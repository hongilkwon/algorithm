package bac.trie


/*
   개미굴(trie)

   문제가 트라이 구조를 위해 만들어지다 보니 설명이 조금 조잡하다...


*/

//import java.util.TreeMap
//
//data class Node(val childes: TreeMap<String, Node> = TreeMap(), var isEnd: Boolean = false)
//
//class Trie() {
//    val root = Node()
//
//    fun insert(strList: List<String>) {
//        var cursor = root
//        for (str in strList) {
//            if (!cursor.childes.containsKey(str)) {
//                cursor.childes[str] = Node()
//            }
//            cursor = cursor.childes[str]!!
//        }
//        cursor.isEnd = true
//    }
//}
//
//val sb = StringBuilder()
//
//fun print(dept: Int, node: Node) {
//
//    if (node.childes.isEmpty()) return
//
//    for (child in node.childes.keys) {
//        repeat(dept) { sb.append("--") }
//        sb.append(child)
//        println(sb.toString())
//        sb.clear()
//        print(dept+1, node.childes[child]!!)
//    }
//}
//
//var n = 0
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    val trie = Trie()
//    for (i in 0 until n){
//        val line = readLine().split(" ").toMutableList()
//        line.removeFirst()
//        trie.insert(line)
//    }
//
//    print(0, trie.root)
//    return@with Unit
//}