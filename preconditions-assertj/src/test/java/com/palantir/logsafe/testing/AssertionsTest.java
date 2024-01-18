/*
 * (c) Copyright 2019 Palantir Technologies Inc. All rights reserved.
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

import static com.palantir.logsafe.testing.Assertions.assertThatLoggableExceptionThrownBy;

import com.palantir.logsafe.SafeArg;
import com.palantir.logsafe.SafeLoggable;
import com.palantir.logsafe.exceptions.SafeIllegalStateException;
import org.assertj.core.error.BasicErrorMessageFactory;
import org.assertj.core.error.ShouldBeInstance;
import org.junit.jupiter.api.Test;

public final class AssertionsTest {

    @Test
    public void testCodeDoesNotThrowException() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThatLoggableExceptionThrownBy(() -> {}))
                .isExactlyInstanceOf(AssertionError.class)
                .hasMessage(new BasicErrorMessageFactory("%nExpecting code to raise a throwable.").create());
    }

    @Test
    public void testCodeThrowsNotSafeLoggable() {
        RuntimeException exception = new RuntimeException("Oops");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThatLoggableExceptionThrownBy(() -> {
                    throw exception;
                }))
                .isExactlyInstanceOf(AssertionError.class)
                .hasMessage(ShouldBeInstance.shouldBeInstance(exception, SafeLoggable.class)
                        .create());
    }

    @Test
    public void testCodeThrowsSafeLoggable() {
        assertThatLoggableExceptionThrownBy(() -> {
            throw new SafeIllegalStateException("Hello");
        });
    }

    @Test
    public void testCodeThrowsSafeLoggableWithArgUsesCorrectRepresentation() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThatLoggableExceptionThrownBy(() -> {
                            throw new SafeIllegalStateException("Hello", SafeArg.of("c", "d"));
                        })
                        .hasExactlyArgs(SafeArg.of("a", "b")))
                .isInstanceOf(AssertionError.class)
                .hasMessageContainingAll("[SafeArg[a=\"b\"]]", "[SafeArg[c=\"d\"]]");
    }
}
