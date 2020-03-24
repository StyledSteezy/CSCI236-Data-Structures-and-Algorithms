class search {
def bSearch(list: Array[Int], target: Int): Int = {
	var left = 0
	var right = list.length-1
	while (left<=right) {
		val mid = left + (right-left)/2
		if (list(mid)==target)
			return mid
		else if (list(mid)>target)
			right = mid-1
		else
			left = mid+1
		}
	-1
	}
}

object test extends search {
	def main(args: Array[String]) {
		println("t is measured in seconds") 
	
		//ranges: 10 / 100000 / 10000000
		//searching through 10 elements in this array
		val ar1 = (1 to 10).toArray

		val t1 = System.nanoTime

		bSearch(ar1, 7)

		val duration1 = (System.nanoTime - t1) / 1e9d
		
		println("searching through 10 elements in array ar1:")
		println("t1 = " + duration1)
		//searching through 100 thousand elements in this array
		val ar2 = (1 to 100000).toArray

		val t2 = System.nanoTime

		bSearch(ar2, 37)

		val duration2 = (System.nanoTime - t1) / 1e9d
		
		println("searching through 100000 elements in array ar2:")
		println("t2 = " + duration2)
		//searching through 10 million elements in this array
		val ar3 = (1 to 10000000).toArray

		val t3 = System.nanoTime

		bSearch(ar3, 4391)

		val duration3 = (System.nanoTime - t1) / 1e9d
		
		println("searching through 10000000 elements in array ar3:")
		println("t3 = " + duration3)
	}
}