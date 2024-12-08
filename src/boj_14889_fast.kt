import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val array = Array(n) { IntArray(n) }
    val teamArray = BooleanArray(n) { false }
    repeat(n) { i ->
        val st = StringTokenizer(readLine())
        repeat(n) { y ->
            array[i][y] = st.nextToken().toInt()
        }
    }
    var min = Int.MAX_VALUE

    fun c14889(index: Int, level: Int) {
        if (level == n / 2) {
            var sum = 0
            for (i in teamArray.indices) {
                for (y in i + 1..<teamArray.size) {
                    if (teamArray[y] == teamArray[i]) {
                        if (teamArray[y]) {
                            sum += array[i][y] + array[y][i]
                        } else {
                            sum -= array[i][y] + array[y][i]
                        }
                    }
                }
            }

            min = min(min, abs(sum))
            return
        }

        val end = if (index == 0) 1 else n

        for (i in index..<end) {
            teamArray[i] = true
            c14889(i + 1, level + 1)
            teamArray[i] = false
        }
    }

    c14889(0, 0)
    print(min)
}