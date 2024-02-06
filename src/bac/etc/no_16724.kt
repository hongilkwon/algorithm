package bac.etc


/*
    피리부는 사나이(그래프 응용, cycle),
    dfs, union find
    각 칸마다 정해진 방향이 있다.
    설정해 놓은 방향을 분석해서 최소 개수의 ‘SAFE ZONE’을 만들려 한다.

    지도밖으로 나가는 입력은 주어지지 않는다.-> 반드시 사이클이 형성되거나

    -> 각 노드 마다 1개의 간선을 가진다(칸마다 정해진 방향)
    -> 순환구조(cycle)마다 1개의 SAFE ZONE을 만들면 됨

 */


//var n = 0
//var m = 0
//
//lateinit var map: Array<CharArray>
//
//lateinit var visited: Array<IntArray>
//
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//var cycleCnt = 0
//fun dfs(node: Pair<Int, Int>) {
//
//    visited[node.first][node.second] = 1
////    visited.forEach {
////        println(it.joinToString(" "))
////    }
////    println()
//    val dir = getDir(node)
//    val ny = node.first + dy[dir]
//    val nx = node.second + dx[dir]
//
//    if (visited[ny][nx] == 0) {
//        dfs(ny to nx)
//    } else if (visited[ny][nx] == 1) {
//        // 다음에 방문할 노드가 이미 방문 되었다면, cycle 발생
//        cycleCnt += 1
//    }
//    // cycle을 발견하고, 재귀가 끝나고 나오면서 전부 visited를 2로 바꿈.
//    visited[node.first][node.second] = 2
//}
//
//fun getDir(node: Pair<Int, Int>) =
//    when (map[node.first][node.second]) {
//        'U' -> {
//            0
//        }
//
//        'R' -> {
//            1
//        }
//
//        'D' -> {
//            2
//        }
//
//        'L' -> {
//            3
//        }
//
//        else -> {
//            -1
//        }
//    }
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    map = Array(n) {
//        readLine().toCharArray()
//    }
//
//    visited = Array(n) { IntArray(m) { 0 } }
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            if (visited[i][j] == 0)
//                dfs(i to j)
//        }
//    }
//    println(cycleCnt)
//
//    return@with Unit
//}
