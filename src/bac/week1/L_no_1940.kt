package bac.week1

/*

주몽
1-L

*/

//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()){
//
//    val elementNum = readLine().toInt()
//    val targetNum = readLine().toInt()
//    val list = readLine().split(" ").map { it.toInt() }
//
//    var cnt = 0
//
//    // 반례 재료 1개의 고유번호는 10만까지다 2개를 합치면 최대 20만.
//    // 만들려고하는 수가 20만을 넘는다면 만들수 없다.
//    if (targetNum>200000){
//        println(0)
//        return@with
//    }
//
//    for (i in 0 until list.size){
//        for (j in i+1 until list.size){
//            if (list[i]+list[j] == targetNum) cnt += 1
//        }
//    }
//
//    println(cnt)
//}



var elementNum = 0
var targetNum = 0
var list = emptyList<Int>()
var cnt = 0

fun main() = with(System.`in`.bufferedReader()){

    elementNum = readLine().toInt()
    targetNum = readLine().toInt()
    list = readLine().split(" ").map { it.toInt() }

    // 반례 재료 1개의 고유번호는 10만까지다 2개를 합치면 최대 20만.
    // 만들려고하는 수가 20만을 넘는다면 만들수 없다.
    if (targetNum>200000){
        println(0)
        return@with
    }

//    for (i in 0 until list.size){
//        for (j in i+1 until list.size){
//            if (list[i]+list[j] == targetNum) cnt += 1
//        }
//    }

    combination(r = 2, resultList = mutableListOf())
    println(cnt)
}

fun combination(r: Int, start: Int = -1, resultList: MutableList<Int>){

    if (resultList.size == r){
        if (list[resultList[0]] + list[resultList[1]] == targetNum) cnt += 1
        return
    }

    for (idx in start+1 until list.size){
        resultList.add(idx)
        combination(r, idx, resultList)
        resultList.remove(idx)
    }
}