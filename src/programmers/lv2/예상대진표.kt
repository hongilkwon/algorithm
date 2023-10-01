package programmers.lv2

/*

    예상 대진표

    2^1 <= N <=2^20

    A번 참가자와 B번 참가자는 서로 붙게 되기 전까지 항상 이긴다고 가정합니다.

    단순 구현 문제인데
    상황을 도식화 하면 쉽게 풀수있는데, 자꾸 엉뚱한 생각을 하다가 이상한 방향으로 가서 너무 시간을 많이 잡아먹음.

 */

//class Solution {
//    fun solution(n: Int, a: Int, b: Int): Int {
//        var answer = 0
//
//        var (l, r) = if (a < b) a to b else b to a
//
//        while (true) {
//            answer += 1
//            l = l / 2 + l % 2
//            r = r / 2 + r % 2
//
//            if (l == r) break
//        }
//        return answer
//    }
//}
//
//fun main() {
//    Solution().solution(8, 4, 7)
//}