package programmers.lv1

import kotlin.math.sqrt

/*
    약수의 개수와 덧셈

    약수 구하는 코드.
        for (i in 1..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            cnt += 1
        }
    }
 */


//fun check(num: Int): Int {
//    var cnt = 0
//    val half = sqrt(num.toDouble()).toInt()
//    for (i in 1..half) {
//        if (num % i == 0) {
//            cnt += 1
//            if (num / i != i) {
//                cnt += 1
//            }
//        }
//    }
//    return cnt
//}
//
//fun solution(left: Int, right: Int): Int {
//    var answer: Int = 0
//
//    for (i in left..right) {
//        if (check(i) % 2 == 0) {
//            answer += i
//        } else {
//            answer -= i
//        }
//    }
//    return answer
//}