package programmers.lv3

/*
    여행경로

    사전순, -> 젤빠른것... 백트레킹.
    원복.

 */

//data class Ticket(val destination: String, var used: Boolean)
//class Solution {
//
//    var adjMap = mutableMapOf<String, MutableList<Ticket>>()
//    var travelCnt = 0
//
//
//    var answer = arrayOf<String>()
//    var flag = false
//    fun go(start: String, order: MutableList<String>) {
//
//        if (flag) return
//
//        if (order.size == travelCnt) {
//            answer = order.toTypedArray()
//            flag = true
//            return
//        }
//
//        if (adjMap[start].isNullOrEmpty()) return
//
//        for (next in adjMap[start]!!) {
//            if (next.used) continue
//
//            order.add(next.destination)
//            next.used = true
//            go(next.destination, order)
//            order.removeLast()
//            next.used = false
//        }
//    }
//
//    fun solution(tickets: Array<Array<String>>): Array<String> {
//
//        for (i in 0 until tickets.size) {
//            val start = tickets[i][0]
//            val end = tickets[i][1]
//
//            if (adjMap.containsKey(start)) {
//                adjMap[start]?.add(Ticket(end, false))
//            } else {
//                adjMap[start] = mutableListOf(Ticket(end, false))
//            }
//        }
//
//        travelCnt = tickets.size + 1
//
//        for (key in adjMap.keys) {
//            adjMap[key]?.sortBy { it.destination }
//        }
//
////        println(adjMap)
//        go("ICN", mutableListOf("ICN"))
//
////        println(answer.joinToString(" "))
//        return answer
//    }
//}

//fun main() {
////    arrayOf(
////        arrayOf("ICN", "SFO"),
////        arrayOf("ICN", "ATL"),
////        arrayOf("SFO", "ATL"),
////        arrayOf("ATL", "ICN"),
////        arrayOf("ATL", "SFO")
////    )
//    Solution().solution(
//        arrayOf(
//            arrayOf("ICN", "JFK"),
//            arrayOf("ICN", "AAD"),
//            arrayOf("JFK", "ICN"),
//        )
//    )
//}