package bac.etc


/*
   텀 프로젝트(dfs,그래프,cycle)

    모든 학생들이 동일한 팀의 팀원인 경우와 같이 한 팀만 있을 수도 있다.
    모든 학생들은 프로젝트를 함께하고 싶은 학생을 선택해야 한다. (단, 단 한 명만 선택할 수 있다.)
    혼자 하고 싶어하는 학생은 자기 자신을 선택하는 것도 가능하다.

    프로젝트 팀에 속하지 못한 학생들의 수

    학생의 수가 정수 n (2 ≤ n ≤ 100,000)

    * 무방향 그래프에서 cycle 탐색 (union-find)
    * 방향 그래프에서 cycle 탐색 (dfs)

 */


//var n = 0
//lateinit var arr: IntArray
//
//lateinit var visited: IntArray
//lateinit var teams: IntArray
//
//var cnt = 0
//fun dfs(node: Int, maker: Int) {
//
//    visited[node] = 1
//    val next = arr[node]
//
//    if (visited[next] == 0) {
//        dfs(next, maker)
//    } else if (teams[next] == 0) {
//        if (node == next){
//            teams[node] = node
//            cnt += 1
//            return
//        }
//        var temp = next
//        while (temp != node) {
//            cnt += 1
//            temp = arr[temp]
//        }
//        cnt += 1
//    }
//
//    teams[node] = maker
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    repeat(tc) { _ ->
//        n = readLine().toInt()
//        arr = intArrayOf(0) + readLine().split(" ").map { it.toInt() }.toIntArray()
//
//        visited = IntArray(n + 1) { 0 }
//        teams = IntArray(n + 1) { 0 }
//
//        cnt = 0
//        for (i in 1..n) {
//            if (visited[i] == 0) {
//                dfs(i, i)
//            }
//        }
//
////        println("cnt $cnt")
////        println(teams.joinToString(" "))
//        println(n-cnt)
//    }
//
//    return@with Unit
//}