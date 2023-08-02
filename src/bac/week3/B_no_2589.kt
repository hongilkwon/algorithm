package bac.week3

/*
    보물섬

    1. 가장 긴 연결된 육지를 찾는다.(불필요한 단계이다)
    2. 가징 긴 육지의 모든 위치에서 넓이 우선탐색을 한다.

 */


//import java.util.LinkedList
//import java.util.Queue
//import kotlin.math.max
//
//var rows = 0
//var cols = 0
//
//lateinit var map: Array<CharArray>
//lateinit var sdArr: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//val q: Queue<Pair<Int, Int>> = LinkedList()
//
//fun bfs(point: Pair<Int, Int>): Int {
//
//    sdArr[point.first][point.second] = 1
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
//            if (sdArr[ny][nx] >= 1) continue
//            if (map[ny][nx] == 'W') continue
//
//            sdArr[ny][nx] = sdArr[p.first][p.second] + 1
//            q.add(ny to nx)
//            maxLen = max(sdArr[ny][nx], maxLen)
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
//    sdArr = Array(rows) { IntArray(cols) { 0 } }
//
//    for (i in 0 until rows) {
//        map[i] = readLine().toCharArray()
//    }
//
//    var sdMax = 0
//    for (i in 0 until rows) {
//        for (j in 0 until cols) {
//            if (map[i][j] == 'L') {
//                sdArr = Array(rows) { IntArray(cols) { 0 } }
//                val len = bfs(i to j)
////                sdArr.forEach { println(it.joinToString(" ")) }
////                println()
//                if (sdMax < len)
//                    sdMax = len
//            }
//        }
//    }
//    println(sdMax-1)
//}