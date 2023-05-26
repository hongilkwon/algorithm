package bac.week6

import kotlin.math.max


/*
   전깃줄

   서로 교차하지 않게 하기 위해,
   없애야 하는 전깃줄의 "최소" 개수
   남아있는 전기줄은 최대.

   1<= 전깃줄의 개수 <=100
   */


var n = 0
val arr = Array(501) { 0 }
val lisLen = Array(501) { 0 }

fun main() = with(System.`in`.bufferedReader()) {
    n = readLine().toInt()

    for (i in 0 until n) {
        val info = readLine().split(" ").map { it.toInt() }
        arr[info[0]] = info[1]
    }
//    println(arr.joinToString(" "))

    var maxLen = 0
    for (i in 0 until arr.size) {
        if (arr[i] == 0) continue
        var tempLen = 0
        for (j in 0 until i) {
            if (arr[j] == 0) continue
            if (arr[i] > arr[j] && lisLen[j] > tempLen) {
                tempLen = lisLen[j]
            }
        }
        lisLen[i] = tempLen + 1
        maxLen = max(maxLen, lisLen[i])
    }

//    println("maxLen $maxLen")
    println(n - maxLen)
    Unit
}



