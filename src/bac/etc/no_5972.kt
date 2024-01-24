package bac.etc


/*
    택배 배송(dijkstra)

    헛간 N (1 <= N <= 50_000)
    소들의 길 M (1 <= M <= 50_000) (양방향)
    소의 수 C_i (0 <= C_i <= 1_000)

    두 개의 헛간은 하나 이상의 길로 연결
 */

//import java.util.PriorityQueue
//
//var n = 0
//var m = 0
//
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//
//lateinit var dist: IntArray
//const val INF = 1_000_000_000
//
//fun dijkstra(node: Int) {
//
//    dist = IntArray(n + 1) { INF }
//    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//
//    dist[node] = 0
//    pq.add(node to 0)
//
//    while (pq.isNotEmpty()) {
//
//        val edge = pq.poll()
//        val u = edge.first
//
//        if (edge.second > dist[u]) continue
//
//        for (next in adjList[u]) {
//            val v = next.first
//            val w = next.second
//
//            if (dist[v] > dist[u] + w) {
//                dist[v] = dist[u] + w
//                pq.add(v to dist[v])
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    adjList = Array(n + 1) { mutableListOf() }
//    for (i in 0 until m) {
//        val edgeInfo = readLine().split(" ").map { it.toInt() }
//        val u = edgeInfo[0]
//        val v = edgeInfo[1]
//        val w = edgeInfo[2]
//
//        adjList[u].add(v to w)
//        adjList[v].add(u to w)
//    }
//
//    dijkstra(1)
//    println(dist[n])
//
//    return@with Unit
//}
