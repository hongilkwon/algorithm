package bac.week2

/*
    연구소

    (3 ≤ N, M ≤ 8)

    1. 기둥 3개를 먼저 세운다. 기둥을 세울때 모든 위치에 세워보기? 효율적으로 세워보기? 효율적으로 세울수있나?
    - 입력값의 범위를 볼떄 모두 세워 본다
    -> 벽이 없는 곳에 3군데 뽑아 세운다. 순서상관 없음. -> 조합

    2. 퍼트린다. --> 바이러스를 기준으로 dfs 조짐
    3. 0의 개수를 세서 가장큰놈 찾기

 */

//var rows = 0
//var cols = 0
//
//lateinit var map: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//var safeMaxArea = 0
//
//
//fun dfs(map: Array<IntArray>, point: Pair<Int, Int>) {
//
//    if (map[point.first][point.second] == 2) return
//    map[point.first][point.second] = 2
//
//    for (i in 0 until 4) {
//
//        val ny = point.first + dy[i]
//        val nx = point.second + dx[i]
//
//        if (ny !in 0 until rows || nx !in 0 until cols) continue
//        if (map[ny][nx] == 1) continue
//
//        dfs(map, ny to nx)
//    }
//}
//
//fun createWall(cnt: Int, map: Array<IntArray>) {
//
//    if (cnt == 0) {
//        val nmap = Array(rows){ i ->
//            IntArray(cols){ j ->
//             map[i][j]
//        } }
//
//        var safeArea = 0
//
//        for (i in 0 until rows) {
//            for (j in 0 until cols) {
//                if (map[i][j] == 2) {
//                    nmap[i][j] = 0
//                    dfs(nmap, i to j)
//                }
//            }
//        }
//
//        for (i in 0 until rows) {
//            for (j in 0 until cols) {
//                if (nmap[i][j] == 0) {
//                    safeArea += 1
//                }
//            }
//        }
//
//        if (safeMaxArea < safeArea) {
//            safeMaxArea = safeArea
//        }
//        return
//    }
//
//    // 벽 세우기.
//    for (i in 0 until rows) {
//        for (j in 0 until cols) {
//            if (map[i][j] == 2) continue
//            if (map[i][j] == 1) continue
//            map[i][j] = 1
//            createWall(cnt - 1, map)
//            map[i][j] = 0
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    rows = info[0]
//    cols = info[1]
//
//    map = Array(rows) { IntArray(cols) { 0 } }
//
//    for (i in 0 until rows) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    createWall(3, map)
//    println(safeMaxArea)
//}