package programmers.lv3


/*
    부대 복귀

    3 ≤ n ≤ 100_000
    2 ≤ roads.size ≤ 500_000

    1 ≤ sources의 길이 ≤ 500

    단순 bfs 최단거리.
    그냥 시작점과 도착점을 뒤집어서 생각해보면됨.
 */


//import java.util.LinkedList
//import java.util.Queue
//
//class Solution {
//
//    var n = 0
//    lateinit var roads: Array<IntArray>
//    lateinit var sources: IntArray
//    var destination: Int = 0
//
//    lateinit var adjList: Array<MutableList<Int>>
//
//    lateinit var visited: IntArray
//    fun bfs(start: Int) {
//
//        val q: Queue<Int> = LinkedList()
//        q.add(start)
//        visited[start] = 1
//
//        while (q.isNotEmpty()) {
//            val curNode = q.poll()
//            for (next in adjList[curNode]) {
//                if (visited[next] > 0) continue
//                q.add(next)
//                visited[next] = visited[curNode] + 1
//            }
//        }
//    }
//
//    fun solution(n: Int, roads: Array<IntArray>, sources: IntArray, destination: Int): IntArray {
//        var answer: IntArray = intArrayOf()
//
//        this.n = n
//        this.roads = roads
//        this.sources = sources
//        this.destination = destination
//
//        adjList = Array(n + 1) { mutableListOf() }
//        for (i in 0 until roads.size) {
//
//            val edge = roads[i]
//            val u = edge[0]
//            val v = edge[1]
//
//            adjList[u].add(v)
//            adjList[v].add(u)
//        }
//
//        visited = IntArray(n + 1) { 0 }
//        bfs(destination)
//
//        val temp = mutableListOf<Int>()
//        for (start in sources) {
//            temp.add(visited[start] - 1)
//        }
//
//        answer = temp.toIntArray()
//        println(answer.joinToString(" "))
//        return answer
//    }
//}