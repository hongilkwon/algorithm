package sorting.basic

/*
    버블 정렬.

    바로 옆에 있는 값과 비교하여 작으면 앞으로 보낸다.
    -> 가장 큰값이 가장 뒤로 간다.

    직관적이고, 구현이 쉽다.

    가장 비효율적이다.

    시간복잡도 O(N^2)
    * 선택정렬과 동일한 복잡도를 가지지만, swap 함수자체가 매우 자주 일어나기 때문에 더 비효율적이다.
 */


//val arr = intArrayOf(1, 10, 5, 3, 2, 4, 7, 9, 8, 6)
//
//fun swap(a: Int, b: Int) {
//    val temp = arr[a]
//    arr[a] = arr[b]
//    arr[b] = temp
//}
//
//fun bubbleSort() {
//
//    for (i in 0 until arr.size) {
//        for (j in 0 until (arr.size - 1) - i) {
//            if (arr[j] > arr[j + 1]) {
//                swap(j, j + 1)
//            }
//        }
////        println(arr.joinToString(" "))
//    }
//}
//
//fun main() {
//    bubbleSort()
//    println(arr.joinToString(" "))
//}