package bac.etc

/*
    용액(이분탐색, 투포인터)

    용액의 특성을 나타내는 하나의 정수

    산성 용액의 특성값은 1<= <= 1_000_000_000
    알칼리성 용액의 특성값은 -1_000_000_000 <=  <= -1

    두 개의 서로 다른 용액을 혼합하여 특성값이 0에 가장 가까운 용액을 만들어내는 두 용액을 찾는 프로그램

    전체 용액의 수 N
    N은 2 <= N <= 100_000

    10만 * 10만

    ---> 커짐   줄어듬 <---
 */

//import kotlin.math.abs
//
//var n = 0
//lateinit var arr: IntArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//    arr.sort()
//
//    var leftIdx = 0
//    var rightIdx = arr.size - 1
//    var min = 2_000_000_000
//
//    var answer = leftIdx to rightIdx
//    while (leftIdx < rightIdx) {
//
//        val temp = arr[leftIdx] + arr[rightIdx]
//        // 절대값이 가장 작은 수를 갱신 한다.
//        if (abs(temp) <= min) {
//            answer = arr[leftIdx] to arr[rightIdx]
//            min = abs(temp)
//        }
//        // 두 용액의 합이 0보다 작으면 leftIndex (작은쪽 idx) -->
//        // 두 용액의 합이 0보다 크면 rightIndex(큰쪽 Idx) <--
//        if (temp <= 0) {
//            leftIdx += 1
//        } else {
//            rightIdx -= 1
//        }
//    }
//
//    println("${answer.first} ${answer.second}")
//}