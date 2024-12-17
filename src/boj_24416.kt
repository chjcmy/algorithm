fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()

    val dp = IntArray(n + 1)
    dp[0] = 0
    if (n > 0) dp[1] = 1

    // 동적 프로그래밍으로 피보나치 수열 계산
    for (i in 2..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    val count = n.coerceAtMost(1)

    println(dp[n])
    println(count)

}