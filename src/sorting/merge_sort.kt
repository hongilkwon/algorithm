package sorting

/*
    병합 정렬

    "반으로 나누고 시작"
    "나중에 합치면서 정렬함"

    시간복잡도는 O(N * logN)을 항 상 보장

 */


//val arr = intArrayOf(10, 1, 5, 3, 2, 4, 7, 9, 8, 6, 5)
//val sortedArr = IntArray(arr.size) { 0 }
//
//fun merge(m: Int, middle: Int, n: Int) {
//
//    var i = m
//    var j = middle + 1
//    var k = m
//
//    // 비교하면서 정렬된 배열에 넣기.
//    while (i <= middle && j <= n) {
//        if (arr[i] <= arr[j]) {
//            sortedArr[k] = arr[i]
//            i += 1
//        } else {
//            sortedArr[k] = arr[j]
//            j += 1
//        }
//        k += 1
//    }
//
//    // 비교하고 남은 데이터도 넣어주기.
//    if (i > middle) {
//        for (idx in j..n) {
//            sortedArr[k] = arr[idx]
//            k += 1
//        }
//    }
//
//    if (j > n) {
//        for (idx in i..middle) {
//            sortedArr[k] = arr[idx]
//            k += 1
//        }
//    }
//
//    //원본 배열로 값을 복사
//    for (idx in m..n) {
//        arr[idx] = sortedArr[idx]
//    }
//}
//
//fun mergeSort(m: Int, n: Int) {
//    if (m < n) {
//        val middle = (m + n) / 2
//        mergeSort(m, middle)
//        mergeSort(middle + 1, n)
//        merge(m, middle, n)
//    }
//}
//
//fun main() {
//    mergeSort(0, arr.lastIndex)
//    println(arr.joinToString(" "))
//}