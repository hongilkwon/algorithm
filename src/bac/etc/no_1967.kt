package bac.etc



/*
    트리의 지름.

    트리(tree)는 사이클이 없는 무방향 그래프이다.
    트리에서는 어떤 두 노드를 선택해도 둘 사이에 경로가 항상 하나만 존재하게 된다.
    정확히 정의하자면 트리에 존재하는 모든 경로들 중에서 가장 긴 것의 길이

    노드의 개수 n(1 ≤ n ≤ 10,000)


    * 임의 노드에 가장 긴 경로로 연결된 노드는 트리의 지름을 구성하는 노드 중 1개이다.

 */

//import java.util.LinkedList
//import java.util.Queue
//
//
//var n = 0
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//
//lateinit var visitedDist: IntArray
//fun bfs(s: Int) {
//
//    val q: Queue<Int> = LinkedList()
//    q.add(s)
//    visitedDist[s] = 1
//
//    while (q.isNotEmpty()) {
//        val node = q.poll()
//
//        for (next in adjList[node]) {
//            val v = next.first
//            val w = next.second
//
//            if (visitedDist[v] > 0) continue
//
//            visitedDist[v] = visitedDist[node] + w
//            q.add(v)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    adjList = Array(n + 1) { mutableListOf() }
//    for (i in 1..n - 1) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//        val v = edge[1]
//        val w = edge[2]
//
//        adjList[u].add(v to w)
//        adjList[v].add(u to w)
//    }
//
//    visitedDist = IntArray(n + 1) { 0 }
//    bfs(1)
//    val maxNode = visitedDist.indexOf(visitedDist.maxOrNull()!!)
//
//    visitedDist = IntArray(n + 1) { 0 }
//    bfs(maxNode)
//    println(visitedDist.maxOrNull()!! - 1)
//}