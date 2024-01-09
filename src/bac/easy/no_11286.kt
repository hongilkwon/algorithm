package bac.easy


/*
    절대값 힙.

    연산의 개수 N(1≤ N ≤100_000)
 */


//import java.util.PriorityQueue
//import kotlin.math.absoluteValue
//
//var n = 0
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    val pq = PriorityQueue(compareBy<Int> { it.absoluteValue }.thenBy { it })
//    repeat(n) {
//        val oper = readLine().toInt()
//        if (oper == 0) {
//            val num =
//                if (pq.isNotEmpty()) {
//                    pq.poll()
//                } else {
//                    0
//                }
//            println(num)
//        } else {
//            pq.add(oper)
//        }
//    }
//
//    return@with Unit
//}