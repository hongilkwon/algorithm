package programmers.lv3


/*
    이진탐색

    최대/최소를 결정할때, 그 범위가 너무 크다면 이분탐색을 고려해볼 필요가 있다.

    모든 사람이 심사를 받는데 "걸리는 시간을 최소"
    입국심사를 기다리는 사람 수 n, 각 심사관이 한 명을 심사하는데 걸리는 시간이 담긴 배열 times

     1 <= n <= 1_000_000_000 (10억)
     1 <= time <= 1_000_000_000 (10억)
     1 <= times.size <= 100_000

     n=6, [7,10] -> 28분

     7분 걸리는 심사대 - 4명
     10분 걸리는 심사대 - 2명
     총 6명

 */

//class Solution {
//
//    var n = 0
//
//    lateinit var times: IntArray
//
//    fun check(totalTime: Long): Boolean {
//        // 모든 인원을 심사하는데 걸리는 시간을 각 심사대에서 걸리는 시간으로 나눠서
//        // 몇 명을 심사 할 수 있는지 카운트
//        var cnt = 0L
//        for (i in 0 until times.size) {
//            cnt += (totalTime / times[i])
//            if (cnt >= n) return true
//        }
//        return false
//    }
//
//    fun solution(n: Int, times: IntArray): Long {
//        var answer: Long = 0
//
//        this.n = n
//        this.times = times
//
//        var l: Long = 1
//        var r: Long = 1_000_000_000 * n.toLong()
//
//        while (l <= r) {
//            val mid = (l + r) / 2
//
//            if (check(mid)) {
//                r = mid - 1
//                answer = mid
//            } else {
//                l = mid + 1
//            }
//        }
//        return answer
//    }
//}