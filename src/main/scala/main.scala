import work1_sources._
@main
def main(): Unit =
  println(Console.BLUE + "Проверка рекурсии")

  val printMessage = (m: String) =>
    println(Console.MAGENTA + "Проверка рекурсии:")
    println(Console.RED + m)

  val (_, bStackoverflowMessage) = checkStackOverflowFor(duplicateElements, "element")
  printMessage(bStackoverflowMessage)

  val (_, tStackoverflowMessage) = checkStackOverflowFor(t_duplicateElements, "element")
  printMessage(tStackoverflowMessage)
