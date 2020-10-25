///Given int[] array return number appears twice

fun main() {

//    val arr = arrayOf(1, 2, 3, 4, 4, 4, 5, 1)
//
//    for (i in 0 until arr.size) {
//        var count = 0
//
//        for (j in 0 until arr.size) {
//            if (arr[i] == arr[j] && i != j) {
//                count++
//            }
//        }
//        if(count == 1){
//            println(arr[i])
//        }
//
//    }

    var arr = arrayOf(1,2,3,4,5,5,4,4)
    var set = mutableSetOf<Int>()
    var output = ""

    for(num in arr){
        if(!set.add(num) && !output.contains(num.toString())){
            output += num
        }
    }

    for(i in output){
        println(i)
    }
}
