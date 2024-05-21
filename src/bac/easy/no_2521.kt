package bac.easy
/*
   예산 (이분탐색)

   정해진 총액 이하에서 가능한 한 최대의 총 예산 배정

   모든 요청이 배정될 수 있는 경우에는 요청한 금액을 그대로 배정한다.
   모든 요청이 배정될 수 없는 경우에는 특정한 정수 상한액을 계산하여 그 이상인 예산요청에는 모두 상한액을 배정한다.
   상한액 이하의 예산요청에 대해서는 요청한 금액을 그대로 배정한다.

    3 <= N <= 10_000
    1 <= 예산 <= 100_000
    N <= M <= 1_000_000_000

    예시)
    상한액을 잡는 방법.

    485 / n

    (121*4) + 1

    120 110 140 150
    +1 +11  -19  -29
    ??

*/

//import kotlin.math.min
//
//
//var n = 0
//var m = 0
//lateinit var arr: IntArray
//
//// 특정한 정수 상한액을 모두에게 분배해도 예산을 넘지 않는가?
//fun check(upperBound: Int): Boolean {
//    var total = 0
//    for (i in 0 until arr.size) {
//        total += min(upperBound, arr[i])
//    }
//    return m >= total
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//    m = readLine().toInt()
//
//    var answer = 0
//
//    var left = 0
//    var right = arr.maxOrNull()!!
//
//    while (left <= right) {
//        val mid = (left + right) / 2
//
//        if (check(mid)) {
//            answer = mid
//            left = mid + 1
//        } else {
//            right = mid - 1
//        }
//    }
//
//    println(answer)
//    return@with Unit
//}