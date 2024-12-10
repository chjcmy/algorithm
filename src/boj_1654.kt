import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (k, n) = readLine()!!.split(" ").map { it.toInt() }
    val lines = LongArray(k) { readLine()!!.toLong() }

    Arrays.sort(lines)

    var left = 1L
    var right  = lines.maxOrNull()!!

    while(left <= right) {
        val mid = (left + right) / 2
        val count = lines.sumOf { it / mid }

        if (count >= n) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    println(right)
}