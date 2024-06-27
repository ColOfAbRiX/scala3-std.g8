package $organization$.$name;format="lower,word"$

import cats.effect.IO
import cats.effect.testing.scalatest.AsyncIOSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AsyncWordSpec

/**
 * Main class tests
 */
class MainSpec extends AsyncWordSpec with AsyncIOSpec with Matchers {

  "Example test" should {

    "succeed" in {
      val obtained = IO(42)
      val expected = 42
      obtained.asserting(_ shouldBe expected)
    }

  }

}
