fun main(){
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val numbers = br.readLine().split(" ").map { it.toInt() }
    val dp = IntArray(n+1)
    for (i in 1..n) {
        dp[i] = dp[i-1] + numbers[i-1]
    }
    repeat(m) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        println(dp[j] - dp[i-1])
    }
}