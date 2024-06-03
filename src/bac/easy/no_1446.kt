package bac.easy


/*
   지름길(dp, dijkstra)

   모든 지름길은 일방통행이고, 고속도로를 역주행할 수는 없다.

   0 <= N <= 12,
   1 <= D <= 10_000

   운전해야 하는 거리의 최솟값

   사고과정.

    예시)
    5 150
    0 50 10 *
    0 50 20
    50 100 10 *
    100 151 10
    110 140 90

    0 --> 50 --> 100 --> 150
    10 + 10 + 50

    이전 거리까지의 최소값을 통해서 다음 거리의 최소값을 계산할 수 있어 보인다.
    -> dp(tabulation, 상향식)

    2. dijkstra

    u -> v  w
    0 -> 1, 1
    1 -> 2, 1
    2 -> 3, 1
    .
    .
    0 -> 50,10

*/

//import java.util.PriorityQueue
//
//var n = 0
//var d = 0
//
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//
//val INF = 1_000_000_000
//lateinit var dist: IntArray
//
//fun dijkstra(start: Int) {
//
//    dist = IntArray(10_001) { INF }
//    dist[start] = 0
//
//    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//    pq.add(start to 0)
//
//    while (pq.isNotEmpty()) {
//
//        val edge = pq.poll()
//        val u = edge.first
//
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
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    d = info[1]
//
//    adjList = Array(10_001) { mutableListOf() }
//    for (i in 0 until n) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//        val v = edge[1]
//        val w = edge[2]
//        adjList[u].add(v to w)
//    }
//    for (i in 0 until 10_001 - 1) {
//        adjList[i].add(i + 1 to 1)
//    }
//
//    dijkstra(0)
//    println(dist[d])
//
//    return@with Unit
//}

//import kotlin.math.min
//
//var n = 0
//var d = 0
//
//val INF = 10_001
//val table = IntArray(10_001) { INF }
//val map = mutableMapOf<Int, MutableList<Pair<Int, Int>>>()
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    d = info[1]
//
//    for (i in 0 until n) {
//        val roadInfo = readLine().split(" ").map { it.toInt() }
//        val from = roadInfo[0]
//        val to = roadInfo[1]
//        val cost = roadInfo[2]
//
//        if (map.containsKey(to)) {
//            map[to]!!.add(from to cost)
//        } else {
//            map[to] = mutableListOf(from to cost)
//        }
//    }
////    println(map)
//    table[0] = 0
//    for (i in 1 until table.size) {
//        if (!map.containsKey(i))
//            // 도착지까지의 지름길이 없는 경우
//            table[i] = min(table[i], table[i - 1] + 1)
//        else {
//            // 도착지까지의 지름길이 없는 경우
//            for (road in map[i]!!) {
//                table[i] = min(table[i], min(table[i - 1] + 1, table[road.first] + road.second))
//            }
//        }
//    }
//
//    println(table.joinToString(" "))
//    println(table[d])
//    return@with Unit
//}