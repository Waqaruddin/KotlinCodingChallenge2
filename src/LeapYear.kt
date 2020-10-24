import java.util.*

///// Print the leap year
fun main() {

    val year = 2004
    var leap:Boolean

//    if (year % 4 == 0) {
//        if (year % 100 == 0) {
//
//            leap = year % 400 == 0
//        } else
//            leap = true
//    } else
//        leap = false
//
//    println(if (leap) "$year is a leap year." else "$year is not a leap year.")

    if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
        println(" $year is leap year")
    }else{
        println(" $year is  not a leap year")
    }
}

