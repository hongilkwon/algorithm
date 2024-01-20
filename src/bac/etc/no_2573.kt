package bac.etc


/*
    빙산


    3 <= N, M <= 300
    0 <= 빙산의 높이 <= 10
 */

//
//var n = 0
//var m = 0
//
//lateinit var map: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//lateinit var cntMap: Array<IntArray>
//lateinit var visited: Array<IntArray>
//fun go(node: Pair<Int, Int>) {
//
//    for (i in 0 until 4) {
//        val ny = node.first + dy[i]
//        val nx = node.second + dx[i]
//
//        if (ny !in 0 until n || nx !in 0 until m) continue
//        if (map[ny][nx] > 0) {
//            cntMap[ny][nx] += 1
//            continue
//        }
//
//        if (visited[ny][nx] == 0) {
//            visited[ny][nx] = 1
//            go(ny to nx)
//        }
//    }
//}
//
//fun check(node: Pair<Int, Int>) {
//
//    for (i in 0 until 4) {
//        val ny = node.first + dy[i]
//        val nx = node.second + dx[i]
//
//        if (ny !in 0 until n || nx !in 0 until m) continue
//        if (map[ny][nx] == 0) continue
//
//        if (visited[ny][nx] == 0) {
//            visited[ny][nx] = 1
//            check(ny to nx)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    map = Array(n) {
//        readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//
//    var year = 0
//    var flag = false
//    while (true) {
//
//        year += 1
//
//        cntMap = Array(n) { IntArray(m) { 0 } }
//        visited = Array(n) { IntArray(m) { 0 } }
//        for (i in 0 until n) {
//            for (j in 0 until m) {
//                if (visited[i][j] == 0 && map[i][j] == 0) {
//                    visited[i][j] = 1
//                    go(i to j)
//                }
//            }
//        }
//
////        visited.forEach { println(it.joinToString(" ")) }
////        println()
////        cntMap.forEach { println(it.joinToString(" ")) }
////        println()
//        for (i in 0 until n) {
//            for (j in 0 until m) {
//                map[i][j] -= cntMap[i][j]
//                if (map[i][j] < 0) map[i][j] = 0
//            }
//        }
//
////        map.forEach { println(it.joinToString(" ")) }
////        println()
//
//        var cnt = 0
//        visited = Array(n) { IntArray(m) { 0 } }
//        for (i in 0 until n) {
//            for (j in 0 until m) {
//                if (visited[i][j] == 0 && map[i][j] > 0) {
//                    visited[i][j] = 1
//                    check(i to j)
//                    cnt += 1
//                }
//            }
//        }
//
//        if (cnt > 1) {
//            break
//        }
//        if (cnt == 0) {
//            flag = true
//            break
//        }
//    }
//
//    if (flag){
//        println(0)
//    }else{
//        println(year)
//    }
//    return@with Unit
//}
