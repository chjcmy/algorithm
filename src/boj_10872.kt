import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val N = br.readLine()!!.toInt()

    println(factorial(N))
}

fun factorial(a: Int): Int {
    return if (a <= 1) {
        1
    } else {
        a * factorial(a - 1)
    }
}