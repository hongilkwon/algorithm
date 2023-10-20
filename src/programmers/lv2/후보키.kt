package programmers.lv2

/*
    후보키

    RDB 후보키.

    유일성(uniqueness) : 릴레이션에 있는 모든 튜플에 대해 유일하게 식별되어야 한다.
    최소성(minimality) : 유일성을 가진 키를 구성하는 속성(Attribute) 중 하나라도 제외하는 경우 유일성이 깨지는 것을 의미한다.
    즉, 릴레이션의 모든 튜플을 유일하게 식별하는 데 꼭 필요한 속성들로만 구성되어야 한다.

     1 <= column <= 8
     1 <= row <=20
     relation의 모든 문자열의 길이는 1 이상 8 이하이며,


    조합을 이용한 완전탐색 문제이지만,
    생각 보다 많이 복잡하고 헷갈린다.

    bitmasking으로도 풀어보자.

 */


// 재귀적 풀이.
//class Solution {
//
//    lateinit var relation: Array<Array<String>>
//
//    var keyList = mutableListOf<List<Int>>()
//    val cntSet = mutableSetOf<String>()
//
//    val result = mutableListOf<Int>()
//    fun combi(n: Int, r: Int, start: Int = 0) {
//
//        if (result.size == r) {
//             for (key in keyList){
//                if (result.containsAll(key)) return
//             }
//
//            for (i in 0 until relation.size) {
//                var temp = ""
//                for (j in 0 until result.size) {
//                    temp += relation[i][result[j]]
//                }
//                cntSet.add(temp)
//            }
//
//            if (cntSet.size == relation.size) {
//                val temp = mutableListOf<Int>()
//                for (col in result){
//                    temp.add(col)
//                }
//               keyList.add(temp)
//            }
//            cntSet.clear()
//            return
//        }
//
//        for (i in start until n) {
//            result.add(i)
//            combi(n, r, i + 1)
//            result.removeLast()
//        }
//    }
//
//    fun solution(relation: Array<Array<String>>): Int {
//        var answer = 0
//        this.relation = relation
//
//        for (i in 1..relation.size) {
//            combi(relation.first().size, i)
//        }
//
//        answer = keyList.size
//        println(answer)
//        return answer
//    }
//}


//fun main() {
//    Solution().solution(
//        arrayOf(
//            arrayOf("100", "ryan", "music", "2"),
//            arrayOf("200", "apeach", "math", "2"),
//            arrayOf("300", "tube", "computer", "3"),
//            arrayOf("400", "con", "computer", "4"),
//            arrayOf("500", "muzi", "music", "3"),
//            arrayOf("600", "apeach", "music", "2")
//        )
//    )
//}