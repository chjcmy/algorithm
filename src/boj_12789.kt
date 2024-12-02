import java.util.Stack

fun main(){
    /*
주어진 학생들의 번호를 순서대로 처리한다.
스택을 사용하여 대기열을 시뮬레이션한다.
현재 처리해야 할 번호와 학생의 번호를 비교한다.
     */
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val students = MutableList(n) { br.readLine().toInt() }
    val stack = Stack<Int>()
    var currentNumber = 1

    for (student in students) {
        while (stack.isNotEmpty() && stack.peek() == currentNumber) {
            stack.pop()
            currentNumber++
        }

        if (student == currentNumber) {
            currentNumber++
        } else if (stack.isEmpty() || student < stack.peek()) {
            stack.push(student)
        } else {
            bw.write("Sad\n")
            bw.flush()
            return
        }
    }

    while (stack.isNotEmpty()) {
        if (stack.pop() != currentNumber) {
            bw.write("Sad\n")
            bw.flush()
            return
        }
        currentNumber++
    }
    bw.write("Nice\n")
    bw.flush()
}