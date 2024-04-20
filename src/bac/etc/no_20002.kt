package bac.etc


/*
   제4회 생각하는 프로그래밍 대회

   사과나무(누적합 2차원)

   1 ≤ N ≤ 300
   K × K 의 크기의 정사각형 모양

   1. 완전탐색 (시간초과)
   300 * 300 = 90000
   90000 * 90000 = 1800_000_000

   2. 2차원 누적합
    https://www.youtube.com/watch?v=KT864Aa3zE0

*/

//import kotlin.math.max
//
//var n = 0
//lateinit var map: Array<IntArray>
//
//lateinit var prefixSum: Array<IntArray>
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    map = Array(n) { IntArray(n) { 0 } }
//    for (i in 0 until n) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
////    map.forEach { println(it.joinToString(" ")) }
////    println()
//
//    prefixSum = Array(n + 1) { IntArray(n + 1) { 0 } }
//    for (i in 0 until n) {
//        for (j in 0 until n) {
//            prefixSum[i + 1][j + 1] = prefixSum[i + 1][j] + prefixSum[i][j + 1] - prefixSum[i][j] + map[i][j]
//        }
//    }
//
//    var maxCost = -1000
//    for (k in 1..n) {
//        for (row in 0 until n - k + 1) {
//            for (col in 0 until n - k + 1) {
//
//                val row1 = row
//                val col1 = col
//
//                val row2 = row1 + (k - 1)
//                val col2 = col1 + (k - 1)
//                val cost =
//                    prefixSum[row2+1][col2+1] - prefixSum[row2 + 1][col1] - prefixSum[row1][col2 + 1] + prefixSum[row1][col1]
//                maxCost = max(maxCost, cost)
//            }
//        }
//    }
//
//    println(maxCost)
//    return@with Unit
//}


//import kotlin.math.max
//
//var n = 0
//lateinit var map: Array<IntArray>
//
//fun calCost(k: Int, start: Pair<Int, Int>): Int {
//    var cost = 0
//
//    for (i in start.first until start.first + k) {
//        for (j in start.second until start.second + k) {
//            cost += map[i][j]
//        }
//    }
//    return cost
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    map = Array(n) { IntArray(n) { 0 } }
//    for (i in 0 until n) {
//        map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//
//    var maxCost = -1000
//    for (k in 1..n) {
//        for (row in 0 until n - k + 1) {
//            for (col in 0 until n - k + 1) {
//                maxCost = max(maxCost, calCost(k, row to col))
//            }
//        }
//    }
//
//    println(maxCost)
//    return@with Unit
//}