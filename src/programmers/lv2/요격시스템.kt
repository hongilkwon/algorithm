package programmers.lv2

/*
    미사일: x축에 수평 미사일 개구간 [s, e] 단,정수구
    요격 : y축에 수평
    요격 미사일은 실수인 x 좌표에서도 발사할 수 있습니다.

    모든 폭격 미사일을 요격하기 위해 필요한 요격 미사일 수의 최솟값을 return 하도록 solution 함수

    0 ≤ s < e ≤ 100,000,000

    greedy 문제.
    문제를 이해할 당시 현재기준에서 최선의 선택을 할때!
    라는 생각으로 그리디 문제로 생각을헀으나

    최선의 선택을 하는 기준을 제대로 잡지 못하였다.

    새로 추가되는 미사일의 요격할수 있는가 없는가?
    새로 추가는 되는 미사일의 첫 시작범위가 이전 요격 가능한 범위에 포함되지 않는다면 요격을 못한다.

 */


//fun solution(targets: Array<IntArray>): Int {
//    var answer: Int = 0
//
//    // 코틀린의 2차원배열 딥카피.
//    val missile = Array(targets.size) { targets[it] }
//
//    missile.sortBy { it[1] }
//
//    var lastIdx = 0
//    var cnt = 0
//    for (i in 0 until missile.size) {
//        val newM = missile[i]
//        if (lastIdx <= newM[0]) {
//            cnt += 1
//            lastIdx = newM[1]
//        }
//    }
//    answer = cnt
//    return answer
//}
//
//fun main() {
//    val tArr = arrayOf(
//        intArrayOf(4, 5),
//        intArrayOf(4, 8),
//        intArrayOf(10, 14),
//        intArrayOf(11, 13),
//        intArrayOf(5, 12),
//        intArrayOf(3, 7),
//        intArrayOf(1, 4),
//    )
//    println(solution(tArr))
//}