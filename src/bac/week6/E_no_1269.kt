package bac.week6

/*
   대칭 차집합

    공집합이 아닌 두 집합 A와 B
    각 집합의 원소의 개수는 200,000을 넘지 않으며, 모든 원소의 값은 100,000,000을 넘지 않는다.

    1<= n <= 200,000
   */


var nA = 0
lateinit var arrA: Array<Int>

var nB = 0
lateinit var arrB: Array<Int>


fun binarySearch(arr: Array<Int>, value: Int): Int {

    var left = 0
    var right = arr.lastIndex

    var mid = 0
    while (left <= right) {
        mid = (left + right) / 2

        if (value > arr[mid]) {
            left = mid + 1
        } else if (value < arr[mid]) {
            right = mid - 1
        } else {
            return mid
        }
    }
    return -1
}

fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toInt() }

    nA = info[0]
    nB = info[1]

    arrA = readLine().split(" ").map { it.toInt() }.toTypedArray()
    arrB = readLine().split(" ").map { it.toInt() }.toTypedArray()

//    집합 collection을 이용한 풀이.
//    val setA = arrA.toSet()
//    val setB = arrB.toSet()
//
//    val temp = (setA - setB) + (setB - setA)
//    println(temp.size)

    arrB.sort()
    var cnt = 0
    for (i in 0 until arrA.size) {
        val result = binarySearch(arrB, arrA[i])
        if (result != -1)
            cnt += 1
    }

    val answer = arrA.size + arrB.size - (cnt * 2)
    println(answer)
    Unit
}
