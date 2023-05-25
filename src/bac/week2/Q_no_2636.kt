package bac.week2

/*
    치즈
    2-Q
 */

//var rows = 0
//var cols = 0
//
//lateinit var map: Array<IntArray>
//lateinit var visited: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//
//fun dfs(point: Pair<Int, Int>, cPoint: MutableList<Pair<Int, Int>>) {
//
//    if (visited[point.first][point.second] == 1) return
//    visited[point.first][point.second] = 1
//
//    if (map[point.first][point.second] == 1) {
//        cPoint.add(point)
//        return
//    }
//
//    for (i in 0 until 4) {
//        val ny = point.first + dy[i]
//        val nx = point.second + dx[i]
//
//        if (ny !in 0 until map.size || nx !in 0 until map.first().size) continue
//        dfs(ny to nx, cPoint)
//    }
//}
//
//fun check(map: Array<IntArray>): Boolean {
//    for (i in 0 until  map.size){
//        for (j in 0 until map.first().size){
//            if (map[i][j] != 0 )
//                return true
//        }
//    }
//    return false
//}
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    rows = info[0]
//    cols = info[1]
//
//    map = Array(rows) { IntArray(cols) { 0 } }
//
//    for (i in 0 until map.size) {
//        val line = readLine().split(" ").map { it.toInt() }.toIntArray()
//        map[i] = line
//    }
//
//    var cnt1 = 0
//    var cnt2 = 0
//
//    while (check(map)){
//        visited = Array(rows) { IntArray(cols) { 0 } }
//        val cPoint = mutableListOf<Pair<Int, Int>>()
//        dfs(0 to 0, cPoint)
//
//        for (p in cPoint) {
//            map[p.first][p.second] = 0
//        }
//
//        cnt1 += 1
//        cnt2 = cPoint.size
//    }
//
//    println(cnt1)
//    println(cnt2)
//}