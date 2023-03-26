
import kotlin.math.max


/*
    종이 조각

    너무 어려움
    기본적인 아이디어 및 접근조차 하지 못함.

    다음 연결이 가로면 1
    다음 연결이 세로면 0

 */


//var bac.week5.concept.getN = 0
//var m = 0
//
//var answer = 0
//lateinit var map: Array<Array<Int>>
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    bac.week5.concept.getN = info[0]
//    m = info[1]
//
//    map = Array(bac.week5.concept.getN) { Array(m) { 0 } }
//
//    for (i in 0 until  bac.week5.concept.getN){
//        val line = readLine().map { it.toString().toInt() }.toTypedArray()
//        map[i] = line
//    }
//
////    map.forEach { println(it.joinToString(" ")) }
//
//    for(s in 0 until (1 shl bac.week5.concept.getN * m )){
//
//        var sum = 0
//
//        for(i in 0 until bac.week5.concept.getN){
//            var temp = 0
//            for(j in 0 until m){
//                val bac.week5.concept.getK = (i * m) + j
//                if (s and (1 shl bac.week5.concept.getK) == 0) {
//                    temp = temp * 10 + map[i][j]
//                } else {
//                    sum += temp
//                    temp = 0
//                }
//            }
//            sum += temp
//        }
//
//        for(j in 0 until m){
//            var temp = 0
//            for(i in 0 until bac.week5.concept.getN){
//                val bac.week5.concept.getK = (i * m) + j
//                if (s and (1 shl bac.week5.concept.getK) != 0) {
//                    temp = temp * 10 + map[i][j]
//                } else {
//                    sum += temp
//                    temp = 0
//                }
//            }
//            sum += temp
//        }
//        answer = max(answer, sum)
//    }
//    println(answer)
//    Unit
//}

