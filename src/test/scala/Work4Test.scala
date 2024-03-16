import org.scalatest.funsuite.AnyFunSuite
import work4_sources._
class Work4Test extends AnyFunSuite {

  test("dividePairs.test") {
    val lst = List(
      (1, 2),
      (1, 3),
      (3, 2),
      (0, 1),
      (4, 0)
    )
    val r = dividePairs(lst)
    assert(r == List(Some(0.5), Some(0.3333333333333333), Some(1.5), Some(0.0), None))
  }
}
