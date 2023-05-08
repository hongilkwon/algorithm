package programmers.lv1

import java.util.Stack

/*
    햄버거 만들기.
     정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장

     상수는 손이 굉장히 빠르기 때문에 상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며,
     재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없습니다.

     1 ≤ ingredient의 길이 ≤ 1,000,000
     ingredient의 원소는 1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기를 의미합니다.

     [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵]

 */


//fun solution(ingredient: IntArray): Int {
//    var answer: Int = 0
//
//    val stack = Stack<Int>()
//
//    var cnt = 0
//    for (i in 0 until ingredient.size) {
//
//        stack.add(ingredient[i])
//
//        if (stack.size >= 4) {
//            val one = stack.pop()
//            val two = stack.pop()
//            val three = stack.pop()
//            val four = stack.pop()
//
//            if (one == 1 && two == 3 && three == 2 && four == 1) {
//                cnt += 1
//            } else {
//                stack.add(four)
//                stack.add(three)
//                stack.add(two)
//                stack.add(one)
//            }
//        }
//
//    }
//    answer = cnt
//    return answer
//}