
/*

 피보나치 수열

*/


//fun main() = with(System.`in`.bufferedReader()) {
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
//        val n = readLine().toInt()
//        if (n == 0) {
//            println("1 0")
//            continue
//        }
//        if (n == 1) {
//            println("0 1")
//            continue
//        }
//        println("${arr[n - 2]} ${arr[n - 1]}")
//    }
//}