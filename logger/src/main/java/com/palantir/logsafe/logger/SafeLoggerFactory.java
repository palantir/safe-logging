/*
 * (c) Copyright 2021 Palantir Technologies Inc. All rights reserved.
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

package com.palantir.logsafe.logger;

import com.palantir.logsafe.Arg;
import com.palantir.logsafe.Safe;
import com.palantir.logsafe.SafeLoggable;
import com.palantir.logsafe.logger.spi.SafeLoggerFactoryBridge;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ServiceLoader;

/** Factory used to access {@link SafeLogger} instance. */
public final class SafeLoggerFactory {

    private static final SafeLoggerFactoryBridge BRIDGE =
            ServiceLoader.load(SafeLoggerFactoryBridge.class, SafeLoggerFactory.class.getClassLoader()).stream()
                    .map(ServiceLoader.Provider::get)
                    .max(Comparator.comparing(SafeLoggerFactoryBridge::priority))
                    // Should never happen unless dependencies are explicitly excluded
                    .orElseThrow(NoSafeLoggerImplementationsException::new);

    /** Returns a {@link SafeLogger} for the {@code clazz} origin. */
    public static SafeLogger get(@Safe Class<?> clazz) {
        return new SafeLogger(BRIDGE.get(clazz));
    }

    /** Returns a {@link SafeLogger} for the {@code name} origin. */
    public static SafeLogger get(@Safe String name) {
        return new SafeLogger(BRIDGE.get(name));
    }

    private SafeLoggerFactory() {}

    private static final class NoSafeLoggerImplementationsException extends RuntimeException implements SafeLoggable {

        private static final String MESSAGE = "Unable to find any logsafe logger-spi implementations. "
                + "Was the `logger-slf4j` dependency excluded?";

        NoSafeLoggerImplementationsException() {
            super(MESSAGE);
        }

        @Override
        public String getLogMessage() {
            return MESSAGE;
        }

        @Override
        public List<Arg<?>> getArgs() {
            return Collections.emptyList();
        }
    }
}
