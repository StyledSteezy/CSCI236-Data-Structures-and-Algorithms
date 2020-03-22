class Person(val first: String, val last: String) {}

object test {
	def main(args: Array[String]) {
		val Chris = new Person("Christian", "Thomas")
		val Christian = new Person("Christian", "Tomford")
		val Jon = new Person("Jon", "Mayer")
		val Arron = new Person("Arron", "Pix")
		val persons = List(Chris, Christian, Jon, Arron)

		val map = persons.groupBy(_.first.mkString)
		println(map)
	}
}

//Type scalac Q5.scala to compile
//Type scala Q5.scala to execute