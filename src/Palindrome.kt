import java.lang.StringBuilder

//How to check if a String and given number  is Palindrome?

fun main() {

    //String Palindrome
    var str = "Madams"
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

