package knolpal

import org.scalatest._

class PalCoreSpec extends FlatSpec with Matchers {

  import PalCore._

  "isPal" should "correctly validate a palindrome" in {
    isPal(2) shouldBe true
    isPal(232) shouldBe true
    isPal(2321) shouldBe false
  }

  "toPal" should "correctly convert a natural number to palindrome" in {
    toPal(2) shouldBe 2
    toPal(10) shouldBe 11
  }

  "nextPal" should "correctly calculate the next bigger palindrome" in {
    nextPal(2) shouldBe 3
    nextPal(10) shouldBe 11
  }
  

}
