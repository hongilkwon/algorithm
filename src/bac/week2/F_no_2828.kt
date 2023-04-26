package bac.week2

/*
사과담기
2-E

구현문제.

문제를 이해를 잘해야되고, 입력값을 잘못 읽어서 헤매였던 문제.
배열의 idx 잘 조절해야되는 문제
최소값
현재 움직여야 하는 위치를 최소한으로 더 한다 그럼 최종적인 최소값을 구할 수 있다.


	 1
	         5
         3
    | | | | | |
box |_|

idx:0 1 2 3 4 5

 */

//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    val screenN = info[0]
//    val boxSize = info[1]
//
//    val moveCnt = readLine().toInt()
//    val screen = 0..screenN
//
//    val box = arrayOf(0, boxSize)
//
//    var cnt = 0
//    for (i in 0 until moveCnt) {
//        val movePoint = readLine().toInt()
//
//        if (movePoint in box[0] + 1..box[1]) {
//            continue
//        } else {
//            if (movePoint <= box[0]) {
//                val d = box[0] - movePoint + 1
//                cnt += d
//                box[0] -= d
//                box[1] -= d
//            }
//            if (movePoint > box[1]) {
//                val d = movePoint - box[1]
//                cnt += d
//                box[0] += d
//                box[1] += d
//            }
//        }
//    }
//    println(cnt)
//}