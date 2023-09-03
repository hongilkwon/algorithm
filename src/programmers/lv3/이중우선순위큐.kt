package programmers.lv3

/*
    이중우선순위 큐


    1 <= operations <= 1,000,000

    명령어에 해당하는 숫자가 2개면 1개에 대해서 수행한다.

    단순구현인데, 백준 7662 문제를 풀어야됨.
    프로그래머스껀 시간효율을 따지지 않는 테스트 케이스

    2개의 우선순위큐를 가지고 구현한다.
    minHeap maxHeap 2개의 우선순위큐 + 전체 원소의 삭제에대한 싱크를 맞추기 위한 배열 및 로직이 필요함.

 */

//import java.util.*
//
//class Solution {
//
//    val minHeap = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//    val maxHeap = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })
////    val removed = mutableSetOf<Pair<Int, Int>>()
//    val removed = BooleanArray(1_000_001) { false }
//    fun solution(operations: Array<String>): IntArray {
//        var answer = intArrayOf()
//
//        for (i in 0 until operations.size) {
//
//            val operation = operations[i].split(' ')
//
//
//            if (operation[0] == "I") {
//                minHeap.add(i to operation[1].toInt())
//                maxHeap.add(i to operation[1].toInt())
//            } else if (operation[0] == "D" && operation[1] == "1") {
//
//                while (maxHeap.isNotEmpty() && removed[maxHeap.peek().first]) {
//                    maxHeap.poll()
//                }
//
//                if (maxHeap.isNotEmpty()) {
//                    removed[maxHeap.poll().first] =  true
//                }
//            } else if (operation[0] == "D" && operation[1] == "-1") {
//
//                while (minHeap.isNotEmpty() && removed[minHeap.peek().first]) {
//                    minHeap.poll()
//                }
//
//                if (minHeap.isNotEmpty()) {
//                    removed[minHeap.poll().first] =  true
//                }
//            }
//        }
//
//        while (maxHeap.isNotEmpty() && removed[maxHeap.peek().first]) {
//            maxHeap.poll()
//        }
//
//        while (minHeap.isNotEmpty() && removed[minHeap.peek().first]) {
//            minHeap.poll()
//        }
//
//        answer = if (minHeap.isEmpty() && maxHeap.isEmpty()) {
//            intArrayOf(0, 0)
//        } else {
//            intArrayOf(maxHeap.poll().second, minHeap.poll().second)
//        }
//        println(answer.joinToString(" "))
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(arrayOf("I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"))
//}