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
import java.util.List;
import org.assertj.core.api.AbstractThrowableAssert;
import org.assertj.core.api.ListAssert;

public class LoggableExceptionAssert<T extends Throwable & SafeLoggable>
        extends AbstractThrowableAssert<LoggableExceptionAssert<T>, T> {
    private final ArgsAssert argsAssert;

    public LoggableExceptionAssert(T actual) {
        super(actual, LoggableExceptionAssert.class);

        argsAssert = actual == null ? null : new ArgsAssert(actual.getArgs());
    }

    public final LoggableExceptionAssert<T> hasOnlyArgs(Arg<?>... args) {
        isNotNull();

        argsAssert.containsOnly(args);
        return this;
    }

    public final LoggableExceptionAssert<T> hasAllArgs(Arg<?>... args) {
        isNotNull();

        argsAssert.contains(args);
        return this;
    }

    public final ArgsAssert args() {
        isNotNull();

        return argsAssert;
    }

    public static final class ArgsAssert extends ListAssert<Arg<?>> {
        private ArgsAssert(List<? extends Arg<?>> actual) {
            super(actual);
        }
    }
}
