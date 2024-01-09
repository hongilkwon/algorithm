package bac.etc


/*
    서강 그라운드

    dijkstra
 */

//import java.util.*
//import kotlin.math.max
//
//var n = 0
//var m = 0
//
//var r = 0
//
//lateinit var itemsCnt: IntArray
//
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//
//const val INF = 1_000_000_000
//lateinit var dist: IntArray
//fun dijkstra(n: Int) {
//    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//    pq.add(n to 0)
//    dist[n] = 0
//
//    while (pq.isNotEmpty()) {
//        val edge = pq.poll()
//
//        val u = edge.first
//        if (dist[u] < edge.second) continue
//
//        for (next in adjList[u]) {
//            val v = next.first
//            val w = next.second
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
//    r = info[2]
//
//    val temp = readLine().split(" ").map { it.toInt() }
//    itemsCnt = IntArray(n + 1) {
//        if (it == 0) 0 else temp[it - 1]
//    }
//
//    adjList = Array(n + 1) { mutableListOf() }
//    for (i in 0 until r) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//        val v = edge[1]
//        val w = edge[2]
//        adjList[u].add(v to w)
//        adjList[v].add(u to w)
//    }
//
//    var max = 0
//    for (initArea in 1..n) {
//
//        dist = IntArray(n + 1) { INF }
//        dijkstra(initArea)
//
//        var totalItem = 0
//        for (i in 1..n) {
//            if (dist[i] <= m) {
//                totalItem += itemsCnt[i]
//            }
//        }
//        max = max(max, totalItem)
//    }
//
//    println(max)
//    return@with Unit
//}