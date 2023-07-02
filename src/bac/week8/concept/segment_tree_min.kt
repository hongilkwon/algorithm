package bac.week8.concept


//const val INF = 1_000_000_000
//val originMinArr = arrayOf(5, 8, 4, 3, 7, 2, 1, 6)
//val segmentTreeMin = Array(16) { INF }
//
//fun minTreeInit() {
//    val offSet = segmentTreeMin.size / 2
//
//    for (i in 0 until originMinArr.size) {
//        segmentTreeMin[i + offSet] = originMinArr[i]
//    }
//
//    for (i in segmentTreeMax.size - 1 downTo 2) {
//        val parentIdx = i / 2
//        if (segmentTreeMin[parentIdx] > segmentTreeMin[i]) {
//            segmentTreeMin[parentIdx] = segmentTreeMin[i]
//        }
//    }
//    println("minSegmentTree: ${segmentTreeMin.joinToString(" ")}")
//}
