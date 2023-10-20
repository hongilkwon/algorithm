package programmers.lv2


/*
    괄호회전하기.

    1 <= s <= 1_000

    1. 회전.
    2. 올바른 괄호 확인(stack 이용)
 */


//import java.util.Stack
//
//class Solution {
//
//    val stack = Stack<Char>()
//    val open = charArrayOf('(', '{', '[')
//    fun check(str: CharArray): Boolean {
//        stack.clear()
//        for (i in 0 until str.size) {
//            if (stack.empty()) {
//                stack.add(str[i])
//                continue
//            }
//
//            val c = stack.peek()
//            if ((c == '[' && str[i] == ']') ||
//                (c == '{' && str[i] == '}') ||
//                (c == '(' && str[i] == ')')
//            ) {
//                stack.pop()
//            } else {
//                stack.add(str[i])
//            }
//        }
////        println("str: ${str.joinToString()} stack: $stack")
//        return stack.empty()
//    }
//
//    fun solution(s: String): Int {
//        var answer: Int = -1
//
//        val arr = s.toCharArray()
//
//        var cnt = 0
//        for (i in 0 until arr.size) {
//            if (check(str = arr)) cnt += 1
//
//            val temp = arr.last()
//            for (j in arr.size - 1 downTo 1) {
//                arr[j] = arr[j - 1]
//            }
//            arr[0] = temp
//        }
//
//        answer = cnt
//        return answer
//    }
//}

//fun main() {
//    Solution().solution("[](){}")
//}