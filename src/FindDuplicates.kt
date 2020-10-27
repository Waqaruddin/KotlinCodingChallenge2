//How do you find duplicates in an array if there is more than one duplicate?

fun main(){
    countDuplicates()
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

//Number of duplicates

fun countDuplicates(){
    val a = arrayOf("a", "a", "b", "c", "c")
    val b = a.distinct().count()
    val c = (a.size-b)
    println("Number of duplicates : $c")
}