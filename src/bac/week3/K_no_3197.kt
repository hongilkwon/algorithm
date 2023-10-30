package bac.week3

/*
    백조의 호수

      1 ≤ R, C ≤ 1500.

      1500 * 1500
      시간초과 남.

 */


//var row = 0
//var col = 0
//
//lateinit var map: Array<CharArray>
//lateinit var visited: Array<BooleanArray>
//
//var lPoints = mutableListOf<Pair<Int, Int>>()
//
//var cnt = 0
//fun check(): Boolean {
//    visited = Array(row) { BooleanArray(col) { false } }
//
//    val start = lPoints[0]
//    val end = lPoints[1]
//
//    dfs(start)
//    return !visited[end.first][end.second]
//}
//
//
//val dy = intArrayOf(0, 1, 0, -1)
//val dx = intArrayOf(1, 0, -1, 0)
//
//val iceList = mutableListOf<Pair<Int, Int>>()
//fun dfs(point: Pair<Int, Int>, doIceCount: Boolean = false) {
//
//    visited[point.first][point.second] = true
//
//    for (i in 0 until 4) {
//        val ny = point.first + dy[i]
//        val nx = point.second + dx[i]
//
//        if (ny !in 0 until row || nx !in 0 until col) continue
//        if (map[ny][nx] == 'X') {
//            if (doIceCount) {
//                iceList.add(ny to nx)
//            }
//            continue
//        }
//        if (visited[ny][nx]) continue
//
//        dfs(ny to nx, doIceCount)
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    row = info[0]
//    col = info[1]
//
//    map = Array(row) { charArrayOf() }
//    visited = Array(row) { BooleanArray(col) { false } }
//
//    for (i in 0 until map.size) {
//        val line = readLine().toCharArray()
//        map[i] = line
//    }
//
//    // 두 백조의 지점 저장.
//    for (i in 0 until map.size) {
//        for (j in 0 until map[i].size) {
//            if (map[i][j] == 'L') lPoints.add(i to j)
//        }
//    }
//
//    while (check()) {
//
//        visited = Array(row) { BooleanArray(col) { false } }
//        iceList.clear()
//
//        for (i in 0 until map.size) {
//            for (j in 0 until map[i].size) {
//                if (!visited[i][j] && map[i][j] == '.') dfs(i to j, true)
//            }
//        }
//
//        iceList.forEach {
//            map[it.first][it.second] = '.'
//        }
//
//        map.forEach {
//            println(it.joinToString(" "))
//        }
//        println()
//        cnt += 1
//    }
//
//    println(cnt)
//}