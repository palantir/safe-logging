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

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** A wrapper around an argument used to build a formatted message. */
public abstract class Arg<T> implements Serializable {

    @Nonnull
    private final String name;

    @Nullable
    private final T value;

    protected Arg(String name, @Nullable T value) {
        this.name = Objects.requireNonNull(name, "name may not be null");
        this.value = value;
    }

    /** A name describing this argument. */
    @Nonnull
    public final String getName() {
        return name;
    }

    /** The value of this argument (which may be {@code null}). */
    @Nullable
    public final T getValue() {
        return value;
    }

    public abstract boolean isSafeForLogging();

    @Override
    public final String toString() {
        return String.valueOf(value);
    }

    @Override
    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Arg)) {
            return false;
        }
        Arg<?> arg = (Arg<?>) other;
        return Objects.equals(name, arg.name)
                && Objects.equals(value, arg.value)
                && (isSafeForLogging() == arg.isSafeForLogging());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(name, value);
    }
}
