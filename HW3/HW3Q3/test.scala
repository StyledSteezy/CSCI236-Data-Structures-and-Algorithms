import com.fpdatastruct.lists._
import com.fpdatastruct.lists.List._

val a2 = List(4, 5, 6)
val l = List(1, 2, 3) // calls apply
println(head(l))
println(tail(l))
println(drop(l,2))
println(dropWhile(l)(_ > 3))
println(append(l, a2))
println(appendElem(l, 99))
println(prepend(l, a2))
println(elemAtIndex(l, 2))
println(setElem(l, 2, 911))