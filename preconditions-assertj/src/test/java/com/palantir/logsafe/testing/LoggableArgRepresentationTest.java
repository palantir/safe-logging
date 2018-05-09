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

import static org.assertj.core.api.Assertions.assertThat;

import com.palantir.logsafe.SafeArg;
import com.palantir.logsafe.UnsafeArg;
import java.util.concurrent.CompletableFuture;
import org.junit.Test;

public class LoggableArgRepresentationTest {

    private final LoggableArgRepresentation representation = new LoggableArgRepresentation();

    @Test
    public void toStringOf_safeArg() {
        assertThat(representation.toStringOf(SafeArg.of("hello", "world")))
                .isEqualTo("SafeArg[hello=\"world\"]");
    }

    @Test
    public void toStringOf_safeArg_complexType() {
        CompletableFuture<String> stringFuture = new CompletableFuture<>();
        assertThat(representation.toStringOf(stringFuture)).isEqualTo("CompletableFuture[Incomplete]");
        assertThat(representation.toStringOf(SafeArg.of("future", stringFuture)))
                .isEqualTo("SafeArg[future=CompletableFuture[Incomplete]]");
    }

    @Test
    public void toStringOf_unsafeArg() {
        assertThat(representation.toStringOf(UnsafeArg.of("hello", "world")))
                .isEqualTo("UnsafeArg[hello=\"world\"]");
    }

}
