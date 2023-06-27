package bac.week2

/*
    효율적인 해킹

    1 <= N <= 10_000
    1 <= M <= 100_000

    kotlin 언어로 깊이 넓이 우선 탐색 둘다 어떻게 푸는지 알수 없음.
 */


import java.util.LinkedList
import java.util.Queue

lateinit var adj: Array<MutableList<Int>>
lateinit var visited: Array<Int>

fun treeDfs(node: Int): Int {

    visited[node] = 1
    var cnt = 1

    for (nNode in adj[node]) {
        if (visited[nNode] == 1) continue
        cnt += treeDfs(nNode)
    }
    return cnt
}

var cnt = 0
val queue: Queue<Int> = LinkedList()

fun treeBfs(node: Int){

    visited[node] = 1
    queue.add(node)
    cnt += 1

    while (queue.isNotEmpty()){

        val node = queue.peek()
        queue.poll()

        for (nNode in adj[node]) {
            if (visited[nNode] != 1){
                cnt += 1
                queue.add(nNode)
            }
        }
    }
}

fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toInt() }

    val n = info[0]
    val m = info[1]

    adj = Array(n + 1) { mutableListOf() }

    for (i in 0 until m) {
        val line = readLine().split(" ").map { it.toInt() }
        adj[line[1]].add(line[0])
    }

    val cntArr = Array(n + 1) { 0 }

    var max = 0
    for (i in 1..n) {
        visited = Array(n + 1) { 0 }
        cnt = 0
        treeBfs(i)
        cntArr[i] = cnt
        if (cntArr[i] > max)
            max = cntArr[i]
    }

    val sb = StringBuilder()
    for (i in 0 until cntArr.size){
        if (cntArr[i] == max)
            sb.append("$i ")
    }
    println(sb.toString())
}