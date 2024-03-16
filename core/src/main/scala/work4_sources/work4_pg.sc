import work4_sources._
import scala.language.postfixOps

val lst = List(
  (1, 2),
  (1, 3),
  (3, 2),
  (0, 1),
  (4, 0)
)

val intPairsLst = List(
  IntPair(1, 2),
  IntPair(1, 3),
  IntPair(3, 2),
  IntPair(0, 1),
  IntPair(4, 0)
)

prettyDividePairs(lst) map println

intPairPrettyDivide(intPairsLst) map println

val expr = Add(Number(1), Multiply(Number(2), Number(3)))

println(expr toRPN)
