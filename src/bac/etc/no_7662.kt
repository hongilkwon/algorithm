package bac.etc

/*
    이중우선순위 큐


    1 <= k <= 1,000,000
    저장될 모든 정수는 -231 이상 231 미만인 정수

    동일한 정수가 삽입될 수 있음
    명령어에 해당하는 숫자가 2개면 1개에 대해서 수행한다.

    우선순위 큐 2개를 이용한다.
    * 우선순위큐는 특정한 우선순위를 정해주지 않으면,
    숫자는 오름차순이다. 스트링은 사전순이다.


 */

//import java.util.PriorityQueue
//
//val minHeap = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//val maxHeap = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })
//var removed = BooleanArray(1_000_001) { false }
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    repeat(tc) {
//
//        val k = readLine().toInt()
//
//        for (i in 0 until k) {
//            val operation = readLine().split(" ")
//
//            if (operation[0] == "I") {
//                minHeap.add(i to operation[1].toInt())
//                maxHeap.add(i to operation[1].toInt())
//            } else if (operation[0] == "D" && operation[1] == "1") {
//
//                while (maxHeap.isNotEmpty() && removed[maxHeap.peek().first]) {
//                    maxHeap.poll()
//                }
//
//                if (maxHeap.isNotEmpty()) {
//                    removed[maxHeap.poll().first] =  true
//                }
//            } else if (operation[0] == "D" && operation[1] == "-1") {
//
//                while (minHeap.isNotEmpty() && removed[minHeap.peek().first]) {
//                    minHeap.poll()
//                }
//
//                if (minHeap.isNotEmpty()) {
//                    removed[minHeap.poll().first] =  true
//                }
//            }
//        }
//
//        while (maxHeap.isNotEmpty() && removed[maxHeap.peek().first]) {
//            maxHeap.poll()
//        }
//        while (minHeap.isNotEmpty() && removed[minHeap.peek().first]) {
//            minHeap.poll()
//        }
//
//        if (minHeap.isEmpty() && maxHeap.isEmpty()) {
//            println("EMPTY")
//        } else {
//            println("${maxHeap.poll().second} ${minHeap.poll().second}")
//        }
//
//        minHeap.clear()
//        maxHeap.clear()
//        removed = BooleanArray(1_000_001) { false }
//    }
//}