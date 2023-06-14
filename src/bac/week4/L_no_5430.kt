/*
 AC 언어


 */



//fun main() = with(System.`in`.bufferedReader()) {
//
//    val testCase = readLine().toInt()
//
//    repeat(testCase) {
//        val operator = readLine().toCharArray()
//        val n = readLine().toInt()
//
//        val line = readLine()
//
//        val list =
//            if (line != "[]")
//                line.substring(1, line.length - 1).split(',').map { it.toInt() }.toMutableList()
//            else
//                mutableListOf()
//
//        var direction = 0
//        var rCnt = 0
//        var flag = false
//
//        for (i in 0 until operator.size) {
//            if (operator[i] == 'R') {
//                rCnt += 1
//                direction = if (direction == 0) 1 else 0
//            }
//            if (operator[i] == 'D') {
//                if (list.isEmpty()) {
//                    println("error")
//                    flag = true
//                    break
//                } else {
//                    if (direction == 0)
//                        list.removeFirst()
//                    else
//                        list.removeLast()
//                }
//            }
//        }
//        if (rCnt%2 == 1) list.reverse()
//        if (!flag) println("["+list.joinToString(",")+"]")
//    }
//    Unit
//}