package bac.etc


/*
    N M 5

    순열.
 */


//var n = 0
//var m = 0
//
//lateinit var arr: IntArray
//
//val result = mutableListOf<Int>()
//lateinit var isSelected: BooleanArray
//fun permu(n: Int, r: Int) {
//
//    if (r == result.size) {
//        val temp = mutableListOf<Int>()
//        for (idx in result) {
//            temp.add(arr[idx])
//        }
//        println(temp.joinToString(" "))
//        return
//    }
//
//    for (i in 0 until n) {
//
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
//}