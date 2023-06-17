package bac.week7

/*
    보석 모으기

    M개의 가방
    각각 C 만큼 무의 보석을 담을 수 있다.

    보석은 N개

    훔칠 수 있는 보석의 최대 개수

    1<= N <= 13

    1<= M <= 10
    1<= C <= 20

    하향식 방법
    (남은 가방의 개수, 용량, 담은 보석)
    비트 마스킹으로 유무 판별시.
    (gems and (1 shl i)) != 0
    괄호 및 != 0 으로 한다.
*/


//import kotlin.math.max
//
//var n = 0
//var m = 0
//var c = 0
//
//lateinit var arr: Array<Int>
//
//// 남은 가방의 개수, 용량, 담은 보석 -> 가져갈 수 있는 최대 보석의 개수
//val case = Array(11) { Array(21) { Array(1 shl 14 ) { -1 } } }
//
//fun go(bagIdx: Int, capacity: Int, gems: Int): Int {
//
//    // 마지막 가방까지 다 사용했으면 종료.
//    if (bagIdx == m) return 0
//
//    // 모든 보석을 이미 담았으면 종료.
//    if (gems > (1 shl n + 1) - 1) return n
//
//    if (case[bagIdx][capacity][gems] != -1) {
//        return case[bagIdx][capacity][gems]
//    }
//
//    var ret = 0
//    // 모든 보석을 돌면서 넣을 수 있는지 확인하고 넣어본다.
//    for (i in 0 until n) {
//
//        val isBeforeContained = (gems and (1 shl i)) != 0
//        val isContainable = capacity >= arr[i]
//
//        if (!isBeforeContained && isContainable)
//            ret = max(ret, go(bagIdx, capacity - arr[i], gems or (1 shl i) ) + 1)
//    }
//
//    // 보석을 담지 못하는 경우 -> 다음 가방/ 용량 초기화.
//    ret = max(ret, go(bagIdx + 1, c, gems))
//
//    case[bagIdx][capacity][gems] = ret
//    return case[bagIdx][capacity][gems]
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    m = info[1]
//    c = info[2]
//
//    arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//    println(go(0, c, 0))
//    Unit
//}
