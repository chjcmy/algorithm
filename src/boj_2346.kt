import java.util.*

fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    val deque = ArrayDeque<Pair<Int, Int>>()

    for (i in numbers.indices) {
        deque.add(Pair(i + 1, numbers[i]))
    }

    val result = StringBuilder()

    while (deque.isNotEmpty()) {
        val (index, move) = deque.removeFirst()
        result.append("$index ")

        if (deque.isEmpty()) break

        if (move > 0) {
            repeat(move - 1) {
                deque.addLast(deque.removeFirst())
            }
        } else {
            repeat(-move) {
                deque.addFirst(deque.removeLast())
            }
        }
    }

    println(result.toString().trim())
}
