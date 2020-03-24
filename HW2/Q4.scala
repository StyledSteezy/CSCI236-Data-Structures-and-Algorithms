import scala.io.Source

class words {
	val words = Source.fromFile("1Paragraph.txt").mkString
	var hp1P = words.split("\\s+").toList
	
	val somewords = Source.fromFile("5Paragraphs.txt").mkString
	var hp5P = somewords.split("\\s+").toList
	
	val lotswords = Source.fromFile("WholeChapter.txt").mkString
	var hp1C = lotswords.split("\\s+").toList
}

object test extends words {
	def main(args: Array[String]) {
		println("Counting the frequency of words in Harry Potter: Book 1")
		println("t is measured in seconds") 
		val t1 = System.nanoTime

		val freq1 = hp1P groupBy(x => x) map { y => (y._1, y._2.length) }

		val duration = (System.nanoTime - t1) / 1e9d
		
		println("1st paragraph, 130 words:")
		println("t1 = " + duration)
		//---------------------------------
		val t2 = System.nanoTime

		val freq2 = hp5P groupBy(x => x) map { y => (y._1, y._2.length) }

		val duration2 = (System.nanoTime - t2) / 1e9d

		println("paragraphs 1-5, 944 words:")
		println("t2 = " + duration2)
		
		//----------------------------------
		val t3 = System.nanoTime

		val freq3 = hp1C groupBy(x => x) map { y => (y._1, y._2.length) }

		val duration3 = (System.nanoTime - t3) / 1e9d

		println("All of chapter 1, 4717 words:")
		println("t3 = " + duration3)
		
	}
}
