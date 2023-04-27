//package bac.week2
//
///*
//2-G
//빈도정렬
//
//비교자(comparator)를 사용문제
//없으면 생성하여 할당하고 있으면 가져와서 작업한다.
//
// */
//
//val comparator = compareBy<Num>({-it.count}, {it.order})
//
//class Num(
//    val value: Int,
//    var count: Int,
//    val order: Int
//) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Num
//
//        return value == other.value
//    }
//
//    override fun hashCode(): Int {
//        return value
//    }
//
//    override fun toString(): String {
//        return "Num(value=$value, count=$count, order=$order)"
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val info = readLine().split(" ").map { it.toInt() }
//
//    val size = info[0]
//    val limit = info[1]
//
//    val arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    val list = mutableListOf<Num>()
//    for (i in 0 until arr.size) {
//        val num = Num(value = arr[i], order = i, count = 1)
//        if (list.contains(num)) {
//            val element = list.find { it.value == arr[i] }!!
//            element.count += 1
//        } else {
//            list.add(num)
//        }
//    }
//
//    val sortedList = list.sortedWith(comparator)
//    sortedList.forEach { num ->
//        repeat(num.count){
//            print("${num.value}")
//        }
//    }
//}