package programmers.lv1

/*
    단순구현 문제.
    우선순위 큐를 사용하면 편하게 풀수 있다.
    * 우선순위 큐의 사용법 및 원리를 정리하자!

 */

//import java.util.*
//fun solution(k: Int, score: IntArray): IntArray {
//    var answer: IntArray = intArrayOf()
//
//    val board = mutableListOf<Int>()
//
//    var queue: PriorityQueue<Int> = PriorityQueue()
//    for (i in 0 until score.size) {
//
//        if (queue.size == k) {
//            if (queue.peek() < score[i]){
//                queue.poll()
//                queue.add(score[i])
//            }
//        } else {
//            queue.add(score[i])
//        }
//        val min = queue.peek()
//        board.add(min)
//    }
//
//    answer = board.toIntArray()
//    return answer
//}