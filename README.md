# Demo to reproduce IntelliJ Bug

This reproduces https://youtrack.jetbrains.com/issue/IDEA-298001 - IntelliJ does not seem to work well with lombok's `lombok.accessors.capitalization` configuration option.

`mvn clean verify`works just fine

IntelliJ does not find **(get|set)aPropertyWhereBeanspecCapitalizationIsDifferent(...)** in **ThingUsingDemoThing**
