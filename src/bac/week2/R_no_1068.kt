package bac.week2

/*
 트리

 트리는 root 중요하다.

 시간날떄 반드시 다시 푼다.

 1. 탐색을 하지않는다.
 2. 실제로 지운 트리를 생성한다.

 */

//lateinit var adj: Array<MutableList<Int>>
//var root = 0
//var removed = 0

//fun treeDfs(node: Int): Int {
//
//    if (adj[node].isEmpty())
//        return 1
//
//    var leafCnt = 0
//
//    for (newNode in adj[node]) {
//        if (newNode == removed) continue
//        leafCnt += treeDfs(newNode)
//    }
//
//    return leafCnt
//}

//fun treeDfs(node: Int): Int {
//    var ret = 0
//    var child = 0
//
//    for (newNode in adj[node]) {
//        if (newNode == removed) continue
//        ret += treeDfs(newNode)
//        child += 1
//    }
//    if (child == 0) return 1
//    return ret
//}
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val bac.week5.concept.getN = readLine().toInt()
//    val parentInfo = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    adj = Array(bac.week5.concept.getN) { mutableListOf() }
//
//    for (i in 0 until parentInfo.size) {
//        if (parentInfo[i] == -1) {
//            root = i
//        } else {
//            adj[parentInfo[i]].add(i)
//        }
//    }
//
//    removed = readLine().toInt()
//
//    if (root == removed) {
//        println(0)
//    }else{
//        println(treeDfs(root))
//    }
//}

//fun treeDfs(node: Int) {
//
//    if (visited[node] == 1) {
//        return
//    }
//    visited[node] = 1
//
//    /*logic*/
//    if (adj[node].isEmpty()){
//        cnt += 1
//        return
//    }
//
//    for (newNode in adj[node]) {
//        treeDfs(newNode)
//    }
//    adj[node] = mutableListOf()
//}
