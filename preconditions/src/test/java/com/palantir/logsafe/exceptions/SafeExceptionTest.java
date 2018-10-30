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

import static org.assertj.core.api.Assertions.assertThat;

import com.palantir.logsafe.SafeArg;
import com.palantir.logsafe.UnsafeArg;
import org.junit.Test;

@SuppressWarnings("ThrowableNotThrown")
public class SafeExceptionTest {

    @Test
    public void testSafeIllegalArgumentException() {
        SafeIllegalArgumentException exception = new SafeIllegalArgumentException("Failure",
                SafeArg.of("value", 3),
                UnsafeArg.of("user", "akarp"));
        assertThat(exception.getMessage()).isEqualTo("Failure: {value=3, user=akarp}");
        assertThat(exception.getLogMessage()).isEqualTo("Failure");
    }

    @Test
    public void testSafeIllegalStateException() {
        SafeIllegalStateException exception = new SafeIllegalStateException("Failure",
                SafeArg.of("value", 3),
                UnsafeArg.of("user", "akarp"));
        assertThat(exception.getMessage()).isEqualTo("Failure: {value=3, user=akarp}");
        assertThat(exception.getLogMessage()).isEqualTo("Failure");
    }

    @Test
    public void testSafeIoException() {
        SafeIoException exception = new SafeIoException("Failure",
                SafeArg.of("value", 3),
                UnsafeArg.of("user", "akarp"));
        assertThat(exception.getMessage()).isEqualTo("Failure: {value=3, user=akarp}");
        assertThat(exception.getLogMessage()).isEqualTo("Failure");
    }

    @Test
    public void testSafeNullPointerException() {
        SafeNullPointerException exception = new SafeNullPointerException("Failure",
                SafeArg.of("value", 3),
                UnsafeArg.of("user", "akarp"));
        assertThat(exception.getMessage()).isEqualTo("Failure: {value=3, user=akarp}");
        assertThat(exception.getLogMessage()).isEqualTo("Failure");
    }

    @Test
    public void testSafeRuntimeException() {
        SafeRuntimeException exception = new SafeRuntimeException("Failure",
                SafeArg.of("value", 3),
                UnsafeArg.of("user", "akarp"));
        assertThat(exception.getMessage()).isEqualTo("Failure: {value=3, user=akarp}");
        assertThat(exception.getLogMessage()).isEqualTo("Failure");
    }
}
