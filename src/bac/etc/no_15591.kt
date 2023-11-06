package bac.etc


/*
    MooTube (Silver)

    N (1 ≤ N ≤ 5_000)
    좀 더 쉽게 말해서, 존은 N-1개의 동영상 쌍을 골라서 어떤 동영상에서 다른 동영상으로 가는 경로가 반드시 하나 존재하도록 했다.
 */


//import kotlin.math.min
//
//var n = 0
//var q = 0
//
//lateinit var adjList: Array<MutableList<Pair<Int, Int>>>
//
//lateinit var visited: IntArray
//
//lateinit var usado: Array<IntArray>
//fun dfs(start: Int, n: Int, r: Int = 1_000_000_000) {
//
//    for (next in adjList[n]) {
//
//        val v = next.first
//        val w = next.second
//
//        if (visited[v] == 1) continue
//        usado[start][v] = min(r, w)
//        visited[v] = 1
//        dfs(start, v, usado[start][v])
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    q = info[1]
//
//    adjList = Array(n + 1) { mutableListOf() }
//    for (i in 1..n - 1) {
//        val line = readLine().split(" ").map { it.toInt() }
//        val u = line[0]
//        val v = line[1]
//        val w = line[2]
//
//        adjList[u].add(v to w)
//        adjList[v].add(u to w)
//    }
//
//    usado = Array(n + 1) { IntArray(n + 1) { 0 } }
//
//    for (i in 1..n) {
//        visited = IntArray(n + 1) { 0 }
//        visited[i] = 1
//        dfs(i, i)
//    }
//
////    usado.forEach { println(it.joinToString(" ")) }
//
//    for (i in 1..q) {
//        val line = readLine().split(" ").map { it.toInt() }
//        val k = line[0]
//        val v = line[1]
//
//        var cnt = 0
//        for (j in 0 until usado[v].size) {
//            if (usado[v][j] >= k) cnt += 1
//        }
//        println(cnt)
//    }
//}