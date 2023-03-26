package bac.week2.concept

import java.util.LinkedList
import java.util.Queue

/*
    이진트리 탐색.

    1.전위순회
    - 먼저 자신의 노드를 방문하고
    - 노드들을 왼쪽 오른쪽 순으로 방문하는 것
    - sudo code

    preorder( node )
        if (node.visited == false)
            node.visited = true
            preorder( node-> left )
            preorder( node-> right )

    2.중위순회
    - 왼쪽 노드를 먼저 방문
    - 자신의 노드를 방문
    - 마지막으로 오른쪽 노드를 방문하는 것
    - sudo code
    inorder( node )
        if (node.visited == false)
            inorder( node->left )
            node.visited = true
            inorder( node->right )

    3.후위순회
    - 자식들 노드를 방문(왼쪽, 오른쪽)이후 자신의 노드를 방문하는 것
    - sudo code

    postorder( node )
        if (node.visited == false)
            postorder( node->left )
            postorder( node->right )
            node.visited = true
    레벨순회
    - 트리를 bfs 탐색알고리즘으로 순회한다.
 */

//val adjList = MutableList(6) { mutableListOf<Int>() }
//var visited = IntArray(6) { 0 }
//
//fun preOrder(root: Int) {
//    if (visited[root] == 1) return
//
//    visited[root] = 1
//    print("$root ")
//
//    if (adjList[root].size == 1)
//        preOrder(adjList[root].first())
//
//    if (adjList[root].size == 2) {
//        preOrder(adjList[root].first())
//        preOrder(adjList[root].last())
//    }
//}
//
//fun inOrder(root: Int) {
//
//    if (visited[root] == 1) return
//
//    if (adjList[root].size == 0) {
//        visited[root] = 1
//        print("$root ")
//    }
//
//    if (adjList[root].size == 1) {
//        inOrder(adjList[root].first())
//        visited[root] = 1
//        print("$root ")
//    }
//
//    if (adjList[root].size == 2) {
//        inOrder(adjList[root].first())
//        visited[root] = 1
//        print("$root ")
//        inOrder(adjList[root].last())
//    }
//}
//
//fun postOrder(root: Int) {
//    if (visited[root] == 1) return
//
//    if (adjList[root].size == 1) {
//        postOrder(adjList[root].first())
//    }
//    if (adjList[root].size == 2) {
//        postOrder(adjList[root].first())
//        postOrder(adjList[root].last())
//    }
//    visited[root] = 1
//    print("$root ")
//}
//
////BFS
//val q: Queue<Int> = LinkedList()
//fun levelOrder(root: Int) {
//    visited[root] = 1
//    q.add(root)
//
//    while (q.isNotEmpty()) {
//        val root = q.peek()
//        q.poll()
//        print("$root ")
//        for (nr in adjList[root]) {
//            if (visited[nr] == 0) {
//                visited[nr] = 1
//                q.add(nr)
//            }
//        }
//    }
//}
//
//fun bac.week5.concept.main() {
//
//    adjList[1].add(2)
//    adjList[1].add(3)
//    adjList[2].add(4)
//    adjList[2].add(5)
//
//
//    val root = 1
//    println("preOrder")
//    preOrder(root)
//    println()
//
//    visited = IntArray(6) { 0 }
//    println("inOrder")
//    inOrder(root)
//    println()
//
//    visited = IntArray(6) { 0 }
//    println("postOrder")
//    postOrder(root)
//    println()
//
//    visited = IntArray(6) { 0 }
//    println("levelOrder")
//    levelOrder(root)
//    println()
//}