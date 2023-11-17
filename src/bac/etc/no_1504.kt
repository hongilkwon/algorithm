package bac.etc


/*
    특정한 최단경로

    임의로 주어진 두 정점은 반드시 통과
    세준이는 한번 이동했던 정점은 물론, 한번 이동했던 간선도 다시 이동할 수 있다.
    하지만 반드시 최단 경로로 이동해야 한다는 사실에 주의하라.

    (2 ≤ N ≤ 800, 0 ≤ E ≤ 200_000)
     c 가중치 (1 ≤ c ≤ 1,000)

 */

//
//import java.util.*
//import kotlin.math.min
//
//var n = 0
//var e = 0
//
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//
//val INF = 1_000_000_000
//lateinit var dist: IntArray
//
//fun dijkstra(start: Int) {
//
//    dist = IntArray(n + 1) { INF }
//
//    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//    pq.add(start to 0)
//    dist[start] = 0
//
//    while (pq.isNotEmpty()) {
//        val edge = pq.poll()
//
//        if (dist[edge.first] < edge.second) continue
//
//        val u = edge.first
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
//    e = info[1]
//
//    adjList = Array(n + 1) { mutableListOf() }
//    for (i in 0 until e) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//        val v = edge[1]
//        val w = edge[2]
//
//        // 양방향
//        adjList[u].add(v to w)
//        adjList[v].add(u to w)
//    }
//
//    var answer = 0
//    val specialE = readLine().split(" ").map { it.toInt() }
//
//    var a = 0
//    dijkstra(1)
//    a += dist[specialE[0]]
//    dijkstra(specialE[0])
//    a += dist[specialE[1]]
//    dijkstra(specialE[1])
//    a += dist[n]
//
//
//    var b = 0
//    dijkstra(1)
//    b += dist[specialE[1]]
//    dijkstra(specialE[1])
//    b += dist[specialE[0]]
//    dijkstra(specialE[0])
//    b += dist[n]
//
//    answer = min(a, b)
//    if (answer >= INF || answer < 0)
//        println(-1)
//    else
//        println(answer)
//}