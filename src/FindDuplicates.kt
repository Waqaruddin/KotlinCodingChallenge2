//How do you find duplicates in an array if there is more than one duplicate?

fun main(){
    var arr = arrayOf("java", "java", "python")
    var output = ""
    var set = mutableSetOf<String>()

    for(name in arr) {
        if(!set.add(name) && !output.contains(name)){
            output += name
        }
    }
    println(output)
}