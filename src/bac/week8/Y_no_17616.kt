package bac.week8


/*
    등수 찾기

    전체 학생의 등수를 발표 하는 대신, 두 학생 A, B가 대회 본부에 찾아가면 본부는 두 학생 중 어느 학생이 더 잘 했는지를 알려준다.
    둘 이상의 학생이 동점인 경우는 없다.


    (2 ≤ N ≤ 105, 1 ≤ M ≤ min(N(N-1)/2, 5×105), 1 ≤ X ≤ N

    앞에 몇놈있는지 뒤에 몇놈 있는지 확인한다.

    간단한 dfs/bfs 탐색한 노드 개수세기로 가능하다.

*/

//var n = 0
//var m = 0
//var x = 0
//
//lateinit var adjList: Array<MutableList<Int>>
//lateinit var adjListRev: Array<MutableList<Int>>
//
//lateinit var visited: IntArray
//fun dfs(idx: Int, adj: Array<MutableList<Int>>): Int {
//
//    visited[idx] = 1
//
//    var cnt = 1
//    for (next in adj[idx]) {
//        if (visited[next] == 1) continue
//        cnt += dfs(next, adj)
//    }
//
//    return cnt
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    m = info[1]
//    x = info[2]
//
//    var maxRank = 1
//    var minRank = n
//
//    adjList = Array(n + 1) { mutableListOf() }
//    adjListRev = Array(n + 1) { mutableListOf() }
//
//    for (i in 1..m) {
//        val rInfo = readLine().split(" ").map { it.toInt() }
//        val u = rInfo[0]
//        val v = rInfo[1]
//
//        adjList[u].add(v)
//        adjListRev[v].add(u)
//    }
//
//    visited = IntArray(n + 1) { 0 }
//    if (adjListRev[x].isNotEmpty()) {
//        maxRank = dfs(x, adjListRev)
//    }
//
//    visited = IntArray(n + 1) { 0 }
//    if (adjList[x].isNotEmpty()) {
//        minRank = n - dfs(x, adjList) + 1
//    }
//
//    println("$maxRank $minRank")
//    Unit
//}

