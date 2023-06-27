package bac.week8


/*
    구간 합 구하기

     N(1 ≤ N ≤ 1,000,000)
     M(1 ≤ M ≤ 10,000),
     K(1 ≤ K ≤ 10,000)

     1인경우 변경
     2인경우 구간합 쿼리.
 */


//// 숫자의 개수
//var n: Long= 0
//
//// 변경이 일어나는 횟수
//var m: Long= 0
//
//// 구간합 쿼리 횟수.
//var k: Long = 0
//
//lateinit var arr: Array<Long>
//lateinit var bit: Array<Long>
//
//val orderList = mutableListOf<Triple<Long, Long, Long>>()
//
//fun bitUpdate(idx: Int, num: Long) {
//
//    val diff = num - arr[idx]
//
//    var i = idx
//    while (i < bit.size) {
//        bit[i] += diff
//        i += (i and -i)
//    }
//    arr[idx] = num
//}
//
//fun prevSum(idx: Long): Long {
//    var i = idx
//
//    var sum: Long = 0
//    while (i > 0) {
//        sum += bit[i.toInt()]
//        i -= (i and -i)
//    }
//    return sum
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toLong() }
//    n = info[0]
//    m = info[1]
//    k = info[2]
//
//    arr = Array(n.toInt() + 1) { 0 }
//    bit = Array(n.toInt() + 1) { 0 }
//
//    for (i in 1..n) {
//        val num = readLine().toLong()
//        bitUpdate(i.toInt(), num)
//    }
//
//    for (i in 0 until m + k) {
//        val order = readLine().split(" ").map { it.toLong() }
//        orderList.add(Triple(order[0], order[1], order[2]))
//    }
//
//    for (i in 0 until orderList.size) {
//        val order = orderList[i]
//
//        if (order.first == 1L) {
//            bitUpdate(idx = order.second.toInt(), num = order.third)
//        } else if (order.first == 2L) {
//            val answer = prevSum(order.third) - prevSum(order.second - 1)
//            println(answer)
//        }
//    }
//}