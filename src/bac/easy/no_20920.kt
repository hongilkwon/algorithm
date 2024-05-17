package bac.easy


/*
   영단어 암기는 어려워(정렬, 문자열,string)

   자주 나오는 단어일수록 앞에 배치한다.
   해당 단어의 길이가 길수록 앞에 배치한다.
   알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다

    1 <= n <= 100_000
    1 <= m <= 10

    사고과정
    어렵지 않은 문제이며, 단순히 정렬 조건을 여러개지만
    comparator를 직접 작성만 할줄 알면 쉽게 해결가능하다.

    배울점.
    1.
    val cmp = Comparator<String> { o1, o2 ->
    return@Comparator if (o1>o2) {
        -1
    } else if (cntMap[o1]!! < cntMap[o2]!!) {
        1
    } else {
        0
    }
    2. 카운팅 맵을 만들때 merge()를 사용하면 매우 빠르다.
    cntMap.merge(str, 1, Integer::sum)
}

*/

//var n = 0
//var m = 0
//
//lateinit var arr: Array<String>
//
//val cntMap = mutableMapOf<String, Int>()
//
//val br = System.out.bufferedWriter()
//
//val cmp = Comparator<String> { o1, o2 ->
//    return@Comparator if (cntMap[o1]!! > cntMap[o2]!!) {
//        -1
//    } else if (cntMap[o1]!! < cntMap[o2]!!) {
//        1
//    } else {
//        if (o1.length > o2.length) {
//            -1
//        } else if (o1.length < o2.length) {
//            1
//        } else {
//            o1.compareTo(o2)
//        }
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    arr = Array(n) {
//        readLine().toString()
//    }
//
//    for (i in 0 until arr.size) {
//        val str = arr[i]
//        if (str.length >= m)
//            cntMap.merge(str, 1, Integer::sum)
//    }
//
//    val answer = cntMap.keys.toList().sortedWith(cmp)
//
//    val sb = StringBuilder()
//    answer.forEach {
//        sb.append("$it\n")
//    }
//    br.write(sb.toString())
//    br.flush()
//    br.close()
//
//    return@with Unit
//}