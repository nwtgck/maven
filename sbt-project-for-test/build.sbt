name := "sbt-project-for-test"

version := "0.1"

scalaVersion := "2.11.8"

// NOTE: Get $TRAVIS_BRANCH
val branchName: String = sys.env("TRAVIS_BRANCH")

resolvers += "nwtgck's GitHub Maven Repository" at s"https://github.com/nwtgck/maven/raw/${branchName}"


// Add dependencies (these are test to confirm whether import is successful or not)
libraryDependencies += "arduino" % "core" % "1.6.0"
libraryDependencies += "net.sf.bluecove" % "bluecove" % "2.1.1"
libraryDependencies += "net.sf.bluecove" % "bluecove" % "2.1.1-SNAPSHOT"
libraryDependencies += "org.clojars.originalsurfmex.processing" % "jogl-all-natives-macosx-universal" % "2.1"
