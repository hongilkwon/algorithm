package bac.week8.concept

import kotlin.math.min


const val INF = 1_000_000_001
val originMinArr = arrayOf(5, 8, 4, 3, 7, 2, 1, 6)
lateinit var segmentTreeMin: Array<Int>

fun minTreeInit() {
    segmentTreeMin = Array(originMinArr.size * 2) { INF }

    for (i in 0 until originMinArr.size) {
        segmentTreeMin[i + originMinArr.size] = originMinArr[i]
    }

    for (i in originMinArr.size - 1 downTo 1) {
        segmentTreeMin[i] =
            if (segmentTreeMin[i * 2] > segmentTreeMin[(i * 2) + 1])
                segmentTreeMin[(i * 2) + 1]
            else
                segmentTreeMin[i * 2]
    }
    println("minSegmentTree: ${segmentTreeMin.joinToString(" ")}")
}

fun minTreeUpdate(idx: Int, value: Int) {

    originMinArr[idx] = value
    segmentTreeMin[idx + originMinArr.size] = value

    var i = idx + originMinArr.size
    while (i > 1) {
        i /= 2
        segmentTreeMin[i] =
            if (segmentTreeMin[i * 2] > segmentTreeMin[(i * 2) + 1])
                segmentTreeMin[(i * 2) + 1]
            else
                segmentTreeMin[i * 2]
    }
//    println(segmentTree.joinToString(" "))
}

fun treeQuery(start: Int, end: Int): Int {
    var l = start + originMinArr.size
    var r = end + originMinArr.size

    var ret = INF
    while (l <= r) {
        if (l % 2 == 1) {
            ret = min(ret, segmentTreeMin[l])
            l += 1
        }
        if (r % 2 == 0) {
            ret = min(ret, segmentTreeMin[r])
            r -= 1
        }
        l /= 2
        r /= 2
    }
    return ret
}
