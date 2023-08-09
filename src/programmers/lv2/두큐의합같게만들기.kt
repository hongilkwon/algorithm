package programmers.lv2


/*
    두 큐의합 같게 만들기.

    30만 , 30만

    2^30만 ---> 완탐 불가능.

    이분탐색???
    dp???
    Greedy

    1 ≤ queue1의 길이 = queue2의 길이 ≤ 300,000
    1 ≤ queue1의 원소, queue2의 원소 ≤ 109

    * 자료구조의 개수가 30만가량 되다보니... 매번 sum을 다시 계산하면 시간초과남.

 */

//
//import java.util.LinkedList
//import java.util.Queue
//
//class Solution {
//
//    val queue1: Queue<Long> = LinkedList()
//    val queue2: Queue<Long> = LinkedList()
//
//    fun solution(q1: IntArray, q2: IntArray): Int {
//        var answer: Int = -2
//
//        val temp1 = q1.map { it.toLong() }.toTypedArray()
//        val temp2 = q2.map { it.toLong() }.toTypedArray()
//
//        queue1.addAll(temp1)
//        queue2.addAll(temp2)
//
//        // 두 큐의 원소의 개소를 한쪽으로 다 옮겨보고 반대쪽으로 옮겨보고
//        val max = (q1.size + q2.size) * 2
//
//        var sumQ1 = queue1.sum()
//        var sumQ2 = queue2.sum()
//
//        if (sumQ1 == sumQ2) {
//            return 0
//        }
//
//        var cnt = -1
//        for (i in 1..max) {
//
//            if (sumQ1 > sumQ2) {
//                val temp = queue1.poll()
//                queue2.add(temp)
//                sumQ1 -= temp
//                sumQ2 += temp
//            } else {
//                val temp = queue2.poll()
//                queue1.add(temp)
//                sumQ1 += temp
//                sumQ2 -= temp
//            }
//
//            if (sumQ1 == sumQ2) {
//                cnt = i
//                break
//            }
//        }
//        return cnt
//    }
//}