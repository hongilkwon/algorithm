package bac.week2

/*
    영역구하기
    2-D

    연결컴포넌트 문제,

    탐색할수 없는 지역을 먼저 표기하고
    남은 지역에서 dfs를 사용하여 연결된 컴포넌트의 사이즈를 구한다.

    영역을 구할때 dfs 함수 내에서 cnt 를 재귀적으로 반환하는 로직을 사용해보기.

 */

/*
*   왼쪽 아래점 (x, y) -> (max-1-y, x)
*   오른쪽 위점 (x, y) -> (max-y, x-1)
* */


//var rows = 0
//var cols = 0
//
//lateinit var map: Array<IntArray>
//lateinit var visited: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//fun dfs(point: Pair<Int, Int>): Int{
//
//    visited[point.first][point.second] = 1
//
//    var cnt = 1
//
//    for (i in 0 until 4) {
//        val ny = point.first + dy[i]
//        val nx = point.second + dx[i]
//
//        if (ny !in 0 until map.size || nx !in 0 until map.first().size) continue
//        if (map[ny][nx] == 0) continue
//        if (visited[ny][nx] == 1) continue
//        cnt += dfs(ny to nx)
//    }
//    return cnt
//}
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    rows = info[0]
//    cols = info[1]
//    val boxNum = info[2]
//
//    map = Array(rows) { IntArray(cols) { 1 } }
//    visited = Array(rows) { IntArray(cols) { 0 } }
//
//    for (bac.week5.concept.getN in 0 until boxNum) {
//        val boxP = readLine().split(" ").map { it.toInt() }
//        val p1 = rows - boxP[1] - 1 to boxP[0]
//        val p2 = rows - boxP[3] to boxP[2] - 1
//
//        for (i in p2.first..p1.first) {
//            for (j in p1.second..p2.second) {
//                map[i][j] = 0
//            }
//        }
//    }
//
//    var result = 0
//    val areaList = mutableListOf<Int>()
//
//    for (i in 0 until map.size) {
//        for (j in 0 until map.first().size) {
//            if (map[i][j] == 1 && visited[i][j] != 1) {
//                result += 1
//                val cnt = dfs(i to j)
//                areaList.add(cnt)
//            }
//        }
//    }
//
//    println(result)
//    areaList.sort()
//    println(areaList.joinToString(" "))
//}
