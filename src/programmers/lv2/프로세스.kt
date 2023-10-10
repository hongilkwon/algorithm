package programmers.lv2


/*
    프로세스

    단순구현.

    1 <= priorities <= 100


    1898
    881
 */

import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue

//data class Process(val idx: Int, val priority: Int)
//class Solution {
//    fun solution(priorities: IntArray, location: Int): Int {
//        var answer = 0
//
//        val list = mutableListOf<Process>()
//        for (i in 0 until priorities.size) {
//            val process = Process(idx = i, priority = priorities[i])
//            list.add(process)
//        }
//
//        var cnt = 0
//        while (list.isNotEmpty()){
//            val highProcess = list.maxByOrNull { it.priority }
//            val idx = list.indexOf(highProcess)
//
//            for (i in 0 until idx){
//                val p = list.removeFirst()
//                list.add(p)
//            }
//
//            val removedProcess = list.removeFirst()
//            cnt += 1
//            if (removedProcess.idx == location){
//                  break
//            }
//        }
//
//        println(cnt)
//        return cnt
//    }
//}