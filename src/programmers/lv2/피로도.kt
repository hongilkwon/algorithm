package programmers.lv2


/*
    피로도

    순열, 완전 탐색.
 */


//class Solution {
//
//    var k = 0
//
//    lateinit var dungeons: Array<IntArray>
//
//    var maxCnt = 0
//    fun go() {
//        var hp = k
//        var cnt = 0
//        for (i in 0 until result.size) {
//            val idx = result[i]
//            if (hp >= dungeons[idx][0]) {
//                hp -= dungeons[idx][1]
//                cnt += 1
//            }else{
//                break
//            }
//        }
//        maxCnt = maxOf(maxCnt, cnt)
//    }
//
//    lateinit var isSelect: BooleanArray
//    val result = mutableListOf<Int>()
//    fun permutation(n: Int, r: Int, cnt: Int = 0) {
//
//        if (cnt == r) {
//            go()
//            return
//        }
//
//        for (i in 0 until n) {
//
//            if (isSelect[i]) continue
//
//            result.add(i)
//            isSelect[i] = true
//
//            permutation(n = n, r = r, cnt + 1)
//
//            result.removeLast()
//            isSelect[i] = false
//        }
//    }
//
//    fun solution(k: Int, dungeons: Array<IntArray>): Int {
//        var answer: Int = -1
//
//        this.k = k
//        this.dungeons = dungeons
//
//        isSelect = BooleanArray(dungeons.size) { false }
//        permutation(dungeons.size, dungeons.size)
//
//        return maxCnt
//    }
//}
