package bac.week5

/*
  원판 돌리기

  원판의 회전은 독립적으로 이루어진다.
  원판의 회전 방법은 미리 정해져 있고, i번째 회전할때 사용하는 변수는 xi, di, ki 이다.

   */

var n = 0
var m = 0
var t = 0

lateinit var map: Array<Array<Int>>
val rotateList = mutableListOf<Triple<Int, Int, Int>>()

val dy = arrayOf(-1, 0, 1, 0)
val dx = arrayOf(0, 1, 0, -1)

fun rClockWise(arr: Array<Int>) {
    val temp = arr.last()
    for (i in arr.size - 1 downTo 1) {
        arr[i] = arr[i - 1]
    }
    arr[0] = temp
}

fun rInverseClockWise(arr: Array<Int>) {
    val temp = arr.first()
    for (i in 0..arr.size - 2) {
        arr[i] = arr[i + 1]
    }
    arr[arr.size - 1] = temp
}

fun check() {

}

fun main() = with(System.`in`.bufferedReader()) {

    val info = readLine().split(" ").map { it.toInt() }
    n = info[0]
    m = info[1]
    t = info[2]

    map = Array(n) { emptyArray() }
    for (i in 0 until n) {
        map[i] = readLine().split(" ").map { it.toInt() }.toTypedArray()
    }
//    map.forEach { println(it.joinToString( " ")) }

    for (i in 0 until t) {
        val rInfo = readLine().split(" ").map { it.toInt() }.toTypedArray()
        rotateList.add(Triple(rInfo[0], rInfo[1], rInfo[2]))
    }
//   println(rotateList.joinToString( " "))

    for (i in 0 until rotateList.size) {
        val info = rotateList[i]

        val diskList = mutableListOf<Int>()
        var temp = info.first
        var idx = 1
        while (n >= temp) {
            diskList.add(temp)
            idx += 1
            temp = (info.first) * idx
        }
//        println(diskList.joinToString( " "))

        for (idx in 0 until diskList.size) {
            repeat(info.third) {
                if (info.second == 0) {
                    rClockWise(map[diskList[idx] - 1])
                } else {
                    rInverseClockWise(map[diskList[idx] - 1])
                }
            }
        }
//        map.forEach { println(it.joinToString(" ")) }

        check()
    }
    Unit
}

