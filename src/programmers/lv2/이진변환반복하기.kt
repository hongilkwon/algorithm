package programmers.lv2


/*
    이진변환 반복하기.

    이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return
 */

//class Solution {
//    fun solution(s: String): IntArray {
//        var answer: IntArray = intArrayOf()
//
//        var str = s
//
//        var cnt = 0
//        var zeroCnt = 0
//        while (str != "1") {
//
//            cnt += 1
//
//            var temp = ""
//            for (i in 0 until str.length) {
//                if (str[i] == '0')
//                    zeroCnt += 1
//                else
//                    temp += str[i]
//            }
//
//            str = Integer.toBinaryString(temp.length)
//        }
//
//        answer = intArrayOf(cnt, zeroCnt)
//        return answer
//    }
//}