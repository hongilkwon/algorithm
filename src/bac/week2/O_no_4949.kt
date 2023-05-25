package bac.week2


/*
    균형잡힌 세상
    2-O

    코틀린의 무제한 입력값에 대한 처리
    while(true){
        (readLine() ?: break)
    }

 */

//import java.util.Stack
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    while (true) {
//
//        val str = readLine().toString()
//
//        if (str == ".") break
//
//        val stack = Stack<Char>()
//        val charArr = arrayOf('(', ')', '[', ']')
//        for (i in 0 until str.length) {
//            if (stack.empty() && str[i] in charArr) {
//                stack.add(str[i])
//                continue
//            }
//            if (stack.isNotEmpty() && str[i] in charArr) {
//                if (str[i] == ')' && stack.peek() =='(') {
//                    stack.pop()
//                } else if (str[i] == ']' && stack.peek() =='[') {
//                   stack.pop()
//                } else {
//                    stack.add(str[i])
//                }
//                continue
//            }
//            if (str[i] == '.')
//                break
//        }
//        if (stack.isEmpty()) {
//            println("yes")
//        } else {
//            println("no")
//        }
//    }
//}