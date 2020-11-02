

fun main(){

    var s1 = "hello"
    var s2 = "world"

    twoString(s1,s2)

}

fun twoString( s1:String, s2:String){

    var duplicate = ""
    var notDuplicate = ""

    for(i in 0..s1.length-1){
        for(j in 0..s2.length-1){
            if(s1[i] == s2[j]){
               duplicate += "YES"
            }else{
                notDuplicate += "NO"
            }
        }
    }
    if(duplicate.contains("YES")){
        println("YES")
    }else{
        println("NO")
    }


}