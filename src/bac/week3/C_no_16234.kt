package bac.week3

/*
    인구이동

    전반적인 문제의 이해랑 로직은 맞았지만
    dfs 구현함에 있어 구현력이 부족해서 틀렸다.
 */


//import kotlin.math.abs
//
//var rows = 0
//var cols = 0
//
//var l = 0
//var r = 0
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//lateinit var map: Array<IntArray>
//lateinit var visited: Array<IntArray>
//
//fun dfs(point: Pair<Int, Int>, list: MutableList<Pair<Int, Int>>) {
//
//    for (i in 0 until 4) {
//        val ny = point.first + dy[i]
//        val nx = point.second + dx[i]
//
//        if (ny !in 0 until map.size || nx !in 0 until map.first().size) continue
//        if (visited[ny][nx] == 1) continue
//
//        val diff = abs(map[point.first][point.second] - map[ny][nx])
//        if ( diff in l..r) {
//            visited[ny][nx] = 1
//            list.add(ny to nx)
//            dfs(ny to nx, list)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    val n = info[0]
//    rows = n
//    cols = n
//
//    l = info[1]
//    r = info[2]
//
//    map = Array(rows) { IntArray(cols) { 0 } }
//    visited = Array(rows) { IntArray(cols) { 0 } }
//
//    for (i in 0 until map.size) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    var cnt = 0
//
//    while (true){
//
//        // 인구이동을 종료하는 Flag
//        var flag = false
//        visited = Array(rows) { IntArray(cols) { 0 } }
//        val list = mutableListOf<Pair<Int, Int>>()
//
//        for (i in 0 until map.size) {
//            for (j in 0 until map.first().size) {
//                if (visited[i][j] == 0){
//                    // dfs 를 시작전에 방문체크
//                    visited[i][j] = 1
//                    list.clear()
//                    list.add(i to j)
//
//                    dfs(i to j, list)
//
//                    // 만약 사방으로 인구이동이 일어나지 않는 좌표였다면, 아무것도 하지 않아야 된다.
//                    if (list.size == 1) continue
//                    else{
//                        flag = true
//                        val sum = list.sumOf { map[it.first][it.second] }
//                        for (p in list){
//                            map[p.first][p.second] = sum / list.size
//                        }
//                    }
//                }
//            }
//        }
//        if (!flag) break
//        cnt += 1
//    }
//    println(cnt)
//}
