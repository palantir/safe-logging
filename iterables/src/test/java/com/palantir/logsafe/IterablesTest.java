/*
 * (c) Copyright 2021 Palantir Technologies Inc. All rights reserved.
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

import com.google.common.collect.ImmutableSet;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class IterablesTest {
    @Test
    public void getOnlyElementReturnsElement() {
        String element = "element";
        assertThat(Iterables.getOnlyElement(ImmutableSet.of(element))).isEqualTo(element);
    }

    @Test
    public void getOnlyElementThrowsIfMoreThanOneElement() {
        String element1 = "element1";
        String element2 = "element2";
        assertThatThrownBy(() -> Iterables.getOnlyElement(ImmutableSet.of(element1, element2)))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining(Iterables.DEFAULT_ERROR_MESSAGE);
    }

    @Test
    public void getOnlyElementThrowsIfEmpty() {
        assertThatThrownBy(() -> Iterables.getOnlyElement(ImmutableSet.of()))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining(Iterables.DEFAULT_ERROR_MESSAGE);
    }
}
