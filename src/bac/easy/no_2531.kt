package bac.easy

/*
   회전초밥
    초밥의 종류를 번호로 표현
    벨트 위에는 같은 종류의 초밥이 둘 이상 있을 수 있다.

    1. 벨트의 임의의 한 위치부터 k개의 접시를 연속해서 먹을 경우 할인된 정액 가격으로 제공한다.

    2. 각 고객에게 초밥의 종류 하나가 쓰인 쿠폰을 발행하고, 1번 행사에 참가할 경우 이 쿠폰에 적혀진 종류의 초밥 하나를 추가로 무료로 제공

    접시 갯수 2 ≤ N ≤ 30_000,
    초밥 종류 2 ≤ d ≤ 3,000

    연속으로 먹는 갯수 2 ≤ k ≤ 3,000 (k ≤ N),
    쿠폰번호 초밥 1 ≤ c ≤ d이다.


    * 쿠폰을 고려하지 않고, 즉 연속으로 안먹는 경우도 고려한다??????
    --> 위 할인 행사에 참여하여 가능한 한 다양한 종류의 초밥을 먹으려고 한다

6 20 5 1
1
10
1
20
1
30
1
40
1
50

    먹을 수 있는 초밥의 가짓수의 최댓값
*/

import kotlin.math.max

var n = 0
var d = 0
var k = 0
var c = 0

lateinit var arr: IntArray

var maxSusi = 0
fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toInt() }
    n = info[0]
    d = info[1]
    k = info[2]
    c = info[3]

    arr = IntArray(n) { 0 }
    for (i in 0 until n) {
        arr[i] = readLine().toInt()
    }

//    println(arr.joinToString(" "))

    var set = mutableSetOf<Int>()
    for (i in 0 until n) {
        var temp = emptyArray<Int>()

        if (i <= n - k) {
            temp = arr.copyOfRange(i, i + k).toTypedArray()
            set.addAll(temp)
        } else {
            temp = arr.copyOfRange(i, n).toTypedArray() + arr.copyOfRange(0, (i + k) % n).toTypedArray()
            set.addAll(temp)
        }
//        println(temp.joinToString(" "))
        set.add(c)
        maxSusi = max(maxSusi, set.size)
        set.clear()
    }

    println(maxSusi)
    return@with Unit
}

//var n = 0
//var d = 0
//var k = 0
//var c = 0
//
//lateinit var susiNumArr: IntArray
//lateinit var adjList: Array<MutableList<Int>>
//
//var maxSusiType = 0
//
//val set = mutableSetOf<Int>()
//fun go(node: Int, cnt: Int) {
//
//    if (cnt == 0) {
//        set.add(c)
//        maxSusiType = max(maxSusiType, set.size)
//        return
//    }
//
//    set.add(susiNumArr[node])
//
//    val next = adjList[node].first()
//    go(next, cnt - 1)
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    d = info[1]
//    k = info[2]
//    c = info[3]
//
//    adjList = Array(n) { mutableListOf() }
//    for (i in 0 until n) {
//        if (i == n - 1) {
//            adjList[i].add(0)
//        } else {
//            adjList[i].add(i + 1)
//        }
//    }
//
//    val allSusiType = mutableSetOf<Int>()
//
//    susiNumArr = IntArray(n) { 0 }
//    for (i in 0 until n) {
//        val susi = readLine().toInt()
//        susiNumArr[i] = susi
//        allSusiType.add(susi)
//    }
//
//    for (i in 0 until n) {
//        set.clear()
//        go(i, k)
//    }
//
//    if (allSusiType.size >= k) {
//        maxSusiType = max(k, maxSusiType)
//    }
//
//    println(maxSusiType)
//    return@with Unit
//}
