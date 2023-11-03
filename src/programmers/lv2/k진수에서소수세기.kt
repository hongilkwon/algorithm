package programmers.lv2

/*
    k진수 에서 소수 세기.

    단순구현, 진법, 소수 등 기본을 적절하게 잘섞어 놓은 문제임

    1 ≤ n ≤ 1_000_000
    3 ≤ k ≤ 10

    * n = 1_000_000, k=3
    이면, 1_212_210_202_001
    Long type 필요함.
 */

//import kotlin.math.sqrt
//
//class Solution {
//
//    fun transform(n: Int, k: Int): String {
//
//        var temp = n
//        var r = 0
//
//        val sb = StringBuilder()
//        while (temp >= k) {
//            r = temp % k
//            temp /= k
//            sb.append(r)
//        }
//        sb.append(temp)
//
//        return sb.reverse().toString()
//    }
//
//    fun isPrime(n: Long): Boolean {
//        if (n == 1L) return false
//        if (n == 2L) return true
//
//        for (i in 2..sqrt(n.toDouble()).toInt()) {
//            if (n % i == 0L) return false
//        }
//        return true
//    }
//
//    fun solution(n: Int, k: Int): Int {
//        var answer: Int = -1
//
//        val str = transform(n, k)
//        println(str)
//
//        var p = ""
//        val list = mutableListOf<Long>()
//        for (i in 0 until str.length) {
//            if (str[i] == '0') {
//                if (p != "") list.add(p.toLong())
//                p = ""
//            } else {
//                p += str[i]
//            }
//        }
//        if (p != "") list.add(p.toLong())
//
////        println(list.joinToString(" "))
//        var cnt = 0
//        for (e in list) {
//            if (isPrime(e)) {
//                cnt += 1
//            }
//        }
//        answer = cnt
////        println(answer)
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(1000000, 3)
//
//}