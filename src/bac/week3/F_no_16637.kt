package bac.week3


/*
    괄호 추가하기

    단, 괄호 안에는 연산자가 하나만 들어 있어야 한다

    N(1 ≤ N ≤ 19)

    문제를 보고 감을 잡기 힘듬.


    1. 괄호를 지정할 곳을 고르는 규칙을 이해한다.
     -> (a x b) x c, a x (b x c)

    2. 누적된 계산을 하여 진행한다.

 */

//import kotlin.math.max
//
//val operators = mutableListOf<Char>()
//val nums = mutableListOf<Int>()
//
//fun cal(operator: Char, a: Int, b: Int) = when(operator){
//        '+' -> {
//            a+b
//        }
//        '-' -> {
//            a-b
//        }
//        '*' -> {
//            a*b
//        }
//        else -> 0
//    }
//
//var result = Int.MIN_VALUE
//
//fun createBracket(here: Int, num: Int){
//
//    // 숫자 list를 다 돌았으면 종료.
//    if (here == nums.size -1){
//        result = max(result, num)
//        return
//    }
//    //  (8*3) + 5
//    //  newHere+1
//    createBracket(here+1, cal(operator = operators[here], num, nums[here+1]))
//
//    if (here+2 <= nums.size-1){
//        // 8 * ( 3 + 5 )
//        val temp = cal(operators[here+1], nums[here+1], nums[here+2])
//        createBracket(here+2, cal(operator = operators[here], num, temp))
//    }
//}
//
//
//fun main() =  with(System.`in`.bufferedReader()){
//
//    val n = readLine().toInt()
//    val express = readLine().toString()
//
//    for (c in express){
//        if (c.isDigit()){
//            nums.add(c.digitToInt())
//        }else{
//            operators.add(c)
//        }
//    }
////    println(operators.joinToString(" "))
////    println(nums.joinToString(" "))
//
//    createBracket(0, nums[0])
//    println(result)
//    Unit
//}