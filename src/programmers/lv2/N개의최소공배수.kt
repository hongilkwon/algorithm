package programmers.lv2

/*
    N개의 최소 공배수

    gcd lcm

    a 20 b 12
    a 12 b 8
    a 8  b 4
    a 4  b 0
 */

//class Solution {
//
//    fun gcd(num1: Int, num2: Int): Int {
//
//        var (a, b) = if (num1 > num2) num1 to num2 else num2 to num1
//
//        while (b != 0) {
//            val r = a % b
//            a = b
//            b = r
//        }
//
//        return a
//    }
//
//    fun lcm(num1: Int, num2: Int) = num1 * num2 / gcd(num1, num2)
//
//    fun solution(arr: IntArray): Int {
//        var answer = 0
//
//        if (arr.size == 1) return arr.first()
//
//        var temp = lcm(arr[0], arr[1])
//        for (i in 2 until arr.size) {
//            temp = lcm(temp, arr[i])
//        }
//
//        answer = temp
//        return answer
//    }
//}