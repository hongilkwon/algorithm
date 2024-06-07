package bac.etc


/*
   뉴스 전하기(그래프 탐색 + dp)

   회사는 트리 구조

   모든 직원은 정확하게 "한 명"의 직속 상사가 있다.
   자기자신은 그들 자기 자신의 직접 또는 간접 상사가 아니고,(자기 자신이 자신의 상사나 부하가 될 수 없고, 사이클이 없다)

   모든 직원은 민식이의 직접 또는 간접적인 부하이다. --> 루트가 민식이다.

   "한 번에 한 사람"씩 전화를 한다
   모든 사람은 자신의 직속 부하에게만 전화를 걸 수 있고, 전화는 정확하게 1분 걸린다.
   1<= N <= 50

   모든 소식을 전하는데 걸리는 시간의 최솟값을 출력

   사고과정

   - 트리의 깊이별로 탐색???? 레벨별로 탐색????
   - 어떻게 탐색을 하던...한 번에 한 사람씩 전화를 하기 때문에 탐색을 하는것 자체로 최소 시간을 구할순 없다.

   - 어떤 부하부터 전화할 것인가??? 하위 전파시간이 긴 부하직원부터 전파해야됨

   (부하직원의 전파에 소모하는 시간) + 나는 몇번째 부하 직원인가?

*/


//var n = 0
//
//lateinit var adjList: Array<MutableList<Int>>
//
//
//fun dfs(node: Int): Int {
//    // 자식이 없다면,
//    if (adjList[node].isEmpty()) {
//        return 0
//    }
//
//    val temp = mutableListOf<Int>()
//
//    for (i in adjList[node]) {
//        val time = dfs(i)
//        temp.add(time)
//    }
//    val childTimes = temp.sortedDescending().mapIndexed { idx, v -> v + (idx+1) }
////    println("node: $node, childTimes: $childTimes")
//    return childTimes.maxOrNull()!!
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    adjList = Array(n + 1) { mutableListOf() }
//
//    val temp = readLine().split(" ").map { it.toInt() }
//    for (i in 0 until temp.size) {
//        if (temp[i] < 0) continue
//        val u = temp[i]
//        val v = i
//        adjList[u].add(v)
//    }
//
//    println(dfs(0))
//    return@with Unit
//}