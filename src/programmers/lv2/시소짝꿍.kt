package programmers.lv2

/*
    시소 짝꿍

    2 ≤ weights의 길이 ≤ 100,000
    100 ≤ weights[i] ≤ 1,000

    중심으로부터 2(m), 3(m), 4(m)

    a  2, 3 ,4
    b  2, 3 ,4

    w * a= k * b
    w * ( a / b ) = k

    1, 3/2, 2
    2/3, 1, 4/3
    1/2, 3/4  1

 */

//class Solution {
//
//    val cntArr = LongArray(1_001) { 0 }
//    fun solution(weights: IntArray): Long {
//
//        for (i in 0 until weights.size) {
//            val idx = weights[i]
//            cntArr[idx] += 1L
//        }
//
//        var cnt = 0L
//        val set  = mutableSetOf<Int>()
//        set.addAll(weights.toTypedArray())
//
//        for (w in set) {
//            if (cntArr[w] > 1) cnt += cntArr[w] * (cntArr[w] - 1) / 2L
//            if (cntArr.size > w * 2) cnt += cntArr[w] * cntArr[w * 2]
//            if (w * 3 % 2 == 0 && cntArr.size > w * 3 / 2) cnt += cntArr[w] * cntArr[w * 3 / 2]
//            if (w * 4 % 3 == 0 && cntArr.size > w * 4 / 3) cnt += cntArr[w] * cntArr[w * 4 / 3]
//        }
//
//        println(cnt)
//        return cnt
//    }
//}
//
//fun main() {
//    Solution().solution(intArrayOf(100, 180, 360, 100, 270))
//}