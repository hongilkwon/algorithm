package programmers.lv3

/*
    네트워크

    연결된 컴포넌트
    - 입력값이 인접행렬 -> 인접리스트로 변환


 */

//class Solution {
//
//    var n = 0
//    lateinit var computers: Array<IntArray>
//
//    lateinit var adjList: Array<MutableList<Int>>
//
//    lateinit var visited: BooleanArray
//    fun dfs(n: Int) {
//
//        for (next in adjList[n]) {
//            if (visited[next])
//                continue
//            visited[next] = true
//            dfs(next)
//        }
//    }
//
//    fun solution(n: Int, computers: Array<IntArray>): Int {
//        var answer = 0
//
//        this.n = n
//        this.computers = computers
//
//        adjList = Array(n + 1) { mutableListOf() }
//
//        for (i in 0 until computers.size) {
//            for (j in 0 until computers[i].size) {
//                if (computers[i][j] == 1)
//                    adjList[i + 1].add(j + 1)
//            }
//        }
//
//        visited = BooleanArray(n + 1) { false }
//
//        var cnt = 0
//        for (i in 1..n) {
//            if (!visited[i]) {
//                dfs(i)
//                cnt += 1
//            }
//        }
//        return cnt
//    }
//}
//
//fun main() {
//    Solution().solution(3, arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 0), intArrayOf(0, 0, 1)))
//}