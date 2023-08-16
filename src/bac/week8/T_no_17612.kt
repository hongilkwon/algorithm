package bac.week8


/*
    쇼핑몰.

    * 우선순위 큐에 데이터를 넣고 값을 변경해도 우선순위가 변하지 않음.

    구현문제???

    n명 -> k개의 계산대

    계산대에서 기다려야 할 시간이 같을 경우에는 가장 번호가 작은 계산부터
    동시에 계산을 마쳤다면, 계산대의 번호가 더 높은 10번 계산대의 고객이 먼저 쇼핑몰을 나간다

    우선순위 큐로 구현
    출력때 타입에 신경을 써야된다.
    타입 때문에 정답을 맞추는데 애먹었던 문제이다.
*/

//import java.util.*
//
//var n = 0
//var k = 0
//
//data class Counter(val id: Int, val customerId: Int, val totalTime: Int)
//
//// 1 = 계산대, 2 = id, 3 = 시간
//val pq = PriorityQueue(compareBy<Counter> { it.totalTime }.thenBy { it.id })
//
//val order = mutableListOf<Counter>()
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    k = info[1]
//
//    for (i in 1 .. n) {
//        val cInfo = readLine().split(" ").map { it.toInt() }
//
//        if (i <= k) {
//            pq.add(Counter(i , cInfo[0], cInfo[1]))
//        }else{
//            val next = pq.peek()
//            val counter = Counter(next.id, cInfo[0], next.totalTime + cInfo[1])
//            pq.add(counter)
//            order.add(pq.poll())
//        }
//    }
//
//    while (pq.isNotEmpty()) {
//        order.add(pq.poll())
//    }
//
//    order.sortWith(compareBy<Counter> { it.totalTime }.thenByDescending { it.id })
//
//    var answer = 0L
//    for (i in 0 until order.size) {
//        answer += ((i+1) * order[i].customerId.toLong())
//    }
//    println(answer)
//    Unit
//}

