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
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public final class Preconditions {
    private Preconditions() {}

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * @param expression a boolean expression
     * @throws SafeIllegalArgumentException if {@code expression} is false
     */
    @Contract("false -> fail")
    public static void checkArgument(boolean expression) {
        if (!expression) {
            throw new SafeIllegalArgumentException();
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * @param expression a boolean expression
     * @param message    the loggable exception message
     * @throws SafeIllegalArgumentException if {@code expression} is false
     */
    @Contract("false, _ -> fail")
    public static void checkArgument(boolean expression, @CompileTimeConstant String message) {
        if (!expression) {
            throw new SafeIllegalArgumentException(message);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkArgument(boolean, String, Arg...)} for details.
     */
    @Contract("false, _, _ -> fail")
    public static void checkArgument(boolean expression, @CompileTimeConstant String message, Arg<?> arg) {
        if (!expression) {
            throw new SafeIllegalArgumentException(message, arg);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkArgument(boolean, String, Arg...)} for details.
     */
    @Contract("false, _, _, _ -> fail")
    public static void checkArgument(
            boolean expression, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2) {
        if (!expression) {
            throw new SafeIllegalArgumentException(message, arg1, arg2);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkArgument(boolean, String, Arg...)} for details.
     */
    @Contract("false, _, _, _, _ -> fail")
    public static void checkArgument(
            boolean expression, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (!expression) {
            throw new SafeIllegalArgumentException(message, arg1, arg2, arg3);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkArgument(boolean, String, Arg...)} for details.
     */
    @Contract("false, _, _ -> fail")
    public static void checkArgument(
            boolean expression, @CompileTimeConstant String message, List<? extends Arg<?>> args) {
        if (!expression) {
            throw new SafeIllegalArgumentException(message, args.toArray(new Arg<?>[0]));
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * @param expression a boolean expression
     * @param message    the loggable exception message
     * @param args       the arguments to include in the {@link SafeIllegalArgumentException}
     * @throws SafeIllegalArgumentException if {@code expression} is false
     */
    @Contract("false, _, _ -> fail")
    public static void checkArgument(boolean expression, @CompileTimeConstant String message, Arg<?>... args) {
        if (!expression) {
            throw new SafeIllegalArgumentException(message, args);
        }
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an String reference
     * @return the non-null reference that was validated
     * @throws SafeIllegalArgumentException if {@code reference} is null
     */
    @Nonnull
    @CanIgnoreReturnValue
    @Contract("null -> fail; !null -> param1")
    public static <T> T checkArgumentNotNull(@Nullable T reference) {
        if (reference == null) {
            throw new SafeIllegalArgumentException();
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an String reference
     * @param message   the loggable exception message
     * @return the non-null reference that was validated
     * @throws SafeIllegalArgumentException if {@code reference} is null
     */
    @Nonnull
    @CanIgnoreReturnValue
    @Contract("null, _ -> fail; !null, _ -> param1")
    public static <T> T checkArgumentNotNull(@Nullable T reference, @CompileTimeConstant String message) {
        if (reference == null) {
            throw new SafeIllegalArgumentException(message);
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * <p>See {@link #checkArgumentNotNull(Object, String, Arg...)} for details.
     */
    @Contract("null, _, _ -> fail; !null, _, _ -> param1")
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkArgumentNotNull(@Nullable T reference, @CompileTimeConstant String message, Arg<?> arg) {
        if (reference == null) {
            throw new SafeIllegalArgumentException(message, arg);
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * <p>See {@link #checkArgumentNotNull(Object, String, Arg...)} for details.
     */
    @Nonnull
    @CanIgnoreReturnValue
    @Contract("null, _, _, _ -> fail; !null, _, _, _ -> param1")
    public static <T> T checkArgumentNotNull(
            @Nullable T reference, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2) {
        if (reference == null) {
            throw new SafeIllegalArgumentException(message, arg1, arg2);
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * <p>See {@link #checkArgumentNotNull(Object, String, Arg...)} for details.
     */
    @Nonnull
    @CanIgnoreReturnValue
    @Contract("null, _, _, _, _ -> fail; !null, _, _, _, _ -> param1")
    public static <T> T checkArgumentNotNull(
            @Nullable T reference, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (reference == null) {
            throw new SafeIllegalArgumentException(message, arg1, arg2, arg3);
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * <p>See {@link #checkArgumentNotNull(Object, String, Arg...)} for details.
     */
    @Nonnull
    @CanIgnoreReturnValue
    @Contract("null, _, _ -> fail; !null, _, _ -> param1")
    public static <T> T checkArgumentNotNull(
            @Nullable T reference, @CompileTimeConstant String message, List<? extends Arg<?>> args) {
        if (reference == null) {
            throw new SafeIllegalArgumentException(message, args.toArray(new Arg<?>[0]));
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an String reference
     * @param message   the loggable exception message
     * @param args      the arguments to include in the {@link SafeIllegalArgumentException}
     * @return the non-null reference that was validated
     * @throws SafeIllegalArgumentException if {@code reference} is null
     */
    @Nonnull
    @CanIgnoreReturnValue
    @Contract("null, _, _ -> fail; !null, _, _ -> param1")
    public static <T> T checkArgumentNotNull(
            @Nullable T reference, @CompileTimeConstant String message, Arg<?>... args) {
        if (reference == null) {
            throw new SafeIllegalArgumentException(message, args);
        }
        return reference;
    }

    /**
     * Ensures the truth of an expression involving the state of the calling instance, but not involving any parameters
     * to the calling method.
     *
     * @param expression a boolean expression
     * @throws SafeIllegalStateException if {@code expression} is false
     */
    @Contract("false -> fail")
    public static void checkState(boolean expression) {
        if (!expression) {
            throw new SafeIllegalStateException();
        }
    }

    /**
     * Ensures the truth of an expression involving the state of the calling instance, but not involving any parameters
     * to the calling method.
     *
     * @param expression a boolean expression
     * @param message    the loggable exception message
     * @throws SafeIllegalStateException if {@code expression} is false
     */
    @Contract("false, _ -> fail")
    public static void checkState(boolean expression, @CompileTimeConstant String message) {
        if (!expression) {
            throw new SafeIllegalStateException(message);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkState(boolean, String, Arg...)} for details.
     */
    @Contract("false, _, _ -> fail")
    public static void checkState(boolean expression, @CompileTimeConstant String message, Arg<?> arg) {
        if (!expression) {
            throw new SafeIllegalStateException(message, arg);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkState(boolean, String, Arg...)} for details.
     */
    @Contract("false, _, _, _ -> fail")
    public static void checkState(boolean expression, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2) {
        if (!expression) {
            throw new SafeIllegalStateException(message, arg1, arg2);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkState(boolean, String, Arg...)} for details.
     */
    @Contract("false, _, _, _, _ -> fail")
    public static void checkState(
            boolean expression, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (!expression) {
            throw new SafeIllegalStateException(message, arg1, arg2, arg3);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkState(boolean, String, Arg...)} for details.
     */
    @Contract("false, _, _ -> fail")
    public static void checkState(
            boolean expression, @CompileTimeConstant String message, List<? extends Arg<?>> args) {
        if (!expression) {
            throw new SafeIllegalStateException(message, args.toArray(new Arg<?>[0]));
        }
    }

    /**
     * Ensures the truth of an expression involving the state of the calling instance, but not involving any parameters
     * to the calling method.
     *
     * @param expression a boolean expression
     * @param message    the loggable exception message
     * @param args       the arguments to include in the {@link SafeIllegalStateException}
     * @throws SafeIllegalStateException if {@code expression} is false
     */
    @Contract("false, _, _ -> fail")
    public static void checkState(boolean expression, @CompileTimeConstant String message, Arg<?>... args) {
        if (!expression) {
            throw new SafeIllegalStateException(message, args);
        }
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an String reference
     * @return the non-null reference that was validated
     * @throws SafeNullPointerException if {@code reference} is null
     */
    @Contract("null -> fail; !null -> param1")
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@Nullable T reference) {
        if (reference == null) {
            throw new SafeNullPointerException();
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an String reference
     * @param message   the loggable exception message
     * @return the non-null reference that was validated
     * @throws SafeNullPointerException if {@code reference} is null
     */
    @Contract("null, _ -> fail; !null, _ -> param1")
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@Nullable T reference, @CompileTimeConstant String message) {
        if (reference == null) {
            throw new SafeNullPointerException(message);
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * <p>See {@link #checkNotNull(Object, String, Arg...)} for details.
     */
    @Contract("null, _, _ -> fail; !null, _, _ -> param1")
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@Nullable T reference, @CompileTimeConstant String message, Arg<?> arg) {
        if (reference == null) {
            throw new SafeNullPointerException(message, arg);
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * <p>See {@link #checkNotNull(Object, String, Arg...)} for details.
     */
    @Contract("null, _, _, _ -> fail; !null, _, _, _ -> param1")
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(
            @Nullable T reference, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2) {
        if (reference == null) {
            throw new SafeNullPointerException(message, arg1, arg2);
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * <p>See {@link #checkNotNull(Object, String, Arg...)} for details.
     */
    @Contract("null, _, _, _, _ -> fail; !null, _, _, _, _ -> param1")
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(
            @Nullable T reference, @CompileTimeConstant String message, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (reference == null) {
            throw new SafeNullPointerException(message, arg1, arg2, arg3);
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * <p>See {@link #checkNotNull(Object, String, Arg...)} for details.
     */
    @Contract("null, _, _ -> fail; !null, _, _ -> param1")
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(
            @Nullable T reference, @CompileTimeConstant String message, List<? extends Arg<?>> args) {
        if (reference == null) {
            throw new SafeNullPointerException(message, args.toArray(new Arg<?>[0]));
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an String reference
     * @param message   the loggable exception message
     * @param args      the arguments to include in the {@link SafeNullPointerException}
     * @return the non-null reference that was validated
     * @throws SafeNullPointerException if {@code reference} is null
     */
    @Contract("null, _, _ -> fail; !null, _, _ -> param1")
    @Nonnull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@Nullable T reference, @CompileTimeConstant String message, Arg<?>... args) {
        if (reference == null) {
            throw new SafeNullPointerException(message, args);
        }
        return reference;
    }
}
