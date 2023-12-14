package bac.etc

/*
    토마토


    1은 익은 토마토,
    0은 익지 않은 토마토,
    -1은 토마토가 들어있지 않은 칸

    철수는 창고에 보관된 토마토들이 며칠이 지나면 다 익게 되는지 그 최소 일수

    저장될 때부터 모든 토마토가 익어있는 상태이면 0을 출력해야 하고,
    토마토가 모두 익지는 못하는 상황이면 -1을 출력해야 한다.

    3차원 bfs
    * 시작점이 여러개인 bfs
 */

//import java.util.LinkedList
//import java.util.Queue
//import kotlin.math.max
//
//// col
//var m = 0
//
//// row
//var n = 0
//var h = 0
//
//lateinit var tomato: Array<Array<IntArray>>
//
//val emptyList = mutableListOf<Triple<Int, Int, Int>>()
//
//val dh = arrayOf(1, -1, 0, 0, 0, 0)
//val dy = arrayOf(0, 0, -1, 0, 1, 0)
//val dx = arrayOf(0, 0, 0, 1, 0, -1)
//
//lateinit var visited: Array<Array<IntArray>>
//var q: Queue<Triple<Int, Int, Int>> = LinkedList()
//fun go() {
//
//    while (q.isNotEmpty()) {
//        val points = q.poll()
//
//        for (i in 0 until 6) {
//            val nh = dh[i] + points.first
//            val ny = dy[i] + points.second
//            val nx = dx[i] + points.third
//
//            if (nh !in 0 until h ||
//                ny !in 0 until n ||
//                nx !in 0 until m
//            ) continue
//
//            if (tomato[nh][ny][nx] == -1) continue
//            if (visited[nh][ny][nx] > 0) continue
//            visited[nh][ny][nx] = visited[points.first][points.second][points.third] + 1
//            q.add(Triple(nh, ny, nx))
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//
//    m = info[0]
//    n = info[1]
//    h = info[2]
//
//    tomato = Array(h) { Array(n) { intArrayOf() } }
//    visited = Array(h) { Array(n) { IntArray(m) { 0 } } }
//
//    var flag = true
//    for (i in 0 until h) {
//        for (j in 0 until n) {
//            tomato[i][j] = readLine().split(" ").map { it.toInt() }.toIntArray()
//            for (k in 0 until m) {
//                if (tomato[i][j][k] == 1) {
//                    q.add(Triple(i, j, k))
//                    visited[i][j][k] = 1
//                }
//                if (tomato[i][j][k] == -1) {
//                    emptyList.add(Triple(i, j, k))
//                }
//                if (tomato[i][j][k] == 0) {
//                    flag = false
//                }
//            }
//        }
//    }
//    if (flag) {
//        println(0)
//        return@with
//    }
//
//    go()
//    var check = true
//    var max = 0
//    for (i in 0 until h) {
//        for (j in 0 until n) {
//            for (k in 0 until m) {
//                if (tomato[i][j][k] != -1 && visited[i][j][k] == 0) {
//                    check = false
//                }
//                max = max(max, visited[i][j][k])
//            }
//        }
//    }
//
////    visited.forEach { n->
////        n.forEach {m->
////            println(m.joinToString(" "))
////        }
////    }
//    if (check) {
//        println(max - 1)
//    } else {
//        println(-1)
//    }
//}