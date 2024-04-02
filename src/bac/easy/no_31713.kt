package bac.easy


/*
   행운을 빌어요

   줄기와 잎을 "남김없이 모두 써서" 클로버를 만들기 위해,
   포닉스가 더 가져와야 하는 클로버 줄기와 잎 개수의 합의 최솟값을 구해주자.

   완전탐색 -> 시간초과
   1 2 3 4 5 6 7 8 9 10 11 12
       1 1 1 2 2 2 3 3  3  4
*/

import java.lang.Integer.min

var julgi = 0
var leaf = 0

fun main() = with(System.`in`.bufferedReader()) {

   val tc = readLine().toInt()

   val sb = StringBuilder()
   repeat(tc) {
      val info = readLine().split(" ").map { it.toInt() }

      julgi = info[0]
      leaf = info[1]

   }

   return@with Unit
}

//import java.lang.Integer.min
//
//var julgi = 0
//var leaf = 0
//
//var min = 1000 * 3
//fun go(cnt: Int, leaf: Int) {
//
//    if (leaf <= 0) {
////        println("cnt: $cnt, leaf: $leaf")
//        var temp =
//            if (cnt >= julgi) {
//                cnt - julgi + (-leaf)
//            } else {
//                (julgi) * 3 + leaf
//            }
//
//        min = min(min, temp)
//        return
//    }
//
//    go(cnt + 1, leaf - 3)
//    go(cnt + 1, leaf - 4)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    val sb = StringBuilder()
//    repeat(tc) {
//        val info = readLine().split(" ").map { it.toInt() }
//
//        julgi = info[0]
//        leaf = info[1]
//
//        min = 1000 * 3
//        go(0, leaf)
//        sb.append("$min\n")
//    }
//    println(sb.toString())
//    return@with Unit
//}