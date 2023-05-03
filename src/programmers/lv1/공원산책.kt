package programmers.lv1

/*
    공원산책

    주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
    주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.

 */

//var row = 0
//var col = 0
//
//lateinit var map: Array<CharArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//fun move(current: Pair<Int, Int>, cnt: Int, dir: Char): Pair<Int, Int> {
//
//    var ny = current.first
//    var nx = current.second
//
//    val dirInt = when (dir) {
//        'N' -> {
//            0
//        }
//
//        'E' -> {
//            1
//        }
//
//        'S' -> {
//            2
//        }
//
//        'W' -> {
//            3
//        }
//        else -> { throw Exception() }
//    }
//
//
//    repeat(cnt) {
//        ny += dy[dirInt]
//        nx += dx[dirInt]
//        if (ny !in 0 until map.size || nx !in 0 until map.first().size)
//            return current
//        if (map[ny][nx] == 'X') {
//            return current
//        }
//    }
//    return ny to nx
//}
//fun solution(park: Array<String>, routes: Array<String>): IntArray {
//    var answer: IntArray = intArrayOf()
//
//    row = park.size
//    col = park.first().length
//    map = Array(park.size) { park[it].toCharArray() }
//
//    var startPoint = 0 to 0
//    for (i in 0 until map.size) {
//        for (j in 0 until map.first().size) {
//            if (map[i][j] == 'S')
//                startPoint = i to j
//        }
//    }
//
//    var currentPoint = startPoint.first to startPoint.second
//    for (i in 0 until routes.size) {
//        val info = routes[i].split(' ')
//
//        val dir = info[0].first()
//        val cnt = info[1].toInt()
//
//        currentPoint = move(currentPoint, dir = dir, cnt = cnt)
//    }
//
//    answer = intArrayOf(currentPoint.first, currentPoint.second)
//    return answer
//}
//
//fun main() {
//    println(solution(arrayOf("SOO", "OOO", "OOO"), arrayOf("E 2", "S 2", "W 1")).joinToString())
//}