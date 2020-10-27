import java.util.*

//import java.util.*
//
////Given 2 strings, find the anagram of 2 strings
////EX: “binary” -> “brainy”
//
//
//
fun main() {

    checkStringsAnagram("abc", "ccc")

    var str1 = "abc"
    var str2 = "ccc"

    var s1 = str1.toCharArray()
    var s2 = str2.toCharArray()

    Arrays.sort(s1)
    Arrays.sort(s2)

    if (s1.contentEquals(s2)) {
        println("Yes")
    } else {
        println("No")
    }


}

fun checkStringsAnagram(str1:String, str2:String):Boolean{
    if(str1.length != str2.length){
        println("Strings are not anagrams")
        return false
    }

    var x = str1.toLowerCase().toCharArray().sorted().joinToString("")
    var y = str2.toLowerCase().toCharArray().sorted().joinToString("")

    if(x == y){
        println("Strings are anagrams")
        return true
    }else{
        println("Strings are not anagrams")
        return false
    }
}
