package bac.week4

import java.lang.Integer.max

var row = 0
var col = 0

var wall: Array<Array<Int>> = emptyArray()
var visited: Array<Array<Int>> = emptyArray()

val dy = arrayOf(0, -1, 0, 1)
val dx = arrayOf(-1, 0, 1, 0)

fun checkWall(point: Pair<Int, Int>, idx: Int): Boolean = (wall[point.first][point.second] and (1 shl idx)) == 0

fun dfs(point: Pair<Int, Int>, marker: Int): Int {

    if (visited[point.first][point.second] != 0) return 0
    visited[point.first][point.second] = marker

    var vCnt = 1
    for (i in 0 until 4) {
        if (checkWall(point, i)) {
            val ny: Int = point.first + dy[i]
            val nx: Int = point.second + dx[i]
            vCnt += dfs(ny to nx, marker)
        }
    }

    return vCnt
}


fun calMaxTwoRoom() {
    for (i in 0 until visited.size) {
        for (j in 0 until visited[0].size) {

            if (i + 1 < visited.size) {
                val a = visited[i + 1][j]
                val b = visited[i][j]
                if (a != b) {
                    twoRoom = max(twoRoom, roomSizes[a] + roomSizes[b])
                }
            }

            if (j + 1 < visited[0].size) {
                val a = visited[i][j + 1]
                val b = visited[i][j]
                if (a != b) {
                    twoRoom = max(twoRoom, roomSizes[a] + roomSizes[b])
                }
            }
        }
    }
}

var roomCnt = 0

var maxRoom = 0
var roomSizes = Array(2504){ 0 }

var twoRoom = 0

fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toInt() }

    col = info[0]
    row = info[1]

    visited = Array(row) {
        Array(col) { 0 }
    }

    wall = Array(row) {
        Array(col) { 0 }
    }

    for (i in 0 until wall.size) {
        val line = readLine().split(" ").map { it.toInt() }.toTypedArray()
        wall[i] = line
    }

    var marker = 1

    for (i in 0 until visited.size) {
        for (j in 0 until visited[0].size) {
            if (visited[i][j] == 0) {
                roomSizes[marker] = dfs( i to j, marker)
                marker += 1
                roomCnt += 1
            }
        }
    }

//    visited.forEach {
//        println(it.joinToString(" "))
//    }

    calMaxTwoRoom()
    println(roomCnt)
    println(roomSizes.maxOrNull())
    println(twoRoom)
}