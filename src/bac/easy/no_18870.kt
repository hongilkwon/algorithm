package bac.easy

/*
    좌표 압축

    1 ≤ N ≤ 1_000_000
    -10^9 ≤ Xi ≤ 10^9

    생각보다 쉽지 않음.

    중복을 줄이고 정렬해서 idx가 필요한것 까지는 생각을 헀으나,
    idx, value ->> map<value, idx> 형태를 만들어야 빠르게 출력 가능하다.
 */

//var n = 0
//lateinit var arr: IntArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    val table = arr.toSet().toIntArray()
//    table.sort()
//
//    val map = mutableMapOf<Int, Int>()
//    table.forEachIndexed { i, v ->
//        map[v] = i
//    }
//
//    val sb = StringBuilder()
//    for (i in 0 until arr.size){
//        sb.append("${map[arr[i]]} ")
//    }
//    println(sb.toString())
//
//    return@with Unit
//}
