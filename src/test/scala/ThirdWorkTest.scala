import org.scalatest.funsuite.AnyFunSuite
import work3_sources._

def createRoot: Three =
  ThreeNode(
    50,
    left = Some(ThreeNode(30)),
    right = Some(
      ThreeNode(
        55,
        left = Some(ThreeNode(54))
      )
    )
  )

class ThirdWorkTest extends  AnyFunSuite {
  test("work3.root.insert.test") {
    var root = createRoot
    root = insert(56, root)

    assert(contains(56, Some(root)))
  }

  test("work3.root.contains.test.v1") {
    val root = createRoot
    assert(contains(30, Some(root)))
  }

  test("work3.root.contains.test.v2") {
    var root = createRoot
    root = insert(56, root)

    assert(contains(56, Some(root)))
  }

  test("work3.sum.test") {
    val root = createRoot
    assert(threeSum(root) == 189)
  }
}
