# Github hosted Maven Repository
[![Build Status](https://travis-ci.org/nwtgck/maven.svg?branch=master)](https://travis-ci.org/nwtgck/maven)

A maven repository providing libraries which is not provided https://mvnrepository.com.

## How to import the libraries?

Step1. Add the following code in your `build.sbt` to solve this repository

```scala
resolvers += "nwtgck's GitHub Maven Repository" at "https://github.com/nwtgck/maven/raw/master"
```

Step2. Add the following code in your `build.sbt`

```scala
libraryDependencies += "arduino" % "core" % "1.6.0" // Arduino/Firmata
```

or

```scala
libraryDependencies += "net.sf.bluecove" % "bluecove" % "2.1.1"
```

or

```scala
libraryDependencies += "org.clojars.originalsurfmex.processing" % "jogl-all-natives-macosx-universal" % "2.1"
```

Done!

## Repositories

###  Arduino/Firmata

Library for Processing v2.0: processing2-arduino.zip (Updated 6 Nov. 2013)
from http://playground.arduino.cc/Interfacing/Processing

You can import in your Scala or Java file the followings

```scala
import cc.arduino._
import org.firmata._
```

### BlueCove

### jogl-all-natives-macosx-universal
