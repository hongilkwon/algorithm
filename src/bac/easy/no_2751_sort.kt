package bac.easy

/*
    수 정렬하기2

    배열의 길이가 길기 때문에
    퀵, 머지, 힙 소트 중에 하면되고
    가장 편한 힙소트 조짐.

    + 빠른 출력 필요하는 문제로 bw사용.
 */


//import java.util.PriorityQueue
//
//var n = 0
//
//lateinit var arr: IntArray
//val pq = PriorityQueue<Int>()
//
//val bw = System.out.bufferedWriter()
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//
//    arr = IntArray(n) { 0 }
//    for (i in 0 until n) {
//        arr[i] = readLine().toInt()
//    }
//    pq.addAll(arr.toList())
//
//    val sb = StringBuilder()
//    for (i in 0 until n) {
//        sb.append("${pq.poll()}\n")
//    }
//
//    bw.write(sb.toString())
//    bw.flush()
//    bw.close()
//}