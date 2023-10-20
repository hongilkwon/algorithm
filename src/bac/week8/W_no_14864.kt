package bac.week8


/*
    줄서기

    학생들에게서 자신보다 "뒤에 서있으면서 더 작은 번호"의 카드를 가진 학생들의 명단을 하나도 "빠짐없이" 모두 받았다.

    "뒤에 서있으면서 더 작은 번호"
    "빠짐없이"

    즉, m=0 이라면
    1 2 3 4 5 순으로 번호를 가지고있다.

    예시 이해가 쉽지 않다.
    문제를 관통하는 원리를 이해 해야된다.

    (1,2), (1,5), (3,4), (3,5), (4,5)
    --> 3, 1, 5, 4, 2

    (1,2), (1,3), (1,5), (2,5), (3,4), (3,5)
    --> 4 2 4 3 2

    "뒤에 서있으면서 더 작은 번호"
    "빠짐 없이"
    (x, y) ---> x+1 y-1
*/

//var n = 0
//var m = 0
//
//lateinit var cardInfoArr: Array<Pair<Int, Int>>
//
//lateinit var studentArr: IntArray
//lateinit var visited: IntArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    cardInfoArr = Array(m) { 0 to 0 }
//    for (i in 0 until m) {
//        val cInfo = readLine().split(" ").map { it.toInt() }
//        cardInfoArr[i] = cInfo[0] to cInfo[1]
//    }
//
//    studentArr = IntArray(n + 1) { it }
//
//    for (i in 0 until cardInfoArr.size) {
//        studentArr[cardInfoArr[i].first] += 1
//        studentArr[cardInfoArr[i].second] -= 1
//    }
//
//    println(studentArr.joinToString(" "))
//    var isPossible = true
//    visited = IntArray(n + 1) { 0 }
//    for (i in 1 until studentArr.size) {
//        visited[studentArr[i]] += 1
//        if (visited[studentArr[i]] >= 2) {
//            isPossible = false
//            break
//        }
//    }
//
//    if (isPossible) {
//        for (i in 1 until studentArr.size) {
//            print("${studentArr[i]} ")
//        }
//    } else {
//        println(-1)
//    }
//    Unit
//}

