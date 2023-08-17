package sorting

/*
    퀵 정렬

     기준키(피벗)를 기준으로
     작거나 같은 값을 지닌 데이터는 앞으로, 큰 값을 지닌 데이터는 뒤로 가도록 한다.

     재귀적 방법을 이용하여 구현한다.

     평균적인 시간복잡도는 O(N * logN)
     최약의 경우(이미 모든값이 정렬이 되어 있다면) O(N^2)

 */

//val arr = intArrayOf(10, 1, 5, 3, 2, 4, 7, 9, 8, 6)
//
//fun swap(a: Int, b: Int) {
//    val temp = arr[a]
//    arr[a] = arr[b]
//    arr[b] = temp
//}
//
//fun quickSort(start: Int, end: Int) {
//    // 파티션 원소 개수가 1개일 경우.
//    if (start >= end) return
//
//    val pivot = start
//    var l = start + 1
//    var r = end
//
//    while (l <= r) {
//        while (l <= end && arr[l] <= arr[pivot]) { // pivot 보다 큰 idx 찾기
//            l += 1
//        }
//        while (r > start && arr[r] >= arr[pivot]) { // pivot 보다 작은 idx 찾기
//            r -= 1
//        }
//
//        // 자리 바꾸기.
//        if (l > r) {
//            swap(pivot, r)
//        } else {
//            swap(l, r)
//        }
//    }
//
//    quickSort(start, r - 1)
//    quickSort(r + 1, end)
//}
//
//fun main() {
//
//    quickSort(0, arr.lastIndex)
//    println(arr.joinToString(" "))
//}