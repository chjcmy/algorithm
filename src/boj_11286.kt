import java.util.*
import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()

    val N = br.readLine().toInt()

    val pq = PriorityQueue<AbsInt>()

    repeat(N) {
        val cur = br.readLine().toInt()
        if (cur == 0) {
            if (pq.isEmpty()) println(0)
            else println("${pq.poll().int}")
        } else {
            pq.add(AbsInt(cur))
        }
    }
}

data class AbsInt(val int: Int) : Comparable<AbsInt> {
    override fun compareTo(other: AbsInt): Int {
        return abs(int).compareTo(abs(other.int)).let {
            if (it == 0) int.compareTo(other.int) else it
        }
    }
}
