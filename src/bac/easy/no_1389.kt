package bac.easy



/*
    케빈 베이컨의 6단계 법칙

    유저의 수 N (2 ≤ N ≤ 100)
    친구 관계의 수 M (1 ≤ M ≤ 5,000)

    bfs 최단거리
 */

//import java.util.LinkedList
//import java.util.Queue
//import kotlin.math.min
//
//var n = 0
//var m = 0
//
//lateinit var adjList: Array<MutableList<Int>>
//
//lateinit var dist: IntArray
//
//fun bfs(start: Int) {
//
//    val queue: Queue<Int> = LinkedList()
//    queue.add(start)
//    dist[start] = 1
//
//    while (queue.isNotEmpty()) {
//
//        val node = queue.poll()
//        for (next in adjList[node]) {
//            if (dist[next] > 0) continue
//            dist[next] = dist[node] + 1
//            queue.add(next)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    m = info[1]
//
//    adjList = Array(n + 1) { mutableListOf() }
//    for (i in 0 until m) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//        val v = edge[1]
//        adjList[u].add(v)
//        adjList[v].add(u)
//    }
//
//    var min = 100 * 5000
//    var minNum = 0
//    for (i in 1..n) {
//        dist = IntArray(n + 1) { 0 }
//        bfs(i)
//        if (min>dist.sum()-n){
//            min = min(min, dist.sum()-n)
//            minNum = i
//        }
//    }
//
//    println(minNum)
//    return@with Unit
//}