## What is this repository? ##

A maven repository providing libraries which is not provided https://mvnrepository.com.

## How to import the libraries? ##

Step1. Add the following code in your `build.sbt` to solve this repository

```scala
resolvers += "github Maven Repository" at "https://github.com/nwtgck/maven/raw/master"
```

Step2. Add the following code in your `build.sbt` (in this case Arduino/Firmata)

```scala
libraryDependencies += "arduino" % "core_2.11.8" % "1.6.0" # Arduino/Firmata
```

Finish!

## Repositories ##

###  Arduino/Firmata ###

Library for Processing v2.0: processing2-arduino.zip (Updated 6 Nov. 2013) 
from http://playground.arduino.cc/Interfacing/Processing

You can import in your Scala or Java file the followings

```scala
import cc.arduino._
import org.firmata._
```
