package bac.etc

/*
    트럭

    n 개의 트럭이 건너가려고 한다. 트럭의 순서는 바꿀 수 없으며,
    트럭의 무게는 서로 같지 않을 수 있다.
    다리 위에는 단지 w 대의 트럭만 동시에 올라갈 수 있다

    트럭들은 하나의 단위시간(unit time)에 하나의 단위길이만큼만 이동
    트럭들의 무게의 합은 다리의 최대하중인 L보다 작거나 같아야 한다

     n (1 ≤ n ≤ 1,000),
     w (1 ≤ w ≤ 100)
     L (10 ≤ L ≤ 1,000)
 */

//import java.util.*
//
//var n = 0
//var w = 0
//var l = 0
//
//lateinit var truckArr: IntArray
//
//val waitingQueue: Queue<Int> = LinkedList()
//val bridge: Queue<Truck> = LinkedList()
//
//data class Truck(var weight: Int, var position: Int)
//
//fun main() = with(System.`in`.bufferedReader()){
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    w = info[1]
//    l = info[2]
//
//    // 모든 트럭을 대기 큐에 넣는다.
//    truckArr = readLine().split(" ").map { it.toInt() }.toIntArray()
//    for (i in 0 until truckArr.size) {
//        waitingQueue.add(truckArr[i])
//    }
//
//    val completeList = mutableListOf<Truck>()
//
//    var time = 0
//    while (truckArr.size > completeList.size) {
//        time += 1
//
//        // 다리 위의 트럭을 이동시킨다.
//        if (bridge.isNotEmpty()) {
//            // 다리위 트럭 1칸씩 이동.
//            bridge.map { it.position += 1 }
//            if (bridge.peek().position > w) {
//                completeList.add(bridge.poll())
//            }
//        }
//
//        // 대기 하는 트럭을 다리 위로 올려보낸다.
//        if (waitingQueue.isNotEmpty()) {
//            val bridgeWeight = bridge.sumOf { it.weight }
//            val restWeight = l - bridgeWeight
//            // 다리의 하중에 더 올라갈 여유가 있고, 다리위에 트럭이 올라갈 공간이 있다면
//            if (restWeight >= waitingQueue.peek() && w > bridge.size)
//                bridge.add(Truck(waitingQueue.poll(), 1))
//        }
//    }
//    println(time)
//}