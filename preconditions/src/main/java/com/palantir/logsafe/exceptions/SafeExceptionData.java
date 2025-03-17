/*
 * (c) Copyright 2025 Palantir Technologies Inc. All rights reserved.
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
import com.palantir.logsafe.Safe;
import com.palantir.logsafe.Unsafe;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Helper to ease the process of defining custom {@link com.palantir.logsafe.SafeLoggable} {@link Throwable throwables}.
 */
@Unsafe
public final class SafeExceptionData {

    private static final SafeExceptionData EMPTY = new SafeExceptionData("", "", List.of());

    @Safe
    @CompileTimeConstant
    private final String logMessage;

    @Unsafe
    private final String unsafeMessage;

    private final List<Arg<?>> arguments;

    /** Returns an empty {@link SafeExceptionData} instance. */
    public static SafeExceptionData of() {
        return EMPTY;
    }

    public static SafeExceptionData of(@Safe @CompileTimeConstant String logMessage, Arg<?>... arguments) {
        return new SafeExceptionData(
                logMessage,
                SafeExceptions.renderMessage(logMessage, arguments),
                Collections.unmodifiableList(Arrays.asList(arguments)));
    }

    private SafeExceptionData(
            @Safe @CompileTimeConstant String logMessage, @Unsafe String unsafeMessage, List<Arg<?>> arguments) {
        this.logMessage = logMessage;
        this.unsafeMessage = unsafeMessage;
        this.arguments = arguments;
    }

    @Safe
    public String logMessage() {
        return logMessage;
    }

    @Unsafe
    public String unsafeMessage() {
        return unsafeMessage;
    }

    public List<Arg<?>> args() {
        return arguments;
    }

    @Unsafe
    @Override
    public String toString() {
        return "SafeExceptionData{logMessage='"
                + logMessage + '\'' + ", unsafeMessage='"
                + unsafeMessage + '\'' + ", arguments="
                + arguments + '}';
    }
}
