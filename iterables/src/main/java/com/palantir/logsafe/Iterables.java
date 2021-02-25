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

/*
 * Copyright (C) 2007 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.palantir.logsafe;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import java.util.Collection;

public final class Iterables {
    @VisibleForTesting
    static final String DEFAULT_ERROR_MESSAGE = "Expected exactly one element in collection";

    private Iterables() {}

    public static <T, C extends Collection<T>> T getOnlyElement(C collection, Arg<?>... args) {
        return getOnlyElement(collection, DEFAULT_ERROR_MESSAGE, args);
    }

    public static <T, C extends Collection<T>> T getOnlyElement(C collection, String message, Arg<?>... args) {
        Preconditions.checkState(collection.size() == 1, message, args);
        return Iterators.getOnlyElement(collection.iterator());
    }
}
