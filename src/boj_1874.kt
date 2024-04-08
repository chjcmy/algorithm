fun main() {
    val input = System.`in`.bufferedReader()

    val n = input.readLine().toInt();

    val sequence = IntArray(n) { input.readLine().toInt()}

    val stack = ArrayDeque<Int>()
    val result = mutableListOf<String>()

    var idx = 0

    for (i in 1..n) {
        stack.add(i)
        result.add("+")

        while (stack.isNotEmpty() && stack.last() == sequence[idx]) {
            stack.removeAt(stack.size - 1)
            result.add("-")
            idx++
        }
    }

    if (stack.isNotEmpty()) {
        println("NO")
    } else {
        result.forEach { println(it) }
    }

}