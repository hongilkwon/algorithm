package bac.easy

/*
    시험감독(단순구현, 쉽지만,까다로움)

    시험장의 개수 N(1 ≤ N ≤ 1,000,000)
    각 시험장에 있는 응시자의 수 Ai (1 ≤ Ai ≤ 1,000,000)


    한 시험장에서 감시할 수 있는 응시자의 수가 B명이고,
    부감독관은 한 시험장에서 감시할 수 있는 응시자의 수가 C명

    각각의 시험장에 총감독관은 오직 1명만 있어야 하고,
    부감독관은 여러 명 있어도 된다.

    필요한 감독관 수의 최솟값
 */


//var n = 0
//lateinit var arr: IntArray
//
//var b = 0
//var c = 0
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    val info = readLine().split(" ").map { it.toInt() }
//    b = info[0]
//    c = info[1]
//
//    var answer: Long = arr.size.toLong()
//    for (i in 0 until arr.size) {
//        arr[i] -= b
//    }
//
//    for (i in 0 until arr.size) {
//
//        if (arr[i] <= 0)
//            continue
//
//        answer += arr[i] / c
//        if ((arr[i] % c) > 0)
//            answer += 1
//    }
//
//    println(answer)
//    return@with Unit
//}
