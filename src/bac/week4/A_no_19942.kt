package bac.week4


/*
    다이어트
 */


//lateinit var mArr: IntArray
//
//fun check(arr: IntArray): Boolean {
//    for (i in 0 until mArr.size) {
//        if (mArr[i] > arr[i]) return false
//    }
//    return true
//}
//
//fun idxToStr(arr: List<Int>): String {
//    var str = ""
//    arr.forEach { str += it + 1 }
//    return str
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val n = readLine().toInt()
//    mArr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    val elements = Array(n) { IntArray(5) { 0 } }
//
//    for (i in 0 until n) {
//        elements[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    var min = Int.MAX_VALUE
//    var result = mutableListOf<Int>()
//
//    for (i in 0 until (1 shl elements.size)) {
//
//        val idx = mutableListOf<Int>()
//        val temp = mutableListOf<IntArray>()
//
//        for (j in 0 until elements.size) {
//            if ((i and (1 shl j)) != 0) {
//                idx.add(j)
//                temp.add(elements[j])
//            }
//        }
//
//        /* 조건 및 최소값 */
//        if (temp.isNotEmpty()) {
//
//            val sumArr = IntArray(4) { 0 }
//            for (k in 0 until temp.size) {
//                for (l in 0 until 4) {
//                    sumArr[l] += temp[k][l]
//                }
//            }
//
//            if (check(sumArr)) {
//                val price = temp.sumOf { it[4] }
//                if (min >= price) {
//                    if (min == price) {
//                        if (result.isEmpty()) result = idx
//                        else if (idxToStr(result) > idxToStr(idx))
//                            result = idx
//                    } else {
//                        result = idx
//                    }
//                    min = price
//                }
//            }
//        }
//    }
//
//    if (min != Int.MAX_VALUE) {
//        println(min)
//        result.forEach { print("${it + 1} ") }
//    } else {
//        println(-1)
//    }
//}