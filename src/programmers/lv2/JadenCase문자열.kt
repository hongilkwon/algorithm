package programmers.lv2

/*
    JadenCase 문자열만들기.

    문자열 및 char 함수 자주 쓰이는거 외우기.


 */


//class Solution {
//    fun solution(s: String) =
//        s.split(' ').joinToString(" ") { it.lowercase().replaceFirstChar { it.uppercase() } }
//}

//class Solution {
//    fun solution(s: String): String {
//        var answer = ""
//
//        val strArr = s.split(' ')
//
//        val temp = mutableListOf<String>()
//        for (i in 0 until strArr.size) {
//            val str = strArr[i]
//            var newStr = ""
//            for (j in 0 until str.length) {
//
//                if (str[j].isDigit()){
//                    newStr += str[j].uppercaseChar()
//                    continue
//                }
//
//                if (j == 0) {
//                    newStr += str[j].uppercaseChar()
//                }else
//                    newStr += str[j].lowercaseChar()
//            }
//            temp.add(newStr)
//        }
//
//        answer = temp.joinToString(" ")
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution("aaaaa aaa aaaaaaa")
//
//}