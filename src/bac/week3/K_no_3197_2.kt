package bac.week3

/*
    백조의 호수

      1 ≤ R, C ≤ 1500.

      1500 * 1500

      제한조건을 충족하기 어렵다.

      얼음을 녹일때 재귀가 아님 물을 중심으로 4방향으로 확인만 해야한다.
 */

//import java.util.*
//
//var row = 0
//var col = 0
//
//lateinit var map: Array<CharArray>
//
//var swanPoints = mutableListOf<Pair<Int, Int>>()
//
//var cnt = 0
//
//val dy = intArrayOf(0, 1, 0, -1)
//val dx = intArrayOf(1, 0, -1, 0)
//
//lateinit var visitedSwan: Array<IntArray>
//val swanQueue: Queue<Pair<Int, Int>> = LinkedList()
//val swanQueueTemp: Queue<Pair<Int, Int>> = LinkedList()
//
//fun check(): Boolean {
////    println("check::call")
//    while (swanQueue.isNotEmpty()) {
//
//        val next = swanQueue.poll()
//
//        for (i in 0 until 4) {
//            val ny = next.first + dy[i]
//            val nx = next.second + dx[i]
//
//            if (ny !in 0 until row || nx !in 0 until col) continue
//            if (visitedSwan[ny][nx] == 1) continue
//
//            visitedSwan[ny][nx] = 1
//            // 물이면 백조가 이동하여 방문처리, 물과 근접한 얼음이면 임시 큐에 담아서 다음 출발지로 이용, 만나면 참 반환.
//            if (map[ny][nx] == '.') {
//                swanQueue.add(ny to nx)
//            } else if (map[ny][nx] == 'X') {
//                swanQueueTemp.add(ny to nx)
//            } else if (map[ny][nx] == 'L') {
//                return false
//            }
//        }
//    }
//    return true
//}
//
//
//val waterQueue: Queue<Pair<Int, Int>> = LinkedList()
//val waterQueueTemp: Queue<Pair<Int, Int>> = LinkedList()
//fun melt() {
////    println("melt::call")
//    while (waterQueue.isNotEmpty()) {
//
//        val next = waterQueue.poll()
//
//        for (i in 0 until 4) {
//            val ny = next.first + dy[i]
//            val nx = next.second + dx[i]
//
//            if (ny !in 0 until row || nx !in 0 until col) continue
//
//            if (map[ny][nx] == 'X') {
//                waterQueueTemp.add(ny to nx)
//                map[ny][nx] = '.'
//            }
//        }
//    }
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    row = info[0]
//    col = info[1]
//
//    map = Array(row) { charArrayOf() }
//
//    for (i in 0 until map.size) {
//        val line = readLine().toCharArray()
//        map[i] = line
//    }
//
//    // 두 백조의 지점 저장.
//    for (i in 0 until map.size) {
//        for (j in 0 until map[i].size) {
//            if (map[i][j] == 'L') swanPoints.add(i to j)
//            if (map[i][j] == '.' || map[i][j] == 'L') waterQueue.add(i to j)
//        }
//    }
//
//    visitedSwan = Array(row) { IntArray(col) { 0 } }
//    swanQueue.add(swanPoints[0])
//    visitedSwan[swanPoints[0].first][swanPoints[0].second] = 1
//
//    while (check()) {
//
//        swanQueue.clear()
//        swanQueue.addAll(swanQueueTemp)
//        swanQueueTemp.clear()
//
//        melt()
//
//        waterQueue.clear()
//        waterQueue.addAll(waterQueueTemp)
//        waterQueueTemp.clear()
//
////        map.forEach {
////            println(it.joinToString(" "))
////        }
////        println()
//        cnt += 1
//    }
//    println(cnt)
//}