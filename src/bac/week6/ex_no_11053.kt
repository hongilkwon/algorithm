//package bac.week6
//
//
///*
//    가장 긴 증가하는 부분 수열
//    N (1 ≤ N ≤ 1,000)
//
//     1 2 2 3
//
//           o
//       o   o
//       o o o
//     o o o o
//
//   */
//
//import kotlin.math.max
//
//var n = 0
//var arr = Array(1001) { 0 }
//var cnt = Array(1001) { 0 }
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    val info = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    for (i in 0 until info.size) {
//        arr[i] = info[i]
//    }
////    println(arr.joinToString(" "))
//
//    var answer = 0
//    for (i in 0 until n) {
//        var maxValue = 0
//        for (j in 0 until i) {
//            // 현재 숫자 보다 작아야 된다.
//            // 지금까지 찾은 최대값 보다는 커야된다.
//            if (arr[i] > arr[j] && maxValue < cnt[j]) {
//                maxValue = cnt[j]
//            }
//        }
//        cnt[i] = maxValue + 1
//        answer = max(answer, maxValue)
//    }
//    println(answer + 1)
//    Unit
//}

