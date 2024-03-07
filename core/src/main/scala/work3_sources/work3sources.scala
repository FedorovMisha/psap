package work3_sources

trait Three {
  def value: Int
  def rightThree: Option[Three]
  def leftThree: Option[Three]
}

final class ThreeNode(data: Int, left: Option[Three] = None, right: Option[Three] = None) extends Three {

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
        new ThreeNode(threeNode.value, left = Some(insertHelper(threeNode.leftThree, data)), right = threeNode.rightThree)
      else
        new ThreeNode(threeNode.value, left = threeNode.leftThree, right = Some(insertHelper(threeNode.rightThree, data)))

    case None =>
      println("return node")
      new ThreeNode(data, None, None)
  }
  insertHelper(Some(node), data)

def threeSum(three: Three): Int =
  def helper(node: Option[Three]): Int = node match {
    case Some(node) =>
      node.value + helper(node.leftThree) + helper(node.rightThree)
    case None => 0
  }
  helper(Some(three))

def contains(data: Int, three: Option[Three]): Boolean = three match {
  case Some(node) if node.value == data => true
  case Some(node) => contains(data, node.leftThree) || contains(data, node.rightThree)
  case None => false
}