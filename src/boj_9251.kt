fun main() = with(System.`in`.bufferedReader()) {
    /*
        DP 테이블 생성: 두 문자열의 길이에 맞춰 2차원 배열을 만듭니다. dp[i][j]는 첫 번째 문자열의 i번째 문자까지와 두 번째 문자열의 j번째 문자까지의 LCS 길이를 나타냅니다.
        테이블 채우기: 두 문자열을 순회하면서 DP 테이블을 채웁니다.
        두 문자가 같으면: dp[i][j] = dp[i-1][j-1] + 1
        다르면: dp[i][j] = max(dp[i-1][j], dp[i][j-1])
        최종 결과: dp[n][m]이 최종 LCS의 길이가 됩니다. (n, m은 각 문자열의 길이)
     */

    val a = readLine()
    val b = readLine()

    val dp = Array(a.length + 1) { IntArray(b.length + 1) }

    for (i in 1..a.length) {
        for (j in 1..b.length) {
            if (a[i-1] == b[j-1]) {
                dp[i][j] = dp[i-1][j-1] + 1
            } else {
                dp[i][j] = maxOf(dp[i-1][j], dp[i][j-1])
            }
        }
    }

    println(dp[a.length][b.length])

}