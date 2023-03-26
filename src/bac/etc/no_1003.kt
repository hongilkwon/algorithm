
/*

 피보나치 수열

*/


//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    val arr = Array(41) { 0 }
//    arr[0] = 1
//    arr[1] = 1
//
//    for (i in 2..40) {
//        arr[i] = arr[i - 1] + arr[i - 2]
//    }
//
//    for (tc in 1..tc) {
//        val bac.week5.concept.getN = readLine().toInt()
//        if (bac.week5.concept.getN == 0) {
//            println("1 0")
//            continue
//        }
//        if (bac.week5.concept.getN == 1) {
//            println("0 1")
//            continue
//        }
//        println("${arr[bac.week5.concept.getN - 2]} ${arr[bac.week5.concept.getN - 1]}")
//    }
//}