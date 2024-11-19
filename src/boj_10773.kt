import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    /**
     * 재현이가 재민이와 같이 돈을 관리한다
     * 재현이가 잘못된 수를 부를 때 0을 외치고 , 가장 최근에 재민이가 쓴수를 지우게 한다
     * 재민이가 모든수를 받아 적은후 그 수의 합을 알게 만든다
     *
     * 1. 첫 번째줄에 정수 k를 주어진다
     * 2. k줄 만큼 정수 갯수를 받는다
     * 3. 정수가 0 일 경우 최근의 숫자를 빼준다
     * 4. 장부가 끝났을 경우에 값을 출력한다
     */
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = br.readLine().toInt()
    val stack = Stack<Int>()

    for (i in 0..<k) {
        val number = br.readLine().toInt()
        if (number == 0) {
            if (stack.isNotEmpty()) {
                stack.pop()
            }
        } else {
            stack.push(number)
        }
    }

    bw.write("${stack.sum()}\n")
    bw.flush()
    bw.close()
    br.close()
}
