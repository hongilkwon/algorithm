package programmers.lv2

/*
    카펫

    중앙의 노란색의 배치에 따라서 갈색의 배치가 달라짐.

    약수
 */

//import kotlin.math.sqrt
//
//class Solution {
//
//    val yaksu = mutableListOf<Pair<Int, Int>>()
//    fun solution(brown: Int, yellow: Int): IntArray {
//        var answer = intArrayOf()
//
//        for (i in 1..sqrt(yellow.toDouble()).toInt()) {
//            if (yellow % i == 0) {
//                yaksu.add(i to yellow / i)
//            }
//        }
////        println(yaksu.joinToString(" "))
//
//        for (i in 0 until yaksu.size) {
//            val temp = yaksu[i].first * 2 + yaksu[i].second * 2 + 4
//            if (brown == temp) {
//                answer = intArrayOf(yaksu[i].second + 2, yaksu[i].first + 2)
//                break
//            }
//        }
////        println(answer.joinToString(" "))
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(24, 24)
//}