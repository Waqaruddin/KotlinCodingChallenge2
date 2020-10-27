//Write a program to remove a given character from String?


fun main() {

    removeCharFromString("Hello", 'o')

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

fun removeCharFromString(str:String, c:Char){
    val newStr = str.replace(c.toString(), "")
    println(newStr)
}