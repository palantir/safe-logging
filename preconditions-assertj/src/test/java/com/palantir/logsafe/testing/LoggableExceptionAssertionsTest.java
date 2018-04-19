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

import static com.palantir.logsafe.testing.Assertions.assertThat;
import static com.palantir.logsafe.testing.Assertions.assertThatLoggableException;
import static com.palantir.logsafe.testing.Assertions.assertThatLoggableExceptionThrownBy;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.palantir.logsafe.Arg;
import com.palantir.logsafe.SafeArg;
import com.palantir.logsafe.SafeLoggable;
import com.palantir.logsafe.UnsafeArg;
import com.palantir.logsafe.exceptions.SafeIllegalArgumentException;
import com.palantir.logsafe.exceptions.SafeIllegalStateException;
import com.palantir.logsafe.exceptions.SafeNullPointerException;
import java.util.Collections;
import java.util.List;
import org.assertj.core.error.ShouldBeInstance;
import org.assertj.core.error.ShouldContain;
import org.assertj.core.error.ShouldHaveMessage;
import org.assertj.core.internal.StandardComparisonStrategy;
import org.assertj.core.util.Lists;
import org.junit.Test;

public final class LoggableExceptionAssertionsTest {

    public SafeIllegalArgumentException illegalArgumentException = new SafeIllegalArgumentException(
            "{index} must be less than {size}", UnsafeArg.of("index", 4), SafeArg.of("size", 1));
    public SafeNullPointerException nullPointerException = new SafeNullPointerException();
    public SafeIllegalStateException illegalStateException = new SafeIllegalStateException(illegalArgumentException);
    public LoggableException loggableException = new LoggableException();

    public void testIllegalArgumentException(LoggableExceptionAssert<SafeIllegalArgumentException> assertion) {
        assertion.isInstanceOf(SafeIllegalArgumentException.class)
                .hasMessage("{index} must be less than {size}")
                .hasOnlyArgs(UnsafeArg.of("index", 4), SafeArg.of("size", 1))
                .hasAllArgs(UnsafeArg.of("index", 4));
    }

    public void testNullPointerException(LoggableExceptionAssert<SafeNullPointerException> assertion) {
        assertion.isInstanceOf(SafeNullPointerException.class)
                .hasMessage("")
                .hasOnlyArgs();
    }

    public void testIllegalStateException(LoggableExceptionAssert<SafeIllegalStateException> assertion) {
        assertion.isInstanceOf(SafeIllegalStateException.class)
                .hasMessage("")
                .hasOnlyArgs();
    }

    public void testLoggableException(LoggableExceptionAssert<LoggableException> assertion) {
        assertion.isInstanceOf(LoggableException.class)
                .hasMessage("test message")
                .args().contains(UnsafeArg.of("arg", "value"));
    }

    @Test
    public void passCorrectAssertThats() {
        testIllegalArgumentException(assertThat(illegalArgumentException));
        testNullPointerException(assertThat(nullPointerException));
        testIllegalStateException(assertThat(illegalStateException));
    }

    @Test
    public void passCorrectAssetThatLoggableException() {
        testLoggableException(assertThatLoggableException(loggableException));
    }

    @Test
    public void passCorrectAssertThatLoggableExceptionThrownBy() {
        testIllegalArgumentException(assertThatLoggableExceptionThrownBy(() -> {
            throw illegalArgumentException;
        }));
        testNullPointerException(assertThatLoggableExceptionThrownBy(() -> {
            throw nullPointerException;
        }));
        testIllegalStateException(assertThatLoggableExceptionThrownBy(() -> {
            throw illegalStateException;
        }));
        testLoggableException(assertThatLoggableExceptionThrownBy(() -> {
            throw loggableException;
        }));
    }

    public void testFailIllegalArgumentException(LoggableExceptionAssert<SafeIllegalArgumentException> assertion) {
        assertThatThrownBy(() -> assertion.hasMessage("not this"))
                .hasMessage(ShouldHaveMessage.shouldHaveMessage(
                        illegalArgumentException, "not this").create());
    }

    public void testFailIllegalStateException(LoggableExceptionAssert<SafeIllegalStateException> assertion) {
        Arg<?> arg = SafeArg.of("missing", "missing");
        assertThatThrownBy(() -> assertion.hasAllArgs(arg))
                .hasMessage(ShouldContain.shouldContain(
                        illegalStateException.getArgs(), Collections.singleton(arg), Collections.singleton(arg),
                        StandardComparisonStrategy.instance()).create());
    }

    public void testFailNullPointerException(LoggableExceptionAssert<SafeNullPointerException> assertion) {
        assertThatThrownBy(() -> assertion.isInstanceOf(IllegalArgumentException.class))
                .hasMessage(ShouldBeInstance.shouldBeInstance(
                        nullPointerException, IllegalArgumentException.class).create());
    }

    public void testFailLoggableException(LoggableExceptionAssert<?> assertion) {
        SafeArg<?> safeArg = SafeArg.of("arg", "value");
        assertThatThrownBy(() -> assertion.args().contains(safeArg))
                .hasMessage(ShouldContain.shouldContain(
                        loggableException.getArgs(), Collections.singleton(safeArg), Collections.singleton(safeArg),
                        StandardComparisonStrategy.instance()).create());
    }

    @Test
    public void failIncorrectAssertThats() {
        testFailIllegalArgumentException(assertThat(illegalArgumentException));
        testFailIllegalStateException(assertThat(illegalStateException));
        testFailNullPointerException(assertThat(nullPointerException));
    }

    @Test
    public void failIncorrectAssetThatLoggableException() {
        testFailLoggableException(assertThatLoggableException(loggableException));
    }

    @Test
    public void failIncorrectAssertThatLoggableExceptionThrownBy() {
        testFailIllegalArgumentException(assertThatLoggableExceptionThrownBy(() -> {
            throw illegalArgumentException;
        }));
        testFailNullPointerException(assertThatLoggableExceptionThrownBy(() -> {
            throw nullPointerException;
        }));
        testFailIllegalStateException(assertThatLoggableExceptionThrownBy(() -> {
            throw illegalStateException;
        }));
        testFailLoggableException(assertThatLoggableExceptionThrownBy(() -> {
            throw loggableException;
        }));
    }

    private static class LoggableException extends Throwable implements SafeLoggable {
        LoggableException() {
            super("test message");
        }

        @Override
        public String getLogMessage() {
            return getMessage();
        }

        @Override
        public List<Arg<?>> getArgs() {
            return Lists.newArrayList(UnsafeArg.of("arg", "value"));
        }
    }
}
