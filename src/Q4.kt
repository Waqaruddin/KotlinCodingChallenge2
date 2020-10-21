import java.util.*

///// Print the leap year
fun main() {

    val year = 1900
    var leap:Boolean

    if (year % 4 == 0) {
        if (year % 100 == 0) {

            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}

