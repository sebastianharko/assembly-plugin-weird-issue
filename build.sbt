organization := "com.unknown"

name := "app-api"

version := "0.1"

scalaVersion := "2.11.6"

parallelExecution in Test := false

mainClass := Some("com.unknown.main.Main")

libraryDependencies ++= {
  val akkaV = "2.3.9"
  val sprayV = "1.3.2"
  Seq(
    "org.scalaz" %% "scalaz-core" % "7.1.1",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0" ,
    "io.lamma" %% "lamma" % "2.2.0" withSources() withJavadoc(), // date library for Scala
    "com.sksamuel.elastic4s" %% "elastic4s" % "1.4.13" withSources() withJavadoc(),
    "com.amazonaws" % "aws-java-sdk" % "1.9.25",
    "commons-io" % "commons-io" % "2.4" withSources() withJavadoc(),
    "org.squeryl" % "squeryl_2.11" % "0.9.5-7" withSources() withJavadoc(), // object relational mapper
    "c3p0" % "c3p0" % "0.9.1.2", // database connection pool manager
    "io.spray" %% "spray-can" % sprayV,
    "io.spray" %% "spray-routing" % sprayV,
    "com.typesafe.akka" %% "akka-actor" % akkaV ,
    "com.typesafe.akka" %% "akka-slf4j" % akkaV,
    "com.gettyimages" %% "spray-swagger" % "0.5.1" withSources() withJavadoc(), // documentation generator for REST API
    "org.json4s" %% "json4s-jackson" % "3.2.9",
    "ch.qos.logback" % "logback-classic" % "1.1.2",
    "org.fusesource.jansi" % "jansi"  % "1.8", // logback needs this on Windows
    "joda-time" % "joda-time" % "2.7",
    "com.h2database" % "h2" % "1.3.170", // in-memory SQL database used for testing
    "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
    "io.spray" %% "spray-testkit" % sprayV % "test",
    "com.typesafe.akka" %% "akka-testkit" % akkaV % "test",
    "org.scalatest" %% "scalatest" % "2.2.1" % "test",
    "org.scalacheck" %% "scalacheck" % "1.12.2" % "test"
  )
}



