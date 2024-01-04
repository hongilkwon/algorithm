package bac.easy

/*
    체스판 다시 칠하기.


    민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램

    N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수

    완전 탐색 후 최소값을 갱신한다.
 */


import kotlin.math.min

//var n = 0
//var m = 0
//
//lateinit var arr: Array<CharArray>
//
//val type1 = arrayOf(
//    charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
//    charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
//    charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
//    charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
//    charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
//    charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
//    charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
//    charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
//)
//
//val type2 = arrayOf(
//    charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
//    charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
//    charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
//    charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
//    charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
//    charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
//    charArrayOf('B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'),
//    charArrayOf('W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'),
//)
//
//fun check(row: Int, col: Int): Int {
//    var type1Cnt = 0
//    for (i in 0 until 8) {
//        for (j in 0 until 8) {
//            if (type1[i][j] != arr[row + i][col + j]) type1Cnt += 1
//        }
//    }
//
//    var type2Cnt = 0
//    for (i in 0 until 8) {
//        for (j in 0 until 8) {
//            if (type2[i][j] != arr[row + i][col + j]) type2Cnt += 1
//        }
//    }
//
//    return if (type1Cnt >= type2Cnt) type2Cnt else type1Cnt
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    arr = Array(n) { CharArray(m) { ' ' } }
//    for (i in 0 until n) {
//        arr[i] = readLine().map { it }.toCharArray()
//    }
//
//    var cnt = 64
//    for (i in 0 until n - 7) {
//        for (j in 0 until m - 7) {
//            val r = check(i, j)
//            cnt = min(cnt, r)
//        }
//    }
//    println(cnt)
//}