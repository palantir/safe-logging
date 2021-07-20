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
package com.palantir.logsafe.logger.slf4j;

import com.google.errorprone.annotations.CompileTimeConstant;
import com.palantir.logsafe.Arg;
import com.palantir.logsafe.logger.spi.SafeLoggerBridge;
import java.util.List;
import java.util.Objects;
import javax.annotation.processing.Generated;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

@Generated("com.palantir.logsafe.logger.generator.LoggerGenerator")
final class Slf4jSafeLoggerBridge implements SafeLoggerBridge {
    private static final Marker MARKER = MarkerFactory.getMarker("com.palantir.logsafe.Safe");

    private final Logger delegate;

    Slf4jSafeLoggerBridge(Logger delegate) {
        this.delegate = Objects.requireNonNull(delegate, "Slf4j Logger is required");
    }

    /**
     * Returns {@code true} if the {@code trace} level is enabled.
     */
    @Override
    public boolean isTraceEnabled() {
        return delegate.isTraceEnabled(MARKER);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void trace(@CompileTimeConstant String message) {
        delegate.trace(MARKER, message);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(@CompileTimeConstant String message, Throwable throwable) {
        delegate.trace(MARKER, message, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void trace(@CompileTimeConstant String message, Arg<?> arg0) {
        delegate.trace(MARKER, message, arg0);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(@CompileTimeConstant String message, Arg<?> arg0, Throwable throwable) {
        delegate.trace(MARKER, message, arg0, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1) {
        delegate.trace(MARKER, message, arg0, arg1);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Throwable throwable) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Throwable throwable) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Throwable throwable) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void trace(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Throwable throwable) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Throwable throwable) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Throwable throwable) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Throwable throwable) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(
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
            Throwable throwable) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void trace(
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
            Arg<?> arg9) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(
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
            Throwable throwable) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    @Override
    public void trace(@CompileTimeConstant String message, List<? extends Arg<?>> args) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, args.toArray(new Object[0]));
        }
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void trace(@CompileTimeConstant String message, List<? extends Arg<?>> args, Throwable throwable) {
        if (isTraceEnabled()) {
            delegate.trace(MARKER, message, merge(args, throwable));
        }
    }

    /**
     * Returns {@code true} if the {@code debug} level is enabled.
     */
    @Override
    public boolean isDebugEnabled() {
        return delegate.isDebugEnabled(MARKER);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void debug(@CompileTimeConstant String message) {
        delegate.debug(MARKER, message);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(@CompileTimeConstant String message, Throwable throwable) {
        delegate.debug(MARKER, message, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void debug(@CompileTimeConstant String message, Arg<?> arg0) {
        delegate.debug(MARKER, message, arg0);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(@CompileTimeConstant String message, Arg<?> arg0, Throwable throwable) {
        delegate.debug(MARKER, message, arg0, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1) {
        delegate.debug(MARKER, message, arg0, arg1);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Throwable throwable) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Throwable throwable) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Throwable throwable) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void debug(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Throwable throwable) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Throwable throwable) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Throwable throwable) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Throwable throwable) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(
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
            Throwable throwable) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void debug(
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
            Arg<?> arg9) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(
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
            Throwable throwable) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    @Override
    public void debug(@CompileTimeConstant String message, List<? extends Arg<?>> args) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, args.toArray(new Object[0]));
        }
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void debug(@CompileTimeConstant String message, List<? extends Arg<?>> args, Throwable throwable) {
        if (isDebugEnabled()) {
            delegate.debug(MARKER, message, merge(args, throwable));
        }
    }

    /**
     * Returns {@code true} if the {@code info} level is enabled.
     */
    @Override
    public boolean isInfoEnabled() {
        return delegate.isInfoEnabled(MARKER);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void info(@CompileTimeConstant String message) {
        delegate.info(MARKER, message);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(@CompileTimeConstant String message, Throwable throwable) {
        delegate.info(MARKER, message, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void info(@CompileTimeConstant String message, Arg<?> arg0) {
        delegate.info(MARKER, message, arg0);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(@CompileTimeConstant String message, Arg<?> arg0, Throwable throwable) {
        delegate.info(MARKER, message, arg0, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1) {
        delegate.info(MARKER, message, arg0, arg1);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Throwable throwable) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Throwable throwable) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Throwable throwable) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void info(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Throwable throwable) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Throwable throwable) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Throwable throwable) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Throwable throwable) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(
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
            Throwable throwable) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void info(
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
            Arg<?> arg9) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(
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
            Throwable throwable) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    @Override
    public void info(@CompileTimeConstant String message, List<? extends Arg<?>> args) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, args.toArray(new Object[0]));
        }
    }

    /**
     * Logs the provided parameters at {@code info} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void info(@CompileTimeConstant String message, List<? extends Arg<?>> args, Throwable throwable) {
        if (isInfoEnabled()) {
            delegate.info(MARKER, message, merge(args, throwable));
        }
    }

    /**
     * Returns {@code true} if the {@code warn} level is enabled.
     */
    @Override
    public boolean isWarnEnabled() {
        return delegate.isWarnEnabled(MARKER);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void warn(@CompileTimeConstant String message) {
        delegate.warn(MARKER, message);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(@CompileTimeConstant String message, Throwable throwable) {
        delegate.warn(MARKER, message, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void warn(@CompileTimeConstant String message, Arg<?> arg0) {
        delegate.warn(MARKER, message, arg0);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(@CompileTimeConstant String message, Arg<?> arg0, Throwable throwable) {
        delegate.warn(MARKER, message, arg0, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1) {
        delegate.warn(MARKER, message, arg0, arg1);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Throwable throwable) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Throwable throwable) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Throwable throwable) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void warn(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Throwable throwable) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Throwable throwable) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Throwable throwable) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Throwable throwable) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(
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
            Throwable throwable) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void warn(
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
            Arg<?> arg9) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(
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
            Throwable throwable) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    @Override
    public void warn(@CompileTimeConstant String message, List<? extends Arg<?>> args) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, args.toArray(new Object[0]));
        }
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void warn(@CompileTimeConstant String message, List<? extends Arg<?>> args, Throwable throwable) {
        if (isWarnEnabled()) {
            delegate.warn(MARKER, message, merge(args, throwable));
        }
    }

    /**
     * Returns {@code true} if the {@code error} level is enabled.
     */
    @Override
    public boolean isErrorEnabled() {
        return delegate.isErrorEnabled(MARKER);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void error(@CompileTimeConstant String message) {
        delegate.error(MARKER, message);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(@CompileTimeConstant String message, Throwable throwable) {
        delegate.error(MARKER, message, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void error(@CompileTimeConstant String message, Arg<?> arg0) {
        delegate.error(MARKER, message, arg0);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(@CompileTimeConstant String message, Arg<?> arg0, Throwable throwable) {
        delegate.error(MARKER, message, arg0, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1) {
        delegate.error(MARKER, message, arg0, arg1);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Throwable throwable) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Throwable throwable) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Throwable throwable) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void error(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Throwable throwable) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Throwable throwable) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Throwable throwable) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Throwable throwable) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            Arg<?> arg7,
            Arg<?> arg8) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(
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
            Throwable throwable) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    @Override
    public void error(
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
            Arg<?> arg9) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(
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
            Throwable throwable) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, throwable);
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    @Override
    public void error(@CompileTimeConstant String message, List<? extends Arg<?>> args) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, args.toArray(new Object[0]));
        }
    }

    /**
     * Logs the provided parameters at {@code error} level.
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    @Override
    public void error(@CompileTimeConstant String message, List<? extends Arg<?>> args, Throwable throwable) {
        if (isErrorEnabled()) {
            delegate.error(MARKER, message, merge(args, throwable));
        }
    }

    private static Object[] merge(List<? extends Arg<?>> args, Throwable throwable) {
        Object[] result = args.toArray(new Object[args.size() + 1]);
        result[result.length - 1] = throwable;
        return result;
    }
}
