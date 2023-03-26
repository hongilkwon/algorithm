package bac.week3

import kotlin.math.pow

/*
   완전이진트리
   루트만 존재하는 경우.
 */


//var bac.week5.concept.getK = 0
//lateinit var nodes: IntArray
//lateinit var levelList: Array<MutableList<Int>>
//
//fun calLevel(level: Int, nodes: IntArray) {
//
//    if (level == bac.week5.concept.getK) return
//
//    val centerIdx = (nodes.size / 2)
//    val left = IntArray(centerIdx) { nodes[it] }
//    val right = IntArray(centerIdx) { nodes[centerIdx + 1 + it] }
//
//    calLevel(level + 1, left)
//    levelList[level].add(nodes[centerIdx])
//    calLevel(level + 1, right)
//}
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    bac.week5.concept.getK = readLine().toInt()
//
//    nodes = readLine().split(" ").map { it.toInt() }.toIntArray()
//    levelList = Array(bac.week5.concept.getK) { mutableListOf() }
//
//    calLevel(0, nodes)
//    levelList.forEach {
//        println(it.joinToString(" "))
//    }
//}