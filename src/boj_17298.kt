fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }

    val stack = mutableListOf<Int>()

    val ans = IntArray(n)

    for (i in 0..<n) {
        while (stack.isNotEmpty() && arr[stack.last()] < arr[i]) {
            ans[stack.last()] = arr[i]
            stack.removeLast()
        }
        stack.add(i)
    }

    for (i in stack){
        ans[i] = -1
    }

    println(ans.joinToString(" "))
}