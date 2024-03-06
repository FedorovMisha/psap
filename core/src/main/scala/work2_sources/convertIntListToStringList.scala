package work2_sources

val convertIntListToStringList = (lst: List[Int]) => lst.zipWithIndex.map {
  case (value, index) => s"Элемент под номером $index равен $value"
}