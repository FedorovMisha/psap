import scala.annotation.tailrec

trait Three {
  def value: Int
  def rightThree: Option[Three]
  def leftThree: Option[Three]
}

final class ThreeNode(val data: Int, left: Option[Three] = None, right: Option[Three] = None) extends Three {

  def value: Int = data

  def rightThree: Option[Three] = right

  def leftThree: Option[Three] = left
}

def printTree(three: Three): Unit =
  def helper(node: Option[Three]): Unit = node match {
    case Some(leaf) => {
      helper(leaf.leftThree)
      println(leaf.value)
      helper(leaf.rightThree)
    }
    case _ =>
  }
  helper(Some(three))

def insert(data: Int, node: Three): Three =
  def insertHelper(node: Option[Three], data: Int): Three = node match {
    case Some(threeNode) =>
      if (threeNode.value > data)
        println("add to left")
        new ThreeNode(threeNode.value, left = Some(insertHelper(threeNode.leftThree, data)), right = threeNode.rightThree)
      else
        println("add to right")
        new ThreeNode(threeNode.value, left = threeNode.leftThree, right = Some(insertHelper(threeNode.rightThree, data)))

    case None =>
      println("return node")
      new ThreeNode(data, None, None)
  }
  insertHelper(Some(node), data)


var root: Three = ThreeNode(
  10
)

printTree(root)

root = insert(15, root)

printTree(root)
