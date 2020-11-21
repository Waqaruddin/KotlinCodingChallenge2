
import java.util.*


class Solution(magazine: String, note: String) {
    var magazineMap: MutableMap<String, Int> = HashMap()
    var noteMap: MutableMap<String, Int> = HashMap()
    fun solve() {
        var canReplicate = true
        for (s in noteMap.keys) {
            if (!magazineMap.containsKey(s) || magazineMap[s]!! < noteMap[s]!!) {
                canReplicate = false
                break
            }
        }
        println(if (canReplicate) "Yes" else "No")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            val m: Int = scanner.nextInt()
            val n: Int = scanner.nextInt()

            // Eat whitespace to beginning of next line
            scanner.nextLine()
            val s = Solution(scanner.nextLine(), scanner.nextLine())
            scanner.close()
            s.solve()
        }
    }

    init {

        // Must use an object instead of a primitive because it may be assigned a null reference.
        var occurrences: Int?
        for (s in magazine.split("[^a-zA-Z]+".toRegex()).toTypedArray()) {
            occurrences = magazineMap[s]
            if (occurrences == null) {
                magazineMap[s] = 1
            } else {
                magazineMap[s] = occurrences + 1
            }
        }
        for (s in note.split("[^a-zA-Z]+".toRegex()).toTypedArray()) {
            occurrences = noteMap[s]
            if (occurrences == null) {
                noteMap[s] = 1
            } else {
                noteMap[s] = occurrences + 1
            }
        }
    }
}