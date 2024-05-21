package bac.etc


/*
   우주 탐사선(floyd, 완전탐색, backtracking)

   "모든 행성"을 탐사하는데 걸리는 "최소 시간"을 계산
    탐사 후 다시 시작 행성으로 돌아올 필요는 없으며, 이미 방문한 행성도 "중복"해서 갈 수 있다.

    -> floyd 모든 점정에서 다른 모든 정점으로 가는 최단거리 계산.
    -> 이후 k 정점을 시작으로 모든 정점을 방문하며 최소 시간 갱신.
    -> Back Tracking을 해도 되지만, 안해도 크게 지장은 없다.


    n은 행성의 개수, K는 시작점(2 ≤ N ≤ 10, 0 ≤ K < N)
    T 이동비용 0 ≤ Tij  ≤ 1000
*/

//import kotlin.math.min
//
//var n = 0
//var k = 0
//
//lateinit var weightMatrix: Array<IntArray>
//
//val INF = 1_000_000_000
//
//fun floyd() {
//    for (t in 0 until n) {
//        for (i in 0 until n) {
//            for (j in 0 until n) {
//                weightMatrix[i][j] = min(weightMatrix[i][j], weightMatrix[i][t] + weightMatrix[t][j])
//            }
//        }
//    }
//}
//
//
//lateinit var visited: BooleanArray
//
//var minTime = 1000 * 10 + 1
//
//fun go(node: Int, time: Int, depth: Int) {
//
//    if (depth == n - 1) {
//        minTime = min(minTime, time)
//        return
//    }
//
//    if (minTime < time) {
//        return
//    }
//
//    for (i in 0 until n) {
//        if (i == node) continue
//        if (visited[i]) continue
//
//        visited[node] = true
//        go(i, time + weightMatrix[node][i], depth + 1)
//        visited[node] = false
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    k = info[1]
//
//    weightMatrix = Array(n) {
//        readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    floyd()
//
//    visited = BooleanArray(n)
//    go(k,0,0)
//    println(minTime)
//
//    return@with Unit
//}