import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()

    val arr = IntArray(N)
    for (i in 0..<N) {
        arr[i] = br.readLine().toInt()
    }

    var max = 0

    for (i in 0..<N) {
        max = Math.max(max, i - arr[i])
    }

    print(max + 1)
}
