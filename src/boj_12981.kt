fun isOk(cnt: IntArray, arr: IntArray): Boolean {
    return cnt['A'.code]>=arr[0] && cnt['C'.code]>=arr[1] && cnt['G'.code]>=arr[2] && cnt['T'.code]>=arr[3]
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val input = readln().toList()

    val cnt = IntArray('Z'.code)
    val arr = readln().split(" ").map { it.toInt() }.toIntArray()

    var ans = 0
    for (i in 0..<m)
        cnt[input[i].code]++

    if (isOk(cnt, arr)) ++ans

    for (i in m..<n) {
        --cnt[input[i-m].code]
        ++cnt[input[i].code]
        if (isOk(cnt, arr)) ++ans
    }
    println(ans)
}