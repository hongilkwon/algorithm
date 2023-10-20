package bac.week3

/*
   완전 이진트리
   루트만 존재하는 경우.
 */


//import kotlin.math.pow
//
//var k = 0
//lateinit var nodes: IntArray
//lateinit var levelList: Array<MutableList<Int>>
//
//fun calLevel(level: Int, nodes: IntArray) {
//
//    if (level == k) return
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
//fun main() = with(System.`in`.bufferedReader()) {
//
//    k = readLine().toInt()
//
//    nodes = readLine().split(" ").map { it.toInt() }.toIntArray()
//    levelList = Array(k) { mutableListOf() }
//
//    calLevel(0, nodes)
//    levelList.forEach {
//        println(it.joinToString(" "))
//    }
//}