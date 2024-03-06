package bac.easy


/*
    과자 나눠주기(이분탐색)

    "하나"씩 나눠준다.
    조카들에게 "최대한 긴" 과자를 나눠줌
    모든 조카에게 "같은 길이의 막대 과자"를 나눠주어야

    단, 막대 과자는 길이와 상관없이 여러 조각으로 "나눠질 수 있지만, 과자를 하나로 합칠 수는 없다".
    단, 막대 과자의 길이는 양의 정수

    M명의 조카가 있고 N개의 과자가 있을 때, 조카 1명에게 줄 수 있는 막대 과자의 최대 길이
    단, 모든 조카에게 같은 길이의 막대과자를 나눠줄 수 없다면, 0을 출력

 */

//
//var m = 0L
//var n = 0L
//
//lateinit var snacks: LongArray
//
//// 내가 현재 "가정한 과자의 길이로" 문제에서 주어진 조카의 수만큼 나눠줄 수 있냐?
//fun check(len: Long): Boolean {
//
//    var cnt = 0
//    for (i in 0 until snacks.size) {
//        if (snacks[i] >= len) {
//            // 과자 쪼개기
//            cnt += (snacks[i] / len).toInt()
//        }
//        if (cnt >= m) {
//            return true
//        }
//    }
//    return false
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toLong() }
//
//    m = info[0]
//    n = info[1]
//
//    snacks = readLine().split(" ").map { it.toLong() }.toLongArray()
//
//    var left = 1L
//    var right = snacks.maxOrNull()!! // 10억
//
//    var answer = 0L
//
//    while (left <= right) {
//        val mid = (left + right) / 2
//
//        if (check(mid)) {
//            answer = mid
//            left = mid + 1
//        } else {
//            right = mid - 1
//        }
//    }
//
//    if (answer == 0L){
//        println(0)
//    }else{
//        println(answer)
//    }
//
//    return@with Unit
//}