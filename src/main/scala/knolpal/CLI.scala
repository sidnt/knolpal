package knolpal

object CLI extends App {

  import PalCore._
  import helpers._

  def output =
    args.                   // :Array[String]      | args is the array containing the input ints
      tail.                 // :Array[String]      | the first argument(a/2 the problemstatement) is notneeded
      map(_.toInt).         // :Array[Int]         | because args contains strings 2bparsed to Ints
      map(validate _).      // :Array[Option[Int]] | turns our Array[Int] to Array[Option[Int]]
      map(_ map nextPal).   // :Array[Option[Int]] | each Some is mapped to its nextPalindrome
      map(_.getOrElse(-1)). // :Array[Int]         | Unboxing from Some
      mkString(" ")         // :String             | Producing the output string

  println(output)
      
}
