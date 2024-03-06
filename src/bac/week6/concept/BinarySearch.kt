package bac.week6.concept



/*
    arr --> 이진탐색을 하기위한 자료구조(정렬이 되어있다)
    key --> 찾으려고 하는 값
    반환값 --> arr에서 key값의 "index"
 */
//fun binarySearch(arr: Array<Int>, key: Int): Int {
//    var left = 0
//    var right = arr.lastIndex
//
//    while (left <= right) {
//        val mid = (left + right) / 2
//
//        if (arr[mid] > key) {
//            right = mid - 1
//        } else if (arr[mid] < key) {
//            left = mid + 1
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
//
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


///*
//    upper_bound
//    key 보다 "큰 값"이 가장 처음 나오는 index
// */
//
//fun upperBound(arr: Array<Int>, key: Int): Int {
//    var left = 0
//    var right = arr.size
//
//    while (left < right) {
//        val mid = (left + right) / 2
//        // arr[mid]가 key 보다 "큰 값"이면,
//        // 그것을 다음 상한선 right
//        if (arr[mid] > key) {
//            right = mid
//        } else {
//            left = mid + 1
//        }
//    }
//    return right
//}

//fun main() {
//    val arr = arrayOf(1, 3, 6)
//    println(lowerBound(arr, key = -1))
//}
