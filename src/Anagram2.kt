import java.util.*

//How to check if two Strings are anagrams of each other?

fun main(){
    var str1 = "abc"
    var str2 = "ccc"

    var str3 = str1.toCharArray()
    var str4 = str2.toCharArray()

    Arrays.sort(str3)
    Arrays.sort(str4)

    if(Arrays.equals(str3, str4)){
        println("Strings are anagram")
    }else{
        println("Strings are not anagram")
    }

}
