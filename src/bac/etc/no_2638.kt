package bac.etc


/*
    치즈

     4변 중에서 적어도 2변 이상이 실내온도의 공기와 접촉한 것
     단, 치즈 내부의 공기와 접촉한 것은 무시한다?

     두 개의 정수 N, M (5 ≤ N, M ≤ 100)
 */


//var n = 0
//var m = 0
//
//lateinit var map: Array<IntArray>
//
//lateinit var visited: Array<IntArray>
//val cheeseMap = mutableMapOf<Pair<Int, Int>, Int>()
//
//val dy = arrayOf(0, 1, 0, -1)
//val dx = arrayOf(1, 0, -1, 0)
//fun melt(node: Pair<Int, Int>) {
//
//    if (visited[node.first][node.second] == 1) {
//        return
//    }
//    visited[node.first][node.second] = 1
//
//    for (i in 0 until 4) {
//        val ny = node.first + dy[i]
//        val nx = node.second + dx[i]
//
//        if (ny !in 0 until n || nx !in 0 until m) {
//            continue
//        }
//
//        if (map[ny][nx] == 1) {
//            if (cheeseMap.containsKey(ny to nx)) {
//                cheeseMap[ny to nx] = cheeseMap[ny to nx]!! + 1
//            } else
//                cheeseMap[ny to nx] = 1
//            continue
//        }
//        melt(ny to nx)
//    }
//}
//
//fun check(): Boolean {
//
//    for (i in 0 until map.size) {
//        for (j in 0 until map[i].size) {
//            if (map[i][j] != 0) return true
//        }
//    }
//    return false
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    map = Array(n) { IntArray(m) { 0 } }
//    for (i in 0 until n) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    var time = 0
//    while (check()) {
//        map.forEach { println(it.joinToString(" ")) }
//        println()
//
//        visited = Array(n) { IntArray(m) { 0 } }
//        cheeseMap.clear()
//        melt(0 to 0)
//        for (i in cheeseMap) {
//            if (i.value >= 2) {
//                val c = i.key
//                map[c.first][c.second] = 0
//            }
//        }
//        time += 1
//    }
//    println(time)
//}

