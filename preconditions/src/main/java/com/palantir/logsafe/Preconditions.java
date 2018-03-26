/*
 * (c) Copyright 2018 Palantir Technologies Inc. All rights reserved.
 * Adapted from Guava 21.0 under the Apache 2 license; original copyright below.
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
import com.palantir.logsafe.exceptions.SafeIllegalArgumentException;
import com.palantir.logsafe.exceptions.SafeIllegalStateException;
import com.palantir.logsafe.exceptions.SafeNullPointerException;

public final class Preconditions {
    private Preconditions() {}

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * @param expression a boolean expression
     * @throws SafeIllegalArgumentException if {@code expression} is false
     */
    public static void checkArgument(boolean expression) {
        if (!expression) {
            throw new SafeIllegalArgumentException();
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * @param expression a boolean expression
     * @param message the loggable exception message
     * @throws SafeIllegalArgumentException if {@code expression} is false
     */
    public static void checkArgument(boolean expression, String message) {
        if (!expression) {
            throw new SafeIllegalArgumentException(message);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkArgument(boolean, String, Arg...)} for details.
     */
    public static void checkArgument(boolean expression, String message, Arg<?> arg) {
        if (!expression) {
            throw new SafeIllegalArgumentException(message, arg);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkArgument(boolean, String, Arg...)} for details.
     */
    public static void checkArgument(boolean expression, String message, Arg<?> arg1, Arg<?> arg2) {
        if (!expression) {
            throw new SafeIllegalArgumentException(message, arg1, arg2);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkArgument(boolean, String, Arg...)} for details.
     */
    public static void checkArgument(boolean expression, String message, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (!expression) {
            throw new SafeIllegalArgumentException(message, arg1, arg2, arg3);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * @param expression a boolean expression
     * @param message the loggable exception message
     * @param args the arguments to include in the {@link SafeIllegalArgumentException}
     * @throws SafeIllegalArgumentException if {@code expression} is false
     */
    public static void checkArgument(boolean expression, String message, Arg<?>... args) {
        if (!expression) {
            throw new SafeIllegalArgumentException(message, args);
        }
    }

    /**
     * Ensures the truth of an expression involving the state of the calling instance, but not
     * involving any parameters to the calling method.
     *
     * @param expression a boolean expression
     * @throws SafeIllegalStateException if {@code expression} is false
     */
    public static void checkState(boolean expression) {
        if (!expression) {
            throw new SafeIllegalStateException();
        }
    }

    /**
     * Ensures the truth of an expression involving the state of the calling instance, but not
     * involving any parameters to the calling method.
     *
     * @param expression a boolean expression
     * @param message the loggable exception message
     * @throws SafeIllegalStateException if {@code expression} is false
     */
    public static void checkState(boolean expression, String message) {
        if (!expression) {
            throw new SafeIllegalStateException(message);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkState(boolean, String, Arg...)} for details.
     */
    public static void checkState(boolean expression, String message, Arg<?> arg) {
        if (!expression) {
            throw new SafeIllegalStateException(message, arg);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkState(boolean, String, Arg...)} for details.
     */
    public static void checkState(boolean expression, String message, Arg<?> arg1, Arg<?> arg2) {
        if (!expression) {
            throw new SafeIllegalStateException(message, arg1, arg2);
        }
    }

    /**
     * Ensures the truth of an expression involving one or more parameters to the calling method.
     *
     * <p>See {@link #checkState(boolean, String, Arg...)} for details.
     */
    public static void checkState(boolean expression, String message, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (!expression) {
            throw new SafeIllegalStateException(message, arg1, arg2, arg3);
        }
    }

    /**
     * Ensures the truth of an expression involving the state of the calling instance, but not
     * involving any parameters to the calling method.
     *
     * @param expression a boolean expression
     * @param message the loggable exception message
     * @param args the arguments to include in the {@link SafeIllegalStateException}
     * @throws SafeIllegalStateException if {@code expression} is false
     */
    public static void checkState(boolean expression, String message, Arg<?>... args) {
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
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new SafeNullPointerException();
        }
        return reference;
    }

    /**
     * Ensures that an Object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an String reference
     * @param message the loggable exception message
     * @return the non-null reference that was validated
     * @throws SafeNullPointerException if {@code reference} is null
     */
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T reference, String message) {
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
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T reference, String message, Arg<?> arg) {
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
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T reference, String message, Arg<?> arg1, Arg<?> arg2) {
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
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T reference, String message, Arg<?> arg1, Arg<?> arg2, Arg<?> arg3) {
        if (reference == null) {
            throw new SafeNullPointerException(message, arg1, arg2, arg3);
        }
        return reference;
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
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T reference, String message, Arg<?>... args) {
        if (reference == null) {
            throw new SafeNullPointerException(message, args);
        }
        return reference;
    }
}
