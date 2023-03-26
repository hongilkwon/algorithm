package bac.week5

/*
    컵라면.

    그리디 문제.

    적산 최대값
    - 가장 적은걸 제외한다.
    - 가장 큰컷만 담는다.

 */


import java.util.PriorityQueue

fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()

    val problems = Array(n) {
        val info = readLine().split(" ").map { it.toInt() }
        info[0] to info[1]
    }

    problems.sortBy { it.first }
//    println(problems.joinToString( " "))

    val pq = PriorityQueue<Int>()

    for (i in 0 until problems.size) {
        if (problems[i].first <= pq.size) {
            if (pq.peek() < problems[i].second) {
                pq.poll()
                pq.add(problems[i].second)
            }
        } else {
            pq.add(problems[i].second)
        }
    }

    var answer = 0
    while (pq.isNotEmpty()){
        answer += pq.poll()
    }
    println(answer)
}