package sorting.basic

import kotlin.math.min

/*
    선택 정렬.

    "가장 작은것" 선택하여 앞으로 이동 시킨다.
    직관적이고, 구현이 쉽다.
    비효율적이다.

    시간복잡도 O(N^2)
 */

//val arr = intArrayOf(1, 10, 5, 3, 2, 4, 7, 9, 8, 6)
//
//fun swap(a: Int, b: Int) {
//    val temp = arr[a]
//    arr[a] = arr[b]
//    arr[b] = temp
//}
//
//fun selectionSort() {
//    for (i in 0 until arr.size) {
//        // 가장 작은것 찾음.
//        var selectedIdx = i
//        for (j in i until arr.size) {
//            if (arr[selectedIdx] > arr[j]) {
//                selectedIdx = j
//            }
//        }
//        // 교환.
//        swap(i, selectedIdx)
//    }
//}
//
//fun main() {
//    selectionSort()
//    println(arr.joinToString(" "))
//}