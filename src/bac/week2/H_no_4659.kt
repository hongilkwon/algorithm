package bac.week2

/*
    2-H
    비밀번호 발음하기.

    문제의 구현 조건에 따라서 필터링 하는 문제.

    일단 모두 성공으로 두고 하나라도 실패한다면,
    여러개의 조건을 확인하면서 검증을 끝낸다.

 */

//fun main() = with(System.`in`.bufferedReader()) {
//
//    val ja =
//        arrayOf('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z')
//    val mo = arrayOf('a', 'e', 'i', 'o', 'u')
//
//    val flag = true
//    while (flag) {
//
//        val password = readLine().toString()
//        if (password == "end"){
//            break
//        }
//
//        var firstCondition = true
//        var secondCondition = true
//        var thirdCondition = true
//
//        //first
//        for (i in 0 until password.length){
//           if (mo.contains(password[i])){
//               firstCondition = true
//               break
//           }
//            firstCondition = false
//        }
//
//        // second
//        if (password.length >= 3) {
//            for (i in 0 until password.length - 2) {
//                if (password[i] in ja && password[i + 1] in ja && password[i + 2] in ja)
//                    secondCondition = false
//                if (password[i] in mo && password[i + 1] in mo && password[i + 2] in mo)
//                    secondCondition = false
//            }
//        }
//
//        //third
//        if (password.length >= 2) {
//            for (i in 0 until password.length - 1) {
//                if (password[i] == password[i + 1]) {
//                    if (password[i] in arrayOf('e', 'o'))
//                        continue
//                    else
//                        thirdCondition = false
//                }
//            }
//        }
//
//        if (firstCondition&&secondCondition&&thirdCondition){
//            println("<$password> is acceptable.")
//        }else{
//            println("<$password> is not acceptable.")
//        }
//    }
//}