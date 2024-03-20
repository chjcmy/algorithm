fun main() {
    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()
    val numbers = br.readLine()
    var sum = 0
    for (i in 0..<n) {
        sum += numbers[i] - '0'
    }
    println(sum)
}