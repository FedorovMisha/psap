import org.scalatest.funsuite.AnyFunSuite
import work2_sources._

class SecondWorkTest extends AnyFunSuite {

  test("test.work2.processList") {
    val lst = List(1, 2, 3, 4, 5)

    val result = processList(lst) { case (l) => l * l }

    assert(result == List(1, 4, 9, 16, 25))
  }

  test("test.work2.convertIntListToStringList") {
    val lst = List(1, 2, 3)
    val result = convertIntListToStringList(lst)
    val assertLst = List(
      "Элемент под номером 0 равен 1",
      "Элемент под номером 1 равен 2",
      "Элемент под номером 2 равен 3",
    )
    assert(result == assertLst)
  }

  test("test.work2.getAvtStudentsBirthDates") {
    val students: List[Student] = List(
      (0, "Алёна", 1995, "FIL", 'F', 1, true),
      (1, "Гриша", 1994, "AVT", 'M', 2, true),
      (2, "Настя", 1993, "MTS", 'F', 3, false),
      (3, "Коля", 1997, "MTS", 'M', 1, false),
      (4, "Миша", 1997, "AVT", 'M', 3, true),
      (5, "Оля", 1992, "FIL", 'F', 3, false),
      (6, "Маша", 1991, "AVT", 'F', 5, true),
      (7, "Таня", 1993, "FIL", 'M', 4, true),
      (8, "Женя", 1992, "FIL", 'F', 4, true),
      (9, "Света", 1989, "AVT", 'F', 3, true),
      (10, "Аня", 1996, "MTS", 'F', 4, false),
      (11, "Лена", 1996, "AVT", 'F', 2, true),
      (12, "Сергей", 1994, "FIL", 'M', 3, false),
      (13, "Влад", 1993, "FIL", 'M', 5, false),
      (14, "Гена", 1996, "MTS", 'M', 1, true),
      (15, "Дима", 1995, "AVT", 'M', 5, false),
      (16, "Катя", 1991, "FIL", 'F', 4, false),
      (17, "Артём", 1994, "MTS", 'M', 3, true),
      (18, "Диана", 1995, "FIL", 'M', 4, false)
    )

    val result = avtStudentBirthDatesLivesInDormitory(students)

    assert(result == List(1994, 1997, 1991, 1989, 1996))
  }
}
