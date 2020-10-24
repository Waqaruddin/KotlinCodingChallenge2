// Find element that appears once

fun main() {

    var arr = arrayOf(1, 1, 2, 3, 3,4)

    for (i in 0 until arr.size) {
        var count = 0
        for (j in 0 until arr.size) {
            if (arr[i] == arr[j] && (i != j)) {
                count++
            }
        }
        if(count == 0){
            println(arr[i])
        }
    }
}

//