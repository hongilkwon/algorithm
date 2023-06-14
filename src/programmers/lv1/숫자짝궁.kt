package programmers.lv1

/*
    숫자짝궁

    3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
    X, Y는 0으로 시작하지 않습니다.
    X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.


    *3백만 2중 반복문 하면 문제가 시간초과

 */


//fun countNum(num: String): Array<Int> {
//    val cntArr = Array(10) { 0 }
//
//    for (i in 0 until num.length) {
//        val idx = num[i].digitToInt()
//        cntArr[idx] += 1
//    }
//
//    return cntArr
//}
//
//fun solution(X: String, Y: String): String {
//    var answer: String = ""
//
//    val arrX = countNum(X)
//    val arrY = countNum(Y)
//
//    val JJack = Array(10) { 0 }
//
//    for (i in 0 until JJack.size) {
//
//        if (arrX[i] == 0 || arrY[i] == 0) continue
//        if (arrX[i] > arrY[i]) {
//            JJack[i] = arrY[i]
//        } else {
//            JJack[i] = arrX[i]
//        }
//    }
//
//    if (JJack.all { it == 0 }) return "-1"
//
//    var isZero = true
//    for (i in 1 until JJack.size ){
//        if (JJack[i] != 0)
//            isZero = false
//    }
//
//    if (isZero) return "0"
//    val sb = StringBuilder()
//    for (i in JJack.size - 1 downTo 0) {
//        repeat(JJack[i]) {
//            sb.append(i)
//        }
//    }
//    answer = sb.toString()
//    return answer
//}