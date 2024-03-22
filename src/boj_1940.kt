fun main() {
    val N = readLine()?.toInt() ?: 0
    val M = readLine()?.toInt() ?: 0
    val arr = readLine()!!.split(" ").map { it.toInt() }.sorted()

    var start = 0
    var end = N - 1
    var answer = 0

    while (start < end) {
        val sum = arr[start] + arr[end]

        when {
            sum == M -> {
                answer++
                start++
                end--
            }
            sum < M -> start++
            else -> end--
        }
    }

    println(answer)
}