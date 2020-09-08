/*
 * (c) Copyright 2020 Palantir Technologies Inc. All rights reserved.
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

import com.palantir.logsafe.Arg;
import com.palantir.logsafe.SafeArg;
import com.palantir.logsafe.UnsafeArg;
import org.junit.Test;

public final class SafeExceptionsTest {

    @Test
    public void testRenderContainsNullArg() {
        String rendered = SafeExceptions.renderMessage("test", SafeArg.of("a", "b"), null, UnsafeArg.of("c", "d"));
        assertThat(rendered).isEqualTo("test: {a=b, c=d}");
    }

    @Test
    public void testRenderNullArgs() {
        String rendered = SafeExceptions.renderMessage("test", (Arg<?>[]) null);
        assertThat(rendered).isEqualTo("test");
    }

    @Test
    public void testRenderNullMessage() {
        String rendered = SafeExceptions.renderMessage(null, SafeArg.of("a", "b"));
        assertThat(rendered).isEqualTo("null: {a=b}");
    }
}
