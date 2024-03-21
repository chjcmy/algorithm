fun main() {
    val br = System.`in`.bufferedReader()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val maze = Array(n +1) { IntArray(n + 1)}

    for (i in 1..n) {
        val input = br.readLine().split(" ").map { it.toInt() }
        for (j in 1..n) {
            maze[i][j] = input[j - 1] + maze[i - 1][j] + maze[i][j - 1] - maze[i - 1][j - 1]
        }
    }

    for (i in 0..<m) {
        val (x1, y1, x2, y2) = br.readLine().split(" ").map { it.toInt() }
        println(maze[x2][y2] - maze[x1 - 1][y2] - maze[x2][y1 - 1] + maze[x1 - 1][y1 - 1])
    }
}