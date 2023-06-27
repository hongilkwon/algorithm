package bac.week8

/*
    Messi Gimossi

    Messi -> 5

    Messi Gimossi -> (5,1,7) 13

    0123456789        18
    Messi Gimossi Messi -> (13, 1, 5) 19

    Messi Gimossi Messi Messi Gimossi

    Messi Gimossi Messi Messi Gimossi Messi Gimossi Messi

 */

//var m = 0
//
//val messiArr = Array(39) { 0 }
//fun main() = with(System.`in`.bufferedReader()) {
//
//    m = readLine().toInt()
//
//    messiArr[0] = 0
//    messiArr[1] = 5
//    messiArr[2] = 13
//
//    // 충분한 메시 배열을 만든다.
//    for (i in 3 until messiArr.size) {
//        messiArr[i] = messiArr[i - 2] + 1 + messiArr[i - 1]
//    }
//
//    // messiArr[2]의 개수만큼 제거 하거나 못한다면,
//    // 2가지 경우로 남는다.
//    // Messi Gimossi Messi
//    // Messi
//    for (i in messiArr.size - 1 downTo 2) {
//        if (m >= messiArr[i] + 1) {
//            // 공백까지 빼야 하니까 messiArr[i] + 1 뺀다.
//            m -= (messiArr[i] + 1)
//        }
//    }
//
//    val str = "Messi Gimossi"
//    if (m == 0 || m == 6) {
//        println("Messi Messi Gimossi")
//    } else {
//        println(str[m - 1])
//    }
//    Unit
//}
