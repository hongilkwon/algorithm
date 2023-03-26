package bac.week5

/*
  뱀

  보드의 상하좌우 끝에 벽이 있다.
  게임이 시작할때 뱀은 맨위 맨좌측에 위치하고 뱀의 길이는 1 이다.
  뱀은 처음에 오른쪽을 향한다.

  먼저 뱀은 몸길이를 늘려 머리를 다음칸에 위치시킨다.
  만약 이동한 칸에 사과가 있다면, 그 칸에 있던 사과가 없어지고 꼬리는 움직이지 않는다.
  만약 이동한 칸에 사과가 없다면, 몸길이를 줄여서 꼬리가 위치한 칸을 비워준다. 즉, 몸길이는 변하지 않는다.

  사과의 위치와 뱀의 이동경로가 주어질 때 이 게임이 몇 초에 끝나는지 계산
  뱀이 이리저리 기어다니다가 벽 또는 자기자신의 몸과 부딪히면 게임이 끝난다.

  구현 문제.

  1초뒤의 상황.

 */

//import java.util.*
//import kotlin.collections.ArrayDeque
//
//var n = 0
//var k = 0
//
//lateinit var map: Array<Array<Int>>
//
//var vSize = 0
//private lateinit var directionList: Queue<Pair<Int, Int>>
//
//// 뱀을 표시하는 자료구조.
//val deque = ArrayDeque<Pair<Int, Int>>()
//
//// 시계방향
//val dy = arrayOf(-1, 0, 1, 0)
//val dx = arrayOf(0, 1, 0, -1)
//
//var time = 0
//var direction = 1
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    k = readLine().toInt()
//
//    map = Array(n) { Array(n) { 0 } }
//
//    for (i in 0 until k) {
//        val info = readLine().split(" ").map { it.toInt() }
//        map[info[0] - 1][info[1] - 1] = 1
//    }
//
//    vSize = readLine().toInt()
//
//    directionList = LinkedList()
//    for (i in 0 until vSize) {
//        val info = readLine().split(" ").toTypedArray()
//        if (info[1] == "D") directionList.add(info[0].toInt() to 1)
//        else directionList.add(info[0].toInt() to 3)
//    }
//
////    map.forEach {
////        println(it.joinToString(" "))
////    }
////    println()
//
//    deque.addFirst(0 to 0)
//
//    while (true) {
//        // 1. 시간증가.
//        time += 1
//
//        // 2. 이동할 좌표 구하기
//        val point = deque.first()
//        val ny = point.first + dy[direction]
//        val nx = point.second + dx[direction]
//
//        // 3. check GameOver.
//        if (ny !in 0 until map.size || nx !in 0 until map.size || ny to nx in deque)
//            break
//
////        println("time: $time ny: $ny nx: $nx")
//
//        // 4-1. 사과여부로 분기처리
//        if (map[ny][nx] == 1){
//            map[ny][nx] = 0
//        }else{
//            deque.removeLast()
//        }
//
//        // 4-2 이동
//        deque.addFirst(ny to nx)
//
//        // 5. 방향 전환
//        if (directionList.isNotEmpty()){
//            if (time == directionList.peek().first){
//                direction = (direction + directionList.peek().second) % 4
//                directionList.poll()
//            }
//        }
//    }
//    println(time)
//}