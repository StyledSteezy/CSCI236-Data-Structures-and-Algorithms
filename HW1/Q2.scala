import scala.annotation.tailrec
class search {
	var ls = List(1,2,3,4,5,6,7,5)

	def searchList(ss: List[Int], key: Int): Int = {
		@tailrec
		def loop(n: Int): Int =
			if (n >= ss.length) - 1
			else if (ss(n) == key) n
			else loop(n + 1)
			
		loop(0)
	}
}

object test extends search {
	def main(args: Array[String]) {
		val ls = List(1,2,3,4,5,6,7)
		val obj = new search
		
		println("List of integers: " + ls.mkString)
		println("Searching for number 6 in the List")
		val found = searchList(ls, 6)
		println("Found at index " + found)
	}
}

//Type scalac Q2.scala to compile
//Type scala Q2.scala to execute