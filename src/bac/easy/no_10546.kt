package bac.easy

/*
    배부른 마라토너(해시, hash, set)

    N (1 ≤ N ≤ 105)
    동명이인 존재
 */


//var n = 0
//val map = hashMapOf<String, Int>()
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    for (i in 0 until n) {
//        val name = readLine()
//        if (map.contains(name)) {
//            map[name] = map[name]!! + 1
//        } else {
//            map[name] = 1
//        }
//    }
//
//    for (i in 0 until n - 1) {
//        val name = readLine()
//        if (map.contains(name)) {
//            map[name] = map[name]!! - 1
//        }
//    }
//
//    var answer = ""
//    for (item in map){
//        if (item.value != 0){
//            answer = item.key
//            break
//        }
//    }
//
//    println(answer)
//    return@with Unit
//}