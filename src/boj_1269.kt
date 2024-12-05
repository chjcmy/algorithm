import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    br.readLine().split(" ").map { it.toInt() }
    val a = br.readLine().split(" ").map { it.toInt() }.toSet()
    val b = br.readLine().split(" ").map { it.toInt() }.toSet()

    val aMinusB = a.size - a.intersect(b).size
    val bMinusA = b.size - a.intersect(b).size

    bw.write("${aMinusB + bMinusA}\n")

    br.close()
    bw.flush()
    bw.close()
}