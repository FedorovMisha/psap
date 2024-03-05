ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % Test

lazy val root = (project in file("."))
  .dependsOn(core)
  .aggregate(core)
  .settings(
    name := "sevsu_scala_lab"
  )

lazy val core = (project in file("core"))
  .settings(
    name := "core"
  )