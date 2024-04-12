package bac.easy


/*
   잃어버린 괄호(그리디, greedy)

   괄호를 적절히 쳐서 이 식의 값을 최소

   식의 길이는 50보다 작거나 같다.

   1. 완전탐색

   V 55 V - V 50 V + V 40 V
   여는 괄호 및 닫는 괄호 어떻게 넣어야 수식이 될지 모름.
   몇개의 괄호들이 추가 될지도 모름.

   2. 최소값이 된다??->>> 음수 이후로 나오는 양수를 최대한 몰아서 괄호를 친다.
   새로운 음수 가나올때 까지
   즉  - (num1 + num2 + num3 .. )

*/


//var expression = ""
//fun main() = with(System.`in`.bufferedReader()) {
//
//    expression = readLine().toString()
//
//    val expList = expression.split("-")
//
//    var answer = 0
//    for (i in 0 until expList.size) {
//
//        if (expList[i].isEmpty()) continue
//
//        if (i == 0) {
//            val temp = expList[i].split("+")
//            answer += temp.sumOf { it.toInt() }
//        } else {
//            val temp = expList[i].split("+")
//            answer -= temp.sumOf { it.toInt() }
//        }
//    }
//
//    println(answer)
//
//    return@with Unit
//}