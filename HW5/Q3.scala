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

        def size[A](tree: BinTree[A]): Int = {
            @annotation.tailrec
            def innerSize(treeList: List[BinTree[A]], acc: Int): Int = treeList match {
                case Nil => acc
                case Leaf::tn => innerSize(tn, acc)
                case Branch(_, l, r)::tn => innerSize(l::r::tn, acc + 1)
            }
            innerSize(List(tree), 0)
        }

        val testList1 = List(1, 2, 3, 4, 5, 6, 7, 8)
        val testTree1 = buildTree(testList1)

        println(size(testTree1))

    
    }

}