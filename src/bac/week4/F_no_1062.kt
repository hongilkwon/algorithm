package bac.week4

/*
    가르침

    anta  tica

    a c i t n 기본 5개
    가르치는 글자 최소 5

    a c i t n

    anta rc tica  -> r
    anta hello tica -> h e l o
    anta car tica ->  r

    글자 r을 더 배우면, 2개의 단어 습득.

 */

//var max = Int.MAX_VALUE
//
//lateinit var words: Array<List<Char>>
//
//val unknown = mutableListOf(
//         'b',     'd', 'e',
//    'f', 'g', 'h',     'j',
//    'k', 'l', 'm',     'o',
//    'p', 'q', 'r', 's',
//    'u', 'v', 'w', 'x', 'y', 'z'
//)
//
//val known = mutableListOf('a', 'c', 'i', 't', 'n')
//
//fun go(known: List<Char>, words: Array<List<Char>> ){
//
//}
//
//fun modify(word: String): List<Char> {
//
//    val set = mutableSetOf<Char>()
//
//    word.forEach {
//        if (it !in known) {
//            set.add(it)
//        }
//    }
//    return set.toList()
//}
//
//fun combination(r: Int, start: Int = -1, resultList: MutableList<Int>){
//    // r 개만큼 결과에 담았으면 그만한다.
//    if (resultList.size == r){
//
//        return
//    }
//
//    for (idx in start+1 until unknown.size){
//        //idx 값을 뽑고 다 뽑지 않은 상태이기 떄문에 재귀호출
//        resultList.add(idx)
//        // 새로운 start 값이 idx 임이 중요하다
//        combination(r, idx, resultList)
//        // 원래 상태로 복구 시킨다
//        resultList.remove(idx)
//    }
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    val n = info[0]
//    val k = info[1] - 5
//
//    words = Array(n) {
//        val str = readLine().toString()
//        modify(str)
//    }
//
//    words.forEach {
//        println(it.joinToString(" "))
//    }
//
//    if (k >= 0){
//        println()
//    }else{
//
//    }
//}
