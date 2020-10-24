//Write a program to remove a given character from String?


fun main() {

    var str = "Hello"

    var output = ""

    for (i in str) {
        if ( i != 'e') {
            output += i
        }else{
            continue
        }
    }
    println(output)
}