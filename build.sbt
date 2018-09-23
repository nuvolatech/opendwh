ThisBuild / organization := "org.opendwh"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.11.12"


lazy val commonSettings = Seq()


lazy val feedServer = (project in file("wh-feed-server")).settings(commonSettings)
  
lazy val dwCoordinator = (project in file("dw-coordinator")).settings(commonSettings)

lazy val dwClient = (project in file("dw-client")).settings(commonSettings)