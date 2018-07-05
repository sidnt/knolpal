package knolpal

import org.scalatest._

class CLISpec extends FlatSpec with Matchers {

  import CLI._

  "outputOf" should "correctly calculate" in {
    outputOf(Array(809,2136)) shouldBe "818 2222"
  }
}
