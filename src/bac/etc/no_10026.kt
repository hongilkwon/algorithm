package bac.etc

/*
    적록색약

    (1 ≤ N ≤ 100)
    연결 컴포넌트의 기초 응용문제.

 */


//var n = 0
//
//lateinit var map: Array<CharArray>
//
//val dy = arrayOf(0, 1, 0, -1)
//val dx = arrayOf(1, 0, -1, 0)
//
//lateinit var visited: Array<IntArray>
//fun dfs(colors: CharArray, node: Pair<Int, Int>) {
//
//    if (visited[node.first][node.second] == 1) {
//        return
//    }
//    visited[node.first][node.second] = 1
//
//    for (i in 0 until 4) {
//        val ny = node.first + dy[i]
//        val nx = node.second + dx[i]
//
//        if (ny !in 0 until n || nx !in 0 until n) continue
//        if (map[ny][nx] in colors) {
//            dfs(colors, ny to nx)
//        }
//    }
//
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//
//    map = Array(n) { charArrayOf() }
//    for (i in 0 until n) {
//        map[i] = readLine().toCharArray()
//    }
//
//    visited = Array(n) { IntArray(n) { 0 } }
//    var cnt1 = 0
//    for (r in 0 until n) {
//        for (l in 0 until n) {
//            if (visited[r][l] == 0) {
//                dfs(charArrayOf(map[r][l]), r to l)
//                cnt1 += 1
//            }
//        }
//    }
//
//    visited = Array(n) { IntArray(n) { 0 } }
//    var cnt2 = 0
//    for (r in 0 until n) {
//        for (l in 0 until n) {
//            if (visited[r][l] == 0) {
//                val arr = if (map[r][l] in charArrayOf('R', 'G')) charArrayOf('R', 'G') else charArrayOf('B')
//                dfs(arr, r to l)
//                cnt2 += 1
//            }
//        }
//    }
//    println("$cnt1 $cnt2")
//}