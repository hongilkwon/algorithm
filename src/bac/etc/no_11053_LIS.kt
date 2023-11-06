package bac.etc


/*
    가장 긴 증가하는 부분 수열

    (LIS, Longest Increasing Subsequence)

 */


//import kotlin.math.max
//
//var n = 0
//lateinit var arr: IntArray
//lateinit var LISLengthArr: IntArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//    LISLengthArr = IntArray(n) { 1 }
//
//    for (i in 0 until n) {
//        for (j in 0 until i) {
//            if (arr[i] > arr[j])
//                LISLengthArr[i] = max(LISLengthArr[j] + 1, LISLengthArr[i])
//        }
//    }
//
//    println(LISLengthArr.joinToString(" "))
//    println(LISLengthArr.maxOrNull()!!)
//    Unit
//}

