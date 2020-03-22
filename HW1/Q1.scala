import scala.annotation.tailrec
class search {
	val arr = Array(1,2,3,4,5,6,7)

	def searchArray(ss: Array[Int], key: Int): Int = {
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
		val arr = Array(1,2,3,4,5,6,7)
		val obj = new search
		
		println("Array of integers: " + arr.mkString)
		println("Searching for number 5 in the Array")
		val found = searchArray(arr, 5)
		println("Found at index " + found)
	}
}

//Type scalac Q1.scala to compile
//Type scala Q1.scala to execute