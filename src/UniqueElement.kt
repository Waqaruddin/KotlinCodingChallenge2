// Find element that appears once

fun main() {

    var arr = arrayOf(1, 1, 2, 3, 3,4)
    var hash = HashMap<String,Int>()

    for(i in arr){
        hash[i.toString()] = hash.getOrDefault(i.toString() , 0) + 1
    }

    for(i in arr){
        if(hash[i.toString()] == 1){
            println(i)
        }
    }

    fun printFirstDistinct(){
        val a = arrayOf("a", "a", "b", "c", "c")
        val b = a.distinct()
        println("First distinct element : ${b[0]}")
    }



//    for (i in arr.indices) {
//        var count = 0
//        for (j in arr.indices) {
//            if (arr[i] == arr[j] && (i != j)) {
//                count++
//            }
//        }
//        if(count == 0){
//            println(arr[i])
//        }
//    }
}

//