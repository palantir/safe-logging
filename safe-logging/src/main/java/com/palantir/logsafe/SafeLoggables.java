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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class SafeLoggables {

    private SafeLoggables() {}

    public static String renderSafeLoggable(SafeLoggable safeLoggable) {
        return renderArgs(safeLoggable.getLogMessage(), safeLoggable.getArgs());
    }

    public static String renderSafeLoggableAndArgs(SafeLoggable safeLoggable) {
        String renderedArgs = safeLoggable.getArgs().stream()
                .map(arg -> arg.getName() + ": " + arg.getValue()).collect(Collectors.joining(", "))
        return renderArgs(safeLoggable.getLogMessage(), safeLoggable.getArgs()) + "\n"
                + "args: {" + renderedArgs + "}";
    }

    public static String renderArgs(String message, List<Arg<?>> arguments) {
        Pattern pattern = Pattern.compile("\\{([^\\}]*)\\}");
        Matcher matcher = pattern.matcher(message);
        List<String> messageBindings = new LinkedList<>();
        while (matcher.find()) {
            messageBindings.add(matcher.group(1));
        }
        Iterator<String> nonBindedArgs = arguments.stream()
                .filter(arg -> !messageBindings.contains(arg.getName()))
                .map(arg -> arg.getValue().toString())
                .iterator();
        Map<String, String> bindings = arguments.stream()
                .collect(Collectors.toMap(Arg::getName, arg -> arg.getValue().toString()));

        return replaceAll(message, pattern, group -> {
            if (group.equals("")) {
                return nonBindedArgs.hasNext() ? nonBindedArgs.next() : "[no param]";
            } else {
                return bindings.containsKey(group) ? bindings.get(group) : "[no param]";
            }
        });
    }

    private static String replaceAll(String templateText, Pattern pattern,
            Function<String, String> replacer) {
        Matcher matcher = pattern.matcher(templateText);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, replacer.apply(matcher.group(1)));
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
