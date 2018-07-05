package knolpal

object PalCore { //contains core logic as required by the problem statement

  import helpers._

  /* validate in this case, just performs the input validation as required by the assignment brief
   * its return type is significant
   * */
  def validate(n:Int):Option[Int] =
    if( (n > 0) && (noOfDigitsIn(n) <= 1000000) ) Some(n)
    else None

  def isPal(n:Int):Boolean =
    reverseInt(n) == n

  /* toPal converts an input naturalNo to a palindrome
   * if the number is palindrome already, it just returns it 
   * otherwise it returns the next bigger palindrome
   * */
  def toPal(n:Int): Int =
    if(isPal(n)) n
    else toPal(n+1)

  /* nextPal wil specifically return the next palindrome only
   * to do that, it uses streams to preserve the FP
   * and do away with do-while loops
   * */
  def nextPal(n:Int):Int = palStreamFrom(n)(1)

}

