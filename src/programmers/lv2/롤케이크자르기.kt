package programmers.lv2

/*
    롤케이크 자르기.

    개수 보단 종류의 개수가 중요!

    1 ≤ topping의 길이 ≤ 1,000,000
    1 ≤ topping의 원소 ≤ 10,000

    greedy

    2중반복문 또는 set등 사용하면 시간초과남.
    언제 토핑의 개수가 증가하고 감소하는 순간을 포착하여
    반복문을 1번으로 줄인다.
 */


//class Solution {
//
//    fun solution(topping: IntArray): Int {
//
//        var answer: Int = -1
//
//        val arr1 = IntArray(10_004) { 0 }
//        val arr2 = IntArray(10_004) { 0 }
//
//        for (i in 0 until topping.size) {
//            val idx = topping[i]
//            arr2[idx] += 1
//        }
//
//        var toppingCnt1 = 0
//        var toppingCnt2 = arr2.count { it > 0 }
//
//        var cnt = 0
//        for (i in 0 until topping.size) {
//
//            val idx = topping[i]
//
//            arr1[idx] += 1
//            arr2[idx] -= 1
//
//            if (arr1[idx] == 1) {
//                toppingCnt1 += 1
//            }
//
//            if (arr2[idx] == 0) {
//                toppingCnt2 -= 1
//            }
//
//            if (toppingCnt1 == toppingCnt2) {
//                cnt += 1
//            }
//        }
//        return cnt
//    }
//}