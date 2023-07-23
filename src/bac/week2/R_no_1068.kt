package bac.week2

/*

     트리
     * 사이클이 없는 연결 그래프이다.

     트리
     - 최상위 루트 노드가 중요하다.
     - 루트 노드에서 탐색을 시작하면, 반드시 다른 노드로 갈수있는 "1개의 경로"가 존재한다

     실제로 트리를 지운것을 생성하기에는 쉽지가 않다 ---> 삭제된 노드를 만나게 되면 트리를 지운다.

 */


//var n = 0
//lateinit var adjList: Array<MutableList<Int>>
//var root = 0
//var removed = 0
//
//lateinit var visited: IntArray
//
//fun dfs(idx: Int): Int {
//
//    visited[idx] = 1
//
//    if (idx == removed){
//        return 0
//    }
//
//    if (adjList[idx].isEmpty()) {
//        return 1
//    }
//
//    var child = 0
//    for (next in adjList[idx]) {
//        if (visited[next] == 1) continue
//
//        child += dfs(next)
//    }
//    // 자식이 하나도 없으면 자신이 리프노드다.
//    if (child == 0) return 1
//    return child
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    val parentInfo = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    adjList = Array(n) { mutableListOf() }
//    for (i in 0 until parentInfo.size) {
//        if (parentInfo[i] == -1) {
//            root = i
//        } else {
//            adjList[parentInfo[i]].add(i)
//        }
//    }
//    removed = readLine().toInt()
//
//    visited = IntArray(n) { 0 }
//    if (root == removed) {
//        println(0)
//    } else {
//        val leafCnt = dfs(root)
//        println(leafCnt)
//    }
//}

//fun dfs(node: Int): Int {
//    var ret = 0
//    var child = 0
//
//    for (newNode in adjList[node]) {
//        if (newNode == removed) continue
//        ret += dfs(newNode)
//        child += 1
//    }
//    if (child == 0) return 1
//    return ret
//}