package programmers.lv1

/*
    푸드파이트 대회

    단순구현 문제.
 */

fun solution(food: IntArray): String {
    var answer: String = ""

    val sb = StringBuilder()
    for (i in 1 until food.size) {
        if (food[i] == 1) continue
        val cnt = food[i] / 2
        repeat(cnt) {
            sb.append(i)
        }
    }

    answer = sb.toString() + "0" + sb.reverse().toString()
    return answer
}