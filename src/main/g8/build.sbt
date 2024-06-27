val scala3Version = "3.8.4"

import org.typelevel.scalacoptions.ScalacOptions

Global / run / fork           := true
Global / onChangedBuildSource := ReloadOnSourceChanges
Global / tpolecatExcludeOptions ++=
  Set(
    ScalacOptions.warnUnusedImports,
    ScalacOptions.warnUnusedPrivates,
    ScalacOptions.warnUnusedLocals,
    ScalacOptions.privateKindProjector,
  )

Compile / wartremoverErrors := Warts.unsafe
Test / wartremoverErrors := Nil
Test / wartremoverWarnings := Nil

addCommandAlias(
  "styleApply",
  "; set ThisBuild / scalacOptions += \"-Wunused:all\"; scalafixAll; session clear; scalafmtAll"
)
addCommandAlias(
  "styleCheck",
  "; set ThisBuild / scalacOptions += \"-Wunused:all\"; scalafixAll --check; session clear; scalafmtCheckAll"
)

lazy val root =
  project
    .in(file("."))
    .settings(
      name              := "$name$",
      organization      := "$organization$",
      version           := "$version$",
      scalaVersion      := scala3Version,
      scalacOptions += "-Wall",
      semanticdbEnabled := true,
      semanticdbVersion := scalafixSemanticdb.revision,
      libraryDependencies ++= List(
        "org.scalatest" %% "scalatest-wordspec"            % "3.2.20" % Test,
        "org.scalatest" %% "scalatest-shouldmatchers"      % "3.2.20" % Test,
        "org.typelevel" %% "cats-core"                     % "2.13.0",
        "org.typelevel" %% "cats-effect"                   % "3.7.0",
        "org.typelevel" %% "cats-effect-testing-scalatest" % "1.8.0" % Test,
      ),
    )
