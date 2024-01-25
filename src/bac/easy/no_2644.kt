package bac.easy


/*
    촌수계산(bfs)

    n (1 ≤ n ≤ 100)

 */


//import java.util.LinkedList
//import java.util.Queue
//
//var n = 0
//var m = 0
//
//var a = 0
//var b = 0
//
//lateinit var adjList: Array<MutableList<Int>>
//
//lateinit var dist: IntArray
//
//fun bfs(start: Int) {
//
//    val queue: Queue<Int> = LinkedList()
//    queue.add(start)
//
//    dist[start] = 1
//
//    while (queue.isNotEmpty()) {
//
//        val node = queue.poll()
//
//        for (next in adjList[node]) {
//            if (dist[next] == 0) {
//                dist[next] = dist[node] + 1
//                queue.add(next)
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    val info = readLine().split(" ").map { it.toInt() }
//    a = info[0]
//    b = info[1]
//
//    m = readLine().toInt()
//
//    adjList = Array(n + 1) { mutableListOf() }
//    for (i in 0 until m) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//        val v = edge[1]
//
//        adjList[u].add(v)
//        adjList[v].add(u)
//    }
//
//    dist = IntArray(n + 1) { 0 }
//    bfs(a)
//
//    if (dist[b] > 0) {
//        println(dist[b] - 1)
//    } else {
//        println(-1)
//    }
//    return@with Unit
//}

