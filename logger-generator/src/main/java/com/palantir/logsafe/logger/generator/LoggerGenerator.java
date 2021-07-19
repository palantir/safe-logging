/*
 * (c) Copyright 2021 Palantir Technologies Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.logsafe.logger.generator;

import com.google.errorprone.annotations.CompileTimeConstant;
import com.palantir.goethe.Goethe;
import com.palantir.logsafe.Arg;
import com.palantir.logsafe.Safe;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ArrayTypeName;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.WildcardTypeName;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;
import javax.annotation.processing.Generated;
import javax.lang.model.element.Modifier;

@SuppressWarnings("checkstyle:CyclomaticComplexity")
public final class LoggerGenerator {

    private static final ClassName BRIDGE_NAME = ClassName.get("com.palantir.logsafe.logger.spi", "SafeLoggerBridge");
    private static final ClassName LOGGER_NAME = ClassName.get("com.palantir.logsafe.logger", "SafeLogger");
    private static final ClassName SLF4J_BRIDGE_NAME =
            ClassName.get("com.palantir.logsafe.logger", "Slf4jSafeLoggerBridge");
    private static final ClassName THROWABLE_TYPE = ClassName.get(Throwable.class);
    private static final String THROWABLE_NAME = "throwable";
    private static final TypeName ARG_TYPE =
            ParameterizedTypeName.get(ClassName.get(Arg.class), WildcardTypeName.subtypeOf(Object.class));
    private static final TypeName ARGS_LIST_TYPE =
            ParameterizedTypeName.get(ClassName.get(List.class), WildcardTypeName.subtypeOf(ARG_TYPE));
    private static final String DELEGATE = "delegate";
    private static final String SLF4J_MARKER = "MARKER";

    public static void main(String[] _args) {
        JavaFile bridge = generateLoggerBridge();
        Goethe.formatAndEmit(bridge, Paths.get("../logger-spi/src/main/java"));
        JavaFile implementation = generateLoggerImplementation();
        Goethe.formatAndEmit(implementation, Paths.get("../logger/src/main/java"));
        JavaFile slf4jBridge = generateSlf4jBridge();
        Goethe.formatAndEmit(slf4jBridge, Paths.get("../logger/src/main/java"));
    }

    private static JavaFile generateLoggerImplementation() {
        TypeSpec.Builder loggerBuilder = TypeSpec.classBuilder(LOGGER_NAME)
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addJavadoc(
                        "Safe-logging logger API used to produce log events with safe-classified {@link Arg} values.")
                .addAnnotation(AnnotationSpec.builder(Generated.class)
                        .addMember("value", "$S", LoggerGenerator.class.getName())
                        .build())
                .addAnnotation(AnnotationSpec.builder(SuppressWarnings.class)
                        .addMember("value", "$S", "TooManyArguments")
                        .build())
                .addField(FieldSpec.builder(BRIDGE_NAME, DELEGATE)
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .build())
                .addMethod(MethodSpec.constructorBuilder()
                        .addJavadoc("Internal package-private constructor for {@link SafeLoggerFactory}.")
                        .addParameter(
                                ParameterSpec.builder(BRIDGE_NAME, DELEGATE).build())
                        .addStatement(
                                "this.$1N = $2T.requireNonNull($1N, $3S)",
                                DELEGATE,
                                Objects.class,
                                "SafeLoggerBridge is required")
                        .build());
        for (MethodSpec spec : createLoggerBridge().methodSpecs) {
            MethodSpec.Builder methodBuilder = spec.toBuilder();
            methodBuilder.modifiers.clear();
            boolean isVoidMethod = ClassName.VOID.equals(spec.returnType);
            CodeBlock args = spec.parameters.stream()
                    .map(param -> CodeBlock.of("$N", param.name))
                    .collect(CodeBlock.joining(", "));
            methodBuilder
                    .addModifiers(Modifier.PUBLIC)
                    .addStatement("$L$N.$N($L)", isVoidMethod ? "" : "return ", DELEGATE, spec.name, args);
            loggerBuilder.addMethod(methodBuilder.build());
        }
        return JavaFile.builder(LOGGER_NAME.packageName(), loggerBuilder.build())
                .skipJavaLangImports(true)
                .addFileComment(copyright(2021))
                .build();
    }

    private static JavaFile generateLoggerBridge() {
        TypeSpec typeSpec = createLoggerBridge();
        return JavaFile.builder(BRIDGE_NAME.packageName(), typeSpec)
                .skipJavaLangImports(true)
                .addFileComment(copyright(2021))
                .build();
    }

    private static TypeSpec createLoggerBridge() {
        TypeSpec.Builder bridgeBuilder = TypeSpec.interfaceBuilder(BRIDGE_NAME)
                .addModifiers(Modifier.PUBLIC)
                .addJavadoc("Logger bridge which must be implemented by frameworks which implement the safe-logging "
                        + "facade API.\nMethods should only be called by the safe-logger implementation, the bridge "
                        + "is not meant to be used directly.")
                .addAnnotation(AnnotationSpec.builder(Generated.class)
                        .addMember("value", "$S", LoggerGenerator.class.getName())
                        .build())
                .addAnnotation(AnnotationSpec.builder(SuppressWarnings.class)
                        .addMember("value", "$S", "TooManyArguments")
                        .build());
        for (LoggerLevel level : LoggerLevel.values()) {
            bridgeBuilder.addMethod(MethodSpec.methodBuilder(level.isEnabled())
                    .addJavadoc("Returns {@code true} if the {@code $L} level is enabled.", level.lower())
                    .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                    .returns(boolean.class)
                    .build());

            ParameterSpec messageParameter = ParameterSpec.builder(String.class, "message")
                    .addAnnotation(CompileTimeConstant.class)
                    .addJavadoc("Message string to log, supports slf4j-style curly-brace interpolation\n")
                    .build();

            ParameterSpec throwableParameter = ParameterSpec.builder(THROWABLE_TYPE, THROWABLE_NAME)
                    .addJavadoc("Throwable to log with a stack trace\n")
                    .build();

            for (int i = 0; i <= 10; i++) {
                MethodSpec.Builder builder = MethodSpec.methodBuilder(level.lower())
                        .addJavadoc("Logs the provided parameters at {@code $L} level.", level.lower())
                        .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                        .addParameter(messageParameter);
                for (int j = 0; j < i; j++) {
                    builder.addParameter(
                            ParameterSpec.builder(ARG_TYPE, "arg" + j).build());
                }
                MethodSpec spec = builder.build();
                MethodSpec specWithThrowable =
                        spec.toBuilder().addParameter(throwableParameter).build();
                bridgeBuilder.addMethod(spec).addMethod(specWithThrowable);
            }

            MethodSpec spec = MethodSpec.methodBuilder(level.lower())
                    .addJavadoc("Logs the provided parameters at {@code $L} level.", level.lower())
                    .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                    .addParameter(messageParameter)
                    .addParameter(ParameterSpec.builder(ARGS_LIST_TYPE, "args")
                            .addJavadoc("List of safe-loggable arguments associated with this event\n")
                            .build())
                    .build();
            MethodSpec specWithThrowable =
                    spec.toBuilder().addParameter(throwableParameter).build();
            bridgeBuilder.addMethod(spec).addMethod(specWithThrowable);
        }
        return bridgeBuilder.build();
    }

    private static JavaFile generateSlf4jBridge() {
        TypeSpec.Builder loggerBuilder = TypeSpec.classBuilder(SLF4J_BRIDGE_NAME)
                .addAnnotation(AnnotationSpec.builder(Generated.class)
                        .addMember("value", "$S", LoggerGenerator.class.getName())
                        .build())
                .addModifiers(Modifier.FINAL)
                .addSuperinterface(BRIDGE_NAME)
                .addField(FieldSpec.builder(ClassName.get(org.slf4j.Marker.class), SLF4J_MARKER)
                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                        .initializer("$T.getMarker($S)", org.slf4j.MarkerFactory.class, Safe.class.getName())
                        .build())
                .addField(FieldSpec.builder(ClassName.get(org.slf4j.Logger.class), DELEGATE)
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .build())
                .addMethod(MethodSpec.constructorBuilder()
                        .addParameter(ParameterSpec.builder(ClassName.get(org.slf4j.Logger.class), DELEGATE)
                                .build())
                        .addStatement(
                                "this.$1N = $2T.requireNonNull($1N, $3S)",
                                DELEGATE,
                                Objects.class,
                                "Slf4j Logger is required")
                        .build());
        for (MethodSpec spec : createLoggerBridge().methodSpecs) {
            MethodSpec.Builder methodBuilder = spec.toBuilder();
            methodBuilder.modifiers.clear();
            boolean isVoidMethod = ClassName.VOID.equals(spec.returnType);
            boolean hasArgList = hasArgList(spec);
            boolean hasThrowableArg = hasThrowableArg(spec);
            CodeBlock args = Stream.concat(
                            Stream.of(CodeBlock.of("$N", SLF4J_MARKER)),
                            spec.parameters.stream().flatMap(param -> {
                                if (hasArgList && ARGS_LIST_TYPE.equals(param.type)) {
                                    if (hasThrowableArg) {
                                        return Stream.of(CodeBlock.of("merge($N, $N)", param.name, THROWABLE_NAME));
                                    } else {
                                        return Stream.of(
                                                CodeBlock.of("$N.toArray(new $T[0])", param.name, Object.class));
                                    }
                                } else if (hasThrowableArg && hasArgList && THROWABLE_TYPE.equals(param.type)) {
                                    return Stream.empty();
                                }
                                return Stream.of(CodeBlock.of("$N", param.name));
                            }))
                    .collect(CodeBlock.joining(", "));
            methodBuilder.addAnnotation(Override.class).addModifiers(Modifier.PUBLIC);

            boolean requiresLevelCheck = requiresSlf4jLevelCheck(spec);
            if (requiresLevelCheck) {
                methodBuilder.beginControlFlow(
                        "if ($N())",
                        LoggerLevel.valueOf(spec.name.toUpperCase(Locale.ENGLISH))
                                .isEnabled());
            }
            methodBuilder.addStatement("$L$N.$N($L)", isVoidMethod ? "" : "return ", DELEGATE, spec.name, args);
            if (requiresLevelCheck) {
                methodBuilder.endControlFlow();
            }
            loggerBuilder.addMethod(methodBuilder.build());
        }
        return JavaFile.builder(
                        SLF4J_BRIDGE_NAME.packageName(),
                        loggerBuilder
                                .addMethod(MethodSpec.methodBuilder("merge")
                                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC)
                                        .returns(ArrayTypeName.of(Object.class))
                                        .addParameter(ParameterSpec.builder(ARGS_LIST_TYPE, "args")
                                                .build())
                                        .addParameter(ParameterSpec.builder(THROWABLE_TYPE, THROWABLE_NAME)
                                                .build())
                                        .addStatement(
                                                "$1T $2N = $3N.toArray(new $4T[$3N.size() + 1])",
                                                ArrayTypeName.of(Object.class),
                                                "result",
                                                "args",
                                                Object.class)
                                        .addStatement("$1N[$1N.length - 1] = $2N", "result", THROWABLE_NAME)
                                        .addStatement("return $N", "result")
                                        .build())
                                .build())
                .skipJavaLangImports(true)
                .addFileComment(copyright(2021))
                .build();
    }

    private static boolean requiresSlf4jLevelCheck(MethodSpec spec) {
        // Always level check prior to delegating to a var-args method
        return spec.parameters.size() > 3
                // Level check prior to converting args list into an object-array
                || hasArgList(spec);
    }

    private static boolean hasArgList(MethodSpec spec) {
        return spec.parameters.stream().anyMatch(param -> Objects.equals(param.type, ARGS_LIST_TYPE));
    }

    private static boolean hasThrowableArg(MethodSpec spec) {
        return spec.parameters.stream().anyMatch(param -> Objects.equals(param.type, THROWABLE_TYPE));
    }

    private static String copyright(int year) {
        return String.format(
                "(c) Copyright %d Palantir Technologies Inc. All rights reserved.\n"
                        + "\n"
                        + "Licensed under the Apache License, Version 2.0 (the \"License\");\n"
                        + "you may not use this file except in compliance with the License.\n"
                        + "You may obtain a copy of the License at\n"
                        + "\n"
                        + "    http://www.apache.org/licenses/LICENSE-2.0\n"
                        + "\n"
                        + "Unless required by applicable law or agreed to in writing, software\n"
                        + "distributed under the License is distributed on an \"AS IS\" BASIS,\n"
                        + "WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n"
                        + "See the License for the specific language governing permissions and\n"
                        + "limitations under the License.",
                year);
    }

    enum LoggerLevel {
        TRACE,
        DEBUG,
        INFO,
        WARN,
        ERROR;

        String lower() {
            return name().toLowerCase(Locale.ENGLISH);
        }

        String isEnabled() {
            String lower = lower();
            return "is" + Character.toUpperCase(lower.charAt(0)) + lower.substring(1) + "Enabled";
        }
    }

    private LoggerGenerator() {}
}
