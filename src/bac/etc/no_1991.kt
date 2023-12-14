package bac.etc

/*
    트리 순회

    이진 트리
    노드의 개수 N(1 ≤ N ≤ 26)

 */

import java.lang.StringBuilder

//var n = 0
//
//val tree = hashMapOf<Char, Node>()
//
//data class Node(val key: Char, var left: Node? = null, var right: Node? = null)
//
//val preOrderSb = StringBuilder()
//val inOrderSb = StringBuilder()
//val postOrderSb = StringBuilder()
//fun go(node: Node) {
//
//    val key = node.key
//    val left = node.left
//    val right = node.right
//
//    preOrderSb.append(key)
//    if (left != null) go(left)
//    inOrderSb.append(key)
//    if (right != null) go(right)
//    postOrderSb.append(key)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//
//    for (i in 0 until n) {
//        tree['A' + i] = Node(key = 'A' + i)
//    }
//
//    for (i in 0 until n) {
//        val info = readLine().filterNot { it.isWhitespace() }.toCharArray()
//        val node = tree[info[0]]!!
//        node.left = if (info[1] != '.') tree[info[1]] else null
//        node.right = if (info[2] != '.') tree[info[2]] else null
//    }
//
//    go(tree['A']!!)
//    println(preOrderSb.toString())
//    println(inOrderSb.toString())
//    println(postOrderSb.toString())
//}

