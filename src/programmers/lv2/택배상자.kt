package programmers.lv2


/*
    택배상자

    보조 컨테이너 벨트는 앞 뒤로 이동이 가능하지만 입구 외에 다른 면이 막혀 있어서 맨 앞의 상자만 뺄 수 있습니다
    즉, 가장 마지막에 보조 컨테이너 벨트에 보관한 상자부터 꺼내게 됩니다
    보조 컨테이너 벨트를 이용해도 기사님이 원하는 순서대로 상자를 싣지 못 한다면, 더 이상 상자를 싣지 않습니다.

    단순구현 문제인데

    컨베이어 벨트 queue
    보조컨테이너 stack

    문제가 조잡함 단순구현 이나 일단 "보조 컨테이너 (스택)에 넣는 작업을 생각하기 쉽지 않음.

 */

//import java.util.*
//
//class Solution {
//
//    val subContainer = Stack<Int>()
//    val belt: Queue<Int> = LinkedList()
//    fun solution(order: IntArray): Int {
//        var answer: Int = 0
//
//        for (i in 1..order.size) {
//            belt.add(i)
//        }
//
//        var idx =0
//        while (belt.isNotEmpty()) {
//
//            val num = belt.poll()
//            subContainer.add(num)
//
//            while (subContainer.isNotEmpty() && subContainer.peek() == order[idx]) {
//                subContainer.pop()
//                idx += 1
//            }
//        }
//
//        answer = idx
//        return answer
//    }
//}

//class Solution {
//
//    val stack = Stack<Int>()
//    fun solution(order: IntArray): Int {
//        var answer: Int = 0
//
//        var idx = 0
//        for (i in 1..order.size) {
//            stack.add(i)
//            while (stack.isNotEmpty() && stack.peek() == order[idx]) {
//                stack.pop()
//                idx += 1
//            }
//        }
//
//        return idx
//    }
//}

//fun main() {
//    Solution().solution(intArrayOf(5, 4, 3, 2, 1))
//}