import java.util.Collections
import java.util.PriorityQueue

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val maxqueue = PriorityQueue<Int>(Collections.reverseOrder())

    repeat(n) {
        when(val x = br.readLine().toInt()){
            0 -> {
                if (maxqueue.isEmpty()){
                    bw.write("0\n")
                } else {
                    bw.write("${maxqueue.poll()}\n")
                }
            }
            else -> maxqueue.offer(x)
        }
    }
    bw.flush()
    bw.close()
    br.close()
}
