// Print all the possible substrings of a string, you may skip some character
// but the sequence should not be changed


fun main() {
    var str = "abc"

    for (i in 0 until str.length) {
        for (j in i+1 until str.length) {

            println(str.substring(i, j))
        }
    }
}