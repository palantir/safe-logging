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

package com.palantir.logsafe.testing;

import com.palantir.logsafe.Arg;
import org.assertj.core.presentation.Representation;
import org.assertj.core.presentation.StandardRepresentation;

final class LoggableArgRepresentation extends StandardRepresentation {

    static final Representation INSTANCE = new LoggableArgRepresentation();

    private LoggableArgRepresentation() {}

    @Override
    protected String fallbackToStringOf(Object object) {
        if (object instanceof Arg) {
            Arg<?> arg = (Arg<?>) object;
            return String.format(
                    "%s[%s=%s]",
                    arg.getClass().getSimpleName(),
                    arg.getName(),
                    toStringOf(arg.getValue()));
        }
        return super.fallbackToStringOf(object);
    }
}
