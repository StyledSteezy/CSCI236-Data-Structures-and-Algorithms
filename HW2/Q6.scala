object App {
   def main(args: Array[String]) {
		val s = Map("a" -> "aValue", "b" -> "bValue", "c" -> "cValue")
		
		val t1 = System.nanoTime
	    if(s.contains( "a" )) {
			println("a key exists with value :"  + s("a"))
		} else {
           println("a key does not exist")
		}
		val duration1 = (System.nanoTime - t1) / 1e9d
		println("This is the time that it took to find the key a with the aValue: ")
		println("t1 = " + duration1)
	    
		val t2 = System.nanoTime
		if(s.contains( "b" )) {
			println("b key exists with value :"  + s("b"))
		} else {
			println("b key does not exist")
		}
		val duration2 = (System.nanoTime - t2) / 1e9d
		println("This is the time that it took to find the key b with the bValue: ")
		println("t2 = " + duration2)
		
		val t3 = System.nanoTime
	    if(s.contains( "x" )) {
			println("x key exists with value :"  + s("x"))
		} else {
			println("x key does not exist")
		}
		val duration3 = (System.nanoTime - t3) / 1e9d
		println("This is the time that it took to find that the key x does not exist: ")
		println("t3 = " + duration3)
		
		
	}
}
