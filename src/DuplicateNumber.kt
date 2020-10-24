///Given int[] array return number appears twice

fun main() {

    val arr = arrayOf(1, 2, 3, 4, 4, 4, 5, 1)

    for (i in 0 until arr.size) {
        var count = 0

        for (j in 0 until arr.size) {
            if (arr[i] == arr[j] && i != j) {
                count++
            }
        }
        if(count == 1){
            println(arr[i])
        }

    }



}

// o(n^2) because 2 loops