package bac.etc

/*
    동전 0

    동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
    동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값

    N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다.
    (1 ≤ Ai ≤ 1_000_000, A1 = 1, i ≥ 2인 경우에 "Ai는 Ai-1의 배수")

    "Ai는 Ai-1의 배수" --> greedy
 */


//var n = 0
//var k = 0
//
//lateinit var arr: IntArray
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    k = info[1]
//
//    arr = IntArray(n) {
//        readLine().toInt()
//    }
//    arr.sortDescending()
//
//    var cnt = 0
//    for (coin in arr) {
//        while (k >= coin){
//            k -= coin
//            cnt += 1
//        }
//    }
//    println(cnt)
//}
