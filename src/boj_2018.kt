fun main() {
    val N = readLine()?.toInt() ?: 0

    var answer = 0
    var end = 0
    var sum = 0

    repeat(N) { start ->
        while (sum < N && end <= N) {
            end++
            sum += end
        }
        if (sum == N) {
            answer++
        }
        sum -= start + 1
    }

    println(answer)
}