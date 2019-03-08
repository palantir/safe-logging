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

import com.google.common.base.MoreObjects;
import com.palantir.logsafe.Arg;

/**
 * {@link SafeExceptions} provides utility functionality for SafeLoggable exception implementations.
 */
final class SafeExceptions {
    private SafeExceptions() {}

    static String renderMessage(String message, Arg<?>... args) {
        if (args.length == 0) {
            return message;
        }

        MoreObjects.ToStringHelper builder = MoreObjects.toStringHelper(message + ": ");
        for (Arg<?> arg : args) {
            builder.add(arg.getName(), arg.getValue());
        }

        return builder.toString();
    }
}
