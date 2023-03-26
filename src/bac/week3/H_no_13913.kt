package bac.week3

/*
숨바꼭질4

+ 어떤 순서로 이동해야되는가.


val path = MutableList<MutableList<Int>>()

200_001 크기의 list 생성하니까 메모리가 부족했음.

path[np].add(np)
path[np].addAll(path[p])

최단거리를 가는데 지나친 모든 경로를 출력.

경로를 추적하는 배열을 만든다.

5 -> 4 -> 8 -> 16 -> 17

path[4] = 5
path[8] = 4
path[16] = 8
path[17] = 16

 */


//import java.util.LinkedList
//import java.util.Queue
//
//lateinit var visited: Array<Int>
//lateinit var pathList: Array<Int>
//
//fun bfs(point: Int) {
//
//    visited[point] = 1
//
//    val queue: Queue<Int> = LinkedList()
//    queue.add(point)
//
//    while (queue.isNotEmpty()) {
//
//        val p = queue.poll()
//
//        for (i in 0 until 3) {
//            val np =
//                when (i) {
//                    0 -> p - 1
//                    1 -> p + 1
//                    else -> p * 2
//                }
//
//            if (np !in 0..100_000) continue
//            if (visited[np] == 0){
//                visited[np] = visited[p] + 1
//                pathList[np] = p
//                queue.add(np)
//            }
//        }
//    }
//}
//
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    val su = info[0]
//    val bro = info[1]
//
//    visited = Array(200_001) { 0 }
//    pathList = Array(200_001){ 0 }
//
//    var answer = 0
//
//    if (su >= bro) {
//        answer = su - bro
//        println(answer)
//        for (i in su downTo bro)
//            print("$i ")
//    } else {
//        bfs(su)
//        answer= visited[bro] - 1
//        println(answer)
//
//        val temp = mutableListOf<Int>()
//        temp.add(bro)
//
//        var idx = bro
//        while (pathList[idx] != su){
//            temp.add(pathList[idx])
//            idx = pathList[idx]
//        }
//        temp.add(su)
//
//        temp.reverse()
//        println(temp.joinToString(" "))
//    }
//}