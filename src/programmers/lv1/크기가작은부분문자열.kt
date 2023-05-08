package programmers.lv1

/*
    크기가 작은 부분 문자

    1 ≤ p의 길이 ≤ 18

    p의 길이 ≤ t의 길이 ≤ 10,000

    t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.

    *String 으로 숫자를 다룰때는 반드시 Int(21억 6천을 넘는 숫자를 반드시 고려해야된다.)

 */

//fun solution(t: String, p: String): Int {
//    var answer: Int = 0
//
//    val size = p.length
//
//    val numList = mutableListOf<String>()
//    val sb = StringBuilder()
//    for (i in 0 .. t.length - size){
//        repeat(size){
//            sb.append(t[i+it])
//        }
//        numList.add(sb.toString())
//        sb.clear()
//    }
//
//    println(numList.joinToString(" "))
//    answer = numList.count {
//        it.toLong() <= p.toLong()
//    }
//    return answer
//}

