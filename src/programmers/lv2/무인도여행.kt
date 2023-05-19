package programmers.lv2

/*
    무인도 여행
    연결된 컴퍼넌트 문제.
 */


//lateinit var maps: Array<Array<Char>>
//lateinit var visited: Array<Array<Int>>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//fun dfs(point: Pair<Int, Int>): Int {
//
//    visited[point.first][point.second] = 1
//    var sum = maps[point.first][point.second].digitToInt()
//
//    for (i in 0 until 4) {
//        val ny = point.first + dy[i]
//        val nx = point.second + dx[i]
//
//        if (ny !in 0 until maps.size || nx !in 0 until maps.first().size) continue
//        if (maps[ny][nx] == 'X') continue
//
//        if (visited[ny][nx] != 1) {
//            sum += dfs(ny to nx)
//        }
//    }
//
//    return sum
//}
//
//fun solution(m: Array<String>): IntArray {
//    var answer: IntArray = intArrayOf()
//
//    maps = Array(m.size) { Array(m.first().length) { ' ' } }
//    visited = Array(m.size) { Array(m.first().length) { 0 } }
//
//    for (i in 0 until m.size) {
//        for (j in 0 until m.first().length) {
//            maps[i][j] = m[i][j]
//        }
//    }
//
//    val temp = mutableListOf<Int>()
//    for (i in 0 until maps.size) {
//        for (j in 0 until maps.first().size) {
//            if (maps[i][j] != 'X' && visited[i][j] != 1) {
//                println(i to j)
//                temp.add(dfs(i to j))
//            }
//        }
//    }
//
//    maps.forEach { println(it.joinToString(" ")) }
//    println()
//    visited.forEach { println(it.joinToString(" ")) }
//
//    temp.sort()
//    if (temp.isEmpty()) temp.add(-1)
//    return temp.toIntArray()
//}
//
//fun main() {
//    solution(arrayOf("X591X", "X1X5X", "X231X", "1XXX1"))
//}