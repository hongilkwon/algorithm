package programmers.lv2

/*
    조이스틱

    1 <= name.size <=20

    위, 아래 --> 알파벳 순서 조정, 되돌아옴.
    왼, 오른 --> 커서 위치

    A(0) B(1) C(2) D(3) E(4)
    F(5) G(6) H(7) I(8) J(9)
    K(10)L(11)M(12)N(13)O(12)
    P(11)Q(10)R(9) S(8) T(7)
    U(6) V(5 )W(4) X(3) Y(2)
    Z(1)

    예시)
    AAA
    JAA(9)
    JAZ(1+1)

    AAA
    JAA(9)
    JAN(1+13)

    위/아래 기준이 N
    이미 A면 횟수0

    좌/오 현재 커서 위치를 기준으로 A가 아닌 문자의 위치로 최소값 으로 이동함.

    0 1 2 3 4 5 6

    1 -> 5
    - 정방향 4칸
    - 역방향 3칸  i+(6 -5) + 1

    문제 분류가 탐욕법이라 생각하여 현재 위치에서 정/역방향 수평이동시 가장 적게 이동하는 대로 탐색을 하면, 정답이 아니다...
    완탐으로 조진다.

    각 위치마다 왼/오 탐색을 정해야된다.

    최대 2^20 2^10 = 1024 *1024
    대략 1000_000 가능하다 조지자! --> 너무 복잡함.

    * 추후에 dijkstra 로 풀어보자.

*/

//import kotlin.math.min
//
//val upDownMap = mutableMapOf(
//    'A' to 0, 'B' to 1, 'C' to 2, 'D' to 3, 'E' to 4,
//    'F' to 5, 'G' to 6, 'H' to 7, 'I' to 8, 'J' to 9,
//    'K' to 10, 'L' to 11, 'M' to 12, 'N' to 13, 'O' to 12,
//    'P' to 11, 'Q' to 10, 'R' to 9, 'S' to 8, 'T' to 7,
//    'U' to 6, 'V' to 5, 'W' to 4, 'X' to 3, 'Y' to 2,
//    'Z' to 1
//)
//
//class Solution {
//    fun solution(name: String): Int {
//        var answer = 0
//        var minCnt = 0
//
//        // 수직방향 이동횟수
//        // 각 자리 마다 'A'가 원하는 문자로 변하는데 들어가는 비용
//        for (i in 0 until name.length){
//            if (name[i] != 'A')
//                minCnt += upDownMap[name[i]]!!
//        }
//
//        // 수평방향 이동횟수
//        // 0부터 시작해서 모든 idx를 다 거친다면 총 name.length - 1번 이면 모든 문자들 방문하게 된다.
//        var minHorizontalMove = name.length - 1
//        for (i in 0 until name.length) {
//
//            // 현재 위치 i에서 A가 아닌 다른 문자가 등장한 인덱스
//            var next = i + 1
//            while (next < name.length && name[next] == 'A') {
//                next += 1
//            }
//
//            // (우측 --> 좌측) = i + 돌아와서 i + 뒤로 감
//            val a = i + (i + name.length - next)
//            // 좌측 -> 우측
//            val b = 2 * (name.length - next) + i
//            val temp = min(a, b)
//
//            minHorizontalMove = min(minHorizontalMove, temp)
//        }
//        minCnt += minHorizontalMove
//
//        return minCnt
//    }
//}


//class Solution {
//
//    fun solution(name: String): Int {
//        var answer = 0
//
//        var cnt = 0
//        var cursor = 0
//
//        val length = name.length
//        for (i in 0 until name.length) {
//
//            val c = name[i]
//            if (c == 'A') {
//                continue
//            }
//
//            var leftRightMove = 0
//            if (i > cursor) {
//                leftRightMove += min(i - cursor, (length - i) + cursor)
//            } else if (i < cursor) {
//                leftRightMove += min(cursor - i, (length - cursor) + i)
//            }
//            cursor = i
//            var upDownMove = 0
//            upDownMove += upDownMap[c]!!
//            cnt += (leftRightMove + upDownMove)
//        }
//        answer = cnt
//        println(cnt)
//        return answer
//    }
//}

//fun main() {
//    Solution().solution("JAZ")
//}