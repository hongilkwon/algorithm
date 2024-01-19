package bac.etc


/*
    맥주 마시면서 걸어가기

    그래프(bfs) 응용

    처음에 문제를 파악하는데건 어렵지 않다.
    하지만, 명확히 bfs탐색을 해야되는 이유를 찾기가 어렵다.



 */


import java.util.LinkedList
import java.util.Queue
import kotlin.math.abs

var n = 0

var start = 0 to 0
var chargePoints = mutableListOf<Pair<Int, Int>>()
var end = 0 to 0


fun calDist(p1: Pair<Int, Int>, p2: Pair<Int, Int>) = abs(p1.first - p2.first) + abs(p1.second - p2.second)


lateinit var visited: IntArray
fun go(start: Pair<Int, Int>): Boolean {

    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(start)

    while (queue.isNotEmpty()) {

        val node = queue.poll()

        if (calDist(node, end) <= 1000) {
            return true
        }

        for (i in 0 until chargePoints.size) {
            if (visited[i] == 1) {
                continue
            }
            val next = chargePoints[i]
            if (calDist(node, next) <= 1000) {
                queue.add(next)
                visited[i] = 1
            }
        }
    }
    return false
}

fun main() = with(System.`in`.bufferedReader()) {

    var tc = readLine().toInt()

    repeat(tc) {
        n = readLine().toInt()

        val info1 = readLine().split(" ").map { it.toInt() }
        start = info1[0] to info1[1]

        for (i in 0 until n) {
            val point = readLine().split(" ").map { it.toInt() }
            chargePoints.add(point[0] to point[1])
        }

        val info2 = readLine().split(" ").map { it.toInt() }
        end = info2[0] to info2[1]

        visited = IntArray(n) { 0 }
        val ret = go(start)

        if (ret) {
            println("happy")
        } else {
            println("sad")
        }

        chargePoints.clear()
    }

    return@with Unit
}
