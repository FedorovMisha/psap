import scala.util.Random

def generateRandomIntWithValueRange(length: Int)(z: Int): Int =
  val rnd = new Random()
  z - length + rnd.nextInt(length * 2 + 1)

val generateRandomIntIn5Range = generateRandomIntWithValueRange(5)

def generateList(z: Int)(length: Int): List[Int] = for (
  i <- (1 to length).toList
) yield generateRandomIntIn5Range(z)

val generateList10 = generateList(10)
val generateList20 = generateList(20)

println(generateList10(10))
println(generateList20(10))