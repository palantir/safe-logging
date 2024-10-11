/*
 * (c) Copyright 2018 Palantir Technologies Inc. All rights reserved.
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

package com.palantir.logsafe.exceptions;

import com.google.errorprone.annotations.CompileTimeConstant;
import com.palantir.logsafe.Arg;
import java.util.Arrays;
import java.util.List;

/** {@link SafeExceptions} provides utility functionality for SafeLoggable exception implementations. */
public final class SafeExceptions {
    private SafeExceptions() {}

    public static String renderMessage(@CompileTimeConstant String safeMessage, List<? extends Arg<?>> args) {
        if (args == null || args.isEmpty()) {
            return safeMessage;
        }

        StringBuilder builder = new StringBuilder();
        builder.append(safeMessage).append(": {");
        boolean first = true;
        for (Arg<?> arg : args) {
            if (arg != null) {
                if (!first) {
                    builder.append(", ");
                } else {
                    first = false;
                }

                builder.append(arg.getName()).append("=");
                appendValue(builder, arg);
            }
        }
        builder.append('}');

        return builder.toString();
    }

    public static String renderMessage(@CompileTimeConstant String safeMessage, Arg<?>... args) {
        if (args == null || args.length == 0) {
            return safeMessage;
        }

        return renderMessage(safeMessage, Arrays.asList(args));
    }

    private static void appendValue(StringBuilder builder, Arg<?> arg) {
        Object value = arg.getValue();
        if (value != null && value.getClass().isArray()) {
            String arrayString = Arrays.deepToString(new Object[] {value});
            builder.append(arrayString, 1, arrayString.length() - 1);
        } else {
            builder.append(value);
        }
    }
}
