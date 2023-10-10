package programmers.lv2

/*
    의상.

    분류 맵을 이용하여 분류하고.
    고등수학 내용이 필요함.
 */


//class Solution {
//
//    val clothesMap = mutableMapOf<String, MutableList<String>>()
//    fun solution(clothes: Array<Array<String>>): Int {
//        var answer = 0
//
//        for (item in clothes){
//            val key = item[1]
//            val name = item[0]
//
//            if (clothesMap.containsKey(key)){
//                clothesMap[key]!!.add(name)
//            }else{
//                clothesMap[key] = mutableListOf(name)
//            }
//        }
//
//        var result = 1
//        for (entry in clothesMap){
//            result *= (entry.value.size + 1)
//        }
//
//        answer = result - 1
//        return answer
//    }
//}