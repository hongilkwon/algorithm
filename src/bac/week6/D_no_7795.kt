package bac.week6

/*
   먹을 것인가 먹힐 것인가.

   1 ≤ N, M ≤ 20,000

   20_000 * 20_000
   400_000_000
   4억   -> 단순 2중반복 안됨.

   lower_bound
   A는 자기보다 크기가 작은 먹이만 먹을 수 있다
   A의 크기가 B보다 큰 쌍이 몇 개나 있는지

  */

//var n = 0
//var m = 0
//
//lateinit var arrA: Array<Int>
//lateinit var arrB: Array<Int>
//
//fun lowerBound(key: Int): Int {
//
//    var left = 0
//    var right = arrB.size
//
//    while (left < right) {
//        val mid = (left + right) / 2
//
//        if (arrB[mid] >= key) {
//            right = mid
//        } else {
//            left = mid + 1
//        }
//    }
//    return right
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//    repeat(tc) { _ ->
//        val info = readLine().split(" ").map { it.toInt() }
//        n = info[0]
//        m = info[1]
//
//        arrA = readLine().split(" ").map { it.toInt() }.toTypedArray()
//        arrB = readLine().split(" ").map { it.toInt() }.toTypedArray()
//        arrB.sort()
//
//        var cnt = 0
//        for (i in 0 until arrA.size) {
//            val idx = lowerBound(arrA[i])
//            cnt += idx
//        }
//        println(cnt)
//    }
//    Unit
//}
