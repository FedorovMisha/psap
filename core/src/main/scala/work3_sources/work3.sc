import scala.annotation.tailrec
import work3_sources._

var root: Three = ThreeNode(
  10
)

println("Вывыод дерева:")
printTree(root)

println("Вызов функции insert(15, root)")
root = insert(15, root)
println("Вызов функции insert(7, root)")
root = insert(7, root)

println("Вывыод дерева:")
printTree(root)

println("Cумма элементов дерава:")
println(threeSum(root))
println("15 содержится в дереве:")
println(if (contains(15, Some(root))) "Да" else "Нет" )
println("13 содержится в дереве:")
println(if (contains(13, Some(root))) "Да" else "Нет" )
println("10 содержится в дереве:")
println(if (contains(10, Some(root))) "Да" else "Нет" )

case class Value(data: Int)