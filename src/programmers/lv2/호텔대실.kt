package programmers.lv2



/*
    호텔대실

    최소한의 객실만을 사용하여 예약 손님들

    시각은 HH:MM 형태로 24시간 표기법을 따르며, "00:00" 부터 "23:59" 까지로 주어집니다.
    예약 시각이 자정을 넘어가는 경우는 없습니다.
    시작 시각은 항상 종료 시각보다 빠릅니다.

    greedy
    지금 당장 수용할 수 있는 방이 있는가?
    우선순위큐를 이용해야된다.
 */

//import java.util.PriorityQueue
//
//lateinit var bookTime: Array<Array<Int>>
//fun strToInt(time: Array<String>): Array<Int> {
//    return time.map {
//        val temp = it.split(':')
//        (temp[0].toInt() * 60) + temp[1].toInt()
//    }.toTypedArray()
//}
//
//fun solution(bt: Array<Array<String>>): Int {
//    var answer: Int = 0
//
//    bookTime = Array(bt.size) { idx ->
//        strToInt(bt[idx])
//    }
//    bookTime.sortBy { it[0] }
//
//    var roomCnt = 0
//    var priorityQueue = PriorityQueue<Int>()
//
//    for (i in 0 until bookTime.size){
//        if (priorityQueue.isEmpty() || priorityQueue.peek() > bookTime[i][0]){
//            roomCnt += 1
//            priorityQueue.add(bookTime[i][1] + 10)
//            continue
//        }
//        priorityQueue.poll()
//        priorityQueue.add(bookTime[i][1] + 10)
//    }
//    answer = roomCnt
//    return answer
//}