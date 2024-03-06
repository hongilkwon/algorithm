package bac.week8


/*
    오민식의 고민

    1 <= N,M <= 50
    돈의 최댓값과 교통 수단의 가격은 1,000,000보다 작거나 같은 음이 아닌 정수

    돈의 액수를 최대 -> 비용이 적은 간선 (최소비용)
    음수 가중치는 없지만, 특정 도시를 방문 후 얻은 수입이 비용보다 크다면,

    수입 > 비용 ---> 음수간선하고 동일한 역활
    사이클을 인지 할 필요가 있음.
    * 최소 -> 최대 (초기화를 음의 무한대로 해서 돈의 액수를 늘린다.)

 */

//import java.util.LinkedList
//import java.util.Queue
//
//var n = 0
//var s = 0
//var e = 0
//var m = 0
//
//data class Edge(val u: Int = -1, val v: Int = -1, val w: Int = 0)
//
//lateinit var adjList: Array<MutableList<Edge>>
//
//lateinit var nodeIncome: Array<Int>
//lateinit var dist: Array<Long>
//lateinit var edgeArr: Array<Edge>
//
//const val INF = Long.MIN_VALUE
//
//val q: Queue<Int> = LinkedList()
//var containsCycle = false
//fun go(start: Int) {
//
//    // 초기화
//    dist = Array(n) { INF }
//    dist[start] = nodeIncome[start].toLong()
//
//    // 모든 노드를 순회
//    for (i in 0 until n) {
//        // 반복마다 모든 간선을 확인 한다.
//        for (j in 0 until m) {
//            val u = edgeArr[j].u
//            val v = edgeArr[j].v
//            val w = nodeIncome[v] - edgeArr[j].w
//
//            if (dist[u] != INF && dist[v] < dist[u] + w) {
//                if (i == n - 1) {
//                    q.add(u)
//                    containsCycle = true
//                }
//                dist[v] = dist[u] + w
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    s = info[1]
//    e = info[2]
//    m = info[3]
//
//    edgeArr = Array(m) { Edge() }
//    adjList = Array(n) { mutableListOf() }
//
//    for (i in 0 until m) {
//        val edgeInfo = readLine().split(" ").map { it.toInt() }
//        val edge = Edge(edgeInfo[0], edgeInfo[1], edgeInfo[2])
//
//        edgeArr[i] = edge
//        adjList[edgeInfo[0]].add(edge)
//    }
//
//    nodeIncome = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    go(s)
////    println(dist.joinToString(" "))
//
//    val visited = Array(n) { 0 }
//    var flag = false
//    if (containsCycle) {
//        while (q.isNotEmpty()) {
//            val node = q.poll()
//            for (edge in adjList[node]) {
//                if (edge.v == e) {
//                    flag = true
//                    break
//                }
//                if (visited[edge.v] != 1) {
//                    visited[edge.v] = 1
//                    q.add(edge.v)
//                }
//            }
//            if (flag) break
//        }
//    }
//
//    if (dist[e] == INF)
//        println("gg")
//    else if (flag) {
//        println("Gee")
//    } else
//        println(dist[e])
//    Unit
//}
