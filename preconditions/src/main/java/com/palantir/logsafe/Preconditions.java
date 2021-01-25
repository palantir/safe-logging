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

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompileTimeConstant;
import com.palantir.logsafe.exceptions.SafeIllegalArgumentException;
import com.palantir.logsafe.exceptions.SafeIllegalStateException;
import com.palantir.logsafe.exceptions.SafeNullPointerException;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Prefer {@link com.palantir.logsafe.preconditions.Preconditions}. This class
 * exists for backwards compatibility.
 *
 * @deprecated in favor of {@link com.palantir.logsafe.preconditions.Preconditions}.
 */
@Deprecated
public final class Preconditions {
    private Preconditions() {}

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * @param expression a boolean expression
     * @throws SafeIllegalArgumentException if {@code expression} is false
     */
    public static void checkArgument(boolean expression) {
        com.palantir.logsafe.preconditions.Preconditions.checkArgument(expression);
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * @param expression a boolean expression
     * @param message the loggable exception message
     * @throws SafeIllegalArgumentException if {@code expression} is false
     */
    public static void checkArgument(boolean expression, @CompileTimeConstant String message) {
        com.palantir.logsafe.preconditions.Preconditions.checkArgument(expression, message);
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkArgument(boolean, String, Arg...)} for details.
     */
    public static void checkArgument(boolean expression, @CompileTimeConstant String message, Arg<?> arg) {
        com.palantir.logsafe.preconditions.Preconditions.checkArgument(expression, message, arg);
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkArgument(boolean, String, Arg...)} for details.
     */
    public static void checkArgument(
            boolean expression, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2) {
        com.palantir.logsafe.preconditions.Preconditions.checkArgument(expression, message, arg1, arg2);
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkArgument(boolean, String, Arg...)} for details.
     */
    public static void checkArgument(
            boolean expression, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        com.palantir.logsafe.preconditions.Preconditions.checkArgument(expression, message, arg1, arg2, arg3);
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * @param expression a boolean expression
     * @param message the loggable exception message
     * @param args the arguments to include in the {@link SafeIllegalArgumentException}
     * @throws SafeIllegalArgumentException if {@code expression} is false
     */
    public static void checkArgument(boolean expression, @CompileTimeConstant String message, Arg<?>... args) {
        com.palantir.logsafe.preconditions.Preconditions.checkArgument(expression, message, args);
    }

    /**
     * Ensures the truth of an expression involving the state of the calling instance, but not involving any parameters
     * to the calling method.
     *
     * @param expression a boolean expression
     * @throws SafeIllegalStateException if {@code expression} is false
     */
    public static void checkState(boolean expression) {
        com.palantir.logsafe.preconditions.Preconditions.checkState(expression);
    }

    /**
     * Ensures the truth of an expression involving the state of the calling instance, but not involving any parameters
     * to the calling method.
     *
     * @param expression a boolean expression
     * @param message the loggable exception message
     * @throws SafeIllegalStateException if {@code expression} is false
     */
    public static void checkState(boolean expression, @CompileTimeConstant String message) {
        com.palantir.logsafe.preconditions.Preconditions.checkState(expression, message);
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkState(boolean, String, Arg...)} for details.
     */
    public static void checkState(boolean expression, @CompileTimeConstant String message, Arg<?> arg) {
        com.palantir.logsafe.preconditions.Preconditions.checkState(expression, message, arg);
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkState(boolean, String, Arg...)} for details.
     */
    public static void checkState(boolean expression, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2) {
        com.palantir.logsafe.preconditions.Preconditions.checkState(expression, message, arg1, arg2);
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkState(boolean, String, Arg...)} for details.
     */
    public static void checkState(
            boolean expression, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        com.palantir.logsafe.preconditions.Preconditions.checkState(expression, message, arg1, arg2, arg3);
    }

    /**
     * Ensures the truth of an expression involving the state of the calling instance, but not involving any parameters
     * to the calling method.
     *
     * @param expression a boolean expression
     * @param message the loggable exception message
     * @param args the arguments to include in the {@link SafeIllegalStateException}
     * @throws SafeIllegalStateException if {@code expression} is false
     */
    public static void checkState(boolean expression, @CompileTimeConstant String message, Arg<?>... args) {
        com.palantir.logsafe.preconditions.Preconditions.checkState(expression, message, args);
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an String reference
     * @return the non-null reference that was validated
     * @throws SafeNullPointerException if {@code reference} is null
     */
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@Nullable T reference) {
        return com.palantir.logsafe.preconditions.Preconditions.checkNotNull(reference);
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an String reference
     * @param message the loggable exception message
     * @return the non-null reference that was validated
     * @throws SafeNullPointerException if {@code reference} is null
     */
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@Nullable T reference, @CompileTimeConstant String message) {
        return com.palantir.logsafe.preconditions.Preconditions.checkNotNull(reference, message);
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * <p>See {@link #checkNotNull(Object, String, Arg...)} for details.
     */
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@Nullable T reference, @CompileTimeConstant String message, Arg<?> arg) {
        return com.palantir.logsafe.preconditions.Preconditions.checkNotNull(reference, message, arg);
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * <p>See {@link #checkNotNull(Object, String, Arg...)} for details.
     */
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(
            @Nullable T reference, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2) {
        return com.palantir.logsafe.preconditions.Preconditions.checkNotNull(reference, message, arg1, arg2);
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * <p>See {@link #checkNotNull(Object, String, Arg...)} for details.
     */
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(
            @Nullable T reference, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        return com.palantir.logsafe.preconditions.Preconditions.checkNotNull(reference, message, arg1, arg2, arg3);
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an String reference
     * @param message the loggable exception message
     * @param args the arguments to include in the {@link SafeNullPointerException}
     * @return the non-null reference that was validated
     * @throws SafeNullPointerException if {@code reference} is null
     */
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@Nullable T reference, @CompileTimeConstant String message, Arg<?>... args) {
        return com.palantir.logsafe.preconditions.Preconditions.checkNotNull(reference, message, args);
    }
}
