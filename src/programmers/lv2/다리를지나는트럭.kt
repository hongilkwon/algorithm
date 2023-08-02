package programmers.lv2




/*
    다리를 지나는 트럭.

    단순 구현 문제.
    조건이 조금 까다롭지만, 어려운 문제는 아니다.


    모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지
 */

//import java.util.LinkedList
//import java.util.Queue
//
//data class Truck(var w: Int,var p: Int)
//fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
//
//
//    val truckCnt = truck_weights.size
//
//    val waitingQueue: Queue<Int> = LinkedList()
//    for (i in 0 until truck_weights.size){
//        waitingQueue.add(truck_weights[i])
//    }
//
//    val bridge: Queue<Truck> = LinkedList()
//
//    val completeList = mutableListOf<Int>()
//
//    var time = 0
//    while (truckCnt > completeList.size){
//        time += 1
//        if (bridge.isNotEmpty()){
//            bridge.map { it.p += 1}
//            if (bridge.peek().p > bridge_length){
//                completeList.add(bridge.poll().w)
//            }
//        }
//
//        if (waitingQueue.isNotEmpty()){
//            val bridgeWeight = bridge.sumOf { it.w }
//            val restWeight = weight - bridgeWeight
//            if (restWeight >= waitingQueue.peek() && bridge_length > bridge.size)
//                bridge.add(Truck(waitingQueue.poll() , 1))
//        }
//    }
//
//    println(time)
//    return time
//}
//
//fun main() {
//    solution(bridge_length = 2, weight = 10, truck_weights = intArrayOf(7,4,5,6))
//}