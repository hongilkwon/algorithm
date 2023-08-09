package bac.week3

/*
    보물섬

    가중치가 같은 그래프에서 최단거리를 계산한다 >> bfs
    맵의 모든 시작점에서 bfs 탐색을 실시하면서 최단거리가 가장 긴것을 찾는다.

 */


//import java.util.LinkedList
//import java.util.Queue
//import kotlin.math.max
//
//var rows = 0
//var cols = 0
//
//lateinit var map: Array<CharArray>
//lateinit var visited: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//val q: Queue<Pair<Int, Int>> = LinkedList()
//
//fun bfs(point: Pair<Int, Int>): Int {
//
//    visited[point.first][point.second] = 1
//    q.add(point)
//
//    var maxLen = 0
//
//    while (q.isNotEmpty()) {
//        val p = q.peek()
//        q.poll()
//
//        for (i in 0 until 4) {
//            val ny = p.first + dy[i]
//            val nx = p.second + dx[i]
//
//            if (ny !in 0 until rows || nx !in 0 until cols) continue
//            if (visited[ny][nx] >= 1) continue
//            if (map[ny][nx] == 'W') continue
//
//            visited[ny][nx] = visited[p.first][p.second] + 1
//            q.add(ny to nx)
//            maxLen = max(visited[ny][nx], maxLen)
//        }
//    }
//    return maxLen
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    rows = info[0]
//    cols = info[1]
//
//    map = Array(rows) { charArrayOf() }
//    visited = Array(rows) { IntArray(cols) { 0 } }
//
//    for (i in 0 until rows) {
//        map[i] = readLine().toCharArray()
//    }
//
//    var maxLen = 0
//    for (i in 0 until rows) {
//        for (j in 0 until cols) {
//            if (map[i][j] == 'L') {
//                visited = Array(rows) { IntArray(cols) { 0 } }
//                val len = bfs(i to j)
////                sdArr.forEach { println(it.joinToString(" ")) }
////                println()
//                if (maxLen < len)
//                    maxLen = len
//            }
//        }
//    }
//    println(maxLen-1)
//}