package bac.week2

/*
    2-J
    기상캐스터

    단순 구현문제
    경우의수를 잘나누면 쉽게 풀수있는 문제이다.
 */


//var rows = 0
//var cols = 0
//lateinit var map: Array<CharArray>
//lateinit var time: Array<IntArray>
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    rows = info[0]
//    cols = info[1]
//
//    map = Array(rows) { CharArray(cols) { ' ' } }
//    time = Array(rows) { IntArray(cols) { 0 } }
//
//    for (i in 0 until map.size) {
//        val line = readLine().toCharArray()
//        map[i] = line
//    }
//
//    for (i in 0 until map.size) {
//        var cPoint = -1
//        for (j in 0 until map.first().size) {
//            if (map[i][j] == 'c') {
//                time[i][j] = 0
//                cPoint = j
//            }
//            if (map[i][j] == '.' && cPoint == -1) {
//                time[i][j] = -1
//            }
//            if (map[i][j] == '.' && cPoint != -1) {
//                time[i][j] = j - cPoint
//            }
//        }
//    }
//
//    time.forEach {
//        println(it.joinToString(" "))
//    }
//}