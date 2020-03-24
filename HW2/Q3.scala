import collection.mutable._
import scala.io.Source

class words {
	def countWords(text: String) = {
		val counts = Map.empty[String, Int]
		for (rawWord <- text.split("[ ,!.]+")) {
			val word = rawWord.toLowerCase
			val oldCount = 
				if (counts.contains(word)) counts(word)
				else 0
			counts += (word -> (oldCount + 1))
		}
		counts
	}
}

object test extends words {
	def main(args: Array[String]) {
		println("Brute force approach: Counting the frequency of words in Harry Potter: Book 1")
		println("t is measured in seconds") 
	
		val paragraph1 = Source.fromFile("1Paragraph.txt").mkString
		
		val t1 = System.nanoTime
		countWords(paragraph1)
		val duration1 = (System.nanoTime - t1) / 1e9d
		println("1st paragraph, 130 words:")
		println("t1 = " + duration1)
	
		val paragraphs5 = Source.fromFile("5Paragraphs.txt").mkString
		
		val t2 = System.nanoTime
		countWords(paragraphs5)
		val duration2 = (System.nanoTime - t1) / 1e9d
		println("paragraphs 1-5, 944 words:")
		println("t2 = " + duration2)
		
		val chapter1 = Source.fromFile("WholeChapter.txt").mkString
		val t3 = System.nanoTime
		countWords(chapter1)
		val duration3 = (System.nanoTime - t1) / 1e9d
		println("All of chapter 1, 4717 words:")
		println("t3 = " + duration3)
		
	}
}
	