/*
 * (c) Copyright 2024 Palantir Technologies Inc. All rights reserved.
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

package com.palantir.logsafe;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import org.junit.Test;

public class ArgTest {

    @Test
    @SuppressWarnings({"EqualsWithItself", "AssertBetweenInconvertibleTypes"}) // testing equals
    public void testSafeVersusUnsafe() {
        SafeArg<String> safeArg = SafeArg.of("test", "value");
        SafeArg<String> safeArg2 = SafeArg.of("test", "value");
        UnsafeArg<String> unsafeArg = UnsafeArg.of("test", "value");

        assertThat(safeArg.getName()).isEqualTo(unsafeArg.getName());
        assertThat(safeArg.getValue()).isEqualTo(unsafeArg.getValue());
        assertThat(safeArg.isSafeForLogging()).isTrue();
        assertThat(safeArg2.isSafeForLogging()).isTrue();
        assertThat(unsafeArg.isSafeForLogging()).isFalse();
        assertThat(safeArg)
                .isEqualTo(safeArg2)
                .isEqualTo(safeArg)
                .hasSameHashCodeAs(safeArg2)
                .hasToString(safeArg2.toString())
                .isNotEqualTo(Map.of("test", "value"));
        assertThat(safeArg2).isEqualTo(safeArg).isEqualTo(safeArg2).isNotEqualTo(Map.of("test", "value"));
        assertThat(unsafeArg).isNotEqualTo(safeArg).isNotEqualTo(safeArg2).isNotEqualTo(Map.of("test", "value"));
        assertThat(safeArg).isNotEqualTo(unsafeArg).doesNotHaveSameHashCodeAs(unsafeArg);
        assertThat(safeArg).hasToString("value").hasToString(unsafeArg.toString());
    }
}
