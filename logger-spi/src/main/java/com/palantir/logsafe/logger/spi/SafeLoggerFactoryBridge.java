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

package com.palantir.logsafe.logger.spi;

/** Bridge which must be implemented by frameworks which implement the safe-logging facade API. */
public interface SafeLoggerFactoryBridge {

    /**
     * Priority used to select the preferred {@link SafeLoggerFactoryBridge} when multiple are present.
     * Higher numbers are preferred. {@code CustomBridge{priority=5}} will be preferred over
     * {@code FallbackBridge{priority=3}}.
     */
    int priority();

    /** Returns a {@link SafeLoggerBridge} for the {@code clazz} origin. */
    SafeLoggerBridge get(Class<?> clazz);

    /** Returns a {@link SafeLoggerBridge} for the {@code name} origin. */
    SafeLoggerBridge get(String name);
}
