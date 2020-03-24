case class IntNode(value: Int, left: Option[IntNode] = None, right: Option[IntNode] = None) {

  def levelorder(f: IntNode => Unit) {
 
    def loVisit(ls: List[IntNode]): Unit = ls match {
      case Nil => None
      case node :: rest => f(node); loVisit(rest ++ node.left ++ node.right)
    }
 
    loVisit(List(this))
  }
}
 
object TreeTraversal extends App {
  implicit def intNode2SomeIntNode(n: IntNode) = Some[IntNode](n)
 
  println("level order traversal tree traversal definition: Process all nodes of a tree by depth: first the root, then the children of the root, etc.")

  println("")

  val tree = IntNode(1,
    IntNode(2,
      IntNode(4,
        IntNode(7)),
      IntNode(5)),
    IntNode(3,
      IntNode(6,
        IntNode(8),
        IntNode(9))))
    
    println("Tree: ")
    println(tree)
    println("")

  List("level order: " -> tree.levelorder _) foreach {
      case (name, func) =>
        val s = new StringBuilder(name)
        func(n => s ++= n.value.toString + " ")
        println(s)
    }
}