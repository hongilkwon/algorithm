package bac.week6.concept
//
//
///*
//  보석상자
//   보석은 M가지 서로 다른 색상 중 한 색상이다. 원장 선생님은 모든 보석을 N명의 학생들에게 나누어 주려고 한다.
//   이때, 보석을 받지 못하는 학생이 있어도 된다. 하지만, 학생은 항상 같은 색상의 보석만 가져간다.
//
//   첫째 줄에 아이들의 수 N과 색상의 수 M이 주어진다. (1 ≤ N ≤ 10^9, 1 ≤ M ≤ 300,000, M ≤ N)
//   1000_000_000
//
//   질투심이 최소가 되게 보석을 나누어주는 방법
//
//   최소값을 결정하며 답을 줄여나갈떄 이분탐색을 이용한다.
//
//
//   RR RR BBB BBB B
//
//   */
//
//import kotlin.math.*
//
//var n = 0
//var m = 0
//lateinit var gemArr: Array<Int>
//
//fun check(mid: Long): Boolean {
//    var num: Long = 0
//    for (i in 0 until m) {
//        num += gemArr[i] / mid
//        if ((gemArr[i] % mid) > 0)
//            num += 1
//    }
//    return n >= num
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    m = info[1]
//
//    gemArr = Array(m) { 0 }
//    for (i in 0 until m) {
//        gemArr[i] = readLine().toInt()
//    }
////    println(gemArr.joinToString(" "))
//
//    // 보석중 가장 작은거
//    var left: Long = 1
//    // 입력받은 보석중 가장 큰거 (1명이 다 가진다면 최대의 질투심)
//    var right: Long = gemArr.maxOrNull()!!.toLong()
//
//    var mid: Long = 0
//
//    var answer: Long = Long.MAX_VALUE
//    while (left <= right) {
//        mid = (left + right) / 2
//        if (check(mid)) {
//            answer = min(answer, mid)
//            right = mid - 1
//        } else {
//            left = mid + 1
//        }
//    }
//    println(answer)
//}
//
