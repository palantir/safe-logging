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
package com.palantir.logsafe.logger;

import com.google.errorprone.annotations.CompileTimeConstant;
import com.palantir.logsafe.Arg;
import com.palantir.logsafe.logger.spi.SafeLoggerBridge;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

/** Safe-logging logger API used to produce log events with safe-classified {@link Arg} values. */
@Generated("com.palantir.logsafe.logger.generator.LoggerGenerator")
@SuppressWarnings("TooManyArguments")
public final class SafeLogger {
    private final SafeLoggerBridge delegate;

    /** Internal package-private constructor for {@link SafeLoggerFactory}. */
    SafeLogger(SafeLoggerBridge delegate) {
        this.delegate = Objects.requireNonNull(delegate, "SafeLoggerBridge is required");
    }

    /** Returns {@code true} if the {@code trace} level is enabled. */
    public boolean isTraceEnabled() {
        return delegate.isTraceEnabled();
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void trace(@CompileTimeConstant String message) {
        delegate.trace(message);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void trace(@CompileTimeConstant String message, @Nullable Throwable throwable) {
        delegate.trace(message, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void trace(@CompileTimeConstant String message, Arg<?> arg0) {
        delegate.trace(message, arg0);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void trace(@CompileTimeConstant String message, Arg<?> arg0, @Nullable Throwable throwable) {
        delegate.trace(message, arg0, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1) {
        delegate.trace(message, arg0, arg1);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, @Nullable Throwable throwable) {
        delegate.trace(message, arg0, arg1, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2) {
        delegate.trace(message, arg0, arg1, arg2);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void trace(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, @Nullable Throwable throwable) {
        delegate.trace(message, arg0, arg1, arg2, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void trace(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        delegate.trace(message, arg0, arg1, arg2, arg3);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            @Nullable Throwable throwable) {
        delegate.trace(message, arg0, arg1, arg2, arg3, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void trace(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4) {
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            @Nullable Throwable throwable) {
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5) {
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            @Nullable Throwable throwable) {
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4, arg5, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6) {
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void trace(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            @Nullable Throwable throwable) {
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.trace(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, throwable);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    public void trace(@CompileTimeConstant String message, List<? extends Arg<?>> args) {
        delegate.trace(message, args);
    }

    /**
     * Logs the provided parameters at {@code trace} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    public void trace(@CompileTimeConstant String message, List<? extends Arg<?>> args, @Nullable Throwable throwable) {
        delegate.trace(message, args, throwable);
    }

    /** Returns {@code true} if the {@code debug} level is enabled. */
    public boolean isDebugEnabled() {
        return delegate.isDebugEnabled();
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void debug(@CompileTimeConstant String message) {
        delegate.debug(message);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void debug(@CompileTimeConstant String message, @Nullable Throwable throwable) {
        delegate.debug(message, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void debug(@CompileTimeConstant String message, Arg<?> arg0) {
        delegate.debug(message, arg0);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void debug(@CompileTimeConstant String message, Arg<?> arg0, @Nullable Throwable throwable) {
        delegate.debug(message, arg0, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1) {
        delegate.debug(message, arg0, arg1);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, @Nullable Throwable throwable) {
        delegate.debug(message, arg0, arg1, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2) {
        delegate.debug(message, arg0, arg1, arg2);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void debug(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, @Nullable Throwable throwable) {
        delegate.debug(message, arg0, arg1, arg2, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void debug(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        delegate.debug(message, arg0, arg1, arg2, arg3);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            @Nullable Throwable throwable) {
        delegate.debug(message, arg0, arg1, arg2, arg3, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void debug(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4) {
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            @Nullable Throwable throwable) {
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5) {
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            @Nullable Throwable throwable) {
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4, arg5, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6) {
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void debug(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            @Nullable Throwable throwable) {
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.debug(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, throwable);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    public void debug(@CompileTimeConstant String message, List<? extends Arg<?>> args) {
        delegate.debug(message, args);
    }

    /**
     * Logs the provided parameters at {@code debug} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    public void debug(@CompileTimeConstant String message, List<? extends Arg<?>> args, @Nullable Throwable throwable) {
        delegate.debug(message, args, throwable);
    }

    /** Returns {@code true} if the {@code info} level is enabled. */
    public boolean isInfoEnabled() {
        return delegate.isInfoEnabled();
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void info(@CompileTimeConstant String message) {
        delegate.info(message);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void info(@CompileTimeConstant String message, @Nullable Throwable throwable) {
        delegate.info(message, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void info(@CompileTimeConstant String message, Arg<?> arg0) {
        delegate.info(message, arg0);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void info(@CompileTimeConstant String message, Arg<?> arg0, @Nullable Throwable throwable) {
        delegate.info(message, arg0, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1) {
        delegate.info(message, arg0, arg1);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, @Nullable Throwable throwable) {
        delegate.info(message, arg0, arg1, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2) {
        delegate.info(message, arg0, arg1, arg2);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void info(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, @Nullable Throwable throwable) {
        delegate.info(message, arg0, arg1, arg2, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void info(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        delegate.info(message, arg0, arg1, arg2, arg3);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            @Nullable Throwable throwable) {
        delegate.info(message, arg0, arg1, arg2, arg3, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void info(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4) {
        delegate.info(message, arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            @Nullable Throwable throwable) {
        delegate.info(message, arg0, arg1, arg2, arg3, arg4, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5) {
        delegate.info(message, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            @Nullable Throwable throwable) {
        delegate.info(message, arg0, arg1, arg2, arg3, arg4, arg5, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6) {
        delegate.info(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void info(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            @Nullable Throwable throwable) {
        delegate.info(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.info(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.info(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.info(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.info(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.info(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.info(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, throwable);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    public void info(@CompileTimeConstant String message, List<? extends Arg<?>> args) {
        delegate.info(message, args);
    }

    /**
     * Logs the provided parameters at {@code info} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    public void info(@CompileTimeConstant String message, List<? extends Arg<?>> args, @Nullable Throwable throwable) {
        delegate.info(message, args, throwable);
    }

    /** Returns {@code true} if the {@code warn} level is enabled. */
    public boolean isWarnEnabled() {
        return delegate.isWarnEnabled();
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void warn(@CompileTimeConstant String message) {
        delegate.warn(message);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void warn(@CompileTimeConstant String message, @Nullable Throwable throwable) {
        delegate.warn(message, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void warn(@CompileTimeConstant String message, Arg<?> arg0) {
        delegate.warn(message, arg0);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void warn(@CompileTimeConstant String message, Arg<?> arg0, @Nullable Throwable throwable) {
        delegate.warn(message, arg0, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1) {
        delegate.warn(message, arg0, arg1);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, @Nullable Throwable throwable) {
        delegate.warn(message, arg0, arg1, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2) {
        delegate.warn(message, arg0, arg1, arg2);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void warn(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, @Nullable Throwable throwable) {
        delegate.warn(message, arg0, arg1, arg2, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void warn(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        delegate.warn(message, arg0, arg1, arg2, arg3);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            @Nullable Throwable throwable) {
        delegate.warn(message, arg0, arg1, arg2, arg3, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void warn(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4) {
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            @Nullable Throwable throwable) {
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5) {
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            @Nullable Throwable throwable) {
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4, arg5, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6) {
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void warn(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            @Nullable Throwable throwable) {
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.warn(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, throwable);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    public void warn(@CompileTimeConstant String message, List<? extends Arg<?>> args) {
        delegate.warn(message, args);
    }

    /**
     * Logs the provided parameters at {@code warn} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    public void warn(@CompileTimeConstant String message, List<? extends Arg<?>> args, @Nullable Throwable throwable) {
        delegate.warn(message, args, throwable);
    }

    /** Returns {@code true} if the {@code error} level is enabled. */
    public boolean isErrorEnabled() {
        return delegate.isErrorEnabled();
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void error(@CompileTimeConstant String message) {
        delegate.error(message);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void error(@CompileTimeConstant String message, @Nullable Throwable throwable) {
        delegate.error(message, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void error(@CompileTimeConstant String message, Arg<?> arg0) {
        delegate.error(message, arg0);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void error(@CompileTimeConstant String message, Arg<?> arg0, @Nullable Throwable throwable) {
        delegate.error(message, arg0, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1) {
        delegate.error(message, arg0, arg1);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, @Nullable Throwable throwable) {
        delegate.error(message, arg0, arg1, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2) {
        delegate.error(message, arg0, arg1, arg2);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void error(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, @Nullable Throwable throwable) {
        delegate.error(message, arg0, arg1, arg2, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void error(@CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        delegate.error(message, arg0, arg1, arg2, arg3);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            @Nullable Throwable throwable) {
        delegate.error(message, arg0, arg1, arg2, arg3, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void error(
            @CompileTimeConstant String message, Arg<?> arg0, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3, Arg<?> arg4) {
        delegate.error(message, arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            @Nullable Throwable throwable) {
        delegate.error(message, arg0, arg1, arg2, arg3, arg4, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5) {
        delegate.error(message, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            @Nullable Throwable throwable) {
        delegate.error(message, arg0, arg1, arg2, arg3, arg4, arg5, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6) {
        delegate.error(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
    public void error(
            @CompileTimeConstant String message,
            Arg<?> arg0,
            Arg<?> arg1,
            Arg<?> arg2,
            Arg<?> arg3,
            Arg<?> arg4,
            Arg<?> arg5,
            Arg<?> arg6,
            @Nullable Throwable throwable) {
        delegate.error(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.error(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.error(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.error(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.error(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     */
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
        delegate.error(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param throwable Throwable to log with a stack trace
     */
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
            @Nullable Throwable throwable) {
        delegate.error(message, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, throwable);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     */
    public void error(@CompileTimeConstant String message, List<? extends Arg<?>> args) {
        delegate.error(message, args);
    }

    /**
     * Logs the provided parameters at {@code error} level.
     *
     * @param message Message string to log, supports slf4j-style curly-brace interpolation
     * @param args List of safe-loggable arguments associated with this event
     * @param throwable Throwable to log with a stack trace
     */
    public void error(@CompileTimeConstant String message, List<? extends Arg<?>> args, @Nullable Throwable throwable) {
        delegate.error(message, args, throwable);
    }
}
