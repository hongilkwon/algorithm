package programmers.lv3

/*
    베스트 앨범.

    cntMap/ priorityQueue 이용한 단순구현.
    kotlin 자료구조 정리.
 */

//import java.util.PriorityQueue
//
//data class Song(val number: Int, val playCnt: Int)
//
//data class Genre(
//    val name: String, var totalPlayCnt: Int, val priorityQueue: PriorityQueue<Song> = PriorityQueue(
//        compareByDescending<Song> { it.playCnt }.thenBy { it.number })
//)
//
//class Solution {
//
//    val cntMap = mutableMapOf<String, Genre>()
//    fun solution(genres: Array<String>, plays: IntArray): IntArray {
//        var answer = intArrayOf()
//
//        for (i in 0 until genres.size) {
//            val g = genres[i]
//            val p = plays[i]
//
//            if (cntMap.containsKey(g)) {
//                cntMap[g]!!.totalPlayCnt += p
//                cntMap[g]!!.priorityQueue.add(Song(i, p))
//            } else {
//                cntMap[g] = Genre(g, p)
//                cntMap[g]!!.priorityQueue.add(Song(i, p))
//            }
//        }
//
//        val list = cntMap.toList().sortedByDescending { it.second.totalPlayCnt }
//
//        val temp = mutableListOf<Int>()
//
//        for (i in 0 until list.size){
//            val p = list[i].second.priorityQueue
//            if (p.size == 1){
//                temp.add(p.poll().number)
//                continue
//            }
//            temp.add(p.poll().number)
//            temp.add(p.poll().number)
//        }
//
//        return temp.toIntArray()
//    }
//}
//
//fun main() {
//    Solution().solution(arrayOf("classic", "pop", "classic", "classic", "pop"), intArrayOf(500, 600, 150, 800, 2500))
//}