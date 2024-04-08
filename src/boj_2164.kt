import java.util.LinkedList

fun main() {
    val n = readln().toInt()

    val queue = LinkedList<Int>()

    for (i in 1..n) {
        queue.add(i)
    }

    while (queue.size != 1) {
        queue.removeFirst()
        queue.addLast(queue.removeFirst())
    }

    println(queue[0])
}