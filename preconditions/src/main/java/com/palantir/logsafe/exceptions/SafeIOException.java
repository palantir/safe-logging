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

import com.palantir.logsafe.Arg;
import com.palantir.logsafe.SafeLoggable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SafeIOException extends IOException implements SafeLoggable {
    private final List<Arg<?>> arguments;

    public SafeIOException() {
        super("");
        this.arguments = Collections.emptyList();
    }

    public SafeIOException(String message, Arg<?>... arguments) {
        super(message);
        this.arguments = Collections.unmodifiableList(Arrays.asList(arguments));
    }

    public SafeIOException(String message, Throwable cause, Arg<?>... arguments) {
        super(message, cause);
        this.arguments = Collections.unmodifiableList(Arrays.asList(arguments));
    }

    public SafeIOException(Throwable cause, Arg<?> arguments) {
        super(cause);
        this.arguments = Collections.unmodifiableList(Arrays.asList(arguments));
    }

    @Override
    public String getLogMessage() {
        return getMessage();
    }

    @Override
    public List<Arg<?>> getArgs() {
        return arguments;
    }
}
