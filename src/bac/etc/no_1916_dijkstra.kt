package bac.etc

/*
    최소비용 구하기

    도시의 개수 N(1 ≤ N ≤ 1_000)
    버스의 개수 M(1 ≤ M ≤ 100_000)

    dijkstra
 */

//import java.util.PriorityQueue
//
//var n = 0
//var m = 0
//
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//
//val INF = 1_000_000_000
//lateinit var dist: Array<Int>
//
//fun dijkstra(start: Int) {
//
//    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//
//    dist[start] = 0
//    pq.add(start to 0)
//
//    while (pq.isNotEmpty()) {
//        // 현재 노드에서 가장 적은 비용으로 지날수 있는 간선 선택.
//        val edge = pq.poll()
//        val u = edge.first
//
//        // 이미 방문되어 최소값이 정해진 노드
//        if (dist[u] < edge.second)
//            continue
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
//    n = readLine().toInt()
//    m = readLine().toInt()
//
//    adjList = Array(n + 1) { mutableListOf() }
//
//    for (i in 1..m) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//        val v = edge[1]
//        val w = edge[2]
//
//        adjList[u].add(v to w)
//    }
//
//    dist = Array(n + 1) { INF }
//
//    val info = readLine().split(" ").map { it.toInt() }
//    dijkstra(info[0])
//    println(dist[info[1]])
//}