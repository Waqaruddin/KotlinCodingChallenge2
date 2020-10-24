//Characters in a string //Given a string of length N, print out:
////a. list of case-insensitive alphabetical characters contained in the string.
////b. Duplicate characters should only appear one time.
//Non-alphabetical characters can be ignored.
///Example:  “The rabbit” → t h e r a b i

fun main(){
    var str = "Rabbit"
//    str = str.toLowerCase().toSet().toString().filter { it.isLetter() }
//    println(str)

    val regex = "abcdefghijklmnopqrstuvwxyz"
    str = str.toLowerCase()
    var output = ""

    for(s in str.toCharArray()){
        if(regex.contains(s.toString()))
            if(!output.contains(s.toString()))
                output +=s.toString()
    }
    println(output)


}