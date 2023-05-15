package math


/*
    조합 nCr
    n개 중에 r개를 순서를 고려하지 않고 뽑는 경우의 수
    n!/(n-r)!
*/


val combiList = mutableListOf('a', 'b', 'c', 'd')

fun combination(n: Int, r: Int, resultList: MutableList<Int> = mutableListOf(), start: Int = -1) {

    if (resultList.size == r) {
        /*
            logic
        * */
        println(resultList.joinToString(" "))
        return
    }

    for (i in start + 1 until n) {
        resultList.add(i)
        combination(n, r, resultList, start = i)
        resultList.remove(i)
    }
}

fun main() {
    combination(combiList.size, 2)
}


//val n = mutableListOf(1, 2, 3, 4)
//
//fun combination(r: Int, start: Int, resultList: MutableList<Int>) {
//
//    if (resultList.size == r) {
//        //logic
//        println(resultList.joinToString())
//        return
//    }
//
//    for (idx in start + 1 until n.size) {
//        resultList.add(idx)
//        combination(r= r, start = idx, resultList =  resultList)
//        resultList.remove(idx)
//    }
//}
//
//fun combinationP(r: Int, start: Int, resultList: MutableList<Int>){
//    // r 개만큼 결과에 담았으면 그만한다.
//    if (resultList.size == r){
//        println(resultList.joinToString())
//        return
//    }
//
//    for (idx in start+1 until n.size){
//        //idx 값을 뽑고 다 뽑지 않은 상태이기 떄문에 재귀호출
//        resultList.add(idx)
//        // 새로운 start 값이 idx 임이 중요하다
//        combination(r, idx, resultList)
//        // 원래 상태로 복구 시킨다
//        resultList.remove(idx)
//    }
//}
//
//
//fun main() {
//    combination(r = 3, start = -1, resultList = mutableListOf())
//
//    // nCr 에서 r이 3이하라면 4이상은 4중 반복이라 매우 비효율적이다.
////    for (i in 0 until bac.week5.concept.getN.size){
////        for (j in i+1 until bac.week5.concept.getN.size){
////            for (bac.week5.concept.getK in j+1 until bac.week5.concept.getN.size){
////                println("$i $j $bac.week5.concept.getK")
////            }
////        }
////    }
//}