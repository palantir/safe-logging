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

/** A wrapper around an argument known to be safe for logging. */
public interface SafeArg {

    final class Concrete<T> extends ConcreteArg<T> {
        Concrete(String name, T value) {
            super(name, value);
        }

        @Override
        public boolean isSafeForLogging() {
            return true;
        }
    }

    final class Lazy<T> extends LazyArg<T> {
        Lazy(String name, Supplier<T> lazyValue) {
            super(name, lazyValue);
        }

        @Override
        public boolean isSafeForLogging() {
            return true;
        }
    }

    static <T> Arg<T> of(String name, T value) {
        return new Concrete<>(name, value);
    }

    static <T> Arg<T> of(String name, Supplier<T> lazyValue) {
        return new Lazy<>(name, lazyValue);
    }

}
