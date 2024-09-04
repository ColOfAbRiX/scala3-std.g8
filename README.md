scala3.g8: simple scala3-compiled sbt project template
=================
[![Continuous Integration](https://github.com/scala/scala3.g8/actions/workflows/ci.yml/badge.svg)](https://github.com/scala/scala3.g8/actions/workflows/ci.yml)

A [Giter8][g8] template for a minimal [Scala 3] project.

ColOfAbRiX's Customizations
--------------
* Proper, packaged directory structure
* [Cats][scala-cats] support as default, including sample IOApp
* Standard formatting with [Scalafmt][scalafmt]
* Code quality checks:
  * [Wartremover][wartremover] checks
  * [Scalafix][scalafix] rules
  * [sbt-tpolecat][sbt-tpolecat] compiler flags
* Better default values for SBT `root` project
* More .gitignore entries

Template usage
--------------
Using `sbt`, do:
```
sbt new scala/scala3.g8
```
in the folder where you want to clone the template.

Template license
----------------
Written in 2017 by [Nicolas Stucki]

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
[Scala 3]: http://dotty.epfl.ch/
[Nicolas Stucki]: https://github.com/nicolasstucki
[scala-cats]: https://typelevel.org/cats/
[scalafix]: https://scalacenter.github.io/scalafix/
[scalafmt]: https://scalameta.org/scalafmt/
[sbt-tpolecat]: https://github.com/typelevel/sbt-tpolecat
[wartremover]: https://www.wartremover.org/
