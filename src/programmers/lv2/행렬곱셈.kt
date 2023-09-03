package programmers.lv2

/*
    행렬 곱셈

    1 4
    3 2   3 3
    4 1   3 3


    m k * k n = m n
 */

//class Solution {
//    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
//        var answer = arrayOf<IntArray>()
//
//        var ret = Array(arr1.size) { IntArray(arr2.first().size) { 0 } }
//
//        for (m in 0 until arr1.size) {
//            for (n in 0 until arr2.first().size) {
//                var sum = 0
//                for (k in 0 until arr1.first().size) {
//                    println("m: ${arr1[m][k]} n: ${arr2[k][n]} k: $k")
//                    sum += arr1[m][k] * arr2[k][n]
//                }
//                ret[m][n] = sum
//            }
//        }
//
//        ret.forEach {
//            it.joinToString(" ")
//        }
//
//        return ret
//    }
//}

