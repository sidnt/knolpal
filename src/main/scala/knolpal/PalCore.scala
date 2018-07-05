package knolpal

object PalCore { //contains core logic as required by the problem statement

  import helpers._

  def validate(n:Int):Option[Int] =
    if(noOfDigitsIn(n) <= 1000000) Some(n)
    else None

  def isPal(n:Int):Boolean =
    reverseInt(n) == n

  def toPal(n:Int): Int =
    if(isPal(n)) n
    else toPal(n+1)

  def nextPal(n:Int):Int = palStreamFrom(n)(1)

}

