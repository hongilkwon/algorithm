package bac.week8

/*
    괄호

    val(R)을 먼저 구한뒤
    dmap을 구해서 최소값을 찾는다.

    (5 ≤ N ≤ 1,000)\

    ()()()() ....() 최대 이 2천자리 -> 스트링 비교로 가야된다.


    합(1,2,3) 또는 곱(2,3,5)으로

    올바른 괄호 -> 옆으로 놓기, 감싸기 -> 올바른 괄호

    1. 괄호를 맵핑한다.

 */

//var tc = 0
//var n = 0
//
////  N일때 --> 최소값(str)
//val case = Array(1001) { "" }
//
//val map = mapOf(
//    '1' to '(',
//    '2' to ')',
//    '3' to '{',
//    '4' to '}',
//    '5' to '[',
//    '6' to ']',
//)
//
//fun checkMin(before: String, after: String): Boolean {
//    if (before == "") return true
//    // 문자열은 자리수가 작을수록 크다.
//    // 자리수가 같다면, 정수처럼 대소비교가 된다.
//    return if (before.length > after.length)
//        true
//    else if (before.length == after.length) {
//        before > after
//    } else
//        false
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    tc = readLine().toInt()
//
//    case[1] = "12"
//    case[2] = "34"
//    case[3] = "56"
//
//    for (i in 1..1000) {
//        // 감싸기 최소값 갱신
//        if ((i % 2 == 0) && checkMin(case[i], '1' + case[i / 2] + '2'))
//            case[i] = '1' + case[i / 2] + '2'
//        if ((i % 3 == 0) && checkMin(case[i], '3' + case[i / 3] + '4'))
//            case[i] = '3' + case[i / 3] + '4'
//        if ((i % 5 == 0) && checkMin(case[i], '5' + case[i / 5] + '6'))
//            case[i] = '5' + case[i / 5] + '6'
//
//        // 앞으로 접합 최소값 갱신.
//        for (j in 1..i) {
//            if (checkMin(case[i], case[j] + case[i - j]))
//                case[i] = case[j] + case[i - j]
//        }
//    }
//
//    repeat(tc) {
//        n = readLine().toInt()
//        for (c in case[n]){
//            print(map[c])
//        }
//        println()
//    }
//    Unit
//}