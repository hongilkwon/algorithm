package programmers.lv2


/*
    가장 큰 수

    숫자 String 정렬문제.

    자리수가 낮을 수 록 큼.
    자리수가 같으면 그냥 비교하면 됨.

    // 숫자문자열 스트링 정렬  strNumbers.sortWith(compareBy<String> { it.length }.thenBy { it })

    입력 : [555, 565, 566, 55, 56, 5, 54, 544, 549]
    정렬된 순서 : 566 56 565 5 55 555 549 54 544
    출력 : "5665656555555554954544"

    565 56
    56 565

    숫자로 이루어진 스트링을 다루는 문제인데, 생각보다 까다롭다.
    비교자를 잘써야된다.

 */

import kotlin.math.*

//val comp = Comparator<String> { o1, o2 ->
//
//    if (o1.length > o2.length) {
//        for (i in 0 until o2.length) {
//            if (o1[i] > o2[i]) return@Comparator -1 else if (o1[i] < o2[i]) return@Comparator 1
//        }
//        for (i in o2.length until o1.length) {
//            if (o1[i] > o2[0]) return@Comparator -1 else if (o1[i] < o2[0]) return@Comparator 1
//        }
//        return@Comparator 0
//
//    } else if (o1.length < o2.length) {
//        for (i in 0 until o1.length) {
//            if (o1[i] > o2[i]) return@Comparator -1 else if (o1[i] < o2[i]) return@Comparator 1
//        }
//        for (i in o1.length until o2.length) {
//            if (o1[0] > o2[i]) return@Comparator -1 else if (o1[0] < o2[i]) return@Comparator 1
//        }
//        return@Comparator 0
//    } else {
//        return@Comparator if (o1 > o2) -1 else if (o2 > o1) 1 else 0
//    }
//}

//val comp = Comparator<String> { o1, o2 ->
//    val temp1 = o1 + o2
//    val temp2 = o2 + o1
//
//    return@Comparator if (temp1 > temp2) {
//        -1
//    } else if (temp2 > temp1) {
//        1
//    } else {
//        0
//    }
//}
//
//class Solution {
//
//    lateinit var strNumbers: Array<String>
//    fun solution(numbers: IntArray): String {
//        var answer = ""
//
//        if (numbers.all { it ==0 }) return "0"
//
//        strNumbers = numbers.map { it.toString() }.toTypedArray()
//        strNumbers.sortWith(comp)
//
//        val sb = StringBuilder()
//        for (i in 0 until strNumbers.size) {
//            sb.append(strNumbers[i])
//        }
//
//        answer = sb.toString()
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(intArrayOf(555, 565, 566, 55, 56, 5, 54, 544, 549))
//}