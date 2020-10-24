//Find 10 biggest number in the array(not sorting)


fun main() {
//    var i: Int
//    val large = IntArray(5)
//    val array = intArrayOf(33, 55, 13, 46, 87, 42, 10, 34, 43, 56,20,35)
//    var max = 0
//    var index: Int
//    for (j in 0..4) {
//        max = array[0]
//        index = 0
//        i = 1
//        while (i < array.size) {
//            if (max < array[i]) {
//                max = array[i]
//               index = i
//            }
//            i++
//        }
//        large[j] = max
//        array[index] = Int.MIN_VALUE
//        println("Largest " + j + " : " + large[j])
//    }

    var arr = arrayOf(1,2,13,3,4,15,5,6,7,8,9,10,11,12,14)
    var swap = true

    while(swap){
        swap = false
        for(i in 0 until arr.size-1){
            if(arr[i] <arr[i+1]){
                var temp = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = temp
                swap = true
            }
        }
    }
    println(arr.take(10))

}