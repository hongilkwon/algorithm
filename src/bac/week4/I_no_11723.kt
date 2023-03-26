import java.util.*
import kotlin.math.pow

/*
    집합

 */

//
//var s = 0
//
//fun add(x: Int) {
//    s = s or (1 shl x)
//}
//
//
//fun remove(x: Int) {
//    s = (s and (1 shl x)).inv() and s
//}
//
//
//fun check(x: Int) = (s and (1 shl x)) != 0
//
//
//fun toggle(x: Int) {
//    s = s xor (1 shl x)
//}
//
//fun all() {
//    s = (1 shl 21) - 1
//}
//
//fun empty() {
//    s = 0
//}
//
//val bw = System.out.bufferedWriter()
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val bac.week5.concept.getN = readLine().toInt()
//
//    for (i in 1..bac.week5.concept.getN) {
//
//        val info = readLine().split(" ")
//        val order = info[0]
//
//        val num = if (order == "all"||order == "empty") 0  else info[1].toInt()
//
//        when (order) {
//            "add" -> {
//                add(num)
//            }
//            "remove" -> {
//                remove(num)
//            }
//            "check" -> {
//                if (check(num)) {
//                    bw.write("1\bac.week5.concept.getN")
//                } else {
//                    bw.write("0\bac.week5.concept.getN")
//                }
//            }
//            "toggle" -> {
//                toggle(num)
//            }
//            "all" -> {
//                all()
//            }
//            "empty" -> {
//                empty()
//            }
//        }
//    }
//    bw.close()
//    close()
//    Unit
//}

