//package math


/*
    조합 nCr
    n개 중에 r개를 순서를 고려하지 않고 뽑는 경우의 수
    n!/(n-r)!
*/


//val combinationList = mutableListOf('a', 'b', 'c', 'd')
//var combinationTotalCnt = 0
//
//// 조합의 결과 뽑은 index를 담을 배열.
//val resultList: MutableList<Int> = mutableListOf()
//
//fun combination(n: Int, r: Int, start: Int = 0) {
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
//        // 뽑고 -> 다음 idx 부터 뽑도록 start param i+1로 증가
//        resultList.add(i)
//        combination(n, r, start = i + 1)
//        // 원복.
//        resultList.removeLast()
//    }
//}

//fun main() {
//    combination(combinationList.size, 3)
//    println("combinationTotalCnt: ${combinationTotalCnt}")
//
//    val arr = Array(4){ it }
//
//    for (i in 0 until arr.size){
//        for (j in i+1 until arr.size){
//            for (k in j+1 until arr.size){
//                println("i:$i j:$j k:$k")
//            }
//        }
//    }
//}