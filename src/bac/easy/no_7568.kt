package bac.easy


/*
    덩치(idea-좋은문제)

    A 와 B의 덩치가 각각 (x, y), (p, q)라고 할 때 x > p 그리고 y > q 이라면 우리는 A의 덩치가 B의 덩치보다 "더 크다"고 말한다.
    자기보다 확실하게 큰놈을 세면됨다!

 */


//var n = 0
//lateinit var arr: Array<Pair<Int, Int>>
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//
//    arr = Array(n) { 0 to 0 }
//    for (i in 0 until arr.size) {
//        val info = readLine().split(" ").map { it.toInt() }
//        arr[i] = info[0] to info[1]
//    }
//
//    val ranks = mutableListOf<Int>()
//    for (i in 0 until arr.size){
//        var ranking = 1
//        val p = arr[i]
//        for (j in 0 until arr.size){
//            if (i == j) continue
//            if (arr[i].first < arr[j].first && arr[i].second < arr[j].second )
//                ranking +=1
//        }
//        ranks.add(ranking)
//    }
//
//    println(ranks.joinToString(" "))
//
//}