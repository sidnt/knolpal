package knolpal

object helpers {

  // helper functions are agnostic to our problem statement
  // this is to keep helper functions out of our faces

  import PalCore._

  def noOfDigitsIn(n:Int):Int = {
    def iter(n:Int, nd:Int):Int = {
        if (n/10 == 0) nd
        else iter(n/10, nd+1)
    }
    iter(n,1)
  }


  def reverseInt(n:Int):Int = {
    def iter(n:Int, rev:Int):Int = {
        if(n == 0) rev
        else {
            val lastDigit = n % 10
            iter(n/10, rev*10 + lastDigit)
        }
    }
    iter(n,0)
  }

  /* this method returns a streamObject
   * which contains a stream of palindromes from n
   * if n is a palindrome itself, the stream starts from n
   * else the stream starts from next palindrome bigger than n
   * */
  def palStreamFrom(n:Int): Stream[Int] = toPal(n) #:: palStreamFrom(toPal(n+1))

}
