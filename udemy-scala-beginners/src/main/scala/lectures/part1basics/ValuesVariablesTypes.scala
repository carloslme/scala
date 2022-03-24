package lectures.part1basics

object ValuesVariablesTypes extends App {

  // VALUES
  val x: Int = 10
  println(x)

  // x = 2 //  VALS ARE IMMUTABLE

  val y = 20 // COMPILER can infer types
  println(y)

  val text: String = "Hello"
  val text2: String = "Hello 2"
  println(text)
  println(text2)

  val bool: Boolean = false
  println(bool)

  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 241242341L // Put capital L at the end to represent Long value
  val aFloat: Float = 2.12f // Put f at the end to represent Float value
  val aDouble: Double = 3.14159

  // VARIABLES: are mutable
  var aVariable: Int = 4
  aVariable = 5
  println(aVariable)
}
