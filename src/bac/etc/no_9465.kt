package bac.etc

/*
    스티커
    n (1 ≤ n ≤ 100_000)

    n = 100_000
    2*2*2*2.....
    너무 많은 경우의수...

    dp -> 타뷸레이션.

 */


//import kotlin.math.max
//
//var n = 0
//
//lateinit var sticker: Array<IntArray>
//lateinit var case: Array<IntArray>
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val tc = readLine().toInt()
//
//    for (t in 0 until tc) {
//        n = readLine().toInt()
//        sticker = Array(2) { IntArray(n) { 0 } }
//        for (i in 0 until sticker.size) {
//            sticker[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//        }
//
//        if (n == 1) {
//            println(max(sticker[0][0], sticker[1][0]))
//            continue
//        } else if (n == 2) {
//            println(max(sticker[1][0] + sticker[0][1], sticker[0][0] + sticker[1][1]))
//            continue
//        }
//
//        case = Array(2) { IntArray(n) { 0 } }
//        case[0][0] = sticker[0][0]
//        case[1][0] = sticker[1][0]
//
//        case[0][1] = case[1][0] + sticker[0][1]
//        case[1][1] = case[0][0] + sticker[1][1]
//
//        val tempList = mutableListOf<Int>()
//        for (i in 2 until n) {
//            case[0][i] = maxOf(case[1][i - 1], case[1][i - 2]) + sticker[0][i]
//            case[1][i] = maxOf(case[0][i - 1], case[0][i - 2]) + sticker[1][i]
//            if (i == n - 2 || i == n - 1) {
//                tempList.add(case[0][i])
//                tempList.add(case[1][i])
//            }
//        }
////        case.forEach { println(it.joinToString(" ")) }
//        println(tempList.maxOrNull())
//    }
//}