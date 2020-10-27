//Give you two string, check if string 1 appears in the string 2(can change the combination of string 1)


fun main() {
    var str1 = "Hello"
    var str2 = "ello"
    var list = ArrayList<String>()

    for (i in 0 until str1.length) {
        for (j in i + 1 until str1.length) {
            list.add(str1.substring(i, j))
        }
    }
    if (list.contains(str2)) {
        println("Yes")
    } else {
        println("No")
    }

}

fun checkSubString(str:String, subStr:String){
    if(str.contains(subStr)){
        println("Given string1 contains string2")
    }else{
        println("Given string1 does not contain string2")
    }
}


