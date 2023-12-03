package bac.etc


/*
    가장 긴 증가하는 부분 수열 2
 */

//var n = 0
//lateinit var arr: IntArray
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
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    lis.add(arr[0])
//    for (i in 1 until arr.size) {
//        if (arr[i] == 0) continue
//        if (arr[i] > lis.last()) {
//            lis.add(arr[i])
//        } else {
//            val idx = lowerBound(arr[i])
//            lis[idx] = arr[i]
//        }
//    }
//    println(lis.size)
//}