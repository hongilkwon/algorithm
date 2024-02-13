package bac.easy

/*
    로프

    N (1 ≤ N ≤ 100_000)

    k개의 로프를 사용하여 중량이 w인 물체를 들어올릴 때,
    각각의 w/k의 중량이 걸린다.

    모든 로프를 사용해야 할 필요는 없으며,
    임의로 몇 개의 로프를 골라서 사용해도 된다.

    로프들을 이용하여 들어올릴 수 있는 물체의 "최대 중량"
    이 값은 10,000을 넘지 않는 자연수이

    무엇이 최대 무게를 결정하는가?
    선택한 로프중에 가장 작은놈 * 로프의 개수.

    정렬해서
 */

//var n = 0
//
//lateinit var arr: IntArray
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    arr = IntArray(n) { 0 }
//
//    for (i in 0 until arr.size) {
//        arr[i] = readLine().toInt()
//    }
//    arr.sortDescending()
//
//    var maxW = 0
//    for (i in 0 until arr.size) {
//        if (maxW <= arr[i] * (i + 1)){
//            maxW = arr[i] * (i + 1)
//        }
//    }
//
//    println(maxW)
//    return@with Unit
//}
