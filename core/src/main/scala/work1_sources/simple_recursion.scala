package work1_sources

/**
 * Лаба 1 Хвостовая рекурсия
 * Функция возвращает новый список, в котором каждый элемент входного списка повторяется дважды.
 * Пример: List(33, 9, 321) преобразуется в List(33, 33, 9, 9, 321, 321)
 */
def duplicateElements[A](l: List[A]): List[A] = l match {
  case Nil => Nil
  case head :: tail => head :: head :: duplicateElements(tail)
}