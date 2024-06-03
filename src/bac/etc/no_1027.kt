package bac.etc


/*
   고층 건물(완전탐색, 수학)

   고층 빌딩 A에서 다른 고층 빌딩 B가 볼 수 있는 빌딩이 되려면,
   두 지붕을 잇는 선분이 A와 B를 제외한 다른 고층 빌딩을 지나거나 접하지 않아야 한다.

   가장 많은 고층 빌딩이 보이는 빌딩을 구하고, 거기서 보이는 빌딩의 수를 출력

   1<= N <= 50
   1<= 높이 <= 1_000_000_000 (10억)

   사고과정

   예시
   https://sookr5416.tistory.com/222

   5
   1 2 7 3 2

   3번 빌딩이 높이 7로 나머지 모든 빌딩을 볼 수 있다.

   기초적인 수학의 A와 B를 이은 선분의 기울기의 개념이 필요하다.
   두 점이 주어졌을때, (x1, y1) (x2, y2)
   기울기 (x2 - x1) / (y2 - y1)

   두 건물 사이의 직선 선분을 "지나거나 접하지 않으려면", 두 건물 사이에 다른 건물이 기울기가 겹치면 안됨.

   특정 건물 기준
   왼쪽으로는 기울기는 계속 감소하는 건물들의 개수
   오른쪽으로는 기울기는 계속 증가하는 건물들의 개수

   문제자체는 어렵지 않은데 기초 수학의 개념이 더해져서 조금 어려움.
*/

//import kotlin.math.max
//
//var n = 0
//lateinit var arr: IntArray
//
//fun calSlope(p1: Pair<Int, Int>, p2: Pair<Int, Int>): Double =
//    (p2.second.toDouble() - p1.second.toDouble()) / (p2.first.toDouble() - p1.first.toDouble())
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    var maxCnt = 0
//
//    for (i in 0 until arr.size) {
//        var temp = 0
//
//        // 왼쪽
//        var curSlope = Double.POSITIVE_INFINITY
//        for (j in i - 1 downTo 0) {
//            val p1 = j to arr[j]
//            val p2 = i to arr[i]
//            val slope = calSlope(p1, p2)
//
//            if (slope < curSlope) {
//
//                temp += 1
//                curSlope = slope
//            }
//        }
//
//        // 오른쪽
//        curSlope = Double.NEGATIVE_INFINITY
//        for (j in i + 1 until arr.size) {
//            val p1 = i to arr[i]
//            val p2 = j to arr[j]
//            val slope = calSlope(p1, p2)
//
//            if (slope > curSlope) {
//
//                temp += 1
//                curSlope = slope
//            }
//        }
//        maxCnt = max(maxCnt, temp)
//    }
//    println(maxCnt)
//    return@with Unit
//}