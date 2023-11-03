package bac.week3

/*
   불

   지훈이가 불에 타기전에 탈출할 수 있는지의 여부, 그리고 "얼마나 빨리 탈출"할 수 있는지를 결정

   - 불 시작점이 2개 이상일 경우가 있음.
   - 가장자리에서 시작하는 경우.
   - 출구가 없는 경우
   - 지훈이가 벽으로 둘러 쌓인 경우.
 */

//import java.util.LinkedList
//import java.util.Queue
//import kotlin.math.min
//
//
//var row = 0
//var col = 0
//
//lateinit var map: Array<CharArray>
//
//lateinit var startJ: Pair<Int, Int>
//
//lateinit var distJ: Array<IntArray>
//lateinit var distF: Array<IntArray>
//
//val dy = arrayOf(0, -1, 0, 1)
//val dx = arrayOf(1, 0, -1, 0)
//fun bfsJ(start: Pair<Int, Int>) {
//
//    val queue: Queue<Pair<Int, Int>> = LinkedList()
//    queue.add(start)
//    distJ[start.first][start.second] = 1
//
//    while (queue.isNotEmpty()) {
//        val point = queue.poll()
//        for (i in 0 until 4) {
//            val ny = point.first + dy[i]
//            val nx = point.second + dx[i]
//
//            if (ny !in 0 until row || nx !in 0 until col) continue
//            if (distJ[ny][nx] > 0) continue
//            if (map[ny][nx] == '.') {
//                distJ[ny][nx] = distJ[point.first][point.second] + 1
//                queue.add(ny to nx)
//            }
//        }
//    }
//}
//
//
//val queueF: Queue<Pair<Int, Int>> = LinkedList()
//fun bfsF() {
//
//    while (queueF.isNotEmpty()) {
//        val point = queueF.poll()
//        for (i in 0 until 4) {
//            val ny = point.first + dy[i]
//            val nx = point.second + dx[i]
//
//            if (ny !in 0 until row || nx !in 0 until col) continue
//            if (distF[ny][nx] > 0) continue
//            if (map[ny][nx] == '.') {
//                distF[ny][nx] = distF[point.first][point.second] + 1
//                queueF.add(ny to nx)
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    row = info[0]
//    col = info[1]
//
//    distJ = Array(row) { IntArray(col) { 0 } }
//    distF = Array(row) { IntArray(col) { 0 } }
//
//    map = Array(row) { charArrayOf() }
//    for (i in 0 until row) {
//        val line = readLine().toCharArray()
//        map[i] = line
//        for (j in 0 until col) {
//            map[i][j] = line[j]
//            if (map[i][j] == 'J') startJ = i to j
//            if (map[i][j] == 'F') {
//                distF[i][j] = 1
//                queueF.add(i to j)
//            }
//        }
//    }
//
//    bfsJ(startJ)
//    bfsF()
//
//    var time = 1_000_000
//    for (i in 0 until row) {
//        for (j in 0 until col) {
//            if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
//                if (map[i][j] in arrayOf( '.', 'J')) {
//                    // 전부다 벽이라 못간 경우.
//                    if (distJ[i][j] == 0) continue
//                    if (distF[i][j] == 0 || distJ[i][j] < distF[i][j]){
//                        time = min(time, distJ[i][j])
//                    }
//                }
//            }
//        }
//    }
//
////    distJ.forEach { println(it.joinToString(" ")) }
////    println()
////    distF.forEach { println(it.joinToString(" ")) }
//
//    if (time == 1_000_000)
//        println("IMPOSSIBLE")
//    else
//        println(time)
//    Unit
//}


