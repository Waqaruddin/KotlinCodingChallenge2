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
   val root = Node(1)
    root.value = 1
    root.left!!.value = 2
    root.right!!.value = 3
    root.left!!.left!!.value = 4
    root.right!!.left!!.value = 5
    root.right!!.right!!.value = 6


    println("(")
    reversePrint(root)
    println(")")


}