package bac.week8

/*
    나무 심기

    N (2 ≤ N ≤ 200,000)

    일단, 20만이라 반복문 돌리면 시간초과남.

    나무가 오름차순으로 심어지는게 아니라 랜덤하게 심어진다.
    --> 거리에 대한 배열의 순서가 동적으로 바뀐다.

    ex) 현재 위치를 기준으로 앞에 나무가 심어져있는 경우
    1 - - - -
    - 2 - - -
    - - - - 5

   3번째 나무비용 = (5-2) + (5-1)
              = (5*2) - (1+2)
              = 7

    ex) 현재 위치를 기준으로 뒤에 나무가 심어져있는 경우
    1 - - - -
    - 2 - - -
    - - - - - - - - - 9
    - - - - - - - 8
    - - - - 5

   4번째 나무비용 = (5-2) + (5-1) + (5-8)
              = (5*2) - (1+2) + (9+8) - (5*2)
              = 7 + 7
              = 14

 */

//const val MOD = 1_000_000_007L
//
//var n = 0
//
//// 좌표 앞에 몇개의 나무가 있는지 개수를 저장한다.
//val cntTree = Array( 200_002) { 0 }
//fun cntTreeUpdate(idx: Long) {
//    var i = idx
//    while (i < cntTree.size) {
//        cntTree[i.toInt()] += 1
//        i += (i and -i)
//    }
//}
//
//fun cntTreePrefixSum(idx: Long): Long {
//    var i = idx
//    var sum: Long = 0
//    while (i > 0) {
//        sum += cntTree[i.toInt()]
//        i -= (i and -i)
//    }
//    return sum
//}
//
//fun cntTreeIntervalSum(startIdx: Long, endIdx: Long) =
//    cntTreePrefixSum(endIdx) - cntTreePrefixSum(startIdx - 1)
//
//// 특정좌표 앞에 나무들의 좌표의 합을 저장한다.
//val sumTree = Array(200_002) { 0L }
//fun sumTreeUpdate(idx: Long, value: Long) {
//    var i = idx
//    while (i < sumTree.size) {
//        sumTree[i.toInt()] += value
//        i += (i and -i)
//    }
//}
//
//fun sumTreePrefixSum(idx: Long): Long {
//    var i = idx
//    var sum  = 0L
//    while (i > 0) {
//        sum += sumTree[i.toInt()]
//        i -= (i and -i)
//    }
//    return sum
//}
//
//fun sumTreeIntervalSum(startIdx: Long, endIdx: Long) =
//    sumTreePrefixSum(endIdx) - sumTreePrefixSum(startIdx - 1)
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    var answer = 1L
//    for (i in 1..n) {
//        var point = readLine().toLong()
//        // 좌표가 0일 경우 메모리 초과 발생한다.
//        point += 1
//        if (i > 1) {
//            // 현재 포인트보다 앞에 심어진 나무와의 차이
//            var left = point * cntTreeIntervalSum(1, point - 1) - sumTreeIntervalSum(1, point - 1)
//            // 현재 포인트보다 뒤에 심어진 나무와의 차이
//            var right =
//                sumTreeIntervalSum(point + 1, (sumTree.size - 1).toLong()) - point * cntTreeIntervalSum(
//                    point + 1, (cntTree.size - 1).toLong()
//                )
//            answer *= (left + right) % MOD
//            answer %= MOD
//        }
//        cntTreeUpdate(point)
//        sumTreeUpdate(point, point)
//    }
//    println(answer)
//    Unit
//}
