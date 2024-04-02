package bac.easy

/*
   블로그(슬라이딩 윈도우)

   n  1<= n <= 250_000
   x  1<= x <= 250_000

   1<= 방문자수 <= 250_000

*/


//import kotlin.math.max
//
//var n = 0
//var x = 0
//
//lateinit var arr: IntArray
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    x = info[1]
//
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//
//    var window = 0
//    for (i in 0 until x) {
//        window += arr[i]
//    }
//
//    val windowSum = IntArray(n) { 0 }
//    windowSum[0] = window
//
//    var maxVisited = window
//    for (i in 1 until n - x + 1) {
//
//        window -= arr[i - 1]
//        window += arr[i + (x - 1)]
//        windowSum[i] = window
//
//        maxVisited = max(maxVisited, window)
//    }
//
//    if (maxVisited == 0) {
//        println("SAD")
//    } else {
//        val cnt = windowSum.count { it == maxVisited }
//        println(maxVisited)
//        println(cnt)
//    }
//
//    return@with Unit
//}