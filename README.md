[ ![Download](https://api.bintray.com/packages/palantir/releases/safe-logging/images/download.svg) ](https://bintray.com/palantir/releases/safe-logging/_latestVersion)

License
-------
This repository is made available under the [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0).

Safe-Logging
=============
Interfaces and utilities for safe log messages.

Usage
-----

Add dependency to gradle:

    compile "com.palantir.safe-logging:safe-logging"

Annotate log messages with named `SafeArg` and `UnsafeArg` as appropriate.  For example:

    // previously
    log.info("Twisted the {} knob {} times", knobName, count);

    // now
    log.info("Twisted the {} knob {} times", UnsafeArg.of("knobName", knobName), SafeArg.of("count", count));


Preconditions
=============
Guava Preconditions equivalent which produces exceptions conforming to the SafeLoggable standard.

Usage
-----

Add dependency to gradle:

    compile "com.palantir.safe-logging:preconditions"
    // optional test utilities
    testCompile "com.palantir.safe-logging:preconditions-assertj"

Annotate Preconditions error messages with named `SafeArg` and `UnsageArg` as appropriate.  For example:

    // previously
    Preconditions.checkArgument(twists > MIN_TWISTS, "%s twists less than minimum %s", twists, MINTWISTS);

    // now
    Preconditions.checkArgument(twists > MIN_TWISTS, "{} twists less than minimum {}", 
            UnsafeArg.of("twists", twists), SafeArg.of("minimum", MIN_TWISTS));

