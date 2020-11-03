import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main() {

    var s1 = "hello"
    var s2 = "aaa"

    println(twoStrings3(s1, s2))


}

fun twoString(s1: String, s2: String) {

//    var duplicate = ""
//    var notDuplicate = ""
//
//    for(i in 0..s1.length-1){
//        for(j in 0..s2.length-1){
//            if(s1[i] == s2[j]){
//               duplicate += "YES"
//            }else{
//                notDuplicate += "NO"
//            }
//        }
//    }
//    if(duplicate.contains("YES")){
//        println("YES")
//    }else{
//        println("NO")
//    }

}


fun twoStrings2(s1: String, s2: String): String {
    var flag = "NO"

    for (c in "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
        if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1)
            flag = "YES"

    }
    return flag
}

fun twoStrings3(s1: String, s2: String):String {
    val str1 = s1.toSet().toCharArray()
    val str2 = s2.toSet().toCharArray()
    var ans = ""

    for (c in str1) {
        if (str2.contains(c)) {
            ans = "YES"
        }else{
            ans = "NO"
        }
    }
    return ans
}

