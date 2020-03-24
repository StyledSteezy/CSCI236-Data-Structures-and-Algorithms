object demo {
   def main(args: Array[String]) {
      val s = Map("a" -> "aValue", "b" -> "bValue", "c" -> "cValue")
	  
	    if(s.contains( "a" )) {
			println("a key exists with value :"  + s("a"))
      } else {
           println("a key does not exist")
      }
	  
	    if(s.contains( "b" )) {
			println("b key exists with value :"  + s("b"))
      } else {
			println("b key does not exist")
      }
	  
	    if(s.contains( "x" )) {
			println("b key exists with value :"  + s("x"))
      } else {
			println("x key does not exist")
      }
	}
}

