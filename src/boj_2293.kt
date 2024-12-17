fun main() = with(System.`in`.bufferedReader()) {
    /*
        * 1. 입력을 받아 동전의 개수 n과 목표 금액 k를 설정된다.
        * 2. 각 동전의 가치를 coins 배열에 저장된다.
        * 3. dp 배열을 생성하여 각 금액을 만들 수 있는 경우의 수를 저장된다.
        * 4. dp[0]을 1로 초기화된다 (0원을 만드는 방법은 1가지).
        * 5. 각 동전에 대해 반복하면서:
        *    - 현재 동전부터 목표 금액까지 각 금액에 대해:
        *      - 현재 금액에서 현재 동전의 가치를 뺀 금액을 만드는 경우의 수를 더해진다.
        * 6. 최종적으로 dp[k]가 목표 금액을 만드는 모든 경우의 수가 된다.
     */

    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val coins = IntArray(n) { readLine()!!.toInt() }
    val dp = IntArray(k + 1)

    dp[0] = 1  // 0원을 만드는 방법은 1가지 (아무 동전도 사용하지 않는 경우)

    for (coin in coins) {
        for (i in coin..k) {
            dp[i] += dp[i - coin]
        }
    }

    println(dp[k])
}