package bac.week6


/*
   용돈관리

   문제를 파악하는 것 자체가 쉽지가 않음.
   * 이분탐색문제는 가능하면 Long 타입을 선언하여 풀이한다.

   N일 동안 정확히 M번 인출을한다.

   M이라는 숫자를 좋아하기 때문에, 정확히 M번을 맞추기 위해서,
   남은 금액이 그날 사용할 금액보다 많더라도 남은 금액은 통장에 집어넣고, 다시 K원을 인출할 수 있다.
   -> 즉, m번을 언제라도 정확히 맞춰 인출 할 수 있다는것, m도 최소가 되고 인출 금액도 k 도 최소가 된다.

   K원을 인출하며, 통장에서 뺀 돈으로 하루를 보낼 수 있으면 그대로 사용하고, 모자라게 되면 남은 금액은 통장에 집어넣고 다시 K원을 인출
   */

//var n = 0
//var m = 0
//
//lateinit var arr: Array<Int>
//
//fun check(money: Int): Boolean {
//
//    var cnt = 0
//    var sum = 0
//    for (i in 0 until arr.size) {
//        if (arr[i] > money) return false
//        if (sum + arr[i] > money) {
//            sum = 0
//            cnt += 1
//        }
//        sum += arr[i]
//    }
//    if (sum != 0) cnt += 1
//
//    return m >= cnt
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    arr = Array(n) { readLine().toInt() }
//
//    var left = 1
//    var right = arr.sum()
//
//    var mid = 0
//
//    var k = Int.MAX_VALUE
//    while (left <= right) {
//        mid = (left + right) / 2
//        if (check(mid)) {
//            k = mid
//            right = mid - 1
//        } else {
//            left = mid + 1
//        }
//    }
//    println(k)
//    Unit
//}

