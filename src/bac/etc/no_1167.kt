package bac.etc

/*
    트리의 지름
 */


//import java.util.LinkedList
//import java.util.Queue
//
//var v = 0
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
//            visitedDist[v] = visitedDist[node] + w
//            q.add(v)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    v = readLine().toInt()
//
//    adjList = Array(v + 1) { mutableListOf() }
//    for (i in 1..v) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//
//        for (j in 1 until edge.size - 1 step 2){
//            val v = edge[j]
//            val w = edge[j+1]
//            adjList[u].add(v to w)
//            adjList[v].add(u to w)
//        }
//    }
//
//    visitedDist = IntArray(v + 1) { 0 }
//    bfs(1)
//    val maxNode = visitedDist.indexOf(visitedDist.maxOrNull()!!)
//
//    visitedDist = IntArray(v + 1) { 0 }
//    bfs(maxNode)
//    println(visitedDist.maxOrNull()!! - 1)
//}