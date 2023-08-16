package programmers.lv2


/*
    멀리뛰기

    n은 1 이상, 2000 이하인 정수

    1칸, 또는 2칸을 뛸 수 있다.

    피보나치
    dp - 타뷸레이션

 */


//class Solution {
//
//    lateinit var arr: LongArray
//    fun solution(n: Int): Long {
//
//        if (n == 1) return 1
//
//        arr = LongArray(n + 1) { 0 }
//
//        arr[1] = 1
//        arr[2] = 2
//
//        for (i in 3 until arr.size) {
//            arr[i] = (arr[i - 1] % 1234567 + arr[i - 2] % 1234567) % 1234567
//        }
//
//        return arr[n]
//    }
//}




