package programmers.lv3


/*
    불량 사용자

    재귀를 활용한 dfs 탐색문제.
    + Set을 이용해야 된다.

    Solution().solution(
        user_id = arrayOf("frodo", "fradi", "crodo", "abc123", "frodoc"),
        banned_id = arrayOf("fr*d*", "*rodo", "******", "******")
    )

    .... abc123, frodoc
    .... frodoc, abc123
    이런 케이스를 줄이기 위해 집합을 사용함.

    종료조건 - 정상적인 id에서 모든 제재할 id를 골라내면 종료한다.

    노드(banned id)

    엣지(user id)
 */

//class Solution {
//
//    lateinit var user_id: Array<String>
//    lateinit var banned_id: Array<String>
//
//    val result = mutableSetOf<Set<Int>>()
//
//    lateinit var visited: BooleanArray
//
//    fun check(userId: String, bannedId: String): Boolean {
//        if (userId.length != bannedId.length) {
//            return false
//        } else {
//            for (i in 0 until userId.length) {
//                if (bannedId[i] == '*') continue
//                if (userId[i] != bannedId[i]) {
//                    return false
//                }
//            }
//            return true
//        }
//    }
//
//    fun go(bannedIdx: Int, set: MutableSet<Int>) {
//
//        if (bannedIdx == banned_id.size) {
//            val temp = mutableSetOf<Int>()
//            set.forEach { temp.add(it) }
//            result.add(temp)
//            return
//        }
//
//        for (i in 0 until user_id.size) {
//            // 이미 뽑힌 id면 넘어감.
//            if (set.contains(i)) continue
//
//            if (check(user_id[i], banned_id[bannedIdx])) {
//                set.add(i)
//                go(bannedIdx + 1, set)
//                set.remove(i)
//            }
//        }
//    }
//
//    fun solution(user_id: Array<String>, banned_id: Array<String>): Int {
//        var answer = 0
//
//        this.user_id = user_id
//        this.banned_id = banned_id
//
//        visited = BooleanArray(user_id.size) { false }
//        go(0, mutableSetOf())
//
//        answer = result.size
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(
//        user_id = arrayOf("frodo", "fradi", "crodo", "abc123", "frodoc"),
//        banned_id = arrayOf("fr*d*", "*rodo", "******", "******")
//    )
//}