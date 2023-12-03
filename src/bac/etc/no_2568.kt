package bac.etc

/*
    전깃줄2

    없애야 하는 전깃줄의 최소 개수를 구하는 프로그램
 */


//var n = 0
//val arr = Array(500_001) { 0 }
//val lis = mutableListOf<Pair<Int, Int>>()
//
//fun lowerBound(key: Int): Int {
//    var left = 0
//    var right = lis.size
//
//    while (left < right) {
//        val mid = (left + right) / 2
//
//        if (lis[mid].second >= key) {
//            right = mid
//        } else {
//            left = mid + 1
//        }
//    }
//    return right
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//    n = readLine().toInt()
//
//    for (i in 0 until n) {
//        val info = readLine().split(" ").map { it.toInt() }
//        arr[info[0]] = info[1]
//        // 첫번째 전기줄을 포함 시켜 줍니다.
//        if (i == 0) {
//            lis.add(info[0] to info[1])
//        }
//    }
//
//    if (arr.filter { it != 0 }.size == 1){
//        println(1)
//        return@with
//    }
//
//    for (i in 1 until arr.size) {
//        // 전깃줄이 연결되지 않은 상태이기에 넘어갑니다.
//        if (arr[i] == 0) continue
//
//        // 현재까지 구해진 LIS의 마지막 값보다 크다면 넣어주면 LIS 조건을 위배 하지 않습니다.
//        if (arr[i] > lis.last().second) {
//            lis.add(i to arr[i])
//        } else {
//            // 그렇지 않다면, "같거다 큰" idx를 찾습니다.
//            // 그리고 갱신 합니다.
//            val idx = lowerBound(arr[i])
//            lis[idx] = i to arr[i]
//        }
//    }
//
//    println(lis)
//    val indice = lis.map { it.first }.toSet()
//    val allIndice = arr.mapIndexed { index, i -> if (i == 0) 0 else index }.toSet().minus(0)
//    val result = allIndice - indice
//    println(result.size)
//    result.sorted().forEach {
//        println(it)
//    }
//    Unit
//}

