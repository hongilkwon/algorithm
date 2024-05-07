package bac.etc


/*
    빗물(완전탐색, 아이디어)

    (1 ≤ H, W ≤ 500)

    사고과정

    1. 완전탐색

    물이 고인다 --> "양쪽"으로 막혀 있다.
    w 1칸을 기준으로 보면 왼쪽에서 가장 높은 블록, 오른쪽에서 가장 높은 블록중에서, 작은것 만큼 물이 고일 수 있다.
    처음 블록과 마지막 블록은 물이 고일 수가 없다.
*/


// 완전탐색
//import kotlin.math.min
//
//var h = 0
//var w = 0
//
//lateinit var arr: IntArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    h = info[0]
//    w = info[1]
//
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    var answer = 0
//    for (i in 1 until arr.size - 1) {
//        var left = arr.copyOfRange(0, i).maxOrNull()!!
//        var right = arr.copyOfRange(i + 1, arr.size).maxOrNull()!!
//
//        val water = min(left, right) - arr[i]
//        if (water > 0)
//            answer += min(left, right) - arr[i]
//    }
//
//    println(answer)
//    return@with Unit
//}