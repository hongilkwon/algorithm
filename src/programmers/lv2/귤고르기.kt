package programmers.lv2


/*
    귤 고르기.

    * 풀다가 런타임 에러남.

    cntMap, cntArr 잘골라서 풀면됨.

    1 ≤ k ≤ tangerine의 길이 ≤ 100,000
    1 ≤ tangerine의 원소 ≤ 10,000,000

 */


//class Solution {
//
//    val cntMap = mutableMapOf<Int, Int>()
//
//    var k = 0
//    lateinit var tangerine: IntArray
//    fun solution(a: Int, b: IntArray): Int {
//        var answer: Int = 0
//
//        k = a
//        tangerine = b
//
//        for (i in 0 until tangerine.size) {
//            if (cntMap.containsKey(tangerine[i])){
//                cntMap[tangerine[i]] = cntMap[tangerine[i]]!! + 1
//            }else{
//                cntMap[tangerine[i]] = 1
//            }
//        }
////        println(cntArr.joinToString(" "))
//
//        val temp = mutableListOf<Pair<Int, Int>>()
//
//        for (item in cntMap) {
//            temp.add(item.toPair())
//        }
//
//        temp.sortByDescending { it.second }
//
//        var cnt = 0
//        for (i in 0 until temp.size) {
//
//            if (k > 0) {
//                k -= temp[i].second
//                cnt += 1
//            }
//
//            if (k <= 0)
//                break
//        }
////        println(cnt)
//        return cnt
//    }
//}
//
//fun main() {
//    Solution().solution(6, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3))
//}