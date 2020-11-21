//Given int[] array, return number with sum target for example {1,2,7,8,9},
// target is 9, return (1,8),(2,7)


fun main() {

    val arr = arrayOf(1, 2, 7, 8, 9)
    val target = 9

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] + arr[j] == target) {
                println("(" + arr[i] + "," + arr[j] + ")")


            }
        }
    }
}