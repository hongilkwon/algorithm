package bac.week2.concept


/*
    바이러스
 */

//var n = 0
//lateinit var adj: Array<MutableList<Int>>
//lateinit var visited: Array<Int>
//
//fun dfs(n: Int): Int {
//
//    visited[n] = 1
//
//    var cnt = 1
//
//    for (nNode in adj[n]) {
//        if (visited[nNode] == 1) continue
//        cnt += dfs(nNode)
//    }
//
//    return cnt
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    val eCnt = readLine().toInt()
//
//    adj = Array(n + 1) { mutableListOf() }
//    visited = Array(n + 1) { 0 }
//
//    for (i in 0 until eCnt) {
//        val line = readLine().split(" ").map { it.toInt() }
//        adj[line[0]].add(line[1])
//        adj[line[1]].add(line[0])
//    }
//
//    val cnt = dfs(1)
//    println(cnt - 1)
//}
