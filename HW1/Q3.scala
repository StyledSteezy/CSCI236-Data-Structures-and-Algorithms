import scala.annotation.tailrec
class search {
	var ls = List(1,2,7,3,4,5,6,7,5,8,9,10)

	def findLast(ss: List[Int], key: Int): Int = {
		@tailrec
		def loop(n: Int): Int =
			if (n >= ss.length) - 1
			else if (ss(n) == key) n
			else loop(n - 1)

		loop(ls.length - 1)
	}
}


object test extends search {
	def main(args: Array[String]) {
		var ls = List(1,2,7,3,4,5,6,7,5,8,9,10)
		val obj = new search
		
		println("List of integers: " + ls.mkString)
		println("Searching for the last number 7 in the List")
		val found = findLast(ls, 7)
		println("Found at index " + found)
	}
}

//Type scalac Q3.scala to compile
//Type scala Q3.scala to execute