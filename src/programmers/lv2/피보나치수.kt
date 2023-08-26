package programmers.lv2

/*
    피보나치 수

    n은 2 이상 100,000
 */

//class Solution {
//
//    val DIV = 1234567
//    val arr = IntArray(100_001) { 0 }
//    fun solution(n: Int): Int {
//        var answer = 0
//
//        arr[1] = 1
//        for (i in 2..n) {
//            arr[i] = (arr[i - 1] % DIV + arr[i - 2] % DIV) % DIV
//        }
//
//        return arr[n]
//    }
//}