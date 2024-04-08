import java.util.PriorityQueue

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int>()

    repeat(n) {
        val x = br.readLine().toInt()
        if (x != 0) {
            pq.add(x)
        } else {
            bw.write((if (pq.isEmpty()) 0 else pq.poll()).toString()        )
        }
    }

    bw.flush()
    bw.close()
    br.close()
}
