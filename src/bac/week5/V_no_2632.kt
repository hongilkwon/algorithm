package bac.week5

/*
  피자판매

  피자크기 0..2,000,000
  피자조각 개수(3 ≤ m, n ≤ 1000)

  한 종류의 피자를 2 조각 이상 판매할 때는 반드시 연속된 조각들을 잘라서 판매
  각 종류의 피자조각의 크기는 시계방향으로 차례로 주어지며

   각각 1000개씩.
   1.A
   2.B
   3.혼합

  구하고자 하는것: 피자를 판매하는 방법의 가지 수

  1. 피자조각을 구성하는 횟수를 미리 생성한다.
  2. 원형 자료구조인 피자의 형태를 2개의 선형의 자료구조를 이용해 해결한다.

  2, 2, 1, 7, 2, 2, 2, 1, 7, 2

  * kotlin map 함수.


 */

//var pizzaSize = 0
//
//var n = 0
//val a = Array(1001) { 0 }
//val sum_a = Array(2002) { 0 }
//
//var m = 0
//val b = Array(1001) { 0 }
//val sum_b = Array(2002) { 0 }
//
//val map_a = mutableMapOf<Int, Int>()
//val map_b = mutableMapOf<Int, Int>()
//
//fun count(n: Int, sum: Array<Int>, map: MutableMap<Int, Int>) {
//    for (interval in 1..n) {
//        for (idx in interval until n + interval) {
//            val num = sum[idx] - sum[idx - interval]
//            if (map.containsKey(num)) {
//                map[num] = map[num]!! + 1
//            } else {
//                map[num] = 1
//            }
//            if (interval == n) break
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    pizzaSize = readLine().toInt()
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    for (i in 1..n) {
//        a[i] = readLine().toInt()
//        sum_a[i] = sum_a[i - 1] + a[i]
//    }
//    for (i in n + 1..n * 2) {
//        sum_a[i] = sum_a[i - 1] + a[i - n]
//    }
////    println(a.joinToString(" "))
////    println(sum_a.joinToString(" "))
//
//    m = info[1]
//    for (i in 1..m) {
//        b[i] = readLine().toInt()
//        sum_b[i] = sum_b[i - 1] + b[i]
//    }
//    for (i in m + 1..m * 2) {
//        sum_b[i] = sum_b[i - 1] + b[i - m]
//    }
////    println(b.joinToString(" "))
////    println(sum_b.joinToString(" "))
//    count(n, sum_a, map_a)
//    count(m, sum_b, map_b)
//
////    println("map_a: ${map_a}")
////    println("map_b: ${map_b}")
//
//    var sum = 0
//    sum += map_a[pizzaSize] ?: 0
//    sum += map_b[pizzaSize] ?: 0
//    for (i in 1 until pizzaSize) {
//        val a = map_a[pizzaSize - i] ?: 0
//        val b = map_b[i] ?: 0
//        sum += a * b
//    }
//    println(sum)
//    Unit
//}

