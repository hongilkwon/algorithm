package programmers.lv2

/*
    타겟 넘버

    순서를 바꾸지 않고 타겟 넘버를 바꾼다.

    숫자의 개수는 2개 이상 20개 이하
 */

//class Solution {
//
//    lateinit var numbers: IntArray
//    var target = 0
//
//    var answer = 0
//    fun go(idx: Int, num: Int) {
//
//        if (idx >= numbers.lastIndex) {
//            if (idx == numbers.lastIndex && num == target)
//                answer += 1
//            return
//        }
//
//        go(idx + 1, num + numbers[idx + 1])
//        go(idx + 1, num - numbers[idx + 1])
//    }
//
//    fun solution(numbers: IntArray, target: Int): Int {
//        this.numbers = numbers
//        this.target = target
//
//        go(-1, 0)
//        println(answer)
//        return answer
//    }
//}