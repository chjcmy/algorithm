fun main() {
    val br = System.`in`.bufferedReader();
    val n = br.readLine().toInt();
    val arr = br.readLine().split(" ").map { it.toInt() }.sorted()

    var answer = 0

    repeat(n) {
        var start = 0;
        var end = n - 1;

        while (start < end) {
            if (start == it) {
                start++;
                continue
            }
            if (end == it) {
                end--
                continue
            }

            val sum = arr[start] + arr[end]

            if(sum == arr[it]) {
                answer++
                break
            }

            if(sum < arr[it]) {
                start++
            } else {
                end--
            }
        }
    }
    println(answer)
}

