package programmers.lv2


/*
    숫자변환

    자연수 x, y, n이 매개변수로 주어질 때, x를 y로 변환하기 위해 필요한 최소 연산 횟수

    단순 재귀를 이용하면 런타임 에러 및 시간초과 발생

    dp
    - memoization -> 반복적 재귀호출로 런타임 에러발생.
    - tabulation -> 통과
    최소값 갱신 상향식 dp

    *백준 7-F(1로 만들기)
 */

//import kotlin.math.min
//
//class Solution {
//
////    val INF = 1_000_001
////    lateinit var case: IntArray
////
////    fun go(num: Int): Int {
////
////        if (num == y) {
////            return 1
////        }
////
////        /*
////            memoization
////         */
////
////        if (case[num] != INF) {
////            return case[num]
////        }
////
////        var ret = INF
////        if (y >= (num * 3)) {
////            ret = min(ret, go(num * 3) + 1)
////        }
////        if (y >= (num * 2)) {
////            ret = min(ret, go(num * 2) + 1)
////        }
////        if (y >= (num + n)) {
////            ret = min(ret, go(num + n) + 1)
////        }
////
////        case[num] = ret
////        return case[num]
////    }
//
//    var x = 0
//    var y = 0
//    var n = 0
//
//    val INF = 1_000_000
//    lateinit var case: Array<Int>
//    fun solution(x: Int, y: Int, n: Int): Int {
//
//        this.x = x
//        this.y = y
//        this.n = n
//
//        if (x == y) return 0
//
//        case = Array(y + 1) { INF }
//
//        case[x] = 0
//        for (i in x..y) {
//
//            if (i % 3 == 0) {
//                case[i] = min(case[i / 3] + 1, case[i])
//            }
//            if (i % 2 == 0) {
//                case[i] = min(case[i / 2] + 1, case[i])
//            }
//            if (i - n >= 0 && case[i - n] != INF)
//                case[i] = min(case[i - n] + 1, case[i])
//        }
////        case.forEachIndexed { idx, value ->
////            println("idx: $idx cnt: $value")
////        }
//        return if (case[y] == INF) -1 else case[y]
//    }
//}

//fun main() {
//    println(Solution().solution(10, 40, 5))
//}