package bac.easy


/*
    프린터 큐하기

    현재 Queue의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.
    나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고 Queue의 가장 뒤에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.

    첫 번째 줄에는 문서의 개수 N(1 ≤ N ≤ 100)과, 몇 번째로 인쇄되었는지 궁금한 문서
    두 번째 줄에는 N개 문서의 중요도가 차례대로 주어진다

    적절한 자료구조를 이용한 단순구현.
 */

//import java.util.LinkedList
//import java.util.Queue
//
//var n = 0
//var target = 0
//
//lateinit var arr: IntArray
//
//val queue: Queue<Pair<Int, Int>> = LinkedList()
//lateinit var result: IntArray
//fun main() = with(System.`in`.bufferedReader()) {
//    var tc = readLine().toInt()
//    repeat(tc) {
//        val info = readLine().split(" ").map { it.toInt() }
//        n = info[0]
//        target = info[1]
//
//        arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//        for (i in 0 until arr.size) {
//            queue.add(i to arr[i])
//        }
//
//        var order = 1
//        result = IntArray(n) { 0 }
//        while (queue.isNotEmpty()) {
//            val docu = queue.poll()
//            var flag = false
//            queue.forEach {
//                if (it.second > docu.second) flag = true
//            }
//
//            if (flag) {
//                queue.add(docu)
//            } else {
//                result[docu.first] = order
//                order += 1
//            }
//        }
//
//        println(result[target])
//        queue.clear()
//    }
//}