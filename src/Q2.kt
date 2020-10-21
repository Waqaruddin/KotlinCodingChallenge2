// Find element that appears once

fun main() {

    var arr = arrayOf(1, 1, 2, 3, 3)
    var res: Int = arr[0]
    for (i in 1 until arr.size) {
        res = res xor arr[i]
    }

    println(res)
}

//