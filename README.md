# sysinfo
## Simple Java Program to get system info. Uses gradle. 
Written in `Java(TM) SE Runtime Environment (build 1.8.0_65-b17)`

* ./gradlew clean
* ./gradlew runjar

NOTE: added more info.

## Output (ymmv) 
```
    ~/projects/sysinfo $ ./gradlew runjar
    :compileJava
    :processResources UP-TO-DATE
    :classes
    :fatJar
    :runJar
    Hello, World
    architecture    : arm
    processors      : 4
    version         : 4.9.59-v7+
    system load avg : 1.95
    physical memory : 0.9055938720703125
    free phy memory : 0.027492523193359375

    BUILD SUCCESSFUL

    Total time: 18.115 secs
```

## Notes
To setup a new gradle project:
`gradle init --type java-library`

To install gradle (on a raspbian OS) :
`sudo apt-get install gradle`



