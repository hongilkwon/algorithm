import kotlin.math.max


/*
    종이 조각

    너무 어려움(다시 봐도 어려움)

    기본적인 아이디어 및 접근조차 하는게 어렵다.

    다음 연결이 가로면 1
    다음 연결이 세로면 0

    예시) 문제의 예시를 위의 아이디어로 비트로 표현하면 아래와 같다.

    0 0 0 1
    1 1 0 1
    1 1 1 1
    0 0 1 1

    이 처럼 종이가 잘려지는 모든 경우를 0,1을 사용하여 나타낼 수 있음.
    이후 가로숫자를 합산하는 반복하여 값을 누적하고, 세로숫자를 합산하는 반복을하여 값을 누적하여
    최댓값을 갱신하면서 정답을 구하면 된다.
 */


//var n = 0
//var m = 0
//
//var answer = 0
//lateinit var map: Array<Array<Int>>
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    m = info[1]
//
//    map = Array(n) { Array(m) { 0 } }
//
//    for (i in 0 until n) {
//        val line = readLine().map { it.toString().toInt() }.toTypedArray()
//        map[i] = line
//    }
//
////    map.forEach { println(it.joinToString(" ")) }
//
//    for (s in 0 until (1 shl n * m)) {
//
//        var sum = 0
//
//        // 가로로 잘려진 숫자를 더함
//        for (i in 0 until n) {
//            var temp = 0
//            for (j in 0 until m) {
//                val k = (i * m) + j
//                if (s and (1 shl k) == 0) {
//                    temp = temp * 10 + map[i][j]
//                } else {
//                    sum += temp
//                    temp = 0
//                }
//            }
//            // 누적된 나머지도 더 해줘야됨
//            sum += temp
//        }
//
//        // 세로로 잘려진 숫자를 더함
//        for (j in 0 until m) {
//            var temp = 0
//            for (i in 0 until n) {
//                val k = (i * m) + j
//                if (s and (1 shl k) != 0) {
//                    temp = temp * 10 + map[i][j]
//                } else {
//                    sum += temp
//                    temp = 0
//                }
//            }
//            sum += temp
//        }
//
//        answer = max(answer, sum)
//    }
//    println(answer)
//    Unit
//}

