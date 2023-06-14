package bac.week7

/*
    축구

    각 18골
    총 36골

    A B
    0 0
    1 0
    0 1
    1 1

    dfs 탐색 원리를 이용하여
    최종 판별이 둘중 하나의 점수가 소수인 경우로 가는 모든 경로의 경우의수에 확률을 곱한다.

 */

//import kotlin.math.pow
//import kotlin.math.sqrt
//
//var aGoalP: Double = 0.0
//var bGoalP: Double = 0.0
//
//val case = Array(19) { Array(19) { Array(19) { 0L } } }
//fun isPrime(n: Int): Boolean {
//    if (n == 0 || n == 1) return false
//    for (i in 2..sqrt(n.toDouble()).toInt()) {
//        if (n % i == 0) return false
//    }
//    return true
//}
//
////fun go(a: Int, b: Int, time: Int): Double {
////
////    if (time == 18) {
////        if (isPrime(a) || isPrime(b)) {
////            return  1.0
////        } else
////            return 0.0
////    }
////
////    if (case[a][b][time] > -1) {
////        return case[a][b][time]
////    }
////
////    var ret = 0.0
////    ret += go(a, b, time + 1) * (1 - aGoalP) * (1 - bGoalP)
////    ret += go(a + 1, b, time + 1) * aGoalP * (1 - bGoalP)
////    ret += go(a, b + 1, time + 1) * (1 - aGoalP) * (bGoalP)
////    ret += go(a + 1, b + 1, time + 1) * aGoalP * bGoalP
////
////    case[a][b][time] = ret
////    return case[a][b][time]
////}


//fun go(a: Int, b: Int, time: Int): Long {
//
//    if (time == 18) {
//        case[a][b][time] = if (isPrime(a) || isPrime(b)) {
//            1
//        } else
//            0
//        return case[a][b][time]
//    }
//
//    if (case[a][b][time] != 0L) {
//        return case[a][b][time]
//    }
//
//    var ret = 0L
//    ret += go(a, b, time + 1)
//    ret += go(a + 1, b, time + 1)
//    ret += go(a, b + 1, time + 1)
//    ret += go(a + 1, b + 1, time + 1)
//
//    case[a][b][time] = ret
//    return case[a][b][time]
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    aGoalP = readLine().toDouble() / 100
//    bGoalP = readLine().toDouble() / 100
//
//    println(go(0, 0, 0))
//
////    var answer = 0.0
////    for (a in 0 until case.size) {
////        for (b in 0 until case.first().size) {
////            for (time in 0 until case.first().first().size) {
////                if (time == 18 && case[a][b][time] > 0) {
////                    println("$a $b")
////                    answer = aGoalP.pow(a) * (1 - aGoalP).pow(18 - a) * bGoalP.pow(b) * (1 - bGoalP).pow(18 - b)
////                }
////            }
////        }
////    }
////    println(answer)
//    Unit
//}