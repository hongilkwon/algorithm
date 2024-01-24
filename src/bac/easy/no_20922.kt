package bac.easy


/*
    겹치는건 싫어(투포인터)
    - 200_000개라 2중 반복문 안됨.
    - 투포인터 -> "언제 idx를 증가 시킬것"인가!
    - 마지막 길이를 포함 해주는 엣지 케이스 놓치지 말기.


    같은 원소가 K개 이하로 들어 있는 최장 연속 부분 수열의 길이를 구하려고 한다.

    1<= n <= 200_000
    1<= k <= 100

    1<= 원소 1개 <= 100_000

    연속 부분 수열이란 그 수열의 원소를 하나 이상 연속하여 선택한 부분 수열을 말한다.
 */

//import kotlin.math.*
//
//var n = 0
//var k = 0
//
//lateinit var arr: IntArray
//lateinit var cntArr: IntArray
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    k = info[1]
//
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    cntArr = IntArray(100_001) { 0 }
//
//    var maxLen = 0
//    var idx1 = 0
//    for (idx2 in 0 until n) {
//        val num = arr[idx2]
//        cntArr[num] += 1
//
//        if (cntArr[num] > k) {
////            println("idx2: $idx2 idx1: $idx1")
//            maxLen = max(maxLen, idx2 - idx1)
//            while (n > idx1 && cntArr[num] > k) {
//                cntArr[arr[idx1]] -= 1
//                idx1 += 1
//            }
////            println("idx2: $idx2 idx1: $idx1")
//        }
//
//        if (idx2 == n - 1) {
//            maxLen = max(maxLen, (idx2 - idx1) + 1)
//        }
//    }
//
//    println(maxLen)
//    return@with Unit
//}
