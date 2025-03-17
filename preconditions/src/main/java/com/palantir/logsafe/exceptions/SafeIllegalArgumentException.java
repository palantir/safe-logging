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

package com.palantir.logsafe.exceptions;

import com.google.errorprone.annotations.CompileTimeConstant;
import com.palantir.logsafe.Arg;
import com.palantir.logsafe.SafeLoggable;
import java.util.List;
import javax.annotation.Nullable;

public final class SafeIllegalArgumentException extends IllegalArgumentException implements SafeLoggable {
    private final SafeExceptionData data;

    public SafeIllegalArgumentException() {
        this(SafeExceptionData.of(), null);
    }

    public SafeIllegalArgumentException(@CompileTimeConstant String message, Arg<?>... arguments) {
        this(SafeExceptionData.of(message, arguments), null);
    }

    public SafeIllegalArgumentException(
            @CompileTimeConstant String message, @Nullable Throwable cause, Arg<?>... arguments) {
        this(SafeExceptionData.of(message, arguments), cause);
    }

    public SafeIllegalArgumentException(@Nullable Throwable cause) {
        this(SafeExceptionData.of(), cause);
    }

    private SafeIllegalArgumentException(SafeExceptionData data, @Nullable Throwable cause) {
        super(data.unsafeMessage(), cause);
        this.data = data;
    }

    @Override
    public String getLogMessage() {
        return data.logMessage();
    }

    @Override
    public List<Arg<?>> getArgs() {
        return data.args();
    }
}
