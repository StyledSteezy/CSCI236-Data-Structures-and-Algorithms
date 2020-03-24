object demo {
	def main(args: Array[String]): Unit = {
		import com.github.plippe.fpinscala.chapter03._
		import com.github.plippe.fpinscala.chapter03.List._
		val ls = List(1,2,3,4,5,6,7)
		val lsdouble = List(1.0, 2.0, 3.0)
		println(sum(ls))
		println(product(lsdouble))
		println(append(ls, lsdouble))
		println(sumWithFoldRight(ls))
		println(productWithFoldRight(lsdouble))
	}
}