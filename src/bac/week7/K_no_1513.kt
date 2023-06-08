package bac.week7

/*
    경로찾기

    너무 어려운 문제이다.

    하향식 방식
    기준(y, x, 방문해야할 오락실 개수, 이전 오락실)

 */

var n = 0
var m = 0
var c = 0

lateinit var map: Array<Array<Int>>

val case = Array(51) { Array(51) { Array(51) { Array(51) { -1 } } } }

fun go(y: Int, x: Int, cnt: Int, prevC: Int): Int {
    // 맵의 범위를 벗어난 경우
    if (y !in 1..n || x !in 1..m) return 0
    // 방문해야할 오락실 개수가 음수라면
    if (cnt < 0) return 0
    // 도착지에 도착한 경우
    if (y == n && x == m) {
        if (map[y][x] == 0) {
            if (cnt == 0) return 1
        } else {
            if (cnt == 1 && map[y][x] > prevC) return 1
        }
        return 0
    }

//    println("y $y, x $x, cnt $cnt prevC $prevC")
    if (case[y][x][cnt][prevC] != -1) return case[y][x][cnt][prevC]

    var pathCnt = 0
    if (map[y][x] == 0) {
        pathCnt = (go(y + 1, x, cnt, prevC) + go(y, x + 1, cnt, prevC)) % 1000007
    } else if (map[y][x] > prevC) {
        pathCnt = (go(y + 1, x, cnt - 1, map[y][x]) + go(y, x + 1, cnt - 1, map[y][x])) % 1000007
    }

    case[y][x][cnt][prevC] = pathCnt
    return pathCnt
}

//fun go(y: Int, x: Int, cnt: Int, prevC: Int): Int {
//    // 맵의 범위를 벗어난 경우
//    if (y > n || x > m) return 0
//    // 도착지에 도착한 경우
//    if (y == n && x == m) {
//        if (cnt == 0 && map[y][x] == 0) return 1
//        if (cnt == 1 && map[y][x] > prevC) return 1
//        return 0
//    }
//
////    println("y $y, x $x, cnt $cnt prevC $prevC")
//    if (case[y][x][cnt][prevC] != -1) return case[y][x][cnt][prevC]
//
//    var pathCnt = 0
//    if (map[y][x] == 0) {
//        pathCnt = (go(y + 1, x, cnt, prevC) + go(y, x + 1, cnt, prevC)) % 1000007
//    } else if (map[y][x] > prevC) {
//        pathCnt = (go(y + 1, x, cnt - 1, map[y][x]) + go(y, x + 1, cnt - 1, map[y][x])) % 1000007
//    }
//
//    case[y][x][cnt][prevC] = pathCnt
//    return pathCnt
//}
fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toInt() }

    n = info[0]
    m = info[1]
    c = info[2]

    map = Array(n + 1) { Array(m + 1) { 0 } }
    for (i in 1..c) {
        val point = readLine().split(" ").map { it.toInt() }
        val y = point[0]
        val x = point[1]
        map[y][x] = i
    }

    for (i in 0..c) {
        print("${go(1, 1, i, 0)} ")
    }
}