import java.util.*

//import java.util.*
//
////Given 2 strings, find the anagram of 2 strings
////EX: “binary” -> “brainy”
//
//
//
fun main(){

    var str1 = "abc"
    var str2 = "ccc"

    var s1 = str1.toCharArray()
    var s2 = str2.toCharArray()

    Arrays.sort(s1)
    Arrays.sort(s2)

    if(Arrays.equals(s1,s2)){
        println("Yes")
    }else{
        println("No")
    }



}

//fun isAnagram(s: String, t: String): Boolean {
//    if (s.length != t.length) {
//        return false
//    }
//    val counter = IntArray(26)
//    for (i in 0 until s.length) {
//        counter[s[i] - 'a']++
//        counter[t[i] - 'a']--
//    }
//    for (count in counter) {
//        if (count != 0) {
//            return false
//        }
//    }
//    return true
//}