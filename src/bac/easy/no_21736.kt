package bac.easy

/*
    헌내기는 친구가 필요해

    1 <= N <= 600
    1 <= M <= 600


 */

//
//var n = 0
//var m = 0
//
//var start = 0 to 0
//lateinit var map: Array<CharArray>
//
//val dy = arrayOf(0, -1, 0, 1)
//val dx = arrayOf(1, 0, -1, 0)
//
//lateinit var visited: Array<BooleanArray>
//
//var cnt = 0
//fun dfs(node: Pair<Int, Int>) {
//
//    if (visited[node.first][node.second]) return
//    if (map[node.first][node.second] == 'P'){
//        cnt += 1
//    }
//    visited[node.first][node.second] = true
//
//    for (i in 0 until 4) {
//        val ny = node.first + dy[i]
//        val nx = node.second + dx[i]
//
//        if (ny !in 0 until n || nx !in 0 until m) continue
//        if (map[ny][nx] == 'X') continue
//        dfs(ny to nx)
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    map = Array(n) {
//        readLine().toCharArray()
//    }
//    visited = Array(n) { BooleanArray(m) { false } }
//
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            if (map[i][j] == 'I') start = i to j
//        }
//    }
//
//    dfs(start)
//    println(if (cnt == 0) "TT" else cnt)
//}