package programmers.lv2


/*
    마법의 엘리베이터

    greedy, 단순구현
    5층일때 다음 숫자에 영향을 주는것을 잘 확인해야됨.

    최소한 버튼을 눌러서 이동

    1 -1
    10 -10
    100 -100
    1000 -1000

    1 ≤ storey ≤ 100_000_000

    문제를 똑바로 읽지 않아서 잘못된 알고리즘으로 문제를 접근함.

    10^n씩 한번에 오르거나 내릴수 있다.

    1-4층까진 현재 자리수에서 내려간다.
    6-9층까지 올라가서 윗자리에서 내려간다.

    5층
    5 -> 0  5번
    5 -> 10 5번

    65
    5개쓰고 70 3개쓰고 100 1개쓰고 0  총 9개
    5개쓰고 60 4개쓰고 100 1개쓰고 0  총 10개

    55
    5개쓰고 60 4개쓰고 100 1개쓰고 0  총 10개
    5개쓰고 50 5개쓰고 0 총 10개

    45
    5개쓰고 50 5개쓰고 100 1개쓰고 0 총 11개
    5개쓰고 40 4개쓰고 0  총 9개

 */

//class Solution {
//
//    var floor = 0
//    fun solution(storey: Int): Int {
//        var answer: Int = 0
//
//        floor = storey
//
//        var cnt = 0
//        while (floor > 0) {
//            val temp = floor % 10
//
//            if (temp in 0..4) {
//                cnt += temp
//            } else if (temp in 6..9) {
//                cnt += (10 - temp)
//                floor += 10
//            } else {
//                if ((floor / 10) % 10 > 4) {
//                    floor += 10
//                    cnt += temp
//                }else{
//                    cnt += temp
//                }
//            }
//            floor /= 10
//        }
//        println(cnt)
//        return cnt
//    }
//}
//
//fun main() {
//    Solution().solution(16)
//}