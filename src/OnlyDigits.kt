import java.awt.SystemColor.text

//How to check if a String contains only digits?


fun main() {
    var str = "1234"
    var regex = "[0-9]+"

    if (str.matches(regex.toRegex())){
        println("All digits")
    }else{
        println("False")
    }

    println(doesStringContainsOnlyDigits())
}

fun doesStringContainsOnlyDigits():Boolean{
    var str = "1234a"
    var regex = "[0-9]+"

    return str.matches(regex.toRegex())
}