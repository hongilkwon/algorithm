package bac.week8

/*
    경찰차

    두 대의 경찰차들이 이동하는 거리의 합을 최소화 하도록 사건을 맡기려고 한다.
    두 사건이 발생한 위치가 같을 수 있다.

    dp 로 인식하기 쉽지 않았다.

 */

//import kotlin.math.*
//
//var n = 0
//var w = 0
//
//lateinit var map: Array<Array<Int>>
//
//val pointList = mutableListOf<Point>()
//
//data class Point(var y: Int, var x: Int)
//
//// 경찰차1 위치 경찰차2 위치
//lateinit var case: Array<Array<Int>>
//fun calDist(point1: Point, point2: Point): Int =
//    abs(point1.x - point2.x) + abs(point1.y - point2.y)
//
//fun go(car1: Int, car2: Int): Int {
//
//    if (car1 == pointList.size || car2 == pointList.size)
//        return 0
//
//    if (case[car1][car2] != -1) {
//        return case[car1][car2]
//    }
//    val nextPoint = max(car1, car2) + 1
//
//    var ret = 0
//    if (nextPoint < pointList.size) {
//        ret = min(
//            go(nextPoint, car2) + calDist(pointList[car1], pointList[nextPoint]),
//            go(car1, nextPoint) + calDist(pointList[car2], pointList[nextPoint])
//        )
//    }
//    case[car1][car2] = ret
//
//    return case[car1][car2]
//}
//
//fun trace(){
//    var car1 = 0
//    var car2 = 1
//    for (i in 2 until pointList.size) {
//        // 경찰차2 이동한 최소값 > 경찰차1 이동한 최소값
//        if(case[car1][i] + calDist(pointList[i], pointList[car2]) > case[i][car2] + calDist(pointList[i], pointList[car1])){
//            println(1)
//            car1 = i
//        }else{
//            println(2)
//            car2 = i
//        }
//    }
//    return
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    w = readLine().toInt()
//
//    map = Array(n) { Array(n) { 0 } }
//
//    pointList.add(Point(1, 1))
//    pointList.add(Point(n, n))
//    for (i in 1..w) {
//        val info = readLine().split(" ").map { it.toInt() }
//        pointList.add(Point(info[0], info[1]))
//    }
//
//    case = Array(pointList.size) { Array(pointList.size) { -1 } }
//
//    println(go(0,1))
//    trace()
//}