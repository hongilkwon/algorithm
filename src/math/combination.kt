//package math


/*
    조합 nCr
    n개 중에 r개를 순서를 고려하지 않고 뽑는 경우의 수
    n!/(n-r)!
*/


//val combinationList = mutableListOf('a', 'b', 'c', 'd')
//var combinationTotalCnt = 0
//
//fun combination(n: Int, r: Int, resultList: MutableList<Int> = mutableListOf(), start: Int = 0) {
//
//    if (resultList.size == r) {
//        /*
//            logic
//
//        * */
//        combinationTotalCnt += 1
//        println(resultList.joinToString(" "))
//        return
//    }
//
//    for (i in start until n) {
//        resultList.add(i)
//        combination(n, r, resultList, start = i + 1)
//        resultList.remove(i)
//    }
//}
//
//fun main() {
////    combination(combinationList.size, 4)
////    println("combinationTotalCnt: ${combinationTotalCnt}")
//
//    val temp = Array(10){ it }
//
//    for (i in 0 until temp.size){
//
//        for (j in i+1 until temp.size){
//
//            for (k in j+1 until temp.size){
//                println("i:$i j:$j k:$k")
//            }
//        }
//    }
//}