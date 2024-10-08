package bac.week6.concept


/*
   입국심사

   m명 n개의 입국 심사대
   k번 심사대에 심사 시간 Tk

    10^9 는 10억
    (1 ≤ N ≤ 100,000, 1 ≤ M ≤ 1,000,000,000)
    (1 ≤ Tk ≤ 10^9)

   7 - 1 3 5 6
   10 - 2 4

   10억...

   */


//var n = 0
//var m = 0L
//
//lateinit var timeArr: Array<Long>
//
//// 모든 심사대의 심사 시간이 1분이고 totalTime 1_000_000_000 * m
//// 이라면 Cnt가 long의 최대 범위 9_223_372_036_854_775_807L 초과하여 쓰레기 값이 생성됨
//// 그래서 아래 함수로 하면 틀림.
////fun check(totalTime: Long): Boolean {
////    var cnt = 0L
////    for (i in 0 until timeArr.size) {
////        cnt += (totalTime / timeArr[i])
////    }
////    return cnt >= m
////}
//
//fun check(totalTime: Long): Boolean {
//    /*
//      모든 인원을 심사하는데 걸리는 시간을 각 심사대에서 걸리는 시간으로 나눠서
//      몇 명을 심사 할 수 있는지 카운트
//     */
//    var cnt = 0L
//    for (i in 0 until timeArr.size) {
//        // 주어진 시간안에 각각의 심사대별로 몇명 심사하는지 계산
//        cnt += (totalTime / timeArr[i])
//        if (cnt >= m) return true
//    }
//    return false
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toLong() }
//
//    n = info[0].toInt()
//    m = info[1]
//
//    timeArr = Array(n) { readLine().toLong() }
//
//    var left: Long = 1
//    var right: Long = timeArr.maxOrNull()!! * m
//
//    var answer = 0L
//
//    while (left <= right) {
//
//        val mid = (left + right) / 2
//
//        if (check(mid)) {
//            answer = mid
//            right = mid - 1
//        } else {
//            left = mid + 1
//        }
//    }
//    println(answer)
//    Unit
//}




