//How to remove duplicate characters from String?

fun main(){

    var str = "Hello"
    var set = mutableSetOf<Char>()
    var output = ""

    for(i in str){
        if(set.add(i)){
            output += i
        }
    }
    println(output)

    removeDuplicates("Hello")

}

fun removeDuplicates(str:String){
    val newStr = str.toCharArray().distinct().toString()
    println(newStr)

    //println(str.toCharArray().toSet().joinToString(""))

}