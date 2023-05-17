package programmers.lv2

import java.util.LinkedList
import java.util.Queue

/*
    미로탈출

    출발 지점에서 먼저 레버가 있는 칸으로 이동하여 레버를 당긴 후,
    미로를 빠져나가는 문이 있는 칸으로 이동하면 됩니다.

    이때 아직 레버를 당기지 않았더라도 출구가 있는 칸을 지나갈 수 있습니다.

    1칸당 1초다. 최단시간으로 탈출을 하려고 한다.
 */


//lateinit var map: Array<Array<Char>>
//lateinit var visited: Array<Array<Int>>
//
//var start = 0 to 0
//var end = 0 to 0
//var lever = 0 to 0
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//fun go(startP: Pair<Int, Int>, stopP: Pair<Int, Int>): Int {
//
//    val queue: Queue<Pair<Int, Int>> = LinkedList()
//    visited[startP.first][startP.second] = 1
//    queue.add(startP)
//
//    while (queue.isNotEmpty()) {
//        val point = queue.poll()
//
//        if (point == stopP) {
//            return visited[point.first][point.second]
//        }
//
//        for (i in 0 until 4) {
//            val ny = point.first + dy[i]
//            val nx = point.second + dx[i]
//
//            if (ny !in 0 until map.size || nx !in 0 until map.first().size) { continue }
//            if (map[ny][nx] == 'X') continue
//
//            if (visited[ny][nx] == 0) {
//                visited[ny][nx] = visited[point.first][point.second] + 1
//                queue.add(ny to nx)
//            }
//        }
//    }
//    return -1
//}
//
//fun solution(m: Array<String>): Int {
//    var answer: Int = 0
//    map = Array(m.size) { emptyArray() }
//    m.forEachIndexed { index, s -> map[index] = s.toCharArray().toTypedArray() }
//
//    visited = Array(m.size) { Array(m.first().length) { 0 } }
//
//    for (i in 0 until map.size) {
//        for (j in 0 until map.first().size) {
//            if (map[i][j] == 'S') start = i to j
//            if (map[i][j] == 'E') end = i to j
//            if (map[i][j] == 'L') lever = i to j
//        }
//    }
//
//    val ret1 = go(start, lever)
//
//    if (ret1 != -1) {
//        visited = Array(m.size) { Array(m.first().length) { 0 } }
//        val ret2 = go(lever, end)
//        return if (ret2 != -1) ret1 + ret2 -2 else -1
//    } else {
//        return -1
//    }
//}
//
//fun main() {
//    println(solution(arrayOf("SOOOL","XXXXO","OOOOO","OXXXX","OOOOE")))
//}