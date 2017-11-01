[ ![Download](https://api.bintray.com/packages/palantir/releases/safe-logging/images/download.svg) ](https://bintray.com/palantir/releases/safe-logging/_latestVersion)

Safe-Logging
=============
Interfaces and utilities for safe log messages.

License
-------
This repository is made available under the [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0).

Usage
-----

Add dependency to gradle:

    compile "com.palantir.safe-logging:safe-logging"

Annotate log messages with named `SafeArg` and `UnsafeArg` as appropriate.  For example:

    // previously
    log.info("Twisted the {} knob {} times", knobName, count);

    // now
    log.info("Twisted the {} knob {} times", UnsafeArg.of("knobName", knobName), SafeArg.of("count", count));
