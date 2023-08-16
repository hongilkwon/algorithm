package programmers.lv2

/*
    소수찾기.

    numbers는 길이 1 이상 7 이하인 문자열입니다.
    numbers는 0~9까지 숫자만으로 이루어져 있습니다.

    완전 탐색 및 순열.
 */

//import kotlin.math.sqrt
//class Solution {
//
//    lateinit var arr: CharArray
//    val numberSet = mutableSetOf<Int>()
//
//    val result = mutableListOf<Int>()
//    lateinit var isSelected: BooleanArray
//    val sb = StringBuilder()
//    fun permu(n: Int, r: Int, cnt: Int = 0) {
//
//        if (cnt == r) {
//            result.forEach {
//                sb.append(arr[it])
//            }
//            numberSet.add(sb.toString().toInt())
//            sb.clear()
//            return
//        }
//
//        for (i in 0 until n) {
//            if (isSelected[i]) continue
//
//            isSelected[i] = true
//            result.add(i)
//            permu(n, r, cnt + 1)
//
//            isSelected[i] = false
//            result.removeLast()
//        }
//    }
//
//    fun isPrime(num: Int): Boolean {
//
//        if (num == 1 || num == 0) return false
//        if (num == 2) return true
//
//        for (i in 2..sqrt(num.toDouble()).toInt()) {
//            if (num % i == 0) return false
//        }
//        return true
//    }
//
//    fun solution(numbers: String): Int {
//        var answer = 0
//
//        arr = numbers.toCharArray()
//
//        val n = arr.size
//        isSelected = BooleanArray(n) { false }
//
//        for (r in 1..arr.size) {
//            permu(n, r)
//        }
//
//        println(numberSet.joinToString(" "))
//        var cnt = 0
//        numberSet.forEach {
//            if (isPrime(it))
//                cnt += 1
//        }
//
//        println(cnt)
//        return cnt
//    }
//}

//fun main() {
//    Solution().solution("011")
//}
