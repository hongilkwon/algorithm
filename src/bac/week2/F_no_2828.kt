package bac.week2

/*
사과담기
2-E
x

구현문제.

이해를 잘해야되고,
배열의 idx 잘 조절해야되는 문제

 */

fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toInt() }
    val screenN = info[0]
    val boxSize = info[1]

    val moveCnt = readLine().toInt()
    val screen = 0..screenN

    val box = arrayOf(0, boxSize)

    var cnt = 0
    for (i in 0 until moveCnt) {
        val movePoint = readLine().toInt()

        if (movePoint in box[0]+1..box[1]) {
            continue
        } else {
            if (movePoint <= box[0]) {
                val d = box[0] - movePoint + 1
                cnt += d
                box[0] -= d
                box[1] -= d
            }
            if (movePoint > box[1]) {
                val d = movePoint - box[1]
                cnt += d
                box[0] += d
                box[1] += d
            }
        }
    }
    println(cnt)
}