//Given an array of numbers, tell me the number that occurs most frequently.[2,3,4,66,4,3]

fun main(){
    var arr = intArrayOf(1,2,2,3,3,3,4)

    var hashMap = HashMap<String,Int>()

    for (i in arr){
        hashMap[i.toString()] = (hashMap.getOrDefault(i.toString() , 0)) + 1
    }

    println(hashMap.maxBy{it.value})

   // println(hashMap.filter { it.value == 1 })

}


//fun getPopularElement(a: IntArray): Int {
//    var count = 1
//    var tempCount: Int
//    var popular = a[0]
//    var temp = 0
//    for (i in 0 until a.size - 1) {
//        temp = a[i]
//        tempCount = 0
//        for (j in 1 until a.size) {
//            if (temp == a[j]) tempCount++
//        }
//        if (tempCount > count) {
//            popular = temp
//            count = tempCount
//        }
//    }
//    return popular
//}