package bac.week8




/*
    녹색 옷 입은 애가 젤다지?
*/

//import java.util.PriorityQueue
//
//var n = 0
//
//lateinit var map: Array<IntArray>
//
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//lateinit var dist: IntArray
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//const val INF = 100_000_000
//val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//fun dijkstra(start: Int) {
//
//    dist = IntArray(n * n) { INF }
//    dist[start] = 0
//
//    pq.add(start to 0)
//
//    while (pq.isNotEmpty()) {
//        val edge = pq.poll()
//        val selectedNode = edge.first
//
//        if (dist[selectedNode] < edge.second) continue
//
//        for (next in adjList[selectedNode]) {
//            val v = next.first
//            val w = next.second
//            val cost = dist[selectedNode] + w
//            if (dist[v] > cost) {
//                dist[v] = cost
//                pq.add(v to cost)
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    var cnt = 1
//    while (true) {
//
//        n = readLine().toInt()
//        if (n == 0) break
//
//        map = Array(n) {
//            readLine().split(" ").map { it.toInt() }.toIntArray()
//        }
//
//        adjList = Array(n * n) { mutableListOf() }
//
//        for (i in 0 until map.size) {
//            for (j in 0 until map[i].size) {
//                val u = n * i + j
//                for (k in 0 until 4) {
//
//                    val ny = i + dy[k]
//                    val nx = j + dx[k]
//
//                    if (ny !in 0 until n || nx !in 0 until n) continue
//
//                    val v = n * ny + nx
//                    val w = map[ny][nx]
//                    adjList[u].add(v to w)
//                }
//            }
//        }
//
//        dijkstra(0)
//        println("Problem $cnt: ${dist.last() + map[0][0]}")
//        cnt += 1
//    }
//    Unit
//}
//
