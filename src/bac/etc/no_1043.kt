package bac.etc


/*
    거짓말

    문제를 이해하는데 시간이 조금 걸린다.

    진실을 아는 사람이 파티에 오면 ---> 지민 진실만 이야기함
    "누군가 진실을 아는 사람과 파티에 참여하면, 진실을 알게된다"

    지민이는 모든 파티에 참가해야 한다
    지민이가 거짓말쟁이로 알려지지 않으면서, 과장된 이야기를 할 수 있는 파티 개수의 최댓값

    사람의 수 1 <= N <= 50
    파티의 개수 1 <= M <= 50
    진실을 아는 사람의 수는 0 이상 50 이하의 정수, 각 파티마다 오는 사람의 수는 1 이상 50 이하의 정수

    6 5
    1 6
    2 4 5
    2 1 2
    2 2 3
    2 3 4
    2 5 6

    union-find
    파티에서 진실을 전파하고, 다시 파티를 점검한다는

 */

//var n = 0
//var m = 0
//
//const val TRUE_KNOW = 0
//
//lateinit var arr: IntArray
//lateinit var partyArr: Array<IntArray>
//
///*
//    재귀적으로 해당 idx의 집합 대표값을 찾아서
//    변경하고, 반환함.
// */
//
//fun searchParent(n: Int): Int =
//    if (arr[n] == n)
//        n
//    else {
//        arr[n] = searchParent(arr[n])
//        arr[n]
//    }
//
///*
//    각 원소의 대표값을 찾아서 변경하여 하나의 집합으로 표현해준다.
// */
//fun union(a: Int, b: Int) {
//
//    val parentA = searchParent(a)
//    val parentB = searchParent(b)
//
//    if (parentA < parentB) {
//        arr[parentB] = parentA
//    } else {
//        arr[parentA] = parentB
//    }
//}
//
///*
//    두 원소가 같은 대표값을 가지는지 확인 한다.
// */
//fun find(a: Int, b: Int): Boolean =
//    searchParent(a) == searchParent(b)
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    n = info[0]
//    m = info[1]
//
//    arr = IntArray(n + 1) { it }
//
//    val known = readLine().split(" ").map { it.toInt() }
//    if (known[0] == 0) {
//        println(m)
//        return@with
//    } else {
//        for (i in 1..known[0])
//            union(TRUE_KNOW, known[i])
//    }
//
//    for (i in 1..known[0]) {
//        arr[known[i]] = TRUE_KNOW
//    }
//
//    partyArr = Array(m) { intArrayOf() }
//    for (i in 0 until m) {
//        val partyInfo = readLine().split(" ").map { it.toInt() }
//        partyArr[i] = partyInfo.filterIndexed { index, _ -> index != 0 }.toIntArray()
//
//        for (j in 0 until partyArr[i].size - 1) {
//            union(partyArr[i][j], partyArr[i][j + 1])
//        }
//    }
//
//    var cnt = 0
//    for (party in partyArr) {
//        if (searchParent(party[0]) == TRUE_KNOW)
//            continue
//        cnt += 1
//    }
//
//    println(cnt)
//    return@with Unit
//}