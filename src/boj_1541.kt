fun main() = with(System.`in`.bufferedReader()) {
    /*
    입력받은 문자열을 '-'를 기준으로 split 합니다.
    분리된 각 부분에 대해:
        '+'로 구분된 숫자들을 모두 더한다.
    첫 번째 그룹의 합을 결과값으로 설정한다.
    나머지 그룹의 합을 결과값에서 뺀다.
     */

        val expression = readLine()!!.split("-")
        var result = 0

        expression.forEachIndexed { index, group ->
            val sum = group.split("+").sumOf { it.toInt() }
            if (index == 0) {
                result += sum
            } else {
                result -= sum
            }
        }

        println(result)
}