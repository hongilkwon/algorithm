package bac.etc


/*
   회의준비

   서로 알고 있는 사람은 반드시 같은 위원회에 속해야 한다.
   효율적인 회의 진행을 위해 위원회의 수는 최대가 되어야 한다.


    가장 적은 사람을 거치는 경로로 의견을 전달하며 이때 거치는 사람의 수를 참석자의 의사전달시간

    위원회의 수 K를 출력한다. 다음 K줄에는 각 위원회의 대표 번호를 작은 수부터 차례로 한 줄에 하나씩 출력한다.
    한 위원회의 대표가 될 수 있는 사람이 둘 이상일 경우 그중 한 명만 출력하면 된다.


    위원회에서 모든 참석자들의 "의사전달시간 중 최댓값"이 최소가 되도록 대표
     각 위원회의 대표 번호를 작은 수부터 차례로 한 줄에 하나씩 출력한다

*/


//import kotlin.math.min
//
//var n = 0
//var m = 0
//
//lateinit var adjList: Array<MutableList<Int>>
//
//const val INF = 1_000_000_000
//lateinit var adjMatrix: Array<IntArray>
//
//lateinit var visited: IntArray
//
//fun dfs(node: Int, list: MutableList<Int>) {
//
//    visited[node] = 1
//
//    for (next in adjList[node]) {
//        if (visited[next] == 0) {
//            list.add(next)
//            dfs(next, list)
//        }
//    }
//}
//
//fun floyd() {
//    for (k in 1 until adjMatrix.size) {
//        for (a in 1 until adjMatrix.size) {
//            for (b in 1 until adjMatrix.size) {
//                adjMatrix[a][b] = min(adjMatrix[a][b], adjMatrix[a][k] + adjMatrix[k][b])
//            }
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    m = readLine().toInt()
//
//    adjList = Array(n + 1) {
//        mutableListOf()
//    }
//
//    adjMatrix = Array(n + 1) { IntArray(n + 1) { INF } }
//    for (i in 1 until n + 1) {
//        for (j in 1 until n + 1) {
//            if (i == j) adjMatrix[i][j] = 0
//        }
//    }
//
//    for (i in 0 until m) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//        val v = edge[1]
//
//        adjList[u].add(v)
//        adjList[v].add(u)
//        adjMatrix[u][v] = 1
//        adjMatrix[v][u] = 1
//    }
//
//    // 집단을 구별한다.
//    visited = IntArray(n + 1) { 0 }
//    val components = mutableListOf<MutableList<Int>>()
//    for (i in 1 until n + 1) {
//        if (visited[i] == 0) {
//            val temp = mutableListOf<Int>()
//            temp.add(i)
//            dfs(i, temp)
////            println(temp.joinToString(" "))
//            components.add(temp)
//        }
//    }
//
//    //floyd
//    floyd()
//
//    val leaderList = mutableListOf<Int>()
//    for (group in components) {
//        var leader = 0
//        var min = (100 * 101) / 2
//
//        for (i in 0 until group.size) {
//            val dist = adjMatrix[group[i]]
//            val max = dist.maxOf { if (it < INF) it else 0 }
//            if (min > max) {
//                min = max
//                leader = group[i]
//            }
//        }
//        leaderList.add(leader)
//    }
//
//    println(components.size)
//    leaderList.sort()
//    leaderList.forEach {
//        println(it)
//    }
//
//    return@with Unit
//}

//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    m = readLine().toInt()
//
//    adjList = Array(n + 1) {
//        mutableListOf()
//    }
//    for (i in 0 until m) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//        val v = edge[1]
//
//        adjList[u].add(v)
//        adjList[v].add(u)
//    }
//
//    // 집단을 구별한다.
//    visited = IntArray(n + 1) { 0 }
//    val components = mutableListOf<MutableList<Int>>()
//    for (i in 1 until n + 1) {
//        if (visited[i] == 0) {
//            val temp = mutableListOf<Int>()
//            temp.add(i)
//            dfs(i, temp)
////            println(temp.joinToString(" "))
//            temp.sort()
//            components.add(temp)
//        }
//    }
//
//    val sb = StringBuilder()
//    sb.append("${components.size}\n")
//
//    for (group in components) {
//        val INF = 1000_000_000
//        val adjMatrix = Array(101) { IntArray(101) { INF } }
//
//        for (i in 0 until adjMatrix.size) {
//            for (j in 0 until adjMatrix.size) {
//                if (i == j) adjMatrix[i][j] = 0
//            }
//        }
//
//        for (node in group) {
//            for (next in adjList[node]) {
//                adjMatrix[node][next] = 1
//            }
//        }
//
//        //floyd
//        for (k in 1 until adjMatrix.size) {
//            for (a in 1 until adjMatrix.size) {
//                for (b in 1 until adjMatrix.size) {
//                    adjMatrix[a][b] = min(adjMatrix[a][b], adjMatrix[a][k] + adjMatrix[k][b])
//                }
//            }
//        }
//
//        // 의사전달 시간 가장 짧은 사람이 대표.
//        var leader = 0
//        var min = (100 * 101) / 2
//
//        for (i in 0 until group.size) {
//            val dist = adjMatrix[group[i]]
//            val max = dist.maxOf { if (it < INF) it else 0 }
//
//            if (min > max) {
//                min = max
//                leader = group[i]
//            }
//        }
//        sb.append("${leader}\n")
//    }
//    println(sb.toString())
//    return@with Unit
//}