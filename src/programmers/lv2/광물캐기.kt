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

    완전탐색으로 풀면 시간초과남
    각 곡갱이가 5개씩 3종류 15개
    15! = 2_004_189_184
    - 순열

    greedy



 */
lateinit var picks: IntArray
lateinit var minerals: Array<String>
lateinit var pirodo: Array<Map<String, Int>>


fun go(cnt: Int, pick: Int): Int {


}

fun solution(p: IntArray, m: Array<String>): Int {
    picks = p
    minerals = m

    pirodo = Array(3) {
        if (it == 0) {
            mutableMapOf("diamond" to 1, "iron" to 1, "stone" to 1)
        } else if (it == 1) {
            mutableMapOf("diamond" to 5, "iron" to 1, "stone" to 1)
        } else {
            mutableMapOf("diamond" to 25, "iron" to 5, "stone" to 1)
        }
    }

    var answer = Int.MAX_VALUE
    for (i in 0 until 3) {
        if (picks[i] == 0) continue
        picks[i]--
        answer = min(answer, go(0, i))
        picks[i]++
    }

    return answer
}

fun main() {

}