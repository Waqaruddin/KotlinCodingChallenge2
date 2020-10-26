//Reverse a string

fun main(){
    var str = "Hello"
    var reverse = ""

    for(i in str.length-1 downTo 0){
        reverse += str[i]
    }
    println(reverse)
}