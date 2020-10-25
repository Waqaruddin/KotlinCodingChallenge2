//Print out the all the nodes of binary search tree in reverse sequence


data class Node(
        var value:Int,
        var left:Node? = null,
        var right:Node? = null
)


fun reversePrint(root:Node){
    if(root.right != null){
        reversePrint(root.right!!)
    }
    println("" + root.value.toString() + "")

    if(root.left != null){
        reversePrint(root.left!!)
    }
}

fun main(){

   val ten = Node(10)
    val five = Node(5)
    val six = Node(6)
    val four = Node(4)
    val fifteen = Node(15)
    val twelve = Node(12)
    val twenty = Node(20)

    ten.left = five
    five.left = four
    five.right = six
    ten.right = fifteen
    fifteen.left = twelve
    fifteen.right   = twenty


    println("(")
    reversePrint(ten)
    println(")")


}