package programmers.lv2

import kotlin.math.min


/*
    광물캐기

    최소한의 피로도로 광물을 캐야

    광물 5개를 캔 후에는 더 이상 사용할 수 없습니다

    사용할 수 있는 곡괭이중 아무거나 하나를 선택해 광물을 캡니다.
    한 번 사용하기 시작한 곡괭이는 사용할 수 없을 때까지 사용합니다.
    광물은 주어진 순서대로만 캘 수 있습니다.
    광산에 있는 모든 광물을 캐거나, 더 사용할 곡괭이가 없을 때까지 광물을 캡니다.

    1. 완전탐색(시간초과)
    - 모든 곡갱이의 순서조합을 다 구한다.
    - 최소값을 구한다.

    3종류의 곡갱이가 최대값인 5개씩 존재한다면,
    총 15개의 곡갱이의 배치를 구해야됨.
    15! = 2_004_189_184(20억)

   2. 백트레킹을 통한 구현.
    - dfs 구현하는 형태로 최소값을 갱신하면서 구한다.

   3. *greedy

 */

//var answer = Int.MAX_VALUE
//lateinit var picks: IntArray
//lateinit var minerals: Array<String>
//lateinit var pirodoInfo: Array<Map<String, Int>>
//
//
//fun go(mineralsIdx: Int, pick: Int, sum: Int) {
//
//    if (mineralsIdx >= minerals.size) {
//        answer = min(answer, sum)
//        return
//    }
//
//    var piro = sum
//    for (i in mineralsIdx until min(mineralsIdx + 5, minerals.size)) {
//        piro += pirodoInfo[pick][minerals[i]]!!
//    }
//
//    for (i in 0 until 3) {
//        if (picks[i] == 0) continue
//        picks[i]--
//        go(mineralsIdx + 5, i, piro)
//        picks[i]++
//    }
//
//    if (picks.all { it == 0}){
//        answer = min(answer, piro)
//        return
//    }
//}
//
//fun solution(p: IntArray, m: Array<String>): Int {
//    picks = p
//    minerals = m
//
//    pirodoInfo = Array(3) {
//        if (it == 0) {
//            mutableMapOf("diamond" to 1, "iron" to 1, "stone" to 1)
//        } else if (it == 1) {
//            mutableMapOf("diamond" to 5, "iron" to 1, "stone" to 1)
//        } else {
//            mutableMapOf("diamond" to 25, "iron" to 5, "stone" to 1)
//        }
//    }
//
//    for (i in 0 until 3) {
//        if (picks[i] == 0) continue
//        picks[i]--
//        go(0, i, 0)
//        picks[i]++
//    }
//
//    return answer
//}
//
//fun main() {
//    println(
//        solution(
//            intArrayOf(0, 1, 1),
//            arrayOf(
//                "diamond",
//                "diamond",
//                "diamond",
//                "diamond",
//                "diamond",
//                "iron",
//                "iron",
//                "iron",
//                "iron",
//                "iron",
//                "diamond"
//            )
//        )
//    )
//}