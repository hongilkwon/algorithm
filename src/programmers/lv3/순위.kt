package programmers.lv3

/*
    순위

    플로이드 와샬 / dfs/bfs(간선을 반대로 사용) 2개로 풀 수 있다.

    아이디어가 필요한 문제이며,
    문제를 읽음으로써 바로 플로이드 와샬 알고리즘을 파악하는건 쉽지 않다.
    이전에도 유사한 문제를 풀었던 기억이 난다.

 */


//class Solution {
//
//    lateinit var adjList: Array<MutableList<Int>>
//    lateinit var adjListRev: Array<MutableList<Int>>
//
//    lateinit var visited: IntArray
//    fun dfs(n: Int, adj: Array<MutableList<Int>>): Int {
//
//        visited[n] = 1
//
//        var cnt = 1
//        for (next in adj[n]){
//            if (visited[next] == 1) continue
//            cnt += dfs(next, adj)
//        }
//
//        return cnt
//    }
//
//    fun solution(n: Int, results: Array<IntArray>): Int {
//        var answer = 0
//
//        adjList = Array(n + 1) { mutableListOf() }
//        adjListRev = Array(n + 1) { mutableListOf() }
//        for (i in 0 until results.size) {
//            val u = results[i][0]
//            val v = results[i][1]
//
//            adjList[u].add(v)
//            adjListRev[v].add(u)
//        }
//
//        var cnt = 0
//
//        for (i in 1..n) {
//            // 내 앞으로 몇 개 있나.
//            visited = IntArray(n + 1) { 0 }
//            val front = dfs(i, adjListRev) - 1
//
//            // 내 뒤로 몇 개 있나.
//            visited = IntArray(n + 1) { 0 }
//            val back = dfs(i, adjList) - 1
//
////            println("$i => front: $front back: $back")
//            if (front + back == n - 1) cnt += 1
//        }
//
//        answer = cnt
//        return answer
//    }
//}