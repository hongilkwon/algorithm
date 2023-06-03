/*
   현욱은 괄호왕이야.
'
    도저히 모르겠다….
    너무 어렵다.

    1. ()
    2. (…)
    3. (..)(…)

    - 짝맞추기형 문제.
    - 짝의 형태를 추적.

 */

//import java.util.Stack
//import kotlin.math.max
//
//var n = 0
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    val str = readLine().toCharArray()
//    val arr = Array(n) { 0 }
//
//    val stack = Stack<Int>()
//
//    for (i in 0 until str.size) {
//        if (str[i] == '(') stack.push(i)
//        else if (stack.isNotEmpty()) {
//            arr[i] = 1
//            arr[stack.peek()] = 1
//            stack.pop()
//        }
//    }
//
//    var max = 0
//    var cnt = 0
//    for (i in 0 until arr.size) {
//        if (arr[i] == 1) {
//            cnt += 1
//            max = max(cnt, max)
//        } else {
//            cnt = 0
//        }
//    }
//
//    println(max)
//    Unit
//}