package bac.easy

/*
    단어 정렬

    길이가 짧은 것부터
    길이가 같으면 사전 순으로
    단, 중복된 단어는 하나만 남기고 제거해야 한다.

 */


//var n = 0
//
//val set = mutableSetOf<String>()
//val list = mutableListOf<String>()
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//
//    for (i in 0 until n) {
//        val str = readLine()
//        if (set.contains(str))
//            continue
//        else {
//            set.add(str)
//            list.add(str)
//        }
//    }
//
//    list.sortWith(compareBy<String> { it.length }.thenBy { it })
//    list.forEach {
//        println(it)
//    }
//}