package knolpal

import org.scalatest._

class helperSpec extends FlatSpec with Matchers {

  import helpers._

  "noOfDigitsIn" should "correctly calculate the number of digits in an Int" in {
    noOfDigitsIn(1234567890) shouldBe 10
  }

  "reverseInt" should "correctly reverse an Int" in {
    reverseInt(123) shouldBe 321
  }

  "palStreamFrom" should "correctly generate a stream of palindromes" in {
    palStreamFrom(8).take(5).toList shouldBe List(8,9,11,22,33)
  }

}
