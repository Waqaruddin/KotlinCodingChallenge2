//fun mostFrequent(arr: Array<Int>): Map.Entry<String, Int>? {
//    val pair = HashMap<String, Int>()
//
//    for (i in arr) {
//        pair[i.toString()] = (pair[i.toString()] ?: 0) + 1
//    }
//
//    return pair.maxBy { it.value }
//}


//}
//
//
//
//data class Node(
//        var value: Int,
//        var left: Node? = null,
//        var right: Node? = null
//)
//
//fun reversePrint(root: Node) {
//    if (root.right != null) {
//        reversePrint(root.right!!)
//    }
//    print(" " + root.value.toString() + " ")
//    if (root.left != null) {
//        reversePrint(root.left!!)
//    }
//}
//
//fun question9(root: Node) {
//    print("(")
//    reversePrint(root)
//    print(")")
//}
//
//





