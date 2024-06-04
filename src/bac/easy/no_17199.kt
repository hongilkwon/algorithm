package bac.easy



/*
   milk Factory(그래프탐색)

   farmer John has elected to use the minimum number of walkways
   so now travel along each walkway is only possible in a single direction!



   N, the number of processing stations.
   there is a conveyor belt that moves from station a to station b

   i 역에서 출발해서 어느역으로 갈수있는 역중에 최소 i를 출력하고 없으면 -1
*/


//import java.util.LinkedList
//import java.util.Queue
//
//var n = 0
//lateinit var adjList: Array<MutableList<Int>>
//
//lateinit var visited: IntArray
//
//fun bfs(start: Int) {
//
//    val queue: Queue<Int> = LinkedList()
//
//    visited[start] = 1
//    queue.add(start)
//
//    while (queue.isNotEmpty()){
//
//        val node = queue.poll()
//
//        for (next in adjList[node]){
//            if (visited[next] == 1) continue
//            visited[next] = 1
//            queue.add(next)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    adjList = Array(n + 1) { mutableListOf() }
//
//    for (i in 0 until n - 1) {
//        val edgeInfo = readLine().split(" ").map { it.toInt() }
//        val u = edgeInfo[0]
//        val v = edgeInfo[1]
//        adjList[v].add(u)
//    }
//
//    var answer = -1
//    for (i in 1..n) {
//        visited = IntArray(n + 1) { 0 }
//        bfs(i)
//
//        // 모두 방문할 수 있는 노드인지 확인하는 flag
//        var flag = true
//        for (j in 1..n) {
//            if (visited[j] == 0) {
//                flag = false
//                break
//            }
//        }
//
//        if (flag) {
//            answer = i
//            break
//        }
//    }
//
//    println(answer)
//    return@with Unit
//}