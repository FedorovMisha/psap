package work2_sources

import scala.annotation.tailrec

def processList(lst: List[Int])(func: (Int) => Int): List[Int] =
  @tailrec
  def helper(input: List[Int], acc: List[Int]): List[Int] = input match {
    case Nil => acc
    case head :: tail => helper(tail, acc :+ func(head))
  }
  helper(lst, List())