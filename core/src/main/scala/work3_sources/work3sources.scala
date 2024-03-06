package work3_sources

trait Three {
  val value: Int
  def rightThree: Three
  def leftThree: Three
}

final class ThreeNode(val value: Int) extends Three {

  def rightThree: Three = ???

  def leftThree: Three = ???
}