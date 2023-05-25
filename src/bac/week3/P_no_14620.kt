package bac.week3


/*
    꽃길
 */


//import kotlin.math.min
//
//var n = 0
//
//lateinit var map: Array<IntArray>
//lateinit var visited: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//var answer = Int.MAX_VALUE
//
//fun plant(p1: Pair<Int, Int>, p2: Pair<Int, Int>, p3: Pair<Int, Int>): Int {
//    var rental = 0
//    return if (check(p1) && check(p2) && check(p3)) {
//        for (i in 0 until n) {
//            for (j in 0 until n) {
//                if (visited[i][j] == 1)
//                    rental += map[i][j]
//            }
//        }
//        rental
//    } else {
//        Int.MAX_VALUE
//    }
//}
//
//fun check(p: Pair<Int, Int>): Boolean {
//    if (visited[p.first][p.second] == 1) { return false }
//    for (i in 0 until 4) {
//        val ny = p.first + dy[i]
//        val nx = p.second + dx[i]
//        if (ny !in 0 until n || nx !in 0 until n) { return false }
//        if (visited[ny][nx] == 1) { return false }
//    }
//
//    visited[p.first][p.second] = 1
//    for (i in 0 until 4) {
//        val np = p.first + dy[i] to p.second + dx[i]
//        visited[np.first][np.second] = 1
//    }
//
//    return true
//}
//
//
//fun change(idx: Int): Pair<Int, Int> {
//    val row = idx / n
//    val col = idx % n
//    return row to col
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    map = Array(n) { IntArray(n) { 0 } }
//    visited = Array(n) { IntArray(n) { 0 } }
//
//    for (i in 0 until n) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    for (i in 0 until n * n) {
//        for (j in i + 1 until n * n) {
//            for (k in j + 1 until n * n) {
//                visited = Array(n) { IntArray(n) { 0 } }
//                answer = min(plant(change(i), change(j), change(k)), answer)
//            }
//        }
//    }
//    println(answer)
//}
