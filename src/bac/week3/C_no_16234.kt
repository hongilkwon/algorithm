package bac.week3

/*
    인구이동

    시뮬레이션 + dfs

    문제의 이해랑 로직은 어렵지 않다.
    dfs 구현에 있어 어떤 점을 지나가야되고(인구수 차이), 어떤 점을 지나갔는지 계산.

    국경을 공유할때, --> 연결된 컴포넌트

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
//        // 인구수 차이 계산
//        val diff = abs(map[point.first][point.second] - map[ny][nx])
//
//        // 연합이 되는 지점을 담고 다음 탐색.
//        if (diff in l..r) {
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
//        // 인구이동 종료 Flag
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
//
//        if (!flag) break
//        cnt += 1
//    }
//    println(cnt)
//}
