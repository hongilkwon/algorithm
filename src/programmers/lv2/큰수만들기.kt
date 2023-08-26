package programmers.lv2


/*
    큰 수 만들기

    number는 2자리 이상, 1,000,000 자리 이하인 숫자

    너무 큰수....
    2중 반복문을 돌리면 안된다.


    "앞에 있으면서, 작은놈을 제거"
    결국 제거를 해야되는지 말아야 되는지 다음 숫자가 무엇인가에 따라서 결정됨.
    또한, 앞자리 일수록 커야되기 때문에 정해진 제거 횟수 k가 0 이면, 더이상 제거 하지 않아도 됨.

    반대로 모든 문자를 탐색하고도 k가 0이상라면, 특정 큰숫자 이후로 내림차순 정렬 되어 있다.
    그냥 팝하면됨.

 */

//import java.util.*
//
//class Solution {
//
//    var stack = Stack<Int>()
//    fun solution(number: String, k: Int): String {
//        var answer = ""
//
//        var cnt = k
//        for (i in 0 until number.length) {
//            val num = number[i].digitToInt()
//            while (stack.isNotEmpty() && cnt > 0 && num > stack.peek()) {
//                stack.pop()
//                cnt -= 1
//            }
//            stack.add(num)
////            println("num: $num cnt: $cnt stack: $stack")
//        }
//
//        if (cnt > 0) {
//            while (cnt > 0) {
//                stack.pop()
//                cnt -= 1
//            }
//        }
//
//        val sb = StringBuilder()
//        for (i in stack) {
//            sb.append(i)
//        }
//        answer = sb.toString()
//        println(answer)
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution("987654123", 1)
//}