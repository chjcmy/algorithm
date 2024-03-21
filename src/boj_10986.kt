fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }
    val sum = IntArray(n + 1)
    val cnt = LongArray(m)

    cnt[0] = 1
    for (i in 1..n) {
        sum[i] = (sum[i - 1] + arr[i - 1]) % m
        cnt[sum[i]]++
    }

    var ans: Long = 0
    for (i in cnt) {
        ans += i * (i - 1) / 2
    }

    println(ans)
}