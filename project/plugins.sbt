// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.1")

// addSbtPlugin("com.github.play2war" % "play2-war-plugin" % "1.2-beta3-SNAPSHOT")

///////////////////////////
// WARNING: only for making the war
////////////////////////////
//addSbtPlugin("play" % "sbt-plugin" % "2.1.3")

//addSbtPlugin("com.github.play2war" % "play2-war-plugin" % "1.0")
////////////////////////////