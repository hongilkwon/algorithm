package bac.etc


/*
    내려가기

    최대 점수, 최소 점수를 구하는 프로그램을 작성
    점수는 원룡이가 위치한 곳의 수의 합

    N(1 ≤ N ≤ 100_000)
    숫자는 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 중의 하나

    dp 문제

 */


/*
    bottom - up 방식(tabulation)

 */

import kotlin.math.max
import kotlin.math.min

//var n = 0
//lateinit var map: Array<IntArray>
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    map = Array(n) { intArrayOf() }
//
//    for (i in 0 until n) {
//        val line = readLine().split(" ").map { it.toInt() }.toIntArray()
//        map[i] = line
//    }
//}


/*
    top - down 방식 (Memoization)
 */
//import kotlin.math.max
//import kotlin.math.min
//
//var n = 0
//lateinit var map: Array<IntArray>
//
//lateinit var cacheMax: Array<IntArray>
//fun goMax(idx: Int, prevIdx: Int): Int {
//
//    if (idx == -1)
//        return 0
//
//    if (cacheMax[idx][prevIdx] != -1) {
//        return cacheMax[idx][prevIdx]
//    }
//
//    val ret =
//        if (prevIdx == 0) {
//            max(goMax(idx - 1, prevIdx), goMax(idx - 1, prevIdx + 1)) + map[idx][prevIdx]
//        } else if (prevIdx == 1) {
//            val temp = max(goMax(idx - 1, prevIdx), goMax(idx - 1, prevIdx + 1))
//            max(temp, goMax(idx - 1, prevIdx - 1)) + map[idx][prevIdx]
//        } else {
//            max(goMax(idx - 1, prevIdx), goMax(idx - 1, prevIdx - 1)) + map[idx][prevIdx]
//        }
//
//    cacheMax[idx][prevIdx] = ret
//    return cacheMax[idx][prevIdx]
//}
//
//lateinit var cacheMin: Array<IntArray>
//fun goMin(idx: Int, prevIdx: Int): Int {
//
//    if (idx == -1)
//        return 0
//
//    if (cacheMin[idx][prevIdx] != -1) {
//        return cacheMin[idx][prevIdx]
//    }
//
//    val ret =
//        if (prevIdx == 0) {
//            min(goMin(idx - 1, prevIdx), goMin(idx - 1, prevIdx + 1)) + map[idx][prevIdx]
//        } else if (prevIdx == 1) {
//            val temp = min(goMin(idx - 1, prevIdx), goMin(idx - 1, prevIdx + 1))
//            min(temp, goMin(idx - 1, prevIdx - 1)) + map[idx][prevIdx]
//        } else {
//            min(goMin(idx - 1, prevIdx), goMin(idx - 1, prevIdx - 1)) + map[idx][prevIdx]
//        }
//
//    cacheMin[idx][prevIdx] = ret
//    return cacheMin[idx][prevIdx]
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    map = Array(n) { intArrayOf() }
//
//    for (i in 0 until n) {
//        val line = readLine().split(" ").map { it.toInt() }.toIntArray()
//        map[i] = line
//    }
//
//    cacheMax = Array(n) { IntArray(3) { -1 } }
//    cacheMin = Array(n) { IntArray(3) { -1 } }
//
//    val max = max(goMax(n - 1, 0), max(goMax(n - 1, 1), goMax(n - 1, 2)))
//    val min = min(goMin(n - 1, 0), min(goMin(n - 1, 1), goMin(n - 1, 2)))
//
//    println("$max $min")
//}