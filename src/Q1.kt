///Given int[] array return number appears twice

fun main() {

    val integers = arrayOf(1, 2, 3, 4, 4, 5, 1)

    for (i in 0 until integers.size - 1) {
        for (j in i + 1 until integers.size) {
            if (integers[i] == integers[j] && i != j) {
                println("Duplicate:" + integers[j])
            }
        }
    }


}

// o(n^2) because 2 loops