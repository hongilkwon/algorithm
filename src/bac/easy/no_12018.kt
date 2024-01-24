package bac.easy


/*
    Yonsei TOTO(그리디)


    다른 사람들이 신청한 마일리지를 볼 수 있게 되었다.
    성준이는 주어진 마일리지로 최대한 많은 과목을 신청하고 싶어 한다.
    (내가 마일리지를 넣고 이후에 과목을 신청하는 사람은 없다) 마일리지는 한 과목에 1에서 36까지 넣을 수 있다.

    과목 수 n (1 ≤ n ≤ 100)
    주어진 마일리지 m (1 ≤ m ≤ 100)

    단 마일리지가 같다면 성준이에게 우선순위가 주어진다고 하자.
 */

//import java.util.PriorityQueue
//
//var n = 0
//var m = 0
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(' ').map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    val pq = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })
//    for (i in 1..n) {
//
//        val info2 = readLine().split(' ').map { it.toInt() }
//        val p = info2[0]
//        val l = info2[1]
//
//        val arr = readLine().split(' ').map { it.toInt() }.toTypedArray()
//        arr.sortDescending()
//
//        // 강의를 들을수 있는 인원보다 신청자가 많을 떄
//        if (p >= l) {
//            if (m >= arr[l - 1]) {
//                pq.add(i to arr[l - 1])
//                m -= arr[l - 1]
//            } else if (pq.isNotEmpty() && pq.peek().second > arr[l - 1]) {
//                m += pq.poll().second
//                pq.add(i to arr[l - 1])
//                m -= arr[l - 1]
//            }
//        } else {
//            // 강의를 들을수 있는 인원보다 신청자가 적을 때
//            if (m >= 1) {
//                pq.add(i to 1)
//                m -= 1
//            } else if (pq.isNotEmpty() && pq.peek().second > 1) {
//                m += pq.poll().second
//                pq.add(i to 1)
//                m -= 1
//            }
//        }
//        println("$pq m: $m")
//    }
//    println(pq.size)
//    return@with Unit
//}
