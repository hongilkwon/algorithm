package bac.etc


/*
    수 나누기 게임

    2 <= N <= 100_000

    100_000 C 2 -> 너무 큼 안됨

    에라토스테네스 체??
    생각하기 어렵다.


 */


//var n = 0
//lateinit var arr: IntArray
//
//val cards = BooleanArray(100_0001) { false }
//val scores = IntArray(100_0001) { 0 }
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    for (i in arr) {
//        cards[i] = true
//    }
//
//    for (i in 0 until n) {
//        for (j in arr[i] until 1000001 step arr[i]) {
//            if (cards[j]) {
//                scores[arr[i]] += 1
//                scores[j] -= 1
//            }
//        }
//    }
//
//    for (i in 0 until arr.size){
//        print("${scores[arr[i]]} ")
//    }
//}