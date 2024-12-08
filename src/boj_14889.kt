import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val arr = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }

    val result = findMinDifference(n, arr)

    bw.write("$result")
    bw.flush()
    bw.close()
}

fun findMinDifference(n: Int, arr: Array<IntArray>): Int {
    var minDiff = Int.MAX_VALUE
    val teamSize = n / 2
    val allPlayers = (0..<n).toList()

    fun calculateTeamPower(team: List<Int>): Int {
        return team.flatMap { i -> team.map { j -> arr[i][j] } }.sum()
    }

    fun combination(team: List<Int>, start: Int) {
        if (team.size == teamSize) {
            val linkTeam = allPlayers - team.toSet()
            val powerDiff = abs(calculateTeamPower(team) - calculateTeamPower(linkTeam))
            minDiff = minOf(minDiff, powerDiff)
            return
        }

        for (i in start..<n) {
            combination(team + i, i + 1)
        }
    }

    combination(emptyList(), 0)
    return minDiff
}