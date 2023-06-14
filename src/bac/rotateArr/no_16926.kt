package bac.rotateArr

import kotlin.math.min

/*
   배열 회전하기1

    temp 배열필수 선언

    1. 획전 시킬 테두리 정하기.
    2. 4분할 회전.

 */

//var n = 0
//var m = 0
//var r = 0
//
//lateinit var arr: Array<Array<Int>>
//
//fun rotate() {
//    val temp = Array(n) { Array(m) { 0 } }
//
////    for (i in 0 until arr.size) {
////        for (j in 0 until arr[0].size) {
////            temp[i][j] = arr[i][j]
////        }
////    }
//
//    val sectionNum = min(n, m) / 2
//
//    val start = 0 to 0
//    val end = n - 1 to m - 1
//
//    repeat(sectionNum) {
//        println(it)
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    m = info[1]
//    r = info[2]
//
//    arr = Array(n) { Array(m) { 0 } }
//
//    for (i in 0 until n) {
//        val line = readLine().split(" ").map { it.toInt() }.toTypedArray()
//        arr[i] = line
//    }
//
//    repeat(1) {
//        rotate()
//    }
//
//    arr.forEach {
//        println(it.joinToString(" "))
//    }
//}