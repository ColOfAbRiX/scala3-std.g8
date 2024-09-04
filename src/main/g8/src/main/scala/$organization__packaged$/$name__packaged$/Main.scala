package $organization$.$name$

import cats.effect.*

/**
 * Application entry point
 */
object Main extends IOApp:

  def run(args: List[String]): IO[ExitCode] =
    IO(println(s"Hello, World!")).as(ExitCode.Success)
