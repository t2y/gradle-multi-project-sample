# gradle-multi-project-sample

sample repository to use gradle multi-project

## Overview

There are 3 sub pjojects.

* common: utility library
* base: base class or interface
* app: application requires base or common

```bash
$ tree common/ base/ app/
common/
├── build.gradle
└── src
    └── main
        └── java
            └── common
                └── MyLibrary.java
base/
├── build.gradle
└── src
    └── main
        └── java
            └── base
                ├── MyBase.java
                └── MyInterface.java
app/
├── build.gradle
└── src
    └── main
        └── java
            └── app
                ├── Main.java
                └── MyApp.java
```

## How to build

Build all sub projects.

```bash
$ ./gradlew build
```

Build `common` project only.

```bash
$ ./gradlew :common:build
```

Build a specific task in a sub project. For example `app` project has a task to build a Fat jar.

```bash
$ ./gradlew :app:customFatJar
$ java -jar app/build/libs/executable-1.0.jar
17:20:42.309 [main] INFO base.MyBase - called doSomeProcess in Base
17:20:42.310 [main] INFO common.MyLibrary - do some process
17:20:42.311 [main] INFO base.MyBase - log floor: 3
17:20:42.316 [main] INFO base.MyBase - f.getCumPct('Z'): 0.5
```

## How to test

Run test for all sub projects.

```bash
$ ./gradlew --info cleanTest test
```

## References

* https://guides.gradle.org/creating-multi-project-builds/
* https://docs.gradle.org/current/userguide/intro_multi_project_builds.html
* https://github.com/embulk/embulk
