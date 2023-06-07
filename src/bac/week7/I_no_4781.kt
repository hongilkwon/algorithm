package bac.week7

/*
    사탕가게

    상향식 방법
    메모이제이션,
    최소값을 갱신하는 방법으로 진행.

    실수형값을 처리하는데 있어 주의해야됨.

    x.xx -> 100을 곱해서 정수형으로 만들떄,
    그냥 곱을 하지말고 . 기준으로 나눠서 곱하고 더한다.

 */

//import kotlin.math.max
//
//var n = 0
//var m = 0.0
//
//lateinit var candyArr: Array<Pair<Int, Int>>
//
//var case = Array(10_004) { 0 }
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    while (true) {
//        val info = readLine().split(" ")
//        n = info[0].toInt()
//        m = info[1].toDouble()
//
//        if (n == 0 && m == 0.00) break
//
//        candyArr = Array(n) { 0 to 0 }
//        case = Array(10_004) { 0 }
//
//        for (i in 0 until n) {
//            val candyInfo = readLine().split(" ")
//            val candyCal = candyInfo[1].split(".").map { it.toInt() }
//            candyArr[i] = candyInfo[0].toInt() to candyCal[0]*100 + candyCal[1]
//        }
//
//        for (i in 0 until n) {
//            val candy = candyArr[i]
//            for (j in candy.second..10_000) {
//                case[j] = max(case[j], case[j - candy.second] + candy.first)
//            }
//        }
//        println(case[(m*100).toInt()])
//    }
//    Unit
//}