import java.util.*

//Write a Java program to sort a numeric array and a string array


fun main(){
//    var arr = arrayOf(5,4,3,2,1)
//    Arrays.sort(arr)

/// Find missing number
//  sum of consective numbers
    // n* ((n+1)/2)
    // find you array sum and deduct from actual

    var arr = arrayOf(1,2,3,4,6,7)
    var len = 7

    var actualSum = len*((len+1)/2)
    var mySum = 0

    for(i in arr.indices){
        mySum += arr[i]
    }
    println("Missing number = " + (actualSum-mySum))

}