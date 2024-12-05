import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    val pattern = createPattern(n)

    for (line in pattern) {
        bw.write(line.joinToString(""))
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

fun createPattern(n: Int): Array<CharArray> {
    val pattern = Array(n) { CharArray(n) { ' ' } }
    drawStar(pattern, 0, 0, n)
    return pattern
}

fun drawStar(pattern: Array<CharArray>, r: Int, c: Int, size: Int) {
    if (size == 1) {
        pattern[r][c] = '*'
        return
    }

    val block = size / 3

    for (i in 0..<3) {
        for (j in 0..<3) {
            if (i == 1 && j == 1) {
                continue  // 중앙 부분 비우기
            }
            drawStar(pattern, r + i * block, c + j * block, block)  // 재귀적으로 작은 패턴 채우기
        }
    }
}