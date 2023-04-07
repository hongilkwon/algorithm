package bac.week2.concept

/*
 * 2.DFS 깊이우선 탐색
 *  특정한 노드에서 가장 멀리 있는 노드를 먼저 탐색하는 알고리즘
 *  주어진 맵/그래프 전체를 탐색한다.
 *  한 번 방문한 곳은 다시는 지나지 않는다.
 *
 *  정점 u의 visited 배열을 참으로 바꾸고 u로 부터 연결되어있는 v지점을 탐색합니다.
 *  이 때 방문되어있지 않은 노드에 대해 "재귀적"으로 DFS 호출합니다.
 *
 * sudo code
 *
 * DFS(G, u)
    u.visited = true
    for each v ∈ G.Adj[u]
        if v.visited == false
            DFS(G,v)
 *
 * 정점 u의 visited 를 참으로 바꾸고 u로 부터 연결되어있는 v지점을 탐색합니다.
 * 이 때 방문되어있지 않은 노드에 대해 "재귀적"으로 DFS를 호출
 *
 */

// 확인후 탐색
//fun dfs1(u:Int, v: Int) {
//    visited[u][v] = 1
//    for (newV in adjList[v]) {
//        val newU = v
//        if (visited[newU][newV]==1) continue
//        dfs1(newU, newV)
//    }
//}

// 탐색후 확인
//fun dfs2(u:Int, v: Int) {
//    if (visited[u][v] == 1) return
//    visited[u][v] = 1
//    for (newV in adjList[v]) {
//        val newU = v
//        dfs2(newU, newV)
//    }
//}


// 그래프 탐색 DFS

//private val vNum = 6
//val adj = Array(vNum) { mutableListOf<Int>() }
//val visited = Array(vNum) { 0 }
//
//fun dfs(g: Array<MutableList<Int>>, v: Int) {
//    println("v: $v")
//    visited[v] = 1
//    for (nv in adj[v]) {
//        if (visited[nv] == 1) continue
//        dfs(g, nv)
//    }
//}
//
//fun draw(){
//    adj[1].add(2)
//    adj[1].add(4)
//
//    adj[2].add(1)
//    adj[2].add(3)
//
//    adj[3].add(2)
//    adj[3].add(5)
//
//    adj[4].add(1)
//    adj[5].add(3)
//}
//fun main() {
//    draw()
//    dfs(adj, 1)
//    println(visited.joinToString())
//}

// 맵(2차원 배열) 탐색 DFS
// 맵의 특정 위치는 y(row) x(col)로 좌표로 나타낸다.
// Pair<Int, Int> 또는 2개의 Int Type 파라미터를 필요로 한다.
// 아래 코드는 맵을 탐색하면서 연결된 덩어리 지역을 방문을 표기한다.

//val map = arrayOf(
//    arrayOf(1, 0, 1, 0, 1),
//    arrayOf(1, 1, 0, 0, 1),
//    arrayOf(0, 0, 0, 1, 1),
//    arrayOf(0, 0, 0, 1, 1),
//    arrayOf(0, 1, 0, 0, 0),
//)
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(-0, 1, 0, -1)
//
//val rows = 5
//val cols = 5
//val visited = Array(rows) { IntArray(cols) { 0 } }
//
//fun mDfs(map: Array<Array<Int>>, p: Pair<Int, Int>) {
//    if (visited[p.first][p.second] == 1) return
//    visited[p.first][p.second] = 1
//
//    for (i in 0 until 4) {
//        val ny = p.first + dy[i]
//        val nx = p.second + dx[i]
//
//        if (ny !in 0..map.size || nx !in 0..map.first().size) continue
//        if(map[ny][nx] == 1 && visited[ny][nx] != 1){
//            mDfs(map,ny to nx)
//        }
//    }
//}
//
//fun main() {
//    var result = 0
//    for (i in 0 until  rows){
//        for (j in 0 until cols){
//            if (map[i][j]==1 && visited[i][j]!=1){
//                result += 1
//                mDfs(map, i to j)
//            }
//        }
//    }
//    visited.forEach { println(it.joinToString()) }
//    println(result)
//}
