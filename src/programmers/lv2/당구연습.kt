package programmers.lv2

/*
    당구연습

    수학적 개념이 필요한 문제, 그렇게 좋은 문제는 아님.
    "대칭이동"을 통해 점의 위치를 새롭게 위치 시키고 최소값을 계산한다.

    시작점이 (0, 0)이 좌측 하단

    단순구현에 가깝지만 쉽게 떠올리지 못하는 생각 떄문에 어렵다.
 */

//import kotlin.math.*
//
//fun solution(m: Int, n: Int, startX: Int, startY: Int, balls: Array<IntArray>): IntArray {
//    var answer = mutableListOf<Int>()
//
//    for (i in 0 until balls.size) {
//        val ballX = balls[i][0]
//        val ballY = balls[i][1]
//
//        // 4방향으로 쿠션을 생성하여 거리를 구하여 가장 작은것을 골라낸다.
//        val temp = mutableListOf<Int>()
//
//        // 상단으로 쿠션을 하여 거리를 구한다.(단, 위로 일직선상에 있으면 안된다.)
//        if (!(startX == ballX && ballY > startY)) {
//            val distance = ((startX - ballX).toDouble().pow(2) + (startY - (n + n - ballY)).toDouble().pow(2)).toInt()
//            temp.add(distance)
//        }
//        // 하단으로 쿠션을 하여 거리를 구한다.(단, 아래로 일직선상에 있으면 안된다.)
//        if (!(startX == ballX && ballY < startY)) {
//            val distance = ((startX - ballX).toDouble().pow(2) + (startY - (-ballY)).toDouble().pow(2)).toInt()
//            temp.add(distance)
//        }
//        // 왼쪽으로 쿠션을 하여 거리를 구한다.(단, 옆으로 일직선상에 있으면 안된다.)
//        if (!(startY == ballY && startX > ballX)) {
//            val distance = ((startX + ballX).toDouble().pow(2) + (startY - ballY).toDouble().pow(2)).toInt()
//            temp.add(distance)
//        }
//        // 오른쪽으로 쿠션을 하여 거리를 구한다.(단, 옆으로 일직선상에 있으면 안된다.)
//        if (!(startY == ballY && startX < ballX)) {
//            val distance = ((startX - (m + m - ballX)).toDouble().pow(2) + (startY - ballY).toDouble().pow(2)).toInt()
//            temp.add(distance)
//        }
//        val min = temp.minOrNull()!!
//        answer.add(min)
//    }
//    return answer.toIntArray()
//}

