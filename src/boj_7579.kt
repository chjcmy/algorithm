fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val memory = readLine().split(" ").map { it.toInt() }.toIntArray()
    val cost = readLine().split(" ").map { it.toInt() }.toIntArray()

    val totalCost = cost.sum()
    val dp = Array(n + 1) { IntArray(totalCost + 1) }

    for (i in 1..n) {
        val mem = memory[i-1]
        val c = cost[i-1]

        for (j in 0..totalCost) {
            dp[i][j] = dp[i-1][j]
            if (j >= c) {
                dp[i][j] = maxOf(dp[i][j], dp[i-1][j-c] + mem)
            }
        }
    }
    /*
    first는 처음으로 만족 하는걸 찾아 내는 함수이다
     */
    println((0..totalCost).first { j -> dp[n][j] >= m })
}
