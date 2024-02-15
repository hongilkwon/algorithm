package bac.etc


/*
    암호 만들기(조합, 백트레킹)

    암호는 서로 다른 L개의 알파벳 소문자들로 구성되며,
    최소 한 개의 모음(a, e, i, o, u)과 최소 두 개의 자음으로 구성

    암호를 이루는 알파벳이 암호에서 증가하는 순서로 배열되었을 것

    암호로 사용했을 법한 문자의 종류는 C가지가 있다고 한다.
    알파벳을 입수한 민식, 영식 형제는 조교들의 방에 침투하기 위해 암호를 추측

    사전식으로 가능성 있는 암호를 모두 출력한다.

    모음(a, e, i, o, u)

    3 ≤ L ≤ C ≤ 15

    15 C 7

    15*14*13*12*11*10*9 / 7!
 */


//var l = 0
//var c = 0
//
//lateinit var arr: CharArray
//
//
//val mo = arrayOf('a', 'e', 'i', 'o', 'u')
//
//val answers = mutableListOf<String>()
//val result = mutableListOf<Int>()
//
//fun check(): Boolean {
//
//    var cntMo = 0
//    var cntJa = 0
//
//    for (i in result) {
//        if (arr[i] in mo) {
//            cntMo += 1
//        } else {
//            cntJa += 1
//        }
//    }
//
//    return (cntMo >= 1) && (cntJa >= 2)
//}
//
//fun combi(n: Int, r: Int, s: Int = 0) {
//
//    if (r == result.size) {
//        var str = ""
//        if (check()) {
//            for (i in result) {
//                str += arr[i]
//            }
//            answers.add(str)
//        }
//        return
//    }
//
//    for (i in s until n) {
//        result.add(i)
//        combi(n, r, i + 1)
//        result.removeLast()
//    }
//}
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    l = info[0]
//    c = info[1]
//
//    arr = readLine().replace(" ", "").toCharArray()
//    arr.sort()
//
//    combi(c, l)
//
//    val sb = StringBuilder()
//    answers.forEach {
//        sb.append("$it\n")
//    }
//    println(sb.toString())
//
//    return@with Unit
//}
