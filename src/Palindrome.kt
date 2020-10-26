import java.util.*

import java.lang.StringBuilder

////How to check if a String and given number  is Palindrome?
//


//Palindrome without String builder
fun palindrome() {
    val original: String
    var reverse = ""
    val `in` = Scanner(System.`in`)
    val length: Int
    println("Enter the number or string")
    original = `in`.nextLine()
    length = original.length
    for (i in length - 1 downTo 0) {
        reverse += original[i]
    }
    println("reverse is: $reverse")
    if (original == reverse) println("The number is palindrome") else println("The number is not a palindrome")
}
fun main() {

    //String Palindrome with String Builder
    var str = "Madam"
    str = str.toLowerCase()

    var strBuilder = StringBuilder(str)

    if (strBuilder.reverse().toString() == str) {
        println("String is a palindrome")
    } else {
        println("String is not a palindrome")
    }

    //Number Palindrome

    var sum = 0
    var n = 300
    var temp = n
    var r = 0

    while(n>0){
        r = n%10
        sum = (sum*10) +r
        n /= 10
    }
    if(temp == sum){
        println("Palindrome number")
    }else{
        println("Not palindrome")
    }




}



