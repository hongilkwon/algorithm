package bac.easy



/*
    단지번호붙히기

    각 단지에 속하는 집의 수를 오름차순으로 정렬
    첫 번째 줄에는 총 단지수를 출력하시오. 그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.

    반환값이 있는 dfs

 */


//var n = 0
//lateinit var map: Array<IntArray>
//
//lateinit var visited: Array<IntArray>
//
//val dy = arrayOf(0, 1, 0, -1)
//val dx = arrayOf(1, 0, -1, 0)
//
//
//fun dfs(node: Pair<Int, Int>): Int {
//
//    val cnt = 1
//    var ret = 0
//
//    for (i in 0 until 4) {
//        val ny = node.first + dy[i]
//        val nx = node.second + dx[i]
//
//        if (ny !in 0 until n || nx !in 0 until n) continue
//        if (map[ny][nx] == 0) continue
//
//        if (visited[ny][nx] == 1) continue
//        visited[ny][nx] = 1
//
//        ret += dfs(ny to nx)
//    }
//
//    return cnt + ret
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    map = Array(n) {
//        readLine().toCharArray().map { it.digitToInt() }.toIntArray()
//    }
//
//    val temp = mutableListOf<Int>()
//    visited = Array(n) { IntArray(n) { 0 } }
//    for (i in 0 until map.size) {
//        for (j in 0 until map[i].size) {
//            if (map[i][j] != 0 && visited[i][j] != 1) {
//                visited[i][j] = 1
//                val size = dfs(i to j)
//                temp.add(size)
//            }
//        }
//    }
//
//    println(temp.size)
//    temp.sort()
//    temp.forEach { println(it) }
//
//    return@with Unit
//}