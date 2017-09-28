#! /bin/bash

branch_name=`git branch | grep \* | cut -d ' ' -f2`

cat <<EOS > sbt-project-for-test/build.sbt
name := "sbt-project-for-test"

version := "0.1"

scalaVersion := "2.11.8"

resolvers += "github Maven Repository" at "https://github.com/nwtgck/maven/raw/$TRAVIS_BRANCH"

// https://mvnrepository.com/artifact/org.processing/core
libraryDependencies += "org.processing" % "core" % "3.3.5"

// from nwtgck/maven
libraryDependencies += "org.clojars.originalsurfmex.processing" % "jogl-all-natives-macosx-universal" % "2.1"
EOS


echo "=== START AUTO-GENERATED build.sbt ===="
cat sbt-project-for-test/build.sbt
echo "=== END   AUTO-GENERATED build.sbt ===="
