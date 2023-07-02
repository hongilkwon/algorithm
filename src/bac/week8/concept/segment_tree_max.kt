package bac.week8.concept

val originMaxArr = arrayOf(5, 8, 4, 3, 10, 2)
lateinit var segmentTreeMax: Array<Int>

fun maxTreeInit(size: Int) {

    segmentTreeMax = Array(size * 2) { 0 }

    val offSet = segmentTreeMax.size / 2

    for (i in 0 until size) {
        segmentTreeMax[i + offSet] = originMaxArr[i]
    }

    for (i in (segmentTreeMax.size / 2) - 1 downTo 1) {
        segmentTreeMax[i] =
            if (segmentTreeMax[i * 2] > segmentTreeMax[(i * 2) + 1]) segmentTreeMax[i * 2] else segmentTreeMax[(i * 2) + 1]

    }

    println("maxSegmentTree: ${segmentTreeMax.joinToString(" ")}")
}

fun main() {
    maxTreeInit(originMaxArr.size)
}