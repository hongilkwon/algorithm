package bac.etc

/*
    숨박꼭질3

    수빈 점 N(0 ≤ N ≤ 100_000)
    동생 점 K(0 ≤ K ≤ 100_000)

    1초 후에 X-1 또는 X+1로 이동하게 된다. 순간이동을 하는 경우에는 0초 후에 2*X
    가장 빠른 시간이 몇 초 후

    일단, 최단거리 bfs를 떠올리지 못한건 반성해야된다.
    2번째는 이게 bfs로 해결을 하려고 한다면 가중치가 같아야 하는데, 2배로 이동하는 경로는 가중치가 0이다.

    즉, dijkstra 알고리즘에서 일단 현재 노드에서 최소 가중치를 편입시키는 방법을 사용하는데 여기서도
    그 생각을 할 필요가 있다. 즉, 가중치가 제일 조금 드는 경로로 먼저 탐색을 시도하다 보면, 제일 먼저 도착점에 도착할떄 최소비용이란 것.
    쉽지 않은 생각이다.

 */

//import java.util.*
//
//var n = 0
//var k = 0
//
//val visited = BooleanArray(100_000 + 1) { false }
//fun go(start: Int) {
//
//    visited[start] = true
//
//    // pair ==> (위치, 현재까지 소모한 시간)
//    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//    pq.add(start to 0)
//
//    while (pq.isNotEmpty()) {
//
//        val info = pq.poll()
//
//        val n = info.first
//        val time = info.second
//
//        visited[n] = true
//
//        if (n == k) {
//            println(time)
//            break
//        }
//
//        if (n - 1 in 0..100_000 && !visited[n - 1]) {
//            pq.add(n - 1 to time + 1)
//        }
//        if (n + 1 in 0..100_000 && !visited[n + 1]) {
//            pq.add(n + 1 to time + 1)
//        }
//        if (n * 2 in 0..100_000 && !visited[n * 2]) {
//            pq.add(n * 2 to time)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    k = info[1]
//
//    go(n)
//}