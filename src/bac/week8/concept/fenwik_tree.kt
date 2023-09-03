package bac.week8.concept


val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

lateinit var fwTree: Array<Int>

fun initFwTree() {

    fwTree = Array(arr.size + 1) { 0 }

    for (i in 0 until arr.size) {
        fwUpdate(i, arr[i])
    }
}

fun fwUpdate(idx: Int, value: Int) {
    val diff = value - arr[idx]

    var i = idx
    while (i < fwTree.size) {
        fwTree[i] += diff
        i += (i and -i)
    }
    arr[idx] = value
}

fun fwPrefixSum(idx: Int): Int {

    var i = idx
    var sum = 0
    while (i > 0) {
        sum += fwTree[i]
        i -= (i and -i)
    }
    return sum
}

fun fwIntervalSum(startIdx: Int, endIdx: Int): Int = fwPrefixSum(endIdx) - fwPrefixSum(startIdx-1)
