import java.util.*

//Fibonnaci sequence

fun main(){

    var num:Int
    var a = 0
    var b = 0
    var c = 1
    var `in` = Scanner(System.`in`)
    println("Enter the number of times")
    num = `in`.nextInt()
    println("Fibonacci series:")
    for (i in 0 until num) {
        a = b
        b = c
        c = a + b
        println(a.toString() + "")
    }

}

