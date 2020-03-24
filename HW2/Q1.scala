class reverse {	
	def revList(list: List[Int]): List[Int] = list match {
		case x :: xs => revList(xs) ++ List(x)
		case Nil => Nil
	}
}

object test extends reverse {
	def main(args: Array[String]) {
		println("t is measured in seconds") 
	
		//ranges: 10 / 500 / 1000
		//reversing through 10 elements in list ls1
		val ls1 = (1 to 10).toList

		val t1 = System.nanoTime

		revList(ls1)

		val duration1 = (System.nanoTime - t1) / 1e9d
		
		println("reversing 10 elements in list ls1:")
		println("t1 = " + duration1)
		//reversing through 500 elements in list ls2
		val ls2 = (1 to 500).toList

		val t2 = System.nanoTime

		revList(ls2)

		val duration2 = (System.nanoTime - t2) / 1e9d
		
		println("reversing 500 elements in list ls2:")
		println("t2 = " + duration2)
		//reversing through 1000 elements in list ls3
		val ls3 = (1 to 1000).toList

		val t3 = System.nanoTime

		revList(ls3)

		val duration3 = (System.nanoTime - t3) / 1e9d
		
		println("reversing 1000 elements in list ls3:")
		println("t3 = " + duration3)
		
	}
}