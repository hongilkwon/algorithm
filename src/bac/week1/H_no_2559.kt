package bac.week1

/*
수열
1-H

최댓값을 구하라 --> 최소로 시작해서 -> 최대
최솟값을 구하라 --> 최대로 시작해서 -> 최소

구간합
누적합 배열을 만드는 코드
    for (i in 1 until tempList.size + 1) {
        sumList[i] = sumList[i - 1] + tempList[i - 1]
    }

 */

fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toInt() }

    val num = info[0]
    val date = info[1]
    val tempList = readLine().split(" ").map { it.toInt() }
    val sumList = MutableList(tempList.size + 1) { 0 }

//     10만 * 10만 100억
//    for (i in 0 until size){
//        var sum = 0
//        for (j in i until i+date ){
//            sum += tempList[j]
//        }
//        sumList[i] = sum
//    }

    // 누적합 배열을 만드는 코드
    for (i in 1 until tempList.size + 1) {
        sumList[i] = sumList[i - 1] + tempList[i - 1]
    }

    var max = Int.MIN_VALUE
    for (i in date until sumList.size) {
        val sum =
            if (i == date)
                sumList[i]
            else {
              sumList[i] - sumList[i-date]
            }
        if (max < sum) {
            max = sum
        }
    }

    println(max)
}