package bac.week7

/*
    냅색문제

    세준이는 N개의 물건을 가지고 있고, 최대 C만큼의 무게를 넣을 수 있는 가방을 하나 가지고 있다.
    N개의 물건을 가방에 넣는 방법의 수를 구하는 프로그램을 작성하시오.

    1<= n <= 30
    0<= C <= 10^9

    가방에 넣는 방법의 수를

    2^30개의 경우의수.
    무게 10억

    -> 메모이제이션 및 테이블을 만드는데 시간 및 공간이 너무 소요 됨.

    meet in the middle

 */


//var n = 0
//var c = 0
//
//lateinit var arr: Array<Int>
//
//val list1 = mutableListOf<Int>()
//val list2 = mutableListOf<Int>()
//
//fun upperBound(arr: MutableList<Int>, start: Int = 0, end: Int = arr.size, key: Int): Int {
//    var left = start
//    var right = end
//
//    while (left < right) {
//        val mid = (left + right) / 2
//        if (arr[mid] > key) {
//            right = mid
//        } else {
//            left = mid + 1
//        }
//    }
//    return right
//}
//
//fun go(idx: Int, lastIdx: Int, preW: Int, list: MutableList<Int>) {
//
//    if (preW > c) {
//        return
//    }
//    if (idx > lastIdx) {
//        list.add(preW)
//        return
//    }
//    go(idx + 1, lastIdx, preW, list)
//    go(idx + 1, lastIdx, preW + arr[idx], list)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    c = info[1]
//    arr = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//
//    go(0, (n / 2) -1, 0, list1)
//    go((n / 2) , n - 1, 0, list2)
//
//    list1.sort()
//    list2.sort()
//
//    var answer: Long = 0
//
////    var e = list2.size - 1
////    for (i in 0 until list1.size) {
////        while (e >= 0 && list1[i] + list2[e] > c) {
////            e -= 1
////        }
////        answer += e + 1
////    }
//
//    for (sum in list1) {
//        if (c - sum >= 0) {
//            answer += upperBound(arr = list2,  key = c - sum)
//        }
//    }
//    println(answer)
//    Unit
//}