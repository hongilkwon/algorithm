package programmers.lv2


/*
    뒤에 있는 큰 수 찾기.

    자신보다 크면서 가장 가까이 있는 수를 뒷 큰수

    4 ≤ numbers size ≤ 1,000,000
    1 ≤ numbers[i] ≤ 1,000,000

    100만
    투포인터 + stack 문제.
 */

// 시간초과남.
//fun solution(numbers: IntArray): IntArray {
//    var answer: IntArray = intArrayOf()
//
//    val temp = Array(numbers.size) { -1 }
//
//    for (i in 0 until numbers.size) {
//        val num = numbers[i]
//        for (j in 0 until i) {
//            if (temp[j] != -1) continue
//            if (numbers[j] < num) {
//                temp[j] = num
//            }
//        }
//    }
//
//    return temp.toIntArray()
//}

import java.util.Stack

//fun solution(numbers: IntArray): IntArray {
//
//    // 전부 시작값을 -1로 초기화
//    var answer: IntArray = IntArray(numbers.size) { -1 }
//
//    // 뒷큰수가 정해져 있지 않은 수의 index 저장.
//    val stack = Stack<Int>()
//    for (i in 0 until numbers.size) {
//        while (stack.isNotEmpty() && numbers[stack.peek()] < numbers[i]) {
//            val idx = stack.pop()
//            answer[idx] = numbers[i]
//        }
//        stack.add(i)
//    }
//    return answer
//}
