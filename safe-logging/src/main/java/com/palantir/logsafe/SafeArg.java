/*
 * (c) Copyright 2017 Palantir Technologies Inc. All rights reserved.
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

import javax.annotation.Nullable;

/** A wrapper around an argument known to be safe for logging. */
public final class SafeArg<T> extends Arg<T> {

    private SafeArg(String name, @Nullable T value) {
        super(name, value);
    }

    public static <T> SafeArg<T> of(String name, @Nullable T value) {
        return new SafeArg<>(name, value);
    }

    @Override
    public boolean isSafeForLogging() {
        return true;
    }
}
