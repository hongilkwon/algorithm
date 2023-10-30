package bac.week8.concept

/*

    Union-find (합집합 찾기)

    특정 원소(노드)가 어느 집합에 속하는 표현하고(Union)
    서로 다른 두 원소(두개의 노드)가 같은 집합에 있는지 확인한다(Find)

    여러 개의 노드가 존재할 때, 두 개의 노드를 선택 하여,
    서로 같은 그래프 속하는지 확인하는 알고리즘.

    3 3
    0 1 2
    0 1 3
    1 2 3
 */

//// 노드의 개수
//var n = 0
//var m = 0
//
//lateinit var arr: IntArray
//fun getParent(n: Int): Int =
//    if (arr[n] == n)
//        n
//    else {
//        arr[n] = getParent(arr[n])
//        arr[n]
//    }
//
//// 부모를 작은것으로 합침
//fun union(a: Int, b: Int) {
//    val aParent = getParent(a)
//    val bParent = getParent(b)
//
//    if (aParent < bParent) {
//        arr[bParent] = aParent
//    } else {
//        arr[aParent] = bParent
//    }
//}
//
//fun find(a: Int, b: Int): Boolean {
//    val aParent = getParent(a)
//    val bParent = getParent(b)
//    return aParent == bParent
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//
//    n = info[0]
//    m = info[1]
//
//    arr = IntArray(n + 1) { it }
////    println(arr.joinToString(" "))
//
//    for (i in 1..m) {
//        val calInfo = readLine().split(" ").map { it.toInt() }
//
//        val operation = calInfo[0]
//        val a = calInfo[1]
//        val b = calInfo[2]
//
//        if (operation == 0) {
//            union(a, b)
//        } else {
//            if (find(a, b)) println("YES") else println("NO")
//        }
//    }
//}
//
