package bac.etc


/*
    트리의 부모찾기

    트리의 루트를 1이라고 정했을 때, 각 노드의 부모를 구하는 프로그램을 작성하시오.
    N (2 ≤ N ≤ 100_000)

 */


//var n = 0
//lateinit var adjList: Array<MutableList<Int>>
//lateinit var parentsArr: IntArray
//
//lateinit var visited: IntArray
//
//fun dfs(node: Int) {
//
//    for (next in adjList[node]) {
//        if (visited[next] == 1) continue
//        visited[next] = 1
//        parentsArr[next] = node
//        dfs(next)
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
//        adjList[u].add(v)
//        adjList[v].add(u)
//    }
//
//    parentsArr = IntArray(n + 1) { 0 }
//    visited = IntArray(n + 1) { 0 }
//
//    dfs(1)
//
//    for (i in 2 until parentsArr.size) {
//        println(parentsArr[i])
//    }
//}