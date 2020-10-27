
fun main(){

    var arr = intArrayOf(0,0,0,0,1,0)

    println(jumpClouds(6, "000010"))
    //println(jumpingOnClouds(arr))

}

fun jumpClouds(size:Int , s:String):Int{

    var i = 0
    var jumps = 0

   while(i < size-2){
       if(s[i+2] == '0'){
           i += 2
       }else{
           i ++
       }
       jumps++
   }
    return jumps
}

fun jumpingOnClouds(c:IntArray):Int{
    var count = -1
    var len = c.size
    var i =0
    while(i<len){
        if(i<len-2 && c[i+2] == 0){
            i += 2
            count++
        }
    }
    return count
}