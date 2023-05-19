package bac.week2

/*
    NBA 농구
    2-L

    구현문제.

    1. preValue(여기서는 동점이 깨지는 순간의 시간)을 미리 저장한다는 아이디어,
    2. 시간등 단위의 작은 단위로 바꾸어서 계산한다.
    3. 함수를 통한 분할정복
    *4. 경기가 끝난후 마지막까지 이기고 있던 것에 대한 계산.

    * 골이라는 특별한 이벤트가 생겼을때, 그 이전의 값을 가지고 다음 값을 계산하는 패턴

    결과적으로 마지막 시각을 출력하는 것을 잘못하여 시간을 오래 소모하였다.
 */


//fun timeToStr(time: Int): String {
//    val min = time / 60
//    val second = time % 60
//
//    return if (10 > min) {
//        if (second == 0)
//            "0$min:$00"
//        else
//            "0$min:$second"
//    } else {
//        if (second == 0)
//            "$min:$00"
//        else
//            "$min:$second"
//    }
//}

//fun strToTime(str: String): Int {
//    val min = str.substring(0, 2).toInt()
//    val second = str.substring(3).toInt()
//    return (min * 60) + second
//}
//
//fun timeToStr(time: Int): String {
//    val m = "00" + (time / 60).toString()
//    val n = "00" + (time % 60).toString()
//    return m.substring(m.length - 2) + ":" + n.substring(n.length - 2)
//}
//
//fun plusTime(prevGoalTime: Int, goalTime: Int) = goalTime - prevGoalTime
//
//fun main() = with(System.`in`.bufferedReader()) {
//    val goalNum = readLine().toInt()
//
//    var winTime1 = 0
//    var winTime2 = 0
//
//    var goal1 = 0
//    var goal2 = 0
//
//    var prevGoalTime = 0
//    for (i in 1..goalNum+1) {
//
//        val info = readLine().split(" ")
//
//        // 새로운 골을 점수에 반영하기 전까지 누적된 시간을 할당해준다.
//        if (goal1 > goal2) {
//            winTime1 += plusTime(prevGoalTime, strToTime(info[1]))
//        } else if (goal1 < goal2) {
//            winTime2 += plusTime(prevGoalTime, strToTime(info[1]))
//        }
//
//        // 점수 계산.
//        if (info[0] == "1") goal1 += 1 else goal2 += 1
//
//        // 골을 넣시간 기록.
//        prevGoalTime = strToTime(info[1])
//
//    }
//
//    // 시합종료할때, 마지막 골을 기준으로 시간을 누적해야 된다.
//    if (goal1 > goal2) {
//        winTime1 += plusTime(prevGoalTime, strToTime("48:00"))
//    } else if (goal1 < goal2) {
//        winTime2 += plusTime(prevGoalTime, strToTime("48:00"))
//    }
//
//    println(timeToStr(winTime1))
//    println(timeToStr(winTime2))
//}
