package bac.week2

/*
   2-B
   유기농 배추

   connected component
   맵을 전체 순회하면서 dfs 탐색을 한다.
   dfs 실행되고 종료된다면 하나의 연결컴포넌트가 존재한다는 것이다.

 */

//var rows: Int = 0
//var cols: Int = 0
//
//lateinit var map: Array<IntArray>
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//lateinit var visited: Array<IntArray>
//
//fun dfs(point: Pair<Int, Int>) {
//
//    if (visited[point.first][point.second] == 1) return
//    visited[point.first][point.second] = 1
//
//    for (i in 0 until 4) {
//        val ny = point.first + dy[i]
//        val nx = point.second + dx[i]
//
//        if (ny !in 0 until map.size || nx !in 0 until map.first().size) continue
//        if (map[ny][nx] == 0) continue
//        dfs(ny to nx)
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val testCase = readLine().toInt()
//
//    repeat(testCase) {
//
//        val info = readLine().split(" ").map { it.toInt() }
//
//        cols = info[0]
//        rows = info[1]
//        val baechuNum = info[2]
//
//        map = Array(rows) { IntArray(cols) { 0 } }
//        visited = Array(rows) { IntArray(cols) { 0 } }
//
//        for (i in 0 until baechuNum) {
//            val baechuPoint = readLine().split(" ").map { it.toInt() }
//            map[baechuPoint[1]][baechuPoint[0]] = 1
//        }
//
//        var result = 0
//        for (i in 0 until map.size){
//            for (j in 0 until  map.first().size){
//                if (map[i][j] == 1 && visited[i][j] != 1 ){
//                    dfs(i to j)
//                    result += 1
//                }
//            }
//        }
//        println(result)
//    }
//}