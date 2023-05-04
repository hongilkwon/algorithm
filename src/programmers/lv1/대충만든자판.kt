package programmers.lv1


/*
    단순구현 문제.

 */

//import kotlin.math.min
//
//fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
//    var answer: IntArray = intArrayOf()
//
//    val cntMap = mutableMapOf<Char, Int>()
//
//    for (i in 0 until keymap.size) {
//        for (j in 0 until keymap[i].length) {
//            val c = keymap[i][j]
//            if (cntMap.containsKey(c)) {
//                cntMap[c] = min(cntMap[c]!!, j + 1)
//            } else {
//                cntMap[c] = j + 1
//            }
//        }
//    }
//
//    val tempList = mutableListOf<Int>()
//    first@ for (i in 0 until targets.size) {
//        var cnt = 0
//        for (j in 0 until targets[i].length) {
//            val targetC = targets[i][j]
//            if (cntMap.containsKey(targetC)) {
//                cnt += cntMap[targetC]!!
//            } else {
//                tempList.add(-1)
//                continue@first
//            }
//        }
//        tempList.add(cnt)
//    }
//
//    return tempList.toIntArray()
//}