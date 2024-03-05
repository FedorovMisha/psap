import org.scalatest.funsuite.AnyFunSuite
import work1_sources._
class FirstWorkTest extends  AnyFunSuite:
  test("tail_recursion_duplicateElements") {
    val a = List(33, 9, 321)
    assert(t_duplicateElements(a) == List(33, 33, 9, 9, 321, 321))
  }

  test("recursion_duplicateElements") {
    val a = List(33, 9, 321)
    assert(duplicateElements(a) == List(33, 33, 9, 9, 321, 321))
  }