package bac.week7

/*
   새로운 게임2

   구현.
   턴 한 번은 1번 말부터 K번 말까지 순서대로 이동시키는 것
   1부터 순서대로 →, ←, ↑, ↓의 의미
   "턴이 진행되던 중"에 말이 4개 이상 쌓이는 순간 게임이 종료된다.

    복잡한 구현 및 시뮬레이션의 경우 천천히 작성을 해야된다.
 */

//import java.util.Stack
//
//var n = 0
//var k = 0
//
//lateinit var map: Array<Array<Point>>
//val allPieces = mutableListOf<Piece>()
//
//val dy = arrayOf(0, 0, -1, 1)
//val dx = arrayOf(1, -1, 0, 0)
//
//data class Piece(val num: Int, var y: Int, var x: Int, var direction: Int)
//data class Point(val color: Int, val stack: Stack<Piece>)
//
//fun reverseDir(dir: Int): Int {
//    if (dir == 0) return 1
//    if (dir == 1) return 0
//    if (dir == 2) return 3
//    if (dir == 3) return 2
//    return -1000
//}
//
//fun move(piece: Piece) {
//
//    val ny = piece.y + dy[piece.direction]
//    val nx = piece.x + dx[piece.direction]
//
//    val nextPointColor =
//        if (ny < 0 || ny >= n || nx < 0 || nx >= n) {
//             2
//        } else{
//            map[ny][nx].color
//        }
//
//    when (nextPointColor) {
//        0 -> {
//            goWhite(piece, ny, nx)
//        }
//        1 -> {
//            goRed(piece, ny, nx)
//        }
//        2 -> {
//            goBlue(piece)
//        }
//    }
//}
//fun check(): Boolean {
//    for (i in 0 until map.size) {
//        for (j in 0 until map.first().size) {
//            if (map[i][j].stack.size >= 4)
//                return true
//        }
//    }
//    return false
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    k = info[1]
//
//    map = Array(n) { emptyArray() }
//    for (i in 0 until n) {
//        map[i] = readLine().split(" ").map { Point(color = it.toInt(), stack = Stack()) }.toTypedArray()
//    }
//
//    for (i in 0 until k) {
//        val info = readLine().split(" ").map { it.toInt() }
//        val y = info[0] - 1
//        val x = info[1] - 1
//        val d = info[2] - 1
//
//        val piece = Piece(num = i, y = y, x = x, direction = d)
//
//        allPieces.add(piece)
//        map[y][x].stack.add(piece)
//    }
//
//    var cnt = 0
//    outer@ while (true) {
//        cnt += 1
//        for (i in 0 until allPieces.size) {
//            move(allPieces[i])
//            // 진행중이라도 4개의 말이 겹친다면 즉시 종료된다.
//            if (check()) break@outer
//        }
//        if (cnt >= 1000) {
//            cnt = -1
//            break
//        }
//    }
//    println(cnt)
//    Unit
//}
//
//fun goWhite(piece: Piece, ny: Int, nx: Int) {
//    val tempList = mutableListOf<Piece>()
//    val preStack = map[piece.y][piece.x].stack
//
//    while (preStack.isNotEmpty()) {
//        if (preStack.peek().num == piece.num) {
//            tempList.add(preStack.pop())
//            break
//        } else {
//            tempList.add(preStack.pop())
//        }
//    }
//    tempList.forEach {
//        it.y = ny
//        it.x = nx
//    }
//    tempList.reverse()
//    map[ny][nx].stack.addAll(tempList)
//}
//
//fun goRed(piece: Piece, ny: Int, nx: Int) {
//    val tempList = mutableListOf<Piece>()
//    val preStack = map[piece.y][piece.x].stack
//
//    while (preStack.isNotEmpty()) {
//        if (preStack.peek().num == piece.num) {
//            tempList.add(preStack.pop())
//            break
//        } else {
//            tempList.add(preStack.pop())
//        }
//    }
//
//    tempList.forEach {
//        it.y = ny
//        it.x = nx
//    }
//
//    map[ny][nx].stack.addAll(tempList)
//}
//
//fun goBlue(piece: Piece) {
//
//    piece.direction = reverseDir(piece.direction)
//    val ny = piece.y + dy[piece.direction]
//    val nx = piece.x + dx[piece.direction]
//
//    if (ny < 0 || ny >= n || nx < 0 || nx >= n || map[ny][nx].color == 2) return
//    if (map[ny][nx].color == 0)
//        goWhite(piece, ny, nx)
//    else
//        goRed(piece, ny, nx)
//}
