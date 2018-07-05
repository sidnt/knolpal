package knolpal

object CLI extends App {

  import PalCore._
  import helpers._

  val inputInts: Array[Int] =
    args.                   // :Array[String]      | args is the array containing the console inputints as strings
      tail.                 // :Array[String]      | the first argument(a/2 the problemstatement) is notneeded in this implementation
      map(_.toInt)          // :Array[Int]         | because args contains strings 2bparsed to Ints

  def outputOf(input: Array[Int]): String =
    input.
      map(validate _).      // :Array[Option[Int]] | turns our Array[Int] to Array[Option[Int]]
      map(_ map nextPal).   // :Array[Option[Int]] | each Some is mapped to its nextPalindrome
      map(_.getOrElse(-1)). // :Array[Int]         | Unboxing from Some
      mkString(" ")         // :String             | Producing the output string

  println(outputOf(inputInts))
      
}
