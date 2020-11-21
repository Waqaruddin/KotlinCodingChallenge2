object SingletonKotlin {

    var s = "Hello I am a string of singleton class"

}


fun main() {
    val x = SingletonKotlin
    val y = SingletonKotlin
    val z = SingletonKotlin
    x.s = x.s.toUpperCase()
    println("String from x " + x.s)
    println("String from y " + y!!.s)
    println("String from z " + z!!.s)
}
