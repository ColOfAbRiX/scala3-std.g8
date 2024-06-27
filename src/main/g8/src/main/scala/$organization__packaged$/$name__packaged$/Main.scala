package $organization$.$name;format="lower,word"$

import cats.effect.*

/**
 * Application entry point
 */
object Main extends IOApp:

  def run(args: List[String]): IO[ExitCode] =
    IO.println("Hello, World!").as(ExitCode.Success)
