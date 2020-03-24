object app {
  def main(args: Array[String]) {
    val ls = List(287.41, 291.45, 281.21, 281.86, 276.82, 271.50, 271.27, 266.69, 278.05)
    
    println("Netflix stock prices from Oct 21 to Oct 31: " + ls)
    

    val bsma = ls.sliding(2,1).toList

    for(i <- bsma) {
      val index = i.sum
      val avg = index/bsma.length
      println(i)
      println("SMA line = " + avg)
    }
  }
}
