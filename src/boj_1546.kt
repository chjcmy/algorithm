fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val numbers = br.readLine().split(" ").map { it.toInt() }
    val max = numbers.maxOrNull()!!
    val sum = numbers.sum()
    println(sum.toDouble() / n / max * 100)
}