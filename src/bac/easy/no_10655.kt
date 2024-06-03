package bac.easy

/*
   마라톤(완전탐색)

   1번 체크포인트에서 시작해서 모든 체크 포인트를 순서대로 방문한 후 N번 체크포인트에서 끝나야지 마라톤이 끝난다
   게으른 젖소 박승원은 막상 대회에 참가하려 하니 귀찮아져서 중간에 있는 체크포인트 한개를 몰래 건너뛰려 한다.
   단, 1번 체크포인트와 N번 체크포인트를 건너뛰면 너무 눈치가 보이니 두 체크포인트는 건너뛰지 않을 생각이다.

   N (3 ≤ N ≤ 100_000)

   사고과정.
    4
    0 0
    8 3
    11 -1
    10 0

    (0,0) -> (8,3) -> (11,-1) -> (10,0)

    체크 포인트를 거처가는 거리 - 체크 포인트를 건너뛴 거리 차이 가장 클때??
*/

//import kotlin.math.abs
//import kotlin.math.max
//
//var n = 0
//lateinit var points: MutableList<Pair<Int, Int>>
//
//
//fun calDist(p1: Pair<Int, Int>, p2: Pair<Int, Int>): Int =
//    abs(p1.first - p2.first) + abs(p1.second - p2.second)
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    points = mutableListOf()
//    for (i in 0 until n) {
//        val pointInfo = readLine().split(" ").map { it.toInt() }
//        points.add(pointInfo[0] to pointInfo[1])
//    }
//
//
//    var maxSavedDist = 0
//    for (i in 1 until points.size - 1) {
//
//        val startPoint = points[i - 1]
//        val skipPoint = points[i]
//        val endPoint = points[i + 1]
//
//        val route1 = calDist(startPoint, skipPoint) + calDist(skipPoint, endPoint)
//        val route2 = calDist(startPoint, endPoint)
//
//        val savedDist = route1 - route2
//        maxSavedDist = max(maxSavedDist, savedDist)
//    }
//
//    var totalCost = 0
//    for (i in 0 until points.size - 1) {
//        totalCost += calDist(points[i], points[i + 1])
//    }
//
//    println(totalCost - maxSavedDist)
//    return@with Unit
//}