package bac.etc

/*
    강의실 배정

     Si에 시작해서 Ti에 끝나는 N개의 수업이 주어지는데, 최소의 강의실을 사용해서 모든 수업을 가능

     N (1 ≤ N ≤ 200_000)
     Si,Ti (0 ≤ Si < Ti ≤ 10^9)

    수업이 끝난 직후에 다음 수업을 시작

    수업이 끝나는 시간이 중요하며 수업이 "빨리 끝나서" 강의실을 쓸 수 있으면 재활용.
    -> 시작시간으로 정렬하고 시작 시간이 같다면 끝나는 시간으로 정렬.
 */

//import java.util.PriorityQueue
//
//var n = 0
//
//lateinit var lectureArr: Array<Pair<Int, Int>>
//val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    lectureArr = Array(n) { 0 to 0 }
//    for (i in 0 until n) {
//        val info = readLine().split(" ").map { it.toInt() }
//        lectureArr[i] = info[0] to info[1]
//    }
//    lectureArr.sortWith(compareBy<Pair<Int, Int>> { it.first }.thenBy { it.second })
//
//    for (i in 0 until lectureArr.size) {
//        pq.add(lectureArr[i])
//        if (pq.peek().second <= lectureArr[i].first) {
//            pq.poll()
//        }
//    }
//    println(pq.size)
//}