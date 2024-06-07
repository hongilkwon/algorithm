package bac.week2.concept

import java.util.LinkedList
import java.util.Queue

/*
   3. BFS 너비우선 탐색
   - 특정 노드에서 시작해 이웃한 모든 노드를 먼저 탐색하는 알고리즘
   - 같은 가중치를 가진 그래프에서 최단거리 알고리즘으로도 사용된다.
   - 시간복잡도는 DFS와 같으며 주어진 맵전체를 탐색하며 한번 방문한 노드는 다시 한번 방문하지 않는다.
   - 때문에 만약 인접리스트로 이루어진 그래프 시간 복잡도는 O(V + E)이고 인접행렬의 경우 O(V^2)된다.
   - 참고로 가중치가 다른 그래프 내에서 최단거리 알고리즘은 다익스트라, 벨만포드 등을 써야된다.

    sudo code

    BFS(G, u)
    u.visited = 1
    q.push(u);
    while(q.size())
        u = q.front()
        q.pop()
        for each v ∈ G.Adj[u]
            if v.visited == 0
                v.visited = u.visited + 1
                q.push(v)

 시작지점인 u를 "방문처리"를 하고 "큐(queue)에 푸시"를 한다.
 q.size() 만큼 while 반복문을 돌면서 큐 앞단의 있는 u를 다시 끄집어내서 그 u를 중심으로 인접한 노드들을 탐색을 합니다.
 방문한 정점은 다시 방문하지 않고 방문처리를 하면서 큐(queue)에 푸시를 하며 방문처리를 합니다.

 최단거리 배열(visited)을 드는것.
 최단거리 배열을 만들면서 진행을 하면 레벨별 탐색이 가능하다.

 */

////그래프 탐색 BFS
//
//val dist = IntArray(6) { 0 }
//val visited = BooleanArray(6) { false }
//
//val queue: Queue<Int> = LinkedList()
//
//fun bfs(adjList: Array<MutableList<Int>>, s: Int) {
//
//    dist[s] = 1
//    visited[s] = true
//    queue.add(s)
//
//    while (queue.isNotEmpty()) {
//
//        val node = queue.poll()
//        println(node)
//
//        for (next in adjList[node]) {
//            if (!visited[next]) {
//                visited[next] = true
//                dist[next] = dist[node] + 1
//                queue.add(next)
//            }
//        }
//    }
//}
//
//fun main() {
//
//    val vNum = 6
//    val adjList = Array(vNum) { mutableListOf<Int>() }
//
//    adjList[1] = mutableListOf(2, 4)
//    adjList[2] = mutableListOf(1, 3)
//    adjList[3] = mutableListOf(2, 5)
//    adjList[4] = mutableListOf(1, 5)
//    adjList[5] = mutableListOf(3, 4)
//
//    bfs(adjList, 5)
//    println(visited.joinToString())
//    println(dist.joinToString())
//}

///*
// map 탐색 BFS
// 맵의 특정 위치는 y(row) x(col)로 좌표로 나타낸다.
// Pair<Int, Int> 또는 2개의 Int Type 파라미터를 필요로 한다.
// 아래 코드는 맵을 탐색하면서 연결된 덩어리 지역을 방문을 표기한다.
//*/
//
//val map = arrayOf (
//    arrayOf(1,0,1,1,1,1),
//    arrayOf(1,0,1,0,1,0),
//    arrayOf(1,0,1,0,1,1),
//    arrayOf(1,1,1,0,1,1)
//)
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//val rows = 4
//val cols = 6
//val dist = Array(rows) { IntArray(cols) { 0 } }
//
//val q: Queue<Pair<Int, Int>> = LinkedList()
//
//fun mBfs(p: Pair<Int, Int>) {
//
//    dist[p.first][p.second] = 1
//    q.add(p)
//
//    while (q.isNotEmpty()) {
//
//        val p = q.peek()
//        q.poll()
//
//        for (i in 0 until 4) {
//            val ny = p.first + dy[i]
//            val nx = p.second + dx[i]
//
//            // 맵을 벗어나면 안됨
//            if (ny !in 0 until map.size || nx !in 0 until map.first().size) continue
//            // 재방문은 허용되지 않음
//            if (dist[ny][nx] != 0) continue
//            // 길이 아니면 안됨
//            if (map[ny][nx] == 0) continue
//            dist[ny][nx] = dist[p.first][p.second] + 1
//            q.add(ny to nx)
//        }
//    }
//}
//
//fun main() {
//    mBfs(0 to 0)
//    dist.forEach {
//       println(it.joinToString())
//    }
//}
