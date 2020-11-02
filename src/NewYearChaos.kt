import java.lang.Math.max
import java.util.*

fun main(){

    val arr = intArrayOf(2,5,1,3,4)
    minimumBribes(arr)
}


fun minimumBribes(q:IntArray){

    var counter = 0
    for(i in q.indices){

        if((q[i] - (i+1)) > 2){
            println("Too chaotic")
            return
        }
        for(j in max(0, q[i]-2)..i){
            if(q[j] > q[i]){
                counter += 1
            }
        }
    }
    println(counter)
}