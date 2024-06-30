package bac.easy


/*
   진우의 달 여행 - small (재귀, dp)

   같은 방향으로 두번 연속으로 움직일 수 없다.
   달에 도달하기 위해 필요한 연료의 최소값을 계산해 주자.

   N, M (2≤ N, M ≤ 6)
   1 <= 행렬의 원소값 <= 100, 자연수

   사고과정.
   n, m이 크지 않아서 완전탐색으로 가능할 수 도??
   단순 재귀를 이용하면 쉽게 해결되는 문제이다.

*/

//import kotlin.math.min
//
//var n = 0
//var m = 0
//
//lateinit var map: Array<IntArray>
//
//val dy = arrayOf(1, 1, 1)
//val dx = arrayOf(-1, 0, 1)
//
//var minCost = 500
//
//fun go(node: Pair<Int, Int>, prev: Int, sum: Int) {
//
//    if (node.first == n) {
//        minCost = min(sum, minCost)
//        return
//    }
//
//    for (i in 0 until 3) {
//        if (i == prev) continue
//
//        val ny = node.first + dy[i]
//        val nx = node.second + dx[i]
//        if (nx !in 0 until m)
//            continue
//        go(ny to nx, prev = i,  sum + map[node.first][node.second])
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    map = Array(n) {
//        readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    for (i in 0 until m) {
//        go(0 to i, prev = -1, sum = 0)
//    }
//
//    println(minCost)
//    return@with Unit
//}