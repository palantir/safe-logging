/*
 * Copyright 2017 Palantir Technologies, Inc. All rights reserved.
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

import java.util.function.Supplier;

public class LazyArg<T> extends Arg<T> {

    private final Supplier<T> lazyValue;

    private boolean cached;
    private T value;

    LazyArg(String name, Supplier<T> lazyValue) {
        super(name);
        this.lazyValue = lazyValue;
    }

    public final synchronized T getValue() {
        if (cached) {
            return value;
        }
        cached = true;
        return value = lazyValue.get();
    }

}
