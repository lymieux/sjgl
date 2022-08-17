# SJGL User Guide

## Project Structure

__sjgl__ consists of several Java modules, each with a separate JAR file.

The core modules are:

* `sjgl-core` - ... (description needed)

Additional modules are:

__!comming soon!__

The following modules depend on proprietary libraries, and are not built by default:

__!comming soon!__

## Using SJGL with Maven

To include __sjgl__ in a Maven project, add a dependency block like the following:

```xml
<properties>
    <sjgl.version>1.0.0</sjgl.version>
</properties>
<dependency>
    <groupId>com.github.kymchi.sjgl</groupId>
    <artifactId>sjgl-core</artifactId>
    <version>${sjgl.version}</version>
</dependency>
```

__sjgl__ artifacts are available on [Maven Central](). (<-- todo)

Releases can also be downloaded from [Source Forge](). (<-- todo)