package bac.easy

/*
    듣보잡
 */


//var n = 0
//var m = 0
//
//val notHearSet = mutableSetOf<String>()
//val notSeeSet = mutableSetOf<String>()
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    for (i in 0 until n){
//        val name = readLine()
//        notHearSet.add(name)
//    }
//    for (i in 0 until m){
//        val name = readLine()
//        notSeeSet.add(name)
//    }
//
//    val result = notHearSet.intersect(notSeeSet).toList().sorted()
//    println(result.size)
//    result.forEach {
//        println(it)
//    }
//}