package bac.week2


/*
    균형잡힌 세상
    2-O

    코틀린의 무제한 입력값에 대한 처리
    while(true){
        (readLine() ?: break)
    }

    * [)]
 */

//import java.util.Stack
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val stack = Stack<Char>()
//    val charArr = arrayOf('(', ')', '[', ']')
//
//    while (true) {
//
//        val str = readLine().toString()
//        if (str == ".") break
//
//        stack.clear()
//        for (i in 0 until str.length) {
//            // stack이 비어있고, 괄호라면. 넣음.
//            if (stack.empty() && str[i] in charArr) {
//                stack.add(str[i])
//                continue
//            }
//            // 괄호짝 맞추기.
//            if (stack.isNotEmpty() && str[i] in charArr) {
//                if (str[i] == ')' && stack.peek() == '(') {
//                    stack.pop()
//                } else if (str[i] == ']' && stack.peek() == '[') {
//                    stack.pop()
//                } else {
//                    stack.add(str[i])
//                }
//                continue
//            }
//            // 1문장 종료.
//            if (str[i] == '.')
//                break
//        }
//        // 스택이 비어 있으면 모든 짝이 맞았기 때문이고,
//        // 스택이 비어 있지 않다면, 왼쪽이던 오른쪽이던 스택에 짝이 맞지 않는 상태로 남아 있다.
//        if (stack.isEmpty()) {
//            println("yes")
//        } else {
//            println("no")
//        }
//    }
//}