fun main() {

    /*
       문자열을 받는다
       해쉬셋 을 문자열 배열로 받는다
       해쉬셋 특징으로 중복 되면 안넣어지는걸 이용해서 계속 넣고
       마지막으로 해쉬셋의 사이즈를 출력한다
     */
    val s = readln()
    val substrings = HashSet<String>()

    for (i in s.indices) {
        for (j in i..<s.length) {
            substrings.add(s.substring(i, j + 1))
        }
    }

    println(substrings.size)
}