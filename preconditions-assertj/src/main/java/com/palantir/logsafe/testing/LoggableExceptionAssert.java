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

package com.palantir.logsafe.testing;

import com.palantir.logsafe.Arg;
import com.palantir.logsafe.SafeLoggable;
import java.util.Collections;
import java.util.List;
import org.assertj.core.api.AbstractThrowableAssert;
import org.assertj.core.api.ListAssert;
import org.assertj.core.util.Objects;

public final class LoggableExceptionAssert<T extends Throwable & SafeLoggable>
        extends AbstractThrowableAssert<LoggableExceptionAssert<T>, T> {
    private final ArgsAssert argsAssert;

    static <T extends Throwable & SafeLoggable> LoggableExceptionAssert<T> create(T actual) {
        return new LoggableExceptionAssert<>(actual).withRepresentation(LoggableArgRepresentation.INSTANCE);
    }

    private LoggableExceptionAssert(T actual) {
        super(actual, LoggableExceptionAssert.class);

        List<Arg<?>> args = actual == null ? Collections.emptyList() : actual.getArgs();
        argsAssert = new ArgsAssert(args);
    }

    /**
     * Verifies that the actual exception contains exactly the given args and nothing else, <b>in any order</b>.<br>
     *
     * @param args the given arguments.
     * @return {@code this} assertion object
     * @throws NullPointerException if the given argument is {@code null}.
     * @throws AssertionError if the exception is {@code null}.
     * @throws AssertionError if the exception argument list is {@code null}.
     * @throws AssertionError if the exception arguments do not contain the given values, i.e. the exception contains
     *     some or none of the given arguments, or the exception contains more arguments than the given ones.
     */
    public LoggableExceptionAssert<T> hasExactlyArgs(Arg<?>... args) {
        isNotNull();

        argsAssert.containsExactlyInAnyOrder(args);
        return this;
    }

    /**
     * Deprecated in favor of {@link #containsArgs}.
     *
     * @deprecated use {@link #containsArgs}
     */
    @Deprecated
    public LoggableExceptionAssert<T> hasArgs(Arg<?>... args) {
        return containsArgs(args);
    }

    /**
     * Verifies that the actual exception contains the given args, in any order.
     *
     * @param args the given arguments.
     * @return {@code this} assertion object
     * @throws NullPointerException if the given argument is {@code null}.
     * @throws IllegalArgumentException if the given argument is an empty array.
     * @throws AssertionError if the exception is {@code null}.
     * @throws AssertionError if the exception argument list is {@code null}.
     * @throws AssertionError if the exception does not contain the given arguments.
     */
    public LoggableExceptionAssert<T> containsArgs(Arg<?>... args) {
        isNotNull();

        argsAssert.contains(args);
        return this;
    }

    /**
     * Verifies that the actual exception does not contain any args.
     */
    public LoggableExceptionAssert<T> hasNoArgs() {
        isNotNull();

        argsAssert.isEmpty();
        return this;
    }

    public LoggableExceptionAssert<T> hasLogMessage(String logMessage) {
        isNotNull();

        String actualMessage = actual.getLogMessage();
        if (!Objects.areEqual(actualMessage, logMessage)) {
            throw new AssertionError(String.format(
                    "Expecting safe logging message:%n <%s>%nbut was:%n <%s>", logMessage, actualMessage));
        }

        return this;
    }

    public ArgsAssert args() {
        isNotNull();

        return argsAssert;
    }

    public static final class ArgsAssert extends ListAssert<Arg<?>> {
        private ArgsAssert(List<? extends Arg<?>> actual) {
            super(actual);
        }
    }
}
