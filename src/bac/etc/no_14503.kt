package bac.etc

/*
    로봇 청소기

    그래프탐색(dfs,응용)

    반시계 방향으로 90도 회전한다.
        0 --> 3
        1 --> 0
        2 --> 1
        3 --> 2

     val dir = (d + 3 -i) % 4
     d = 0, i = 0 -> 3
     d = 0, i = 1 -> 2
     d = 0, i = 2 -> 1
     d = 0, i = 3 -> 0

 */


//import kotlin.system.exitProcess
//
//var n = 0
//var m = 0
//
//var start = 0 to 0
//var d = 0
//
//lateinit var map: Array<IntArray>
//
//lateinit var visited: Array<IntArray>
//
//// 북동남서
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//fun go(point: Pair<Int, Int>, d: Int) {
//
//    visited[point.first][point.second] = 1
//
//    for (i in 0 until 4) {
//        val dir = (d + 3 - i) % 4
//
//        val ny = point.first + dy[dir]
//        val nx = point.second + dx[dir]
//
//        if (ny !in 0 until n || nx !in 0 until m) continue
//        if (map[ny][nx] == 0 && visited[ny][nx] == 0) {
//            go(ny to nx, dir)
//        }
//    }
//
//    val dir = (d + 2) % 4
//    val by = point.first + dy[dir]
//    val bx = point.second + dx[dir]
//
//    if (by in 0 until n
//        && bx in 0 until m
//        && map[by][bx] != 1
//    ) {
//        go(by to bx, d)
//    } else {
//        var cnt = 0
////        visited.forEach { println(it.joinToString(" ")) }
//        visited.forEach { line ->
//            line.forEach { if (it == 1) cnt +=1 }
//        }
//        println(cnt)
//        exitProcess(0)
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info1 = readLine().split(" ").map { it.toInt() }
//    n = info1[0]
//    m = info1[1]
//
//    val info2 = readLine().split(" ").map { it.toInt() }
//    start = info2[0] to info2[1]
//    d = info2[2]
//
//    map = Array(n) {
//        readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    visited = Array(n) { IntArray(m) { 0 } }
//    go(start, d)
//
//    return@with Unit
//}
