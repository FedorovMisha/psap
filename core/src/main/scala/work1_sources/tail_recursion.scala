package work1_sources

import scala.annotation.tailrec

/**
 * Лаба 1 Рекурсия
 * Функция возвращает новый список, в котором каждый элемент входного списка повторяется дважды.
 * Пример: List(33, 9, 321) преобразуется в List(33, 33, 9, 9, 321, 321)
 */
def t_duplicateElements[A](l: List[A]): List[A] =
  @tailrec
  def helper(input: List[A], acc: List[A]): List[A] = input match {
    case Nil => acc
    case head :: tail => helper(tail, head :: head :: acc)
  }
  helper(l, Nil).reverse