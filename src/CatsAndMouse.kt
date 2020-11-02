import java.lang.Math.abs

//

fun main(){
    catAndMouse(1,3,2)
}

fun catAndMouse(a:Int , b:Int, c:Int) {
    if(kotlin.math.abs(c - a) < kotlin.math.abs(c - b)){
        println("Cat A")
    }else if (kotlin.math.abs(c - a) == kotlin.math.abs(c - b)){
        println("Mouse C")
    }else{
        println("Cat B")
    }
}
