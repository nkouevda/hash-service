organization := "com.nkouevda"
name := "hash-service"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.13.18"

val logbackVersion = "1.6.8"
val comTwitterFinatraVersion = "24.2.0"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % logbackVersion,
  "com.twitter" %% "finatra-http-server" % comTwitterFinatraVersion,
)
