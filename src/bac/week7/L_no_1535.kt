package bac.week7

/*
    안녕

    상향식 방법.
    최대값 갱신
 */

//import kotlin.math.max
//
//var n = 0
//
//var hp = 100
//var happy = 0
//
//lateinit var damageInfo: Array<Int>
//lateinit var happyInfo: Array<Int>
//
//val case = Array(101){ 0 }
//fun main() = with(System.`in`.bufferedReader()){
//    n = readLine().toInt()
//    damageInfo = readLine().split(" ").map { it.toInt() }.toTypedArray()
//    happyInfo = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    for (i in 0 until n){
//        val damage = damageInfo[i]
//        val happy = happyInfo[i]
//        for (j in 100 downTo damage){
//            case[j] = max(case[j-damage]+happy, case[j])
//        }
//    }
//    println(case[99])
//}