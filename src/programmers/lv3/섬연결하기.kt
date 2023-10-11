package programmers.lv3

/*
    섬 연결하기 (MST)

    n개의 섬 사이에 다리를 건설하는 비용(costs)이 주어질 때,
    "최소의 비용"으로 모든 섬이 서로 통행 가능하도록 만들 때 필요한 최소 비용 구하기.

 */


//class Solution {
//
//    var n = 0
//    lateinit var pArr: IntArray
//    lateinit var costs: Array<IntArray>
//
//    fun getParent(n: Int): Int {
//        return if (pArr[n] == n)
//            n
//        else {
//            pArr[n] = getParent(pArr[n])
//            pArr[n]
//        }
//    }
//
//    fun union(a: Int, b: Int) {
//        val aParent = getParent(a)
//        val bParent = getParent(b)
//
//        if (aParent < bParent) {
//            pArr[bParent] = aParent
//        } else {
//            pArr[aParent] = bParent
//        }
//    }
//
//    fun find(a: Int, b: Int): Boolean {
//        val aParent = getParent(a)
//        val bParent = getParent(b)
//
//        return if (aParent == bParent) true else false
//    }
//
//
//    fun solution(n: Int, costs: Array<IntArray>): Int {
//        var answer = 0
//
//        this.n = n
//        this.costs = costs
//        costs.sortBy { it.last() }
//
//        pArr = IntArray(n) { it }
//
//        var totalCost = 0
//        for (i in 0 until costs.size) {
//            val u = costs[i][0]
//            val v = costs[i][1]
//            val c = costs[i][2]
//            if (!find(u, v)){
//                union(u, v)
//                totalCost += c
//            }
//        }
//
//        answer = totalCost
//        return answer
//    }
//}