package bac.etc


/*
   회전초밥(기존 + 슬라이딩 윈도우 + hash)

   2 ≤ N ≤ 3_000_000,
   2 ≤ d ≤ 3_000,
   2 ≤ k ≤ 3_000 (k ≤ N), 1 ≤ c ≤ d


   시간복잡도를 위해 hash를 사용.

   kotlin mutableMap(hashmap)
    put O(1)
    get O(1)
    containsKey : O(1)
    *containValue O(n)
    remove O(1)
*/

//import kotlin.math.max
//
//var n = 0
//var d = 0
//var k = 0
//var c = 0
//
//lateinit var arr: IntArray
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    d = info[1]
//    k = info[2]
//    c = info[3]
//
//    arr = IntArray(n) { 0 }
//    for (i in 0 until n) {
//        arr[i] = readLine().toInt()
//    }
//
//    // 쿠폰은 무조건 1
//    val window = mutableMapOf<Int, Int>()
//    for (i in 0 until k) {
//        if (window.containsKey(arr[i]))
//            window[arr[i]] = window[arr[i]]!! + 1
//        else
//            window[arr[i]] = 1
//    }
////    println(window)
//
//    var maxSushi = window.size
//    for (i in 1 until n) {
//
//        val (pre, post) = if (i <= n - k) {
//            arr[i - 1] to arr[i + k - 1]
//
//        } else {
//            arr[i - 1] to arr[((i + k) % n) - 1]
//        }
//
//        if ((window[pre]!! - 1) == 0)
//            window.remove(pre)
//        else
//            window[pre] = window[pre]!! - 1
//
//        if (window.containsKey(post))
//            window[post] = window[post]!! + 1
//        else
//            window[post] = 1
//
//        // 쿠폰으로 받는 추가 초밥
//        if (window.containsKey(c))
//            window[c] = window[c]!! + 1
//        else
//            window[c] = 1
//        maxSushi = max(maxSushi, window.size)
//    }
//
//    println(maxSushi)
//    return@with Unit
//}