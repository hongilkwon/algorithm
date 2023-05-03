package bac.week2

/*
    2-I 수학숙제

    Int 21억5천  10자리
    long 922경  19자리
    Int -> String 변환하여 해결한다.

    Char type 유용한함수.

    Char.isDigit()
    Char.isLetter()

    구현문제
 */

//val comparator = compareBy<String>({ it.length }, { it })
//
//fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {
//
//    val strNum = readLine().toInt()
//
//    val list = mutableListOf<String>()
//
//    for (i in 0 until strNum) {
//        val str = readLine().toString()
//        var numStr = ""
//        for (j in 0 until str.length) {
//            if (str[j].isDigit()) {
//                numStr += str[j]
//            } else {
//                if (numStr.isNotEmpty()) {
//                    list.add(numStr)
//                    numStr = ""
//                }
//            }
//            if (str.length - 1 == j) {
//                if (numStr.isNotEmpty()) {
//                    list.add(numStr)
//                    numStr = ""
//                }
//            }
//        }
//    }
//
//    val sortedList = list.map {str ->
//        if (str.all { it == '0' }) "0"
//        else{
//            val idx = str.indexOfFirst { it != '0' }
//            str.substring(idx)
//        }
//    }.sortedWith(comparator)
//
//    sortedList.forEach {
//        println(it)
//    }
//}