package programmers.lv2

/*
    하노이 탑

    너무 유명한 재귀 문제.
    그냥 알고있자....

 */

//
//val mList = mutableListOf<IntArray>()
//fun hanoi(n: Int, start: Int, sub: Int, end: Int){
//
//    if (n == 1){
//        move(start, end)
//        return
//    }
//
//    hanoi(n-1, start,  end, sub)
//    move(start, end)
//    hanoi(n-1, sub,  start, end)
//}
//
//fun move(to: Int, from: Int){
//    mList.add(intArrayOf(to, from))
//}
//
//class Solution {
//    fun solution(n: Int): Array<IntArray> {
//        var answer = arrayOf<IntArray>()
//
//        hanoi(n, 1,2,3)
//        answer= mList.toTypedArray()
//
////        answer.forEach { println("[${it.joinToString(",")}]") }
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(2)
//}