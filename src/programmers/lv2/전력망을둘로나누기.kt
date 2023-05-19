package programmers.lv2

/*
    전략망을 둘로 나누기

    완전탐색 문제.

 */
//import kotlin.math.min
//import kotlin.math.abs
//
//lateinit var adj: Array<MutableList<Int>>
//lateinit var visited: Array<Int>
//
//fun dfs(node: Int, marker: Int) {
//
//    visited[node] = marker
//
//    for (next in adj[node]) {
//        if (visited[next] == 0)
//            dfs(next, marker) }
//}
//
//fun solution(n: Int, wires: Array<IntArray>): Int {
//    var answer: Int = Int.MAX_VALUE
//
//    for (skip in 0 until wires.size) {
//        adj = Array(n + 1) { mutableListOf() }
//        visited = Array(n+1) { 0 }
//
//        for (i in 0 until wires.size) {
//            if (i == skip) continue
//            adj[wires[i][0]].add(wires[i][1])
//            adj[wires[i][1]].add(wires[i][0])
//        }
//
//        var marker = 1
//        for (i in 1..n) {
//            if (visited[i] == 0) {
//                dfs(i, marker)
//                marker += 1
//            }
//        }
//
//        val a = visited.count { it == 1 }
//        val b = visited.count { it == 2 }
//        answer = min(answer, abs(a - b))
//    }
//    return answer
//}
//
//fun main() {
//    solution(
//        9, arrayOf(
//            intArrayOf(1, 3),
//            intArrayOf(2, 3),
//            intArrayOf(3, 4),
//            intArrayOf(4, 5),
//            intArrayOf(4, 6),
//            intArrayOf(4, 7),
//            intArrayOf(7, 8),
//            intArrayOf(7, 9),
//        )
//    )
//}