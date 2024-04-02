package bac.easy


/*
   핑크빈 레이드
*/


//lateinit var yoon: IntArray
//lateinit var dalgu: IntArray
//lateinit var ponix: IntArray
//
//var hp = 0
//fun main() = with(System.`in`.bufferedReader()) {
//
//    yoon = readLine().split(" ").map { it.toInt() }.toIntArray()
//    dalgu = readLine().split(" ").map { it.toInt() }.toIntArray()
//    ponix = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//    hp = readLine().toInt()
//
//    var time = 0
//
//    while (hp > 0) {
//        if (time == 0) {
//            hp -= yoon[1] + dalgu[1] + ponix[1]
//        } else {
//            if (time % yoon[0] == 0) {
//                hp -= yoon[1]
//            }
//            if (time % dalgu[0] == 0) {
//                hp -= dalgu[1]
//            }
//            if (time % ponix[0] == 0) {
//                hp -= ponix[1]
//            }
//        }
//       time += 1
//    }
//   println(time - 1)
//    return@with Unit
//}