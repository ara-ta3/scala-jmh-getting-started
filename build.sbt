ThisBuild / scalaVersion := "3.3.7"

lazy val root = (project in file("."))
  .enablePlugins(JmhPlugin)
  .settings(
    name := "scala-jmh-sample",
    organization := "com.example",
    Test / fork := true,
    Jmh / unmanagedSourceDirectories += baseDirectory.value / "src" / "bench" / "scala"
  )
