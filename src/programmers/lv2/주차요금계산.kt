package programmers.lv2


/*
    주차 요금 계산

    어떤 차량이 입차된 후에 출차된 내역이 없다면, 23:59에 출차된 것으로 간주
    초과한 시간이 단위 시간으로 나누어 떨어지지 않으면, 올림합니다.

    들어온 차가 다시 들어온다.
    차 번호 오름 차순대로 출력.

    어려운 문제는 아니지만, 실제로 구현할때 까다롭게 하는점이 있고, 문제와 예제를 꼼꼼히 봤어야됬다.
 */

//import kotlin.math.ceil
//
//data class CarRecord(val num: Int, val type: String, val time: Int)
//
//fun calTime(str: String): Int {
//
//    val timeArr = str.split(":")
//    val hour = timeArr[0].toInt()
//    val minute = timeArr[1].toInt()
//
//    return (hour * 60) + minute
//}
//
//fun calFees(fees: IntArray, usedTime: Int): Int {
//
//    val baseTime = fees[0]
//    val baseFee = fees[1]
//    val term = fees[2]
//    val termFee = fees[3]
//
//    val result = if (usedTime > baseTime) {
//        baseFee + ceil((usedTime - baseTime).toDouble() / term.toDouble()).toInt() * termFee
//    } else {
//        baseFee
//    }
//
//    return result
//}
//
//
//val recordMap = mutableMapOf<Int, MutableList<CarRecord>>()
//
//class Solution {
//    fun solution(fees: IntArray, records: Array<String>): IntArray {
//        var answer: IntArray = intArrayOf()
//
//        for (i in 0 until records.size) {
//            val record = records[i].split(" ")
//
//            val n = record[1].toInt()
//            val cr = CarRecord(num = n, type = record[2], time = calTime(record[0]))
//
//            if (recordMap.containsKey(n)) {
//                recordMap[n]?.add(cr)
//            } else {
//                recordMap[n] = mutableListOf(cr)
//            }
//        }
//
//        var feesList = mutableListOf<Int>()
//
//        for (carRecord in recordMap.toSortedMap()) {
//            val list = carRecord.value
//
//            if (list.size % 2 != 0) {
//                list.add(CarRecord(carRecord.key, "OUT", calTime("23:59")))
//            }
//
//            var totalTime = 0
//            for (i in 0 until list.size step 2) {
//                totalTime += list[i + 1].time - list[i].time
//            }
//            feesList.add(calFees(fees, totalTime))
//        }
//
//        return feesList.toIntArray()
//    }
//}

//fun main() {
//    Solution().solution(
//        fees = intArrayOf(120, 0, 60, 591),
//        records = arrayOf("16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN")
//    )
//}