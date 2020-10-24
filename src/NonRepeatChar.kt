
import kotlin.collections.HashMap


//How to program to print the first non repeated character from String?


fun main(){
    var str = "abac"
    val count = HashMap<Char,Int>()
    for(element in str){
        count[element] = count.getOrDefault(element,0) +1
    }
    for (i in 0..1){
        if(count[str[i]] == 1){
            println(str[i])
        }
    }
}
