package programmers.lv3

/*
    가장 먼 노드

    2 <= n <= 20_000

    간선은 양방향이며,
    1 <= edge.size <= 50_000

    1번 노드로 부터 가장 먼 노드의 개수를 반환 한다.

    bfs를 통해 가중치가 동등하다면,
    특정 노드서 부터 각 노드별 거리를 구하고, 최대값을 뽑아서 카운팅.
 */


//import java.util.LinkedList
//import java.util.Queue
//
//class Solution {
//
//    var n = 0
//    lateinit var edge: Array<IntArray>
//
//    lateinit var adjList: Array<MutableList<Int>>
//    lateinit var visited: IntArray
//
//    fun bfs(node: Int) {
//        val queue: Queue<Int> = LinkedList()
//
//        queue.add(1)
//        visited[node] = 1
//
//        while (queue.isNotEmpty()) {
//            val u = queue.poll()
//            for (v in adjList[u]) {
//                if (visited[v] == 0) {
//                    visited[v] = visited[u] + 1
//                    queue.add(v)
//                }
//            }
//        }
//    }
//
//    fun solution(n: Int, edge: Array<IntArray>): Int {
//        var answer = 0
//
//        this.n = n
//        this.edge = edge
//
//        adjList = Array(n + 1) { mutableListOf() }
//        for (i in 0 until this.edge.size) {
//            val u = edge[i][0]
//            val v = edge[i][1]
//            // 양방향 간선.
//            adjList[u].add(v)
//            adjList[v].add(u)
//        }
//
//        visited = IntArray(n + 1) { 0 }
//        bfs(1)
//
////        println(visited.joinToString(" "))
//        val maxValue = visited.maxOrNull()
//        var cnt = 0
//        for (i in 0 until visited.size) {
//            if (visited[i] == maxValue) cnt += 1
//        }
//
//        answer = cnt
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(
//        6,
//        arrayOf(
//            intArrayOf(3, 6),
//            intArrayOf(4, 3),
//            intArrayOf(3, 2),
//            intArrayOf(1, 3),
//            intArrayOf(1, 2),
//            intArrayOf(2, 4),
//            intArrayOf(5, 2)
//        )
//    )
//}