package bac.easy

/*
    가장 가까운 세사람의 심리적 거리.

    1 <= T <= 50
    3 <= N <= 100_000


    100_000 C 3... 너무 큼


    비둘기집 원리
    16개의 서로 다른 mbti를 가진다.
    즉 16명을 넘어 17명이 되면 2명의 공통된 mbti를 가진자가 나온다.
    즉 32명을 넘어 33명이 되면 3명의 공통된 mbti를 가진자가 나온다. -> 거리 0

 */

import kotlin.math.min

fun calDiff(a: String, b: String): Int {
    var dist = 0
    for (i in 0 until 4) {
        if (a[i] != b[i]) dist += 1
    }
    return dist
}

fun main() = with(System.`in`.bufferedReader()) {

    val tc = readLine().toInt()
    for (t in 0 until tc) {

        val n = readLine().toInt()
        val mbtiList = readLine().split(" ")
        if (n > 33) {
            println(0)
            continue
        } else {
            var minDist = 15
            for (i in 0 until mbtiList.size) {
                for (j in i + 1 until mbtiList.size) {
                    for (k in j + 1 until mbtiList.size) {
                        minDist = min(
                            minDist,
                            calDiff(mbtiList[i], mbtiList[j]) +
                                    calDiff(mbtiList[j], mbtiList[k]) +
                                    calDiff(mbtiList[k], mbtiList[i])
                        )
                    }
                }
            }
            println(minDist)
        }
    }
    return@with Unit
}
