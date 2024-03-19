package work5_sources

import scala.annotation.tailrec

def decimalToNBase(base: Int)(number: Int): String =
  @tailrec
  def decimalToNBaseHelper(num: Int, acc: String): String = num match {
    case 0 => acc
    case num => decimalToNBaseHelper(
      num / base,
      (num % base).toString + acc
    )
  }
  decimalToNBaseHelper(number, "")

val decimalTo2Base = decimalToNBase(2)
val decimalTo8Base = decimalToNBase(8)
val decimalTo16Base = decimalToNBase(16)
val decimalTo3Base = decimalToNBase(3)

