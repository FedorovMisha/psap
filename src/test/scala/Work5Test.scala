import org.scalatest.funsuite.AnyFunSuite
import work5_sources._

class Work5Test extends AnyFunSuite {

  test("work5.decimalTo2BaseTest") {
    assert(decimalTo2Base(456) == "111001000")
    assert(decimalTo2Base(2) == "10")
    assert(decimalTo2Base(16) == "10000")
  }

  test("work5.decimalTo8BaseTest") {
    assert(decimalTo8Base(456) == "710")
    assert(decimalTo8Base(2) == "2")
    assert(decimalTo8Base(16) == "20")
  }

  test("work5.decimalTo16BaseTest") {
    assert(decimalTo16Base(456) == "1128")
    assert(decimalTo16Base(2) == "2")
    assert(decimalTo16Base(16) == "10")
  }

  test("work5.decimalTo3BaseTest") {
    assert(decimalTo3Base(456) == "121220")
    assert(decimalTo3Base(2) == "2")
    assert(decimalTo3Base(16) == "121")
  }
}
