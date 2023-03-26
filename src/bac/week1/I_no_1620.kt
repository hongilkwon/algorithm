package bac.week1

/*
1-I
나는야 포켓몬 마스터 이다솜.

String

toIntOrNull
숫자로 변환 가능한 string 이면 변환해주고 불가능하다면, null 반환한다.

* counting에 유효한 자료구조의 탐색속도

String(key) 이 주어졌을떄, Int(value) 찾을때,
map<String, Int> -> O(log)

String(value) 이 주어졌을떄
arr<String> -> O(N)

Int(key) 주어졌을때 String(value) 찾을때,
map<Int, String> -> O(log)

Int(index) 주어졌을때
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
        pmMap[s] = index + 1
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
                pmList[quizList[i].toInt() - 1]
            }
        println(answer)
    }
}
