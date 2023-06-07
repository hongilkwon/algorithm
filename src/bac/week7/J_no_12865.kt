package bac.week7

/*
    평범한 배낭

    첫 줄에 물품의 수 N(1 ≤ N ≤ 100)
    버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다.

    두 번째 줄부터 N개의 줄에 거쳐
    각 물건의 무게 W(1 ≤ W ≤ 100,000)
    해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.

    가치의 최대값.

 */

//import kotlin.math.*
//
//var n = 0
//var k = 0
//
//lateinit var itemArr: Array<Pair<Int, Int>>
//
//// 버틸수 있는 무게 - 최대 가치.
//lateinit var case: Array<Int>
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    k = info[1]
//
//    itemArr = Array(n) { 0 to 0 }
//    case = Array(k+1) { 0 }
//
//    for (i in 0 until n) {
//        val itemInfo = readLine().split(" ").map { it.toInt() }
//        itemArr[i] = itemInfo[0] to itemInfo[1]
//    }
//
//    for (i in 0 until n) {
//        val item = itemArr[i]
//        for (j in k downTo item.first) {
//            case[j] = max(case[j], case[j - item.first] + item.second)
//        }
//        println(case.joinToString(" "))
//    }
//    println(case[k])
//    Unit
//}