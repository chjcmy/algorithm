import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashSet

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val sSet = HashSet<String>(n)
    repeat(n) {
        sSet.add(br.readLine())
    }

    val result = TreeSet<String>()
    repeat(m) {
        val name = br.readLine()
        if (sSet.contains(name)) {
            result.add(name)
        }
    }

    val sb = StringBuilder()
    sb.appendLine(result.size)
    result.forEach { sb.appendLine(it) }
    print(sb)
}