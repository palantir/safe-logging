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

import com.palantir.logsafe.logger.spi.SafeLoggerFactoryBridge;
import java.util.Comparator;
import java.util.ServiceLoader;

/** Factory used to access {@link SafeLogger} instance. */
public final class SafeLoggerFactory {

    private static final SafeLoggerFactoryBridge BRIDGE =
            ServiceLoader.load(SafeLoggerFactoryBridge.class, SafeLoggerFactory.class.getClassLoader()).stream()
                    .map(ServiceLoader.Provider::get)
                    .max(Comparator.comparing(SafeLoggerFactoryBridge::priority))
                    .orElse(DefaultSlf4JSafeLoggerFactoryBridge.INSTANCE);

    /** Returns a {@link SafeLogger} for the {@code clazz} origin. */
    public static SafeLogger get(Class<?> clazz) {
        return new SafeLogger(BRIDGE.get(clazz));
    }

    /** Returns a {@link SafeLogger} for the {@code name} origin. */
    public static SafeLogger get(String name) {
        return new SafeLogger(BRIDGE.get(name));
    }

    private SafeLoggerFactory() {}
}
