package bac.week8.concept


//val originSumArr = arrayOf(5, 8, 4, 3, 10, 2, 1, 6)
//
//lateinit var segmentTreeSum: Array<Int>
//
//fun sumTreeInit(size: Int) {
//
//    segmentTreeSum = Array(originSumArr.size * 2) { 0 }
//    // leaf node 채우기
//    for (i in 0 until originSumArr.size) {
//        segmentTreeSum[i + segmentTreeSum.size / 2] = originSumArr[i]
//    }
//    // parent node 채우기
//    for (i in (segmentTreeSum.size / 2) - 1 downTo 1)
//        segmentTreeSum[i] = segmentTreeSum[i * 2] + segmentTreeSum[(i * 2) + 1]
//    println("sumSegmentTree: ${segmentTreeSum.joinToString(" ")}")
//}
//
//
//fun sumTreeUpdate(idx: Int, value: Int) {
//    // 원본 변경
//    originSumArr[idx] = value
//    // 트리 변경
//    var treeIdx = idx + (segmentTreeSum.size / 2)
//    segmentTreeSum[treeIdx] = value
//    // 리프노드부터 조상노드들에 차이값을 더 해줌
//    while (treeIdx > 1) {
//        treeIdx /= 2
//        segmentTreeSum[treeIdx] = segmentTreeSum[treeIdx * 2] + segmentTreeSum[(treeIdx * 2) + 1]
//    }
//    println("sumSegmentTree: ${segmentTreeSum.joinToString(" ")}")
//}
//
//fun sumTreeQuery(startIdx: Int, endIdx: Int): Int {
//
//    var l = startIdx + (segmentTreeSum.size / 2)
//    var r = endIdx + (segmentTreeSum.size / 2)
//
//    var ret = 0
//    while (l <= r) {
//        if (l % 2 == 1) {
//            ret += segmentTreeSum[l]
//            l += 1
//        }
//        if (r % 2 == 0) {
//            ret += segmentTreeSum[r]
//            r -= 1
//        }
//        l /= 2
//        r /= 2
//    }
//    return ret
//}
//
//fun main() {
//    sumTreeInit(originSumArr.size)
//}