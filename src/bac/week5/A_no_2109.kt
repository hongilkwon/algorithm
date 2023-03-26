package bac.week5

/*
    순회강연
    그리디 문제.

    n개의 대학강의
    d 날짜
    p 가격

 */

import java.util.PriorityQueue

fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()

    val lectures = Array(n) {
        val info = readLine().split(" ").map { it.toInt() }
        info[0] to info[1]
    }

    // 강의 남은 날을 기준으로 오름차순 정렬
    lectures.sortBy { it.second }

    val pq = PriorityQueue<Int>()
    for (i in 0 until n) {
        // 해당 강의 페이를 일단 넣고
        pq.add(lectures[i].first)
        // 남은 날 보다 해야될 강의가 많다면, 가장 페이가 적은것을 안하는 쪽으로 한다.
        if(lectures[i].second < pq.size){
            pq.poll()
        }
    }

    var answer = 0
    while (pq.isNotEmpty()){
        answer += pq.poll()
    }
    println(answer)
}