package bac.week6

/*
   먹을 것인가 먹힐것인가.

   1 ≤ N, M ≤ 20,000

   20,000 * 20,000
   400,000,000
   4억

   kotlin
   2분탐색을 이용한 lower_bound , upper_bound 구현

   */

var n = 0
var m = 0

lateinit var arrA: Array<Int>
lateinit var arrB: Array<Int>

fun lowerBound(arr: Array<Int>, k: Int): Int {
    var start = 0
    var end = arr.lastIndex

    if (arr.last() < k) return arr.size
    if (arr.first() > k) return -1

    while (start < end) {
        val mid = (start + end) / 2
        if (arr[mid] < k) {
            start = mid + 1
        } else {
            end = mid
        }
    }
    return start
}

fun main() = with(System.`in`.bufferedReader()) {

    val tc = readLine().toInt()
    repeat(tc) { _ ->
        val info = readLine().split(" ").map { it.toInt() }
        n = info[0]
        m = info[1]

        arrA = readLine().split(" ").map { it.toInt() }.toTypedArray()
        arrA.sort()

        arrB = readLine().split(" ").map { it.toInt() }.toTypedArray()
        arrB.sort()

        var cnt = 0
        for (i in 0 until arrA.size) {
            val idx = lowerBound(arrB, arrA[i])
            if (idx > 0)
                cnt += idx
        }
        println(cnt)
    }
    Unit
}
