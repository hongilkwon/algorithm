package bac.week7

/*
    서울에서 경산까지.
    정해진 순서대로 단 한 번씩 방문한 후

    서울에서 경산까지 여행하면서 모금할 수 있는 최대 금액
    (3 ≤ N ≤ 100, 0 < K ≤ 100,000)

     하향식 방법

 */

//import kotlin.math.*
//
//var n = 0
//var k = 0
//
//// "구간", "남은시간" --> 모금액
//val case = Array(101) { Array(100_001) { -1 } }
//
//lateinit var workInfo: Array<Work>
//lateinit var bicycleInfo: Array<Bicycle>
//
//data class Work(val section: Int, val time: Int, val money: Int)
//data class Bicycle(val section: Int, val time: Int, val money: Int)
//
//fun go(section: Int, remainTime: Int): Int {
//
//    if (section == n) return 0
//
//    if (case[section][remainTime] != -1) {
//        return case[section][remainTime]
//    }
//
//    var ret = -1_000_000_000
//
//    if (workInfo[section].time <= remainTime) {
//        ret = max(
//            ret,
//            go(section + 1, remainTime - workInfo[section].time) + workInfo[section].money
//        )
//    }
//
//    if (bicycleInfo[section].time <= remainTime) {
//        ret = max(
//            ret,
//            go(section + 1, remainTime - bicycleInfo[section].time) + bicycleInfo[section].money
//        )
//    }
//
//    case[section][remainTime] = ret
//    return case[section][remainTime]
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    k = info[1]
//
//    workInfo = Array(n) { Work(0, 0, 0) }
//    bicycleInfo = Array(n) { Bicycle(0, 0, 0) }
//
//    for (i in 0 until n) {
//        val moveInfo = readLine().split(" ").map { it.toInt() }
//        workInfo[i] = Work(i, moveInfo[0], moveInfo[1])
//        bicycleInfo[i] = Bicycle(i, moveInfo[2], moveInfo[3])
//    }
//
//    println(go(0, k))
//    for (i in 0 until case.size) {
//        for (j in 0 until case.first().size) {
//            if (case[i][j] != -1)
//                println("section $i, rTime $j = ${case[i][j]}")
//        }
//    }
//    Unit
//}