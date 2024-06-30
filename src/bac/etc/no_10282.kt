package bac.etc


/*
   해킹(dijkstra)

   어떤 컴퓨터 a가 다른 컴퓨터 b에 의존한다면, b가 감염되면 그로부터 일정 시간 뒤 a도 감염되고 만다.
   이때 b가 a를 의존하지 않는다면, a가 감염되더라도 b는 안전하다.

    a, b, s가 주어진다(1 ≤ a, b ≤ n, a ≠ b, 0 ≤ s ≤ 1,000).
    이는 컴퓨터 a가 컴퓨터 b를 의존하며, 컴퓨터 b가 감염되면 s초 후 컴퓨터 a도 감염됨

    의존성 (a, b)가 두 번 이상 존재하지 않는다.

    사고과정.
    가중치가 다른 edge가 주어지고.

    의존성 (a, b)가 두 번 이상 존재하지 않는다면,
    dijkstra 사용하여 가장 큰 distance 갖는 노드가 곧 모든 노드를 지나 온것이기에 모든 컴퓨터가 감염되는 시간이고,
    거리를 구할 수 있는 노드가 곧 감염된 노드이다.
*/


//import java.util.PriorityQueue
//import kotlin.math.max
//
//
//var tc = 0
//
//var n = 0
//var d = 0
//var c = 0
//
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//
//const val INF = 1_000_000_000
//
//lateinit var dist: IntArray
//
//
//fun dijkstra(start: Int) {
//
//    dist = IntArray(n + 1) { INF }
//    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//
//    dist[start] = 0
//    pq.add(start to 0)
//
//    while (pq.isNotEmpty()) {
//        val node = pq.poll()
//        val u = node.first
//
//        if (dist[u] < node.second) {
//            continue
//        }
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
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    tc = readLine().toInt()
//    repeat(tc) {
//        val info = readLine().split(" ").map { it.toInt() }
//        n = info[0]
//        d = info[1]
//        c = info[2]
//
//        adjList = Array(n + 1) { mutableListOf() }
//        for (i in 0 until d) {
//            val edgeInfo = readLine().split(" ").map { it.toInt() }
//            val u = edgeInfo[1]
//            val v = edgeInfo[0]
//            val w = edgeInfo[2]
//
//            adjList[u].add(v to w)
//        }
//
//        dijkstra(c)
//        val num = dist.count { it != INF }
//        var cost = 0
//        for (i in 0 until dist.size){
//            if (dist[i]!= INF){
//                cost = max(cost, dist[i])
//            }
//        }
//        println("$num $cost")
//    }
//    return@with Unit
//}