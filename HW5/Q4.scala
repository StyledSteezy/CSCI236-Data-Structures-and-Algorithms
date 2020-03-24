object app {
  def main(args: Array[String]) {
    sealed trait BinTree[+A]
    case object Leaf extends BinTree[Nothing]
    case class Branch[A](value: A, left: BinTree[A], right: BinTree[A]) extends BinTree[A]
    def buildTree[A](list: List[A]): BinTree[A] = list match {
    case Nil => Leaf
    case x :: xs => {
    val k = xs.length / 2
    Branch(x, buildTree(xs.take(k)), buildTree(xs.drop(k)))
    }
    }

    def depth [A] (t: BinTree[A]): Int = {
    var depths = Set [Int] ()
    @annotation.tailrec
    def depthAcc (tree: List[Tuple3[BinTree[A], Boolean, Int]], acc: Int): Int = tree match {
    case (Branch(_, l, r), _, _) :: rest => depthAcc((l, true, acc + 1) :: (Leaf, false, acc + 1) :: (r, true, acc + 1) :: rest, acc + 1)
    case (Leaf, notSeparator, curDepth) :: rest if notSeparator == false => depthAcc(rest, curDepth)
    case (Leaf, notSeparator, curDepth) :: rest if notSeparator == true => {
    depths += curDepth
    depthAcc(rest, acc)
    }
    case Nil => depths.max
    }
    depthAcc(List((t, true, 1)), 1)
    }

    val testList1 = List(1, 2, 3, 4, 5, 6, 7, 8)
    val testTree1 = buildTree(testList1)

    println("depth of the binary tree = " + depth(testTree1))
    
    }
}