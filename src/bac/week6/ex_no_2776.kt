package bac.week6


/*
  암기왕
  수첩 1’에 적어 놓은 정수의 개수 N(1 ≤ N ≤ 1,000,000)
  수첩 2’에 적어 놓은 정수의 개수 M(1 ≤ M ≤ 1,000,000)
   */

//import java.io.BufferedWriter
//import java.io.OutputStreamWriter
//
//var n = 0
//lateinit var note1: Array<Int>
//
//var m = 0
//lateinit var note2: Array<Int>
//
////fun binarySearch(element: Int): Int {
////
////    var left = 0
////    var right = note1.lastIndex
////
////    var mid = 0
////    while (left <= right) {
////        mid = (left + right) / 2
////        when {
////            note1[mid] < element -> left = mid + 1
////            note1[mid] > element -> right = mid - 1
////            note1[mid] == element -> return mid
////        }
////    }
////    return -1
////}
//
//val bw = BufferedWriter(OutputStreamWriter(System.out))
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val testCase = readLine().toInt()
//
//    repeat(testCase) { _ ->
//        n = readLine().toInt()
//        note1 = readLine().split(" ").map { it.toInt() }.toTypedArray()
//        note1.sort()
////        println(note1.joinToString(" "))
//
//        m = readLine().toInt()
//        note2 = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//        for (i in 0 until m) {
//            val num = note2[i]
//            if (note1.binarySearch(num) >= 0)
//                bw.write("1" + "\n");
//            else
//                bw.write("0" + "\n");
//        }
//    }
//    bw.flush()
//    bw.close()
//    Unit
//}


