package bac.week6


/*
    증가하는 가장 긴 부분 수열
    (Longest Increasing Subsequence)

    N (1 ≤ N ≤ 1,000)

     1 2 2 3

           o
       o   o
       o o o
     o o o o

   */

import kotlin.math.max

//var n = 0
//var arr = Array(1001) { 0 }
//var cnt = Array(1001) { 0 }
//
// O(N^2)
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    var answer = 0
//
//    for (i in 0 until n) {
//        var len = 0
//        for (j in 0 until i) {
//            // 현재 숫자 보다 작고, 지금까지 찾은 LIS 길이 보다는 커야된다.
//            if (arr[i] > arr[j] && len < cnt[j]) {
//                len = cnt[j]
//            }
//        }
//        cnt[i] = len + 1
//        answer = max(answer, len)
//    }
//    println(answer + 1)
//    Unit
//}

//var n = 0
//var arr = Array(1004) { 0 }
//lateinit var lis: Array<Int>
//
//fun upperBound(arr: Array<Int>, start: Int = 0, end: Int = arr.lastIndex, key: Int): Int {
//    var left = start
//    var right = end
//
//    while (left < right) {
//        val mid = (left + right) / 2
//        if (arr[mid] > key) {
//            right = mid
//        } else {
//            left = mid + 1
//        }
//    }
//    return right
//}
//fun lowerBound(arr: Array<Int>, start: Int = 0, end: Int = arr.lastIndex, key: Int): Int {
//    var left = start
//    var right = end
//
//    while (left < right) {
//        val mid = (left + right) / 2
//        if (arr[mid] >= key) {
//            right = mid
//        } else {
//            left = mid + 1
//        }
//    }
//    return right
//}
//
//// O(N*LogN)
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    lis = Array(n) { 0 }
//    var len = 0
//    for (i in 0 until n) {
//        val num = arr[i]
//        // 현재 LIS 에서 새로운 값 같거나 큰 idx
//        val idx = lowerBound(arr = lis, end = len, key = num)
//        // lis[idx]이 0이면, 지금까지 있던 원소보다 큰값이 들어왔옴.
//        if (lis[idx] == 0) {
//            len += 1
//        }
//        // 기존의 값을 최소로 작은수로 갱신함
//        lis[idx] = num
//        println("idx: $idx num: $num")
//        println(lis.joinToString(" "))
//    }
//    println(len)
//}

