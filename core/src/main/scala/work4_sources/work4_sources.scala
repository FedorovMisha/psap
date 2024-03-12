package work4_sources

import scala.language.postfixOps

trait Expr

case class Number(value: Double) extends Expr
case class Add(left: Expr, right: Expr) extends Expr
case class Subtract(left: Expr, right: Expr) extends Expr
case class Multiply(left: Expr, right: Expr) extends Expr
case class Divide(left: Expr, right: Expr) extends Expr

object Expr {
  implicit class ToRPN(expr: Expr) {
    def toRPN: String = expr match {
      case Number(value) => value.toString
      case Add(left, right) => s"${left toRPN} ${right toRPN} +"
      case Subtract(left, right) => s"${left toRPN} ${right toRPN} -"
      case Multiply(left, right) => s"${left toRPN} ${right toRPN} *"
      case Divide(left, right) => s"${left toRPN} ${right toRPN} /"
    }
  }
}
def dividePairs(list: List[(Int, Int)]): List[Option[Double]] = list.map {
  case (numerator, denominator) if denominator != 0 => Some(numerator.toDouble / denominator)
  case _ => None
}

def prettyDivideResult(list: List[Option[Double]]): List[String] = list.map {
  case Some(value) => s"Результат деления = $value"
  case None => "Деление на ноль невозможно"
}

case class IntPair(a: Int, b: Int)

val convertToTuplePair: List[IntPair] => List[(Int, Int)] = _ map(pair => (pair.a, pair.b))

val prettyDividePairs = dividePairs andThen prettyDivideResult

val intPairPrettyDivide = convertToTuplePair andThen prettyDividePairs