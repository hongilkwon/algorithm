package bac.week7


/*
    게임

    동전이 있는 곳에 쓰여 있는 숫자 X를 본다.
    위, 아래, 왼쪽, 오른쪽 방향 중에 한가지를 고른다.
    동전을 위에서 고른 방향으로 X만큼 움직인다. 이때, 중간에 있는 구멍은 무시한다.

    동전이 구멍에 빠지거나, 보드의 바깥으로 나간다면 게임은 종료

    재밌는 게임을 되도록이면 오래 하고 싶다.

    1<= N, M <=50

    하향식 방법
    기준(point(y, x))
    +dfs
    +backtracking

  */

//import kotlin.math.*
//import kotlin.system.exitProcess
//
//var n = 0
//var m = 0
//
//lateinit var map: Array<Array<Char>>
//lateinit var visited: Array<Array<Boolean>>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//// point 에서 최대이동할 수 있는 횟수
//val case = Array(51) { Array(51) { 0 } }
//fun go(point: Pair<Int, Int>): Int {
//    // 종료조건.
//    if (point.first !in 0 until map.size || point.second !in 0 until map.first().size) {
//        return 0
//    }
//    if (map[point.first][point.second] == 'H') {
//        return 0
//    }
//    // 그래프의 순환이 발생할시 종료한다.
//    if (visited[point.first][point.second]) {
//        println("-1")
//        exitProcess(0)
//    }
//
//    if (case[point.first][point.second] != 0) {
//        return case[point.first][point.second]
//    }
//
//    visited[point.first][point.second] = true
//    var maxMove = 0
//    val jump = map[point.first][point.second].digitToInt()
//    for (i in 0 until 4) {
//        val ny = point.first + (dy[i] * jump)
//        val nx = point.second + (dx[i] * jump)
//        maxMove = max(maxMove, go(ny to nx) + 1)
//    }
//    visited[point.first][point.second] = false
//
//    case[point.first][point.second] = maxMove
//    return case[point.first][point.second]
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    m = info[1]
//
//    map = Array(n) {
//        readLine().toCharArray().toTypedArray()
//    }
//    visited = Array(n) {
//        Array(m) { false }
//    }
//    println(go(0 to 0))
//    Unit
//}