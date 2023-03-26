package bac.week3.concept


/*
컴백홈

dfs + 백트레킹 문제
집으로 가는 거리를 구해야 되는 문제라 넓이우선 탐색을 사용해야되는가 헷갈릴수 있다.
하지만 탐색의 경우를 직접생각을 해보면 level 단위의 탐색을 하면 안된다고 판단해야된다.

 */


//var rows = 0
//var cols = 0
//var cnt = 0
//
//lateinit var map: Array<CharArray>
//lateinit var visited: Array<IntArray>
//
//val dy = arrayOf(-1,0,1,0)
//val dx = arrayOf(0,1,0,-1)
//
//fun dfs(point: Pair<Int, Int>): Int{
//
//    if (visited[point.first][point.second] == cnt && point.first == 0 && point.second == (cols-1))
//        return 1
//
//    var result = 0
//
//    for (i in 0 until 4){
//        val ny = point.first + dy[i]
//        val nx = point.second + dx[i]
//
//        if (ny !in 0 until rows || nx !in 0 until cols) continue
//        if (visited[ny][nx] >= 1) continue
//        if (map[ny][nx] == 'T') continue
//
//        /* back Tracking */
//        visited[ny][nx] += visited[point.first][point.second] + 1
//        result += dfs(ny to nx)
//        visited[ny][nx] = 0
//    }
//
//    return result
//}
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()){
//
//    val info  = readLine().split(" ").map { it.toInt() }
//
//    rows = info[0]
//    cols = info[1]
//    cnt = info[2]
//
//
//    map = Array(rows){ charArrayOf() }
//    visited = Array(rows){ IntArray(cols){0} }
//
//    for (i in 0 until rows){
//        map[i] = readLine().toCharArray()
//    }
//
//    visited[rows-1][0] = 1
//    val ret = dfs(rows-1 to 0)
//
//    println(ret)
//}