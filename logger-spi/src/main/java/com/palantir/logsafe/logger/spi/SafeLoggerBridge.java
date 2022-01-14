/*
 * (c) Copyright 2022 Palantir Technologies Inc. All rights reserved.
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
// (c) Copyright 2021 Palantir Technologies Inc. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.palantir.logsafe.logger.spi;

import com.google.errorprone.annotations.CompileTimeConstant;
import com.palantir.logsafe.Arg;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

/**
 * Logger bridge which must be implemented by frameworks which implement the safe-logging facade API.
 * Methods should only be called by the safe-logger implementation, the bridge is not meant to be used directly.
 */
@Generated("com.palantir.logsafe.logger.generator.LoggerGenerator")
@SuppressWarnings("TooManyArguments")
public interface SafeLoggerBridge {
    /**
     * Returns {@code true} if the {@code trace} level is enabled.
     */
    boolean isTraceEnabled();

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void trace(@CompileTimeConstant String message);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void trace(@CompileTimeConstant String message, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void trace(@CompileTimeConstant String message, Arg<?> arg0);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void trace(@CompileTimeConstant String message, Arg<?> arg0, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void trace(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            Arg<?> arg9);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            Arg<?> arg9,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    void trace(@CompileTimeConstant String message, List<? extends Arg<?>> args);

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    void trace(@CompileTimeConstant String message, List<? extends Arg<?>> args, @Nullable Throwable throwable);

    /**
     * Returns {@code true} if the {@code debug} level is enabled.
     */
    boolean isDebugEnabled();

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void debug(@CompileTimeConstant String message);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void debug(@CompileTimeConstant String message, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void debug(@CompileTimeConstant String message, Arg<?> arg0);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void debug(@CompileTimeConstant String message, Arg<?> arg0, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void debug(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            Arg<?> arg9);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            Arg<?> arg9,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    void debug(@CompileTimeConstant String message, List<? extends Arg<?>> args);

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    void debug(@CompileTimeConstant String message, List<? extends Arg<?>> args, @Nullable Throwable throwable);

    /**
     * Returns {@code true} if the {@code info} level is enabled.
     */
    boolean isInfoEnabled();

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void info(@CompileTimeConstant String message);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void info(@CompileTimeConstant String message, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void info(@CompileTimeConstant String message, Arg<?> arg0);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void info(@CompileTimeConstant String message, Arg<?> arg0, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void info(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            Arg<?> arg9);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            Arg<?> arg9,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    void info(@CompileTimeConstant String message, List<? extends Arg<?>> args);

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    void info(@CompileTimeConstant String message, List<? extends Arg<?>> args, @Nullable Throwable throwable);

    /**
     * Returns {@code true} if the {@code warn} level is enabled.
     */
    boolean isWarnEnabled();

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void warn(@CompileTimeConstant String message);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void warn(@CompileTimeConstant String message, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void warn(@CompileTimeConstant String message, Arg<?> arg0);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void warn(@CompileTimeConstant String message, Arg<?> arg0, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void warn(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            Arg<?> arg9);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            Arg<?> arg9,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    void warn(@CompileTimeConstant String message, List<? extends Arg<?>> args);

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    void warn(@CompileTimeConstant String message, List<? extends Arg<?>> args, @Nullable Throwable throwable);

    /**
     * Returns {@code true} if the {@code error} level is enabled.
     */
    boolean isErrorEnabled();

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void error(@CompileTimeConstant String message);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void error(@CompileTimeConstant String message, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void error(@CompileTimeConstant String message, Arg<?> arg0);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void error(@CompileTimeConstant String message, Arg<?> arg0, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void error(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            Arg<?> arg9);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8,
            Arg<?> arg9,
            @Nullable Throwable throwable);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    void error(@CompileTimeConstant String message, List<? extends Arg<?>> args);

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    void error(@CompileTimeConstant String message, List<? extends Arg<?>> args, @Nullable Throwable throwable);
}
