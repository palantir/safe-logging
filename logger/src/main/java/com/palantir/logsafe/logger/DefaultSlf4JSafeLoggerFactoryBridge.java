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

import com.palantir.logsafe.logger.spi.SafeLoggerBridge;
import com.palantir.logsafe.logger.spi.SafeLoggerFactoryBridge;
import org.slf4j.LoggerFactory;

final class DefaultSlf4JSafeLoggerFactoryBridge implements SafeLoggerFactoryBridge {

    static final SafeLoggerFactoryBridge INSTANCE = new DefaultSlf4JSafeLoggerFactoryBridge();

    @Override
    public int priority() {
        return Integer.MIN_VALUE;
    }

    @Override
    public SafeLoggerBridge get(Class<?> clazz) {
        return new Slf4jSafeLoggerBridge(LoggerFactory.getLogger(clazz));
    }

    @Override
    public SafeLoggerBridge get(String name) {
        return new Slf4jSafeLoggerBridge(LoggerFactory.getLogger(name));
    }
}
