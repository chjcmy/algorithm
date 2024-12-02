import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    
    // 인덱스 정보를 포함한 배열 생성
    val arr = Array(n) { Pair(br.readLine().toInt(), it) }
    
    // 값을 기준으로 정렬
    arr.sort()
    
    // 정렬 전후의 인덱스 차이의 최대값 + 1이 답
    var maxDiff = 0
    for (i in arr.indices) {
        maxDiff = maxOf(maxDiff, arr[i].second - i)
    }
    
    println(maxDiff + 1)
}
