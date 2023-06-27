package bac.week8

/*
    RPG

    퀘스트는 단 한 번만 깰 수 있으며,
    퀘스트를 깨는 "순서"는 준규가 마음대로 정할 수 있다.
    퀘스트 보상으로 얻게되는 포인트로 준규 마음대로 스탯을 올릴 수 있다.

 */

//import kotlin.math.*
//
//var n = 0
//
//data class Quest(val s: Int, val i: Int, val p: Int, var isPossible: Boolean)
//
//lateinit var qArr: Array<Quest>
//
//// (str, int) --> 최대 퀘스트
//val case = Array(1004) { Array(1004) { -1 } }
//
//fun go(mStr: Int, mInt: Int): Int {
//
//    /*
//        종료조건이 없음
//     */
//
//    if (case[mStr][mInt] != -1) {
//        return case[mStr][mInt]
//    }
//
//    var cnt = 0
//    var pnt = 0
//    val temp = mutableListOf<Int>()
//
//    // 모든 퀘스트를 순회 하면서, 현재의 상태로 해결할 수 있는 퀘스트의 포인트 획득.
//    for (i in 0 until qArr.size) {
//        val quest = qArr[i]
//        if (mStr >= quest.s || mInt >= quest.i) {
//            // 반드시 밖에 있어야됨. 그래야 최대값을 갱신때 이전 노드에서도 꺨수 있는것에 포함된다.
//            cnt += 1
//            if (quest.isPossible) {
//                quest.isPossible = false
//                pnt += quest.p
//                temp.add(i)
//            }
//        }
//    }
//
//    var ret = cnt
//    if (pnt != 0) {
//        // 포인트 분배
//        for (p in 0..pnt) {
//            val nextS: Int = min(1000, mStr + p)
//            val nextI: Int = min(1000, mInt + pnt - p)
//            // 최댓값 갱신.
//            ret = max(ret, go(nextS, nextI))
//        }
//    }
//
//    // 현재 해결했던 퀘스트 원복
//    for (i in 0 until temp.size) {
//        val questIdx = temp[i]
//        qArr[questIdx].isPossible = true
//    }
//
//    case[mStr][mInt] = ret
//    return case[mStr][mInt]
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    qArr = Array(n) { Quest(0, 0, 0, false) }
//
//    for (i in 0 until n) {
//        val info = readLine().split(" ").map { it.toInt() }
//        val q = Quest(info[0], info[1], info[2], true)
//        qArr[i] = q
//    }
//
//    println(go(1, 1))
//    Unit
//}
