object app {
  def main(args: Array[String]) {
    val stocks = List(287.41, 291.45, 281.21, 281.86, 276.82, 271.50, 271.27, 266.69, 278.05)
    
    val ls = List(287.41 * 0.02, 291.45 * 0.04, 281.21 * 0.06, 281.86 * 0.08, 276.82 * 0.1, 271.50 * 0.2, 271.27 * 0.4, 266.69 * 0.6, 278.05 * 0.8)

    println("Netflix stock prices from Oct 21 to Oct 31: " + stocks)
    
    println("EMA definition: moving average that places a greater weight and significance on the most recent data points.")

    println("")

    println("Therefore, by placing more significance on the most recent data points here are the values of the stock price with a higher weight on the more recent prices: " + ls)

    val sliding = ls.sliding(2,1).toList

    println("")

    println("Using the sliding window, here is the EMA line for the Netflix stock prices from Oct 21 to Oct 31: ")

    for(i <- sliding) {
      val index = i.sum
      val avg = index/sliding.length
      println(i)
      println("EMA line = " + avg)
    }
  }
}
