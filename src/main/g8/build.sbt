import org.typelevel.scalacoptions.ScalacOptions

val scala3Version = "3.4.2"

Global / run / fork           := true
Global / onChangedBuildSource := ReloadOnSourceChanges
Global / tpolecatExcludeOptions ++=
  Set(
    ScalacOptions.warnUnusedImports,
    ScalacOptions.warnUnusedPrivates,
    ScalacOptions.warnUnusedLocals,
  )

lazy val root =
  project
    .in(file("."))
    .settings(
      name              := "$name$",
      organization      := "$organization$",
      version           := "0.1.0-SNAPSHOT",
      scalaVersion      := scala3Version,
      scalaVersion      := scala3Version,
      semanticdbEnabled := true,
      semanticdbVersion := scalafixSemanticdb.revision,
      libraryDependencies ++= List(
        "org.scalameta"        %% "munit"              % "1.0.0" % Test,
        "org.typelevel"        %% "cats-core"          % "2.12.0",
        "org.typelevel"        %% "cats-effect"        % "3.5.4",
      ),
    )
