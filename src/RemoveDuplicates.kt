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

}