package bac.etc

/*
    여행가자

    동혁이의 여행 계획에 속한 도시들이 순서대로 주어졌을 때 가능한지 여부를 판별

    플로이드 와샬/ 유니온 파인드/ bfs
    3가지 모두 풀이가 가능하다.

    1. 플로이드
    - n <= 200 노드가 400개이하 이기 때문에 충분히 가능하다.
    - 여행경로가 1개일때 yes이기 때문에 인접행렬의 대각선 요소를 모두 1로 변경한다.
    - 그리고 단순히 방문여부가 중요하기 때문에 방문 여부만 따져 인접행렬을 완화 한다.

    "같은 도시를 여러 번 방문하는 것도 가능하다."

 */


//var n = 0
//var m = 0
//
//lateinit var adjMatrix: Array<IntArray>
//lateinit var dist: Array<IntArray>
//
//lateinit var path: IntArray
//
//fun floyed(){
//
//    for (i in 0 until n){
//        for (j in 0 until n) {
//            if (i == j) adjMatrix[i][j] = 1
//        }
//    }
//
//    for (k in 0 until n) {
//        for (i in 0 until n) {
//            for (j in 0 until n) {
//                if (adjMatrix[i][k] == 1 && adjMatrix[k][j] == 1)
//                    adjMatrix[i][j] = 1
//            }
//        }
//    }
//}
//fun main() = with(System.`in`.bufferedReader()) {
//
//    var n = readLine().toInt()
//    var m = readLine().toInt()
//
//    adjMatrix = Array(n) { intArrayOf() }
//    for (i in 0 until n) {
//        adjMatrix[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    path = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    floyed()
////    adjMatrix.forEach { println(it.joinToString(" ")) }
//    var flag = true
//    for (i in 1 until path.size) {
//        val u = path[i - 1]
//        val v = path[i]
//        if (adjMatrix[u - 1][v - 1] != 1) {
//            flag = false
//            break
//        }
//    }
//
//    if (flag) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//    return@with Unit
//}
