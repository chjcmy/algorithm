fun main() {
    val n = readln().toInt()

    val a = readln().split(" ").map { it.toInt() }

    val stack = mutableListOf<Int>()

    val ans = IntArray(n)

    for (i in 0 ..<n) {
        while (stack.isNotEmpty() && a[stack.last()] < a[i]) {
            ans[stack.last()] = a[i]
            stack.removeLast()
        }
        stack.add(i)
    }

    for (i in stack) {
        ans[i] = -1
    }

    println(ans.joinToString(" "))
    
}