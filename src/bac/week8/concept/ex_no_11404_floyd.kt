package bac.week8.concept

/*
    플로이드 와샬.

    모든 노드에서 다른 모든 노드까지 최단경로 모두 계산한다. O(N^3)
    노드의 개수가 적어야 효율적인 사용 가능한 알고리즘이다.
    노드 및 간선의 개수가 많다면 다익스트라를 사용한다.
    방문하는 노드를 기준으로 로직을 수행한다.

    단, 매 단계 마다 방문하지 않은 노드중에 최단 거리 갖는 노드를 찾는 과정이 필요하지 않다.
    2차원 배열에 거리 정보를 저장한다.
    다이나믹 프로그래밍 유형의 알고리즘이다.

    특정한 노드 k를 경유해 가는 경우를 확인한다.
    A --> B 와 A --> K --> B 뭐가 더 짧은지 확인한다.

    D(ab) = min(D(ab), D(ak) + D(bk))

 */

//import kotlin.math.min
//
//const val INF = 1_000_000_000
//
//// n = 노드개수, m = 간선개수
//var n = 0
//var m = 0
//
//lateinit var distance: Array<Array<Int>>
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    m = readLine().toInt()
//    distance = Array(n + 1) { Array(n + 1) { INF } }
//
//    for (i in 1 until distance.size) {
//        for (j in 1 until distance.size) {
//            if (i == j) distance[i][j] = 0
//        }
//    }
//
//    for (i in 1..m) {
//        val edgeInfo = readLine().split(" ").map { it.toInt() }
//        val u = edgeInfo[0]
//        val v = edgeInfo[1]
//        val w = edgeInfo[2]
//        distance[u][v] = min(distance[u][v], w)
//    }
//
//    for (k in 1 until distance.size) {
//        for (i in 1 until distance.size) {
//            for (j in 1 until distance.size) {
//                distance[i][j] = min(distance[i][j], distance[i][k] + distance[k][j])
//            }
//        }
//    }
//
//    for (i in 1 until distance.size) {
//        for (j in 1 until distance.size) {
//            if (distance[i][j] == INF)
//                print("${0} ")
//            else
//                print("${distance[i][j]} ")
//        }
//        println()
//    }
//}