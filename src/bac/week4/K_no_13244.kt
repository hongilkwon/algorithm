import java.util.*

/*
 Tree
 인지 확인하기.

  방향성이 있는 비순환 그래프

   check
   1. 노드의 개수
   2. dfs 로 탐색시 연결된 컴포넌트가 1개여야 된다.
   ( )
 */


var nodeNum = 0
var edgeNum = 0

lateinit var nodes: Array<MutableSet<Int>>

lateinit var visited: Array<Int>

lateinit var queue: Queue<Int>


fun dfs(p: Int) {
    visited[p] = 1

    for (i in nodes[p]) {
        if (visited[i] != 1) {
            dfs(i)
        }
    }
    return
}


fun bfs(p: Int): Boolean {

    queue.add(p)
    visited[p] = 1

    while (queue.isNotEmpty()) {

        val point = queue.poll()

        for (i in nodes[point]) {
            if (visited[i] == 1) {
                return false
            } else {
              queue.add(i)
            }
        }
    }
    return true
}

fun main() = with(System.`in`.bufferedReader()) {

    val testCase = readLine().toInt()

    testCase@ for (tc in 1..testCase) {

        nodeNum = readLine().toInt()
        edgeNum = readLine().toInt()

        nodes = Array(nodeNum + 1) {
            mutableSetOf<Int>()
        }

        visited = Array(nodeNum + 1) { 0 }

        for (i in 1..edgeNum) {
            val info = readLine().split(" ").map { it.toInt() }
                nodes[info[0]].add(info[1])
                nodes[info[1]].add(info[0])
        }

        var cnt = 0
        for (i in 1..nodeNum) {
            if (visited[i] == 0) {
                dfs(i)
                cnt += 1
            }
        }

        if (edgeNum == nodeNum - 1 && cnt == 1)
            println("tree")
        else
            println("graph")
    }
    Unit
}