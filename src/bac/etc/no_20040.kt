package bac.etc

/*
    사이클 게임

    점의 개수 n과 m 번째 차례
    정수 3 ≤ n ≤ 500,000 과 진행된 차례의 수를 나타내는 정수 3 ≤ m ≤ 1,000,000

    사이클의 존재여부 -> 유니온 파인드.


 */


//var n = 0
//var m = 0
//
//lateinit var arr: IntArray
//
//fun getParent(n: Int): Int =
//    if (n == arr[n]) {
//        n
//    } else {
//        arr[n] = getParent(arr[n])
//        arr[n]
//    }
//
//fun union(a: Int, b: Int) {
//
//    val pa = getParent(a)
//    val pb = getParent(b)
//
//    if (pa < pb) {
//        arr[pb] = arr[pa]
//    } else {
//        arr[pa] = arr[pb]
//    }
//}
//
//fun find(a: Int, b: Int) = (getParent(a) == getParent(b))
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    arr = IntArray(n + 1) { it }
//
//    var answer = 0
//    for (i in 1..m) {
//        val edge = readLine().split(" ").map { it.toInt() }
//        val u = edge[0]
//        val v = edge[1]
//
//        if (find(u, v)) {
//            answer = i
//            break
//        } else {
//            union(u, v)
//        }
//    }
//
//    println(answer)
//    return@with Unit
//}
