package bac.week3

/*
주난의 난.

 */


//var rows = 0
//var cols = 0
//
//lateinit var map: Array<CharArray>
//lateinit var visited: Array<IntArray>
//
//lateinit var ju: Pair<Int, Int>
//lateinit var choco: Pair<Int, Int>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//var flag = true
//
//fun dfs(point: Pair<Int, Int>) {
//
//    visited[point.first][point.second] = 1
//
//    if (map[point.first][point.second] == '#'){
//        flag = false
//    }
//    if (map[point.first][point.second] == '1') {
//        map[point.first][point.second] = '0'
//        return
//    }
//
//    for (i in 0 until 4) {
//        val ny = point.first + dy[i]
//        val nx = point.second + dx[i]
//
//        if (ny !in 0 until map.size || nx !in 0 until map.first().size) continue
//        if (visited[ny][nx] == 0){
//            dfs(ny to nx)
//        }
//
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//
//    val info1 = readLine().split(" ").map { it.toInt() }
//    rows = info1[0]
//    cols = info1[1]
//
//    val info2 = readLine().split(" ").map { it.toInt() }
//
//    ju = info2[0] - 1 to info2[1] - 1
//    choco = info2[2] - 1 to info2[3] - 1
//
//    map = Array(rows) { CharArray(cols) { ' ' } }
//    visited = Array(rows) { IntArray(cols) { 0 } }
//
//    for (i in 0 until map.size) {
//        map[i] = readLine().toCharArray()
//    }
//
//    var cnt = 0
//    while (flag){
//        visited = Array(rows) { IntArray(cols) { 0 } }
//        dfs(ju)
//        cnt +=1
//    }
//    println(cnt)
//}