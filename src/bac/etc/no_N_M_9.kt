package bac.etc

/*
    n m 9

    순열 + 집합

    * 동일한 순서와 데이터를 가진 list는 집합이 같은거로 인식 하지만, Array는 아님.

 */


//var n = 0
//var m = 0
//
//lateinit var arr: IntArray
//
//val result = mutableListOf<Int>()
//lateinit var isSelected: BooleanArray
//
//
//val set = mutableSetOf<List<Int>>()
//fun permu(n: Int, r: Int) {
//
//    if (r == result.size) {
//        val temp = MutableList(result.size) {
//            arr[result[it]]
//        }
//        set.add(temp)
//        return
//    }
//
//    for (i in 0 until n) {
//        if (isSelected[i]) continue
//        result.add(i)
//        isSelected[i] = true
//
//        permu(n, r)
//        isSelected[i] = false
//        result.removeLast()
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//    arr.sort()
//
//    isSelected = BooleanArray(n) { false }
//    permu(n, m)
//
//    for (e in set) {
//        println(e.joinToString(" "))
//    }
//}