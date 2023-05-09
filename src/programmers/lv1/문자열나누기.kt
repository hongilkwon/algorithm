package programmers.lv1

/*
    문자열 나누기

    먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
    이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다.
    처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.

    s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.

    만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.

    단순구현문제.

    *일련의 순서를 구현할때, continue, break, init 등을 옳바른 순서로 구현해야되야 한다.
 */



//fun solution(s: String): Int {
//    var answer: Int = 0
//
//    var x = ' '
//    var cntX = 0
//    var cntOther = 0
//
//    val strList = mutableListOf<String>()
//    val sb = StringBuilder()
//    for (i in 0 until s.length) {
//
//        sb.append(s[i])
//        if (x == ' '){
//            x = s[i]
//            cntX += 1
//            continue
//        }
//
//        if (x == s[i]) {
//            cntX += 1
//        } else {
//            cntOther += 1
//        }
//
//        if (cntX == cntOther){
//            x = ' '
//            cntX = 0
//            cntOther = 0
//            strList.add(sb.toString())
//            sb.clear()
//        }
//    }
//
//    if (sb.isNotEmpty()){
//        strList.add(sb.toString())
//        sb.clear()
//    }
//
//    println(strList.joinToString())
//    return strList.size
//}