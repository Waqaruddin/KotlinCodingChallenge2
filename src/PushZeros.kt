import java.util.*
import kotlin.collections.ArrayList


// Given an array of random numbers, Push all the zeros of a given array to the end of the array.
// For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
// it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}


fun main() {

//    var arr = arrayOf(1,0,2,0,3)
//    var j = 0
//    for(i in 0..arr.size-1){
//        if(arr[i] != 0){
//            val temp = arr[i]
//            arr[i] = arr[j]
//            arr[j] = temp
//            j++
//        }
//    }
//    println(arr.contentToString())
    var arr = ArrayList<Int>()

    arr.add(1)
    arr.add(0)
    arr.add(3)
    arr.add(2)
    arr.add(4)

    for (i in arr.indices) {
        if (arr[i] == 0) {
            arr.removeAt(i)
            arr.add(0)
        }

    }
    println(arr)


}



