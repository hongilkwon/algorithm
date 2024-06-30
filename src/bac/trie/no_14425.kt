package bac.trie


/*
   문자열 집합(집합)

    set 자료구조를 사용하면 매우쉽게 해결되는 문제지만,
    trie를 사용하여 연습삼아 풀어보자!

*/

//const val ROOT = 1
//var unused = 2
//
//// 1 ≤ N ≤ 10_000 이며, 길이는 500을 넘지 않는다.
//const val MAX = 10_000 * 500 + 4
//
//val isEnd = BooleanArray(MAX) { false }
//val next = Array(MAX) { Array(26) { -1 } }
//
//fun toIdx(c: Char): Int {
//    return c.code - 'a'.code
//}
//
//fun insert(s: String) {
//    var cursor = ROOT
//    for (c in s) {
//        if (next[cursor][toIdx(c)] == -1) {
//            next[cursor][toIdx(c)] = unused
//            unused += 1
//        }
//        cursor = next[cursor][toIdx(c)]
//    }
//    isEnd[cursor] = true
//}
//
//fun find(s: String): Boolean {
//    var cursor = ROOT
//    for (c in s) {
//        if (next[cursor][toIdx(c)] == -1) {
//            return false
//        }
//        cursor = next[cursor][toIdx(c)]
//    }
//    return isEnd[cursor]
//}
//
//
//var n = 0
//var m = 0
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    for (i in 0 until n) {
//        val s = readLine()
//        insert(s)
//    }
//
//    var cnt = 0
//    for (i in 0 until m) {
//        val s = readLine()
//        if (find(s)) {
//            cnt += 1
//        }
//    }
//
//    println(cnt)
//    return@with Unit
//}


//var n = 0
//var m = 0
//
//val set = mutableSetOf<String>()
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    for (i in 0 until n) {
//        val str = readLine().toString()
//        set.add(str)
//    }
//
//    var cnt = 0
//    for (i in 0 until m) {
//        val str = readLine().toString()
//        if (set.contains(str)) {
//            cnt += 1
//        }
//    }
//
//    println(cnt)
//    return@with Unit
//}