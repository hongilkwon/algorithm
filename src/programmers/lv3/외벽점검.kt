package programmers.lv3


/*
    외벽점검


    친구들은 출발 지점부터 시계, 혹은 반시계 방향으로 외벽을 따라서만 이동
    최소한의 친구들을 투입
    친구들을 모두 투입해도 취약 지점을 전부 점검할 수 없는 경우에는 -1

    1 <= n <= 200 자연수
    1<=  weak <= 15 이하
    1<= dist.size <= 8
    1<= dist의 원소 < =100

    원형 자료구조 --> 배열을 2개 연결하여 붙힌다.

    즉, 원을 1바퀴 이상 돌수 있는 친구는 없다.

    완전탐색 문제인지 빠르게 파악하기 힘들고,
    시계, 반시계방향 때문에, 친구들을 순열로 돌리고 그안에서 원형인 벽을 돌려야 한다는 생각 자체가 쉽지가 않다.
    또한, 구현도 쉽지 않다.

 */

//import kotlin.math.min
//
//class Solution {
//
//    var n = 0
//    lateinit var weak: IntArray
//    lateinit var dist: IntArray
//
//    lateinit var linearWeak: MutableList<Int>
//    lateinit var friends: IntArray
//
//    var minCnt = Int.MAX_VALUE
//
//    val result = mutableListOf<Int>()
//    lateinit var isSelected: BooleanArray
//
//    fun createLinearWeak(start: Int): MutableList<Int> {
//
//        val temp = mutableListOf<Int>()
//
//        for (i in start until weak.size) {
//            temp.add(weak[i])
//        }
//        for (i in 0 until start) {
//            temp.add(weak[i] + n)
//        }
//
//        return temp
//    }
//
//    fun createFriends(): IntArray {
//        val temp = IntArray(result.size) {
//            dist[result[it]]
//        }
//        return temp
//    }
//
//    fun permutation(n: Int, r: Int) {
//
//        if (r == result.size) {
//
//            /*
//                logic
//             */
//
//            friends = createFriends()
////            println(friends.joinToString(" "))
//
//            // 외벽의 점검을 할 시작점 변경
//            for (i in 0 until weak.size) {
//
//                linearWeak = createLinearWeak(i)
////                println(linearWeak.joinToString(" "))
//
//                var friendsIdx = 0
//                var curPos = linearWeak[0] + friends[friendsIdx]
//
//                var isPossible = true
//                for (j in 1 until linearWeak.size) {
//                    if (linearWeak[j] > curPos) {
//                        if (friendsIdx + 1 == dist.size) {
//                            isPossible = false
//                            break
//                        }
//                        friendsIdx += 1
//                        curPos = linearWeak[j] + friends[friendsIdx]
//                    }
//                }
//
//                // 실제 친구는 index + 1 명 필요함.
//                if (isPossible)
//                    minCnt = min(minCnt, friendsIdx + 1)
//            }
//            return
//        }
//
//        for (i in 0 until n) {
//            if (isSelected[i]) continue
//
//            isSelected[i] = true
//            result.add(i)
//
//            permutation(n, r)
//            result.removeLast()
//            isSelected[i] = false
//        }
//    }
//
//    fun solution(n: Int, weak: IntArray, dist: IntArray): Int {
//        var answer = 0
//
//        this.n = n
//        this.weak = weak
//        dist.sort()
//        this.dist = dist
//
//        isSelected = BooleanArray(dist.size) { false }
//        permutation(n = dist.size, r = dist.size)
//
//        answer = if (minCnt == Int.MAX_VALUE) -1 else minCnt
//
////        println(answer)
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(12, intArrayOf(1, 3, 4, 9, 10), intArrayOf(3, 5, 7))
//}