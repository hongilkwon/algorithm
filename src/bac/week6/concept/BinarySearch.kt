package bac.week6.concept

//fun binarySearch(arr: Array<Int>, k: Int): Int {
//    var left = 0
//    var right = arr.lastIndex
//
//    while (left <= right) {
//        val mid = (left + right) / 2
//        if (arr[mid] < k) {
//            left = mid + 1
//        } else if (arr[mid] > k) {
//            right = mid - 1
//        } else {
//            return mid
//        }
//    }
//    return -1
//}
//
//fun lowerBound(arr: Array<Int>, k: Int): Int {
//    var left = 0
//    var right = arr.lastIndex
//
//    if (arr.last() < k) return arr.size
//    if (arr.first() > k) return -1
//
//    while (left < right) {
//        val mid = (left + right) / 2
//
//        if (arr[mid] < k) {
//            left = mid + 1
//        } else {
//            right = mid
//        }
//    }
//    return left
//}
//
//fun upperBound(arr: Array<Int>, k: Int): Int {
//    var left = 0
//    var right = arr.lastIndex
//
//    if (arr.last() < k) return arr.size
//    if (arr.first() > k) return -1
//
//    while (left < right) {
//        val mid = (left + right) / 2
//
//        if (arr[mid] <= k) {
//            left = mid + 1
//        } else {
//            right = mid
//        }
//    }
//    return right
//}
//
//fun main() {
//
//    val arr = arrayOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5)
//
//    println(binarySearch(arr, 4))
//    println(lowerBound(arr, 4))
//    println(upperBound(arr, 4))
//}
