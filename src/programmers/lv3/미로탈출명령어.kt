package programmers.lv3

import kotlin.math.abs

/*
    미로 탈출 명령어

    2<= n,m <=50

    2500칸, 4방향, 재방문가능(무제한 방문)
    4^2500?
    dp??, BackTracking?,

    총 k번 이동 중에 사전순으로 가장 빠른것.

    * 그래프, 맵을 탐색에 있어 특별한 조건이 추가된다면, dfs
    -> d -> l -> r -> u 이순으로 탐색을 해야된다.

    * k - 최단거리 = 홀수면 불가능.
    * k - 최단거리 <= 0 불가능.
 */

//class Solution {
//
//    var n = 0
//    var m = 0
//
//    lateinit var map: Array<IntArray>
//
//    // d(아래) -> l(왼쪽) -> r(오른쪽) -> u(위)
//
//    val dArr = arrayOf('d', 'l', 'r', 'u')
//    val dy = arrayOf(1, 0, 0, -1)
//    val dx = arrayOf(0, -1, 1, 0)
//
//    lateinit var s: Pair<Int, Int>
//    lateinit var e: Pair<Int, Int>
//
//    var k = 0
//
//    var answer = ""
//
//    fun calMinDist(s: Pair<Int, Int>, e: Pair<Int, Int>) =
//        abs(s.first - e.first) + abs(s.second - e.second)
//
//    fun go(point: Pair<Int, Int>, moveCnt: Int, dirSting: String): Boolean {
//
//        val minDist = calMinDist(point, e)
//
//        if (moveCnt < minDist) {
//            answer = "impossible"
//            return false
//        }
//
//        if ((moveCnt - minDist) % 2 == 1) {
//            answer = "impossible"
//            return false
//        }
//
//        // 도착점에 도착하고, 정해진 만큼 이동했다면,
//        if (point == e && moveCnt == 0) {
//            answer = dirSting
//            return true
//        }
//
//        var ret = false
//        for (i in 0 until 4) {
//            val ny = point.first + dy[i]
//            val nx = point.second + dx[i]
//            val d = dArr[i]
//
//            if (ny !in 0 until map.size || nx !in 0 until map.first().size) continue
//
//            ret = go(ny to nx, moveCnt - 1, dirSting + d)
//            if (ret) break
//        }
//
//        return ret
//    }
//
//    fun solution(n: Int, m: Int, x: Int, y: Int, r: Int, c: Int, k: Int): String {
//
//        this.n = n
//        this.m = m
//
//        map = Array(n) { IntArray(m) { 0 } }
//
//        s = x - 1 to y - 1
//        e = r - 1 to c - 1
//
//        this.k = k
//
//        go(s, k, "")
//        println(answer)
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(3, 4, 2, 3, 3, 1, 5)
//}