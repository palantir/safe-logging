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

package com.palantir.logsafe.logger.slf4j;

import com.google.auto.service.AutoService;
import com.palantir.logsafe.Safe;
import com.palantir.logsafe.logger.spi.SafeLoggerBridge;
import com.palantir.logsafe.logger.spi.SafeLoggerFactoryBridge;
import org.slf4j.LoggerFactory;

@AutoService(SafeLoggerFactoryBridge.class)
public final class Slf4JSafeLoggerFactoryBridge implements SafeLoggerFactoryBridge {

    /** ServiceLoader requires a public no-arg constructor. */
    public Slf4JSafeLoggerFactoryBridge() {}

    @Override
    public int priority() {
        // Default priority, negative values may be used
        // to opt out and positive values are preferred.
        return 0;
    }

    @Override
    public SafeLoggerBridge get(@Safe Class<?> clazz) {
        return new Slf4jSafeLoggerBridge(LoggerFactory.getLogger(clazz));
    }

    @Override
    public SafeLoggerBridge get(@Safe String name) {
        return new Slf4jSafeLoggerBridge(LoggerFactory.getLogger(name));
    }
}
