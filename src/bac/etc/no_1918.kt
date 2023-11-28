package bac.etc


///*
//    후위 표기식
// */
//
//
//import java.util.*
//
//var str = ""
//
//val result = mutableListOf<Char>()
//val stack = Stack<Char>()
//
//val operator = charArrayOf('+', '-', '*', '/')
//val operand = CharArray(26) { 'A' + it }
//fun main() = with(System.`in`.bufferedReader()) {
//
//    str = readLine()
//
//    for (i in 0 until str.length) {
//
//        // 피연산자 A..Z 라면 결과리스트에 넣음
//        if (str[i] in operand) {
//            result.add(str[i])
//            continue
//        }
//
//        // 스택이 비어 있다면, 일단 넣음.
//        if (stack.isEmpty()) {
//            stack.add(str[i])
//        } else {
//            if (str[i] == '(') {
//                // 여는 괄호는 그냥 넣음.
//                stack.add(str[i])
//            } else if (str[i] == ')') {
//                // 닫는 괄호는 여는 괄호를 만날때 까지 모든 연산자를 꺼냄
//                while (stack.isNotEmpty() && stack.peek() != '(') {
//                    result.add(stack.pop())
//                }
//                stack.pop()
//            } else if (str[i] in operator) {
//                // 연산자라면 자신보다 높거나 같은 순위 연산자를 모두 꺼내고 들어감.
//                if (str[i] in arrayOf('+', '-')) {
//                    while (stack.isNotEmpty() && stack.peek() in operator) {
//                        result.add(stack.pop())
//                    }
//                    stack.add(str[i])
//                } else {
//                    while (stack.isNotEmpty() && stack.peek() in arrayOf('*', '/')) {
//                        result.add(stack.pop())
//                    }
//                    stack.add(str[i])
//                }
//            }
//        }
////        println(stack)
//    }
//
//    while (stack.isNotEmpty()){
//        result.add(stack.pop())
//    }
//
//    val sb = StringBuilder()
//    for (i in 0 until result.size){
//        sb.append(result[i])
//    }
//    println(sb.toString())
//}