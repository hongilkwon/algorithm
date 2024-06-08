package bac.etc

/*
   사회망 서비스(sns)

   사회망 서비스에 속한 사람들은 얼리 아답터이거나 얼리 아답터가 아니다.
   얼리 아답터가 아닌 사람들은 "자신의 모든 친구들이 얼리 아답터일 때"만 이 아이디어를 받아들인다.


   친구 관계 그래프가 트리인 경우, 즉 모든 두 정점 사이에 이들을 잇는 경로가 존재하면서 사이클이 존재하지 않는 경우만 고려
   가능한 한 최소의 수의 얼리 아답터를 확보하여 모든 사람이 이 아이디어를 받아들이게 하는 문제는 매우 중요하다.
   모든 개인이 새로운 아이디어를 수용하기 위하여 필요한 최소 얼리 어답터의 수를 구하는 프로그램


   2 ≤ N ≤ 1_000_000

   사고과정

   문제를 이해하는건 어렵지 않다. 하지만, 어떻게 풀어야되는지 방향자체를 못잡겠다.
   못풀어서 해설봤음.

   대부분 tree의 성질 + dp로 문제를 해결하였다.

   "자신의 모든 친구들이 얼리 아답터일 때"
    즉, 부모 노드가 얼리 얼리어답터라면, 자식은 얼리어답터일 수도 있고 아니여도 상관없다.
    부모 노드가 얼리 얼리어답터가 아니라면, 자식은 무조건 얼리 어답터이어야 한다.

*/

//import kotlin.math.min
//
//
//var n = 0
//lateinit var adjList: Array<MutableList<Int>>
//
//// table[node][isEarlyAdopter]
//lateinit var table: Array<IntArray>
//lateinit var visited: IntArray
//
//fun dfs(node: Int) {
//    for (next in adjList[node]) {
//        if (visited[next] == 1) continue
//        visited[next] = 1
//        dfs(next)
//        // 탐색후, 다시 노드를 거슬러 올라 올떄 연산한다!
//        // 부모 노드 얼리어답터가 아니면, 자식 노드는 모두 얼리 어답터이다.
//        table[node][0] += table[next][1]
//        // 부모 노드 얼리어답터라면, 자식 노드는 얼리어답터든 아니든 최소값을 구한다.
//        table[node][1] += min(table[next][0], table[next][1])
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//    adjList = Array(n + 1) { mutableListOf() }
//
//    for (i in 0 until n - 1) {
//        val edgeInfo = readLine().split(" ").map { it.toInt() }
//        val u = edgeInfo[0]
//        val v = edgeInfo[1]
//        adjList[u].add(v)
//        adjList[v].add(u)
//    }
//
//    table = Array(n + 1) { intArrayOf(0, 1) }
//    visited = IntArray(n + 1) { 0 }
//    visited[1] = 1
//    dfs(1)
//
//    table.forEach {
//        println(it.joinToString(" "))
//    }
//
//    println(min(table[1][0], table[1][1]))
//    return@with Unit
//}