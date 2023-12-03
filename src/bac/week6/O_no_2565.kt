package bac.week6


/*
   전깃줄

   서로 교차하지 않게 하기 위해,
   없애야 하는 전깃줄의 "최소" 개수
   ---> 남아있는 전기줄은 최대.

   전깃줄 끼리 교차 하지 않으려면, A --> B 연결되는 값이 작아지면 안된다.
   -> LIS

   1<= 전깃줄의 개수 <=100

 */

//import kotlin.math.max
//
//var n = 0
//val arr = Array(501) { 0 }
//val lisLen = Array(501) { 0 }

//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//
//    for (i in 0 until n) {
//        val info = readLine().split(" ").map { it.toInt() }
//        arr[info[0]] = info[1]
//    }
//
//    var maxLen = 0
//    for (i in 0 until arr.size) {
//        if (arr[i] == 0) continue
//        var tempLen = 0
//        for (j in 0 until i) {
//            // 전깃줄이 연결되어 있지 않은 경우.
//            if (arr[j] == 0) continue
//            if (arr[i] > arr[j] && lisLen[j] > tempLen) {
//                tempLen = lisLen[j]
//            }
//        }
//        lisLen[i] = tempLen + 1
//        maxLen = max(maxLen, lisLen[i])
//    }
////    println("maxLen $maxLen")
//    println(lisLen.joinToString(" "))
//    println(n - maxLen)
//    Unit
//}

//var n = 0
//val arr = Array(501) { 0 }
//val lis = mutableListOf<Int>()
//
//fun lowerBound(key: Int): Int {
//    var left = 0
//    var right = lis.size
//
//    while (left < right) {
//        val mid = (left + right) / 2
//
//        if (lis[mid] >= key) {
//            right = mid
//        } else {
//            left = mid + 1
//        }
//    }
//    return right
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//
//    for (i in 0 until n) {
//        val info = readLine().split(" ").map { it.toInt() }
//        arr[info[0]] = info[1]
//        if (i == 0)
//            lis.add(info[1])
//    }
//
//    for (i in 1 until arr.size) {
//        if (arr[i] == 0) continue
//        if (arr[i] > lis.last()) {
//            lis.add(arr[i])
//        } else {
//            val idx = lowerBound(arr[i])
//            lis[idx] = arr[i]
//        }
//    }
//    println(lis.joinToString(" "))
//    println(n - lis.size)
//    Unit
//}

