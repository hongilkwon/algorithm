package bac.week6.concept

//fun binarySearch(arr: Array<Int>, key: Int): Int {
//    var left = 0
//    var right = arr.lastIndex
//
//    while (left <= right) {
//        val mid = (left + right) / 2
//        if (arr[mid] < key) {
//            left = mid + 1
//        } else if (arr[mid] > key) {
//            right = mid - 1
//        } else {
//            return mid
//        }
//    }
//    return -1
//}

/*
    lower_bound
    key 보다 "크거나 같은 값" 중 가장 처음 나오는 index
 */

//fun lowerBound(arr: Array<Int>, start: Int = 0, end: Int = arr.size, key: Int): Int {
//    var left = start
//    var right = end
//
//    while (left < right) {
//        val mid = (left + right) / 2
//
//        if (arr[mid] >= key) {
//            right = mid
//        } else {
//            left = mid + 1
//        }
//    }
//    return right
//}
//
///*
//    upper_bound
//    key 보다 "큰 값"이 가장 처음 나오는 index
// */
//
//fun upperBound(arr: Array<Int>, start: Int = 0, end: Int = arr.size, key: Int): Int {
//    var left = start
//    var right = end
//
//    while (left < right) {
//        val mid = (left + right) / 2
//
//        if (arr[mid] > key) {
//            right = mid
//        } else {
//            left = mid + 1
//        }
//    }
//    return right
//}
//
//fun main() {
//    val arr = arrayOf(1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5)
//
//    println(lowerBound(arr, key= 4))
//    println(upperBound(arr, key= 2))
//}
