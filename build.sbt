ThisBuild / scalaVersion := "2.13.16"

lazy val `repro` =
  project
    .in(file("."))
    .settings(
      name := "repro",
      scalaVersion := "2.13.16",
      libraryDependencies ++= Seq(
        "org.scalameta" %% "munit" % "1.1.0" % Test
      )
    )
