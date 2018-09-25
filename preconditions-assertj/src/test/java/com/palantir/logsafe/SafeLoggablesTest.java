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

package com.palantir.logsafe;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.assertj.core.util.Lists;
import org.junit.Test;

public class SafeLoggablesTest {

    @Test
    public void testRenderArgsNamed() {
        String msg = "I am sorry {person}, I am afraid I cannot do that.";
        List<Arg<?>> args = Lists.newArrayList(SafeArg.of("person", "Nick"));
        String rendered = SafeLoggables.renderSafeLoggableAndArgs(safeLoggable(msg, args));
        assertThat(rendered).isEqualTo("I am sorry Nick, I am afraid I cannot do that.\nargs: {person: Nick}");
    }

    @Test
    public void testRenderArgsNonNamed() {
        String msg = "I am sorry {}, I am afraid I cannot do that.";
        List<Arg<?>> args = Lists.newArrayList(SafeArg.of("person", "Nick"));
        String rendered = SafeLoggables.renderSafeLoggableAndArgs(safeLoggable(msg, args));
        assertThat(rendered).isEqualTo("I am sorry Nick, I am afraid I cannot do that.\nargs: {person: Nick}");
    }

    @Test
    public void testRenderArgsNoParam() {
        String msg = "I am sorry {}, I am afraid I cannot do that.";
        List<Arg<?>> args = Lists.newArrayList();
        String rendered = SafeLoggables.renderSafeLoggableAndArgs(safeLoggable(msg, args));
        assertThat(rendered).isEqualTo("I am sorry [no param], I am afraid I cannot do that.\nargs: {}");
    }

    @Test
    public void testRenderComplex() {
        String msg = "Let me put it this way, Mr. {}. The {person} is the most reliable computer ever made."
                + "No {person} has ever made a mistake or distorted information. "
                + "We are{}, by any practical definition of the words, foolproof and incapable of error."
                + "{} {no_binding}";
        List<Arg<?>> args = Lists.newArrayList(
                SafeArg.of("mr", "important client"),
                SafeArg.of("person", "Nick"),
                SafeArg.of("group", ", the expandables"));
        String rendered = SafeLoggables.renderSafeLoggableAndArgs(safeLoggable(msg, args));
        assertThat(rendered).isEqualTo(
                "Let me put it this way, Mr. important client. The Nick is the most reliable computer ever made."
                        + "No Nick has ever made a mistake or distorted information. We are, the expandables, "
                        + "by any practical definition of the words, foolproof and incapable of error."
                        + "[no param] [no param]\n"
                        + "args: {mr: important client, person: Nick, group: , the expandables}");
    }

    private SafeLoggable safeLoggable(String message, List<Arg<?>> args) {
        return new SafeLoggable() {
            @Override
            public List<Arg<?>> getArgs() {
                return args;
            }

            @Override
            public String getLogMessage() {
                return message;
            }
        };
    }
}
