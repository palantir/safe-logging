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

import java.io.Serializable;
import java.util.Objects;

/** A wrapper around an argument used to build a formatted message. */
public abstract class Arg<T> implements Serializable {

    private final String name;

    protected Arg(String name) {
        this.name = Objects.requireNonNull(name, "name may not be null");
    }

    /** A name describing this argument. */
    public final String getName() {
        return name;
    }

    /** The value of this argument (which may be {@code null}). */
    public abstract T getValue();

    /** returns true if this argument can be safely removed from a deployment. */
    public boolean isSafeForLogging() {
        return false;
    }

    @Override
    public final String toString() {
        return String.valueOf(getValue());
    }

    @Override
    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Arg<?> arg = (Arg<?>) other;
        return Objects.equals(getName(), arg.getName())
                && Objects.equals(getValue(), arg.getValue());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(getName(), getValue());
    }

}
