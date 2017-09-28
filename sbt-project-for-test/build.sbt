name := "sbt-project-for-test"

version := "0.1"

scalaVersion := "2.11.8"

// NOTE: Get $TRAVIS_BRANCH
val branchName: String = sys.env("TRAVIS_BRANCH")

resolvers += "nwtgck's GitHub Maven Repository" at s"https://github.com/nwtgck/maven/raw/${branchName}"

// https://mvnrepository.com/artifact/org.processing/core
libraryDependencies += "org.processing" % "core" % "3.3.5"

// from nwtgck/maven
libraryDependencies += "org.clojars.originalsurfmex.processing" % "jogl-all-natives-macosx-universal" % "2.1"
