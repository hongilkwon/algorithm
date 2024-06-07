package bac.easy


/*
   Bitmap

   각 픽셀에 대해 "가장 가까운" 흰색 픽셀까지의 거리를 계산

   1 ≤ n ≤ 182, 1 ≤ m ≤ 182
*/

//import java.util.LinkedList
//import java.util.Queue
//
//var n = 0
//var m = 0
//
//lateinit var map: Array<IntArray>
//
//lateinit var visited: Array<IntArray>
//lateinit var result: Array<IntArray>
//
//
//val queue: Queue<Pair<Int, Int>> = LinkedList()
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//fun bfs() {
//
//    while (queue.isNotEmpty()) {
//        val node = queue.poll()
//
//        for (i in 0 until 4) {
//            val ny = node.first + dy[i]
//            val nx = node.second + dx[i]
//
//            if (ny !in 0 until n || nx !in 0 until m)
//                continue
//
//            if (visited[ny][nx] > 0)
//                continue
//            visited[ny][nx] = visited[node.first][node.second] + 1
//            queue.add(ny to nx)
//        }
//    }
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    map = Array(n) {
//        readLine().map { it.digitToInt() }.toIntArray()
//    }
//
//    visited = Array(n) { IntArray(m) { 0 } }
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            if (map[i][j] == 1) {
//                visited[i][j] = 1
//                queue.add(i to j)
//            }
//        }
//    }
//    bfs()
//    val result = visited.map { it.map { it - 1 } }
//    result.forEach {
//        println(it.joinToString(" "))
//    }
//    return@with Unit
//}