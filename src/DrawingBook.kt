import kotlin.math.min

// Minimum number of pages to turns


fun main() {

    println(pageCount(6,2))
}

fun pageCount(n: Int, p: Int): Int {

    var totalFront = n/2
    var targetFront = p/2
    var targetBack = totalFront - targetFront

    return Math.min(targetFront , targetBack)

}


