import scala.annotation.tailrec
class Student(val name: String, val gpa: Int) {}

object test {
	val p1 = new Student("John", 2)
	val p2 = new Student("Christian", 3)
	val p3 = new Student("Mark", 4)

	val list = List [Student] (p1, p2, p3)

	@tailrec
	def sum(pl: List[Student], mySum: Int = 0, index: Int = 0): Int = {
		if(index == pl.length) mySum
		else sum(pl, mySum + pl(index).gpa, index + 1)
	}
	sum(list)
}












