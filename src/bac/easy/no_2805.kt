package bac.easy


/*
    나무 자르기

    나무를 필요한 만큼만 집으로 가져가려고 한다.
    이때, 적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값

    나무의 수 N과 상근이가 집으로 가져가려고 하는 나무의 길이 M
    (1 ≤ N ≤ 1,000,000, 1 ≤ M ≤ 2,000,000,000)
    높이는 1,000,000,000보다 작거나 같은 양의 정수 또는 0이다.

    이진탐색 결정화 문제.
 */


//var n = 0L
//var m = 0L
//
//lateinit var trees: LongArray
//
//fun check(h: Long): Boolean {
//
//    var namu = 0L
//    for (i in 0 until trees.size) {
//        val temp = trees[i] - h
//        if (temp > 0) {
//            namu += temp
//        }
//        if (namu >= m) return true
//    }
//
//    return false
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toLong() }
//    n = info[0]
//    m = info[1]
//
//    trees = readLine().split(" ").map { it.toLong() }.toLongArray()
//
//    var left = 0L
//    var right = trees.maxOrNull()!!
//    var minH = 1_000_000_000L
//
//    while (left <= right) {
//
//        val mid = (left + right) / 2
//        if (check(mid)) {
//            left = mid + 1
//            minH = mid
//        } else {
//            right = mid - 1
//        }
//    }
//    println(minH)
//}