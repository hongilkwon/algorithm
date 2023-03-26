package bac.week1

/*
1-I
나는야 포켓몬 마스터 이다솜.

String

toIntOrNull
숫자로 변환가능한 string이면 변환해주고 안되면 null를 반환한다.


String 이 주어졌을떄 Int를 찾을때,
map<String, Int> -> O(log)
arr<String> -> O(bac.week5.concept.getN)

Int가 주어졌을때 String을 찾을때,
map<Int, String> -> O(log)
arr<String> -> O(1)

 */

fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toInt() }

    val pmNum = info[0]
    val quizNum = info[1]

    val pmList = MutableList(pmNum) {
        readLine().toString()
    }

    val pmMap = mutableMapOf<String, Int>()
    pmList.forEachIndexed { index, s ->
        pmMap[s]=index+1
    }

    val quizList = MutableList(quizNum) {
        readLine().toString()
    }

    // 10만 * 10만  = 100억
//    for (i in 0 until quizList.size) {
//        val answer =
//            if (quizList[i].toIntOrNull() == null) {
//                (pmList.indexOf(quizList[i])+1).toString()
//            } else {
//                pmList[quizList[i].toInt()-1]
//            }
//        println(answer)
//    }

    for (i in 0 until quizList.size) {
        val answer =
            if (quizList[i].toIntOrNull() == null) {
                pmMap[quizList[i]].toString()
            } else {
                pmList[quizList[i].toInt()-1]
            }
        println(answer)
    }
}