package bac.week2

/*
    안전영역
    2-C

    연결된 컴포넌트 찾기 문제.
    문제에 주어진 높이에 따라 조건을 맞추어 탐색한다.

 */

//var rows = 0
//var cols = 0
//
//lateinit var map: Array<IntArray>
//lateinit var nmap: Array<IntArray>
//lateinit var visited: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//fun dfs(point: Pair<Int, Int>) {
//    if (visited[point.first][point.second] == 1) return
//    visited[point.first][point.second] = 1
//
//    for (i in 0 until 4) {
//        val ny = point.first + dy[i]
//        val nx = point.second + dx[i]
//
//        if (ny !in 0 until nmap.size || nx !in 0 until nmap.first().size) continue
//        if (nmap[ny][nx] == 0) continue
//        dfs(ny to nx)
//    }
//}
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val mapSize = readLine().toInt()
//    rows = mapSize
//    cols = mapSize
//
//    map = Array(rows) { IntArray(cols) }
//
//    for (i in 0 until mapSize) {
//        val arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//        map[i] = arr
//    }
//
////    var min = 100
////    var max = 0
////    for (i in 0 until mapSize) {
////        for (j in 0 until mapSize) {
////            if (map[i][j] < min)
////                min = map[i][j]
////            if (map[i][j] > max)
////                max = map[i][j]
////        }
////    }
//
//    var maxSafeArea = 0
//    for (bac.week5.concept.getN in 0..100) {
//
//        nmap = Array(rows) { IntArray(cols) { 0 } }
//        visited = Array(rows) { IntArray(cols) { 0 } }
//        var safeArea = 0
//
//        map.forEachIndexed { i, arr ->
//            arr.forEachIndexed { j, h ->
//                nmap[i][j] = if (h > bac.week5.concept.getN) 1 else 0
//            }
//        }
//
//        for (i in 0 until nmap.size) {
//            for (j in 0 until nmap.first().size) {
//                if (nmap[i][j] == 1 && visited[i][j] != 1) {
//                    dfs(i to j)
//                    safeArea += 1
//                }
//            }
//        }
//
//        if (safeArea > maxSafeArea)
//            maxSafeArea = safeArea
//    }
//    println(maxSafeArea)
//}


