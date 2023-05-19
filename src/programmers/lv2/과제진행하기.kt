package programmers.lv2

import java.util.Stack

/*
    과제 진행하기.

    작할 시각이 되었을 때, 기존에 진행 중이던 과제가 있다면 진행 중이던 과제를 멈추고 새로운 과제를 시작
    과제를 끝냈을 때, 잠시 멈춘 과제가 있다면, 멈춰둔 과제를 이어서 진행
    새로 시작하는 과제 > 최근에 멈춘 과제

    과제를 끝낸 순서대로 이름을 배열에 담아


    3 ≤ plans의 길이 ≤ 1,000
    plans의 원소는 [name, start, playtime]의 구조로 이루어져 있습니다.

    name : 과제의 이름을 의미합니다.
    2 ≤ name의 길이 ≤ 10
    name은 알파벳 소문자로만 이루어져 있습니다.
    name이 중복되는 원소는 없습니다.

    start : 과제의 시작 시각을 나타냅니다.
    "hh:mm"의 형태로 "00:00" ~ "23:59" 사이의 시간값만 들어가 있습니다.
    모든 과제의 시작 시각은 달라서 겹칠 일이 없습니다.
    과제는 "00:00" ... "23:59" 순으로 시작하면 됩니다. 즉, 시와 분의 값이 작을수록 더 빨리 시작한 과제입니다.

    playtime : 과제를 마치는데 걸리는 시간을 의미하며, 단위는 분입니다.
    1 ≤ playtime ≤ 100
    playtime은 0으로 시작하지 않습니다.
    배열은 시간순으로 정렬되어 있지 않을 수 있습니다.
    진행중이던 과제가 끝나는 시각과 새로운 과제를 시작해야하는 시각이 같은 경우 진행중이던 과제는 끝난 것으로 판단합니다.


    1. 시간의 단위를 통일한다.
    2. 정렬한다.
    3. stack 이용하여 구현한다!

    단순구현문제이지만, 로직이 조금 까다로운면이 있다.
    또한, 시간을 반복하게 되면, 0 .. 10_000

    1000개의 plan 만약 전부 stack에 들어가서 남은시간을 가지고 있다면, 그부분을 해결하기위함인데,
    시간을 순회하기보단, plans 자체를 순회하는 로직으로 수정하는 구현이 좀더 옳아 보인다.



 */

//data class Plan(val name: String, val startTime: Int, var playTime: Int, var remainingTime: Int)
//
//fun transFormTime(timeStr: String): Int {
//    val temp = timeStr.split(':')
//    return temp[0].toInt() * 60 + temp[1].toInt()
//}
//
//fun solution(plans: Array<Array<String>>): Array<String> {
//    var answer: Array<String> = arrayOf()
//
//    val plansList = mutableListOf<Plan>()
//    for (plan in plans) {
//        val element = Plan(
//            name = plan[0],
//            startTime = transFormTime(plan[1]),
//            playTime = plan[2].toInt(),
//            remainingTime = plan[2].toInt()
//        )
//        plansList.add(element)
//    }
//    plansList.sortBy { it.startTime }
//
//    val stack = Stack<Plan>()
//    var currentPlan: Plan? = null
//
//    val temp = mutableListOf<String>()
//    for (time in 0..10_000) {
//        if (currentPlan?.remainingTime == 0) {
//            temp.add(currentPlan.name)
//            currentPlan = null
//        }
//
//        val newPlan = plansList.find { it.startTime == time }
//        if (newPlan != null){
//            if (currentPlan != null)
//                stack.add(currentPlan)
//            currentPlan = newPlan
//        }else{
//            if (currentPlan == null && stack.isNotEmpty()){
//                currentPlan = stack.pop()
//            }
//        }
//
//        if (currentPlan != null){
//            currentPlan.remainingTime = currentPlan.remainingTime - 1
//        }
//    }
//    answer = temp.toTypedArray()
//    return answer
//}