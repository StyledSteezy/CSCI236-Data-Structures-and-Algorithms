class State(n:Int) {
	def sayHello(a:String) : String = {
	println("Hello")
	}
}
	
//local impacts only a
object local extends State {
	def main(args: Array[String]) {
	//counter to add to this list every time only local is called
	//return list with number of calls
	println("hello local")
}


//global - impacts both a and b
object global extends State {
	def main(args: Array[String]) {
	//counter to add to this list every time both local and global are called
	//reutn list with number of calls
	println("hello global")
}
