package programmers.lv2

/*
    2019 카카오 개발자 겨울 인턴십

    s의 길이는 5 이상 1,000,000 이하

    단순 문자열 처리 문제.

    char
    - isDigit()
    - isLetter()
    - isLowerCase()

    - digitToInt()
    - digitToInt
    - digitToIntOrNull()

 */

//class Solution {
//    fun solution(s: String): IntArray {
//        var answer = intArrayOf()
//
//        val list = mutableListOf<MutableList<Int>>()
//
//        lateinit var temp: MutableList<Int>
//        var sb = StringBuilder()
//        for (i in 1..s.length - 2) {
//            if (s[i] == '{')
//                temp = mutableListOf()
//
//            if (s[i].isDigit()) {
//                sb.append(s[i])
//            }
//
//            if (s[i] == ',' && sb.isNotEmpty()) {
//                temp.add(sb.toString().toInt())
//                sb.clear()
//            }
//
//            if (s[i] == '}') {
//                temp.add(sb.toString().toInt())
//                sb.clear()
//                list.add(temp)
//            }
//        }
//
//        list.sortBy { it.size }
//
//        val tuple = mutableListOf<Int>()
//        val set = mutableSetOf<Int>()
//        for (i in 0 until list.size) {
//            for (j in 0 until list[i].size) {
//                if (set.contains(list[i][j])) {
//                    continue
//                } else {
//                    set.add(list[i][j])
//                    tuple.add(list[i][j])
//                }
//            }
//        }
//        answer = tuple.toIntArray()
//        return answer
//    }
//}