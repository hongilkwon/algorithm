package programmers.lv3

/*
    가장 긴 팰린드롭

    팰린드롬
    dp(타뷸레이션으로 해결)

    nC2 * 2500

 */

//class Solution {
//
//    lateinit var arr: CharArray
//
//    // case[start][end]
//    lateinit var case: Array<IntArray>
//
//    fun solution(s: String): Int {
//        var answer = 0
//
//        arr = s.toCharArray()
//
//        case = Array(s.length) { IntArray(s.length) { 0 } }
//
//        // 최소 팰린드롬 사이즈가 1인 경우
//        for (i in 0 until arr.size) {
//            case[i][i] = 1
//        }
//
//        // 최소 팰린드롬 사이즈가 2인 경우
//        for (i in 0 until arr.size - 1) {
//            if (arr[i] == arr[i + 1]) case[i][i + 1] = 2
//        }
//
//        // size = 펠린드롬의 중심 사이즈
//        for (size in 2 until arr.size) {
//            for (i in 0 until arr.size - size) {
//                if (arr[i] == arr[i + size] && case[i + 1][i + size - 1] > 0){
//                    case[i][i + size] = case[i + 1][i + size - 1] + 2
//                }
//            }
//        }
//
//        var maxLen = 0
//        for (i in 0 until case.size){
//            for (j in 0 until case.first().size){
//                maxLen = maxOf(maxLen, case[i][j])
//            }
//        }
//
//        return maxLen
//    }
//}