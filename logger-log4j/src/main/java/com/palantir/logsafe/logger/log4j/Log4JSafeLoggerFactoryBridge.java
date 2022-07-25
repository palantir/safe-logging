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

package com.palantir.logsafe.logger.log4j;

import com.google.auto.service.AutoService;
import com.palantir.logsafe.Safe;
import com.palantir.logsafe.logger.spi.SafeLoggerBridge;
import com.palantir.logsafe.logger.spi.SafeLoggerFactoryBridge;
import org.apache.logging.log4j.LogManager;

@AutoService(SafeLoggerFactoryBridge.class)
public final class Log4JSafeLoggerFactoryBridge implements SafeLoggerFactoryBridge {

    private static final int DEFAULT_PRIORITY = 500;

    private final int priority;

    /** ServiceLoader requires a public no-arg constructor. */
    public Log4JSafeLoggerFactoryBridge() {
        // priority is relatively high when log4j-core is available on the classpath but low when it is not.
        this.priority = isLog4jCoreAvailable() ? DEFAULT_PRIORITY : -DEFAULT_PRIORITY;
    }

    @Override
    public int priority() {
        return priority;
    }

    @Override
    public SafeLoggerBridge get(@Safe Class<?> clazz) {
        return new Log4jSafeLoggerBridge(LogManager.getLogger(clazz));
    }

    @Override
    public SafeLoggerBridge get(@Safe String name) {
        return new Log4jSafeLoggerBridge(LogManager.getLogger(name));
    }

    private static boolean isLog4jCoreAvailable() {
        try {
            Class.forName("org.apache.logging.log4j.core.LoggerContext");
            return true;
        } catch (Throwable ignored) {
            return false;
        }
    }
}
