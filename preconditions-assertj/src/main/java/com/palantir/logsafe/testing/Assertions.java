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

import com.palantir.logsafe.SafeArg;
import com.palantir.logsafe.SafeLoggable;
import com.palantir.logsafe.UnsafeArg;
import com.palantir.logsafe.exceptions.SafeIllegalArgumentException;
import com.palantir.logsafe.exceptions.SafeIllegalStateException;
import com.palantir.logsafe.exceptions.SafeIoException;
import com.palantir.logsafe.exceptions.SafeNullPointerException;
import org.assertj.core.api.AssertionsForClassTypes;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.assertj.core.internal.Failures;

public class Assertions extends org.assertj.core.api.Assertions {

    static {
        org.assertj.core.api.Assertions.registerFormatterForType(
                SafeArg.class, arg -> String.format("SafeArg[%s=%s]", arg.getName(), arg.getValue()));
        org.assertj.core.api.Assertions.registerFormatterForType(
                UnsafeArg.class, arg -> String.format("UnsafeArg[%s=%s]", arg.getName(), arg.getValue()));
    }

    Assertions() {}

    public static LoggableExceptionAssert<SafeIllegalArgumentException> assertThat(
            SafeIllegalArgumentException actual) {
        return new LoggableExceptionAssert<>(actual);
    }

    public static LoggableExceptionAssert<SafeIllegalStateException> assertThat(SafeIllegalStateException actual) {
        return new LoggableExceptionAssert<>(actual);
    }

    public static LoggableExceptionAssert<SafeNullPointerException> assertThat(SafeNullPointerException actual) {
        return new LoggableExceptionAssert<>(actual);
    }

    public static LoggableExceptionAssert<SafeIoException> assertThat(SafeIoException actual) {
        return new LoggableExceptionAssert<>(actual);
    }

    public static <T extends Throwable & SafeLoggable> LoggableExceptionAssert<T> assertThatLoggableException(
            T actual) {
        return new LoggableExceptionAssert<>(actual);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Throwable & SafeLoggable> LoggableExceptionAssert<T> assertThatLoggableExceptionThrownBy(
            ThrowingCallable shouldRaiseThrowable) {
        Throwable throwable = AssertionsForClassTypes.catchThrowable(shouldRaiseThrowable);
        if (!SafeLoggable.class.isInstance(throwable)) {
            throw Failures.instance().failure(String.format("Expecting code to throw a SafeLoggable exception, "
                    + "but caught a %s which does not", throwable.getClass().getCanonicalName()));
        }
        return new LoggableExceptionAssert<>((T) throwable);
    }
}
