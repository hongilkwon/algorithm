package bac.week6.concept


/*
    가장 긴 증가하는 부분 수열
    N (1 ≤ N ≤ 1,000)

     1 2 2 3

           o
       o   o
       o o o
     o o o o

   */

import kotlin.math.max

//var n = 0
//lateinit var arr: IntArray
//lateinit var LISLengthArr: IntArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//    LISLengthArr = IntArray(n) { 0 }
//
//    for (i in 0 until n) {
//        var tempMaxLength = 0
//        for (j in 0 until i) {
//            // (arr[i] > arr[j]) 오름 차순 증가 이기 때문에 현재 숫자 보다 작아야 된며,
//            // LIS 길이 값은 가장 크다면 갱신.
//            if (arr[i] > arr[j] && tempMaxLength < LISLengthArr[j]) {
//                tempMaxLength = LISLengthArr[j]
//            }
//        }
//        // 위에서 선택된 arr[j]을 포함 하는 LISLengthArr[i] 값을 갱신.
//        LISLengthArr[i] = tempMaxLength + 1
//    }
////    println(LISLengthArr.joinToString(" "))
//    println(LISLengthArr.maxOrNull())
//    Unit
//}

