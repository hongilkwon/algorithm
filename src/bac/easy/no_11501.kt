package bac.easy


/*
    주식(greedy)

    1. 주식 하나를 산다.
    2. 원하는 만큼 가지고 있는 주식을 판다.
    3. 아무것도 안한다


    날 별로 주식의 가격을 알려주었을 때, 최대 이익이 얼마나 되는지 계산을 해달라고 부탁했다.


    날짜의 수 N(2 ≤ N ≤ 1_000_000)
    날 별 주가 10_000 이하

    10 7 6 15 16 14 15
    1 1 3 1 2

    "구입한 가격이후 가장 비쌀때 팔면된다 하지만, 가장 큰수가 탐색을 지속하다 보면 또 나온다?
    흠.... 여기서 "역방향으로 탐색"을 한다면 최소한 현재 최대값보다 큰값을 만나기 전까지는 가장 크다는 것을 보장함.

    부호있는 64bit(8byte) 정수형으로 표현 가능 -> Long Type
 */


//var n = 0
//lateinit var arr: IntArray
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val tc = readLine().toInt()
//
//    val sb = StringBuilder()
//    repeat(tc) {
//        n = readLine().toInt()
//        arr = readLine().split(" ").map { it.toInt() }.toIntArray()
//
//        var money = 0L
//        var prevMax = 0
//        for (i in arr.size - 1 downTo 0) {
//            if (prevMax < arr[i]) {
//                prevMax = arr[i]
//                continue
//            }
//            money += prevMax - arr[i]
//        }
//        sb.append("$money\n")
//    }
//    println(sb.toString())
//
//    return@with Unit
//}
