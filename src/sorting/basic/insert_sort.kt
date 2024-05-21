package sorting.basic

/*
    삽입 정렬(꺼내서 앞으로 삽입)

    자신보다 "앞에 정렬"된 원소들 사이에 적절한 위치에 삽입하여 정렬한다.

    "필요할때만, swap이 일어난다"

    앞쪽부터 정렬이 일어난다.

    선택, 버블, 삽입 셋다 O(N^2) 시간복잡도를 가지지만,
    이 셋중에서 가장 연산이 적기 때문에 효율적이다.

    * 이미 데이터가 정렬이 많이 진행되어 있는 상태라면, 매우 좋은 성능을 보여준다.
 */


//val arr = intArrayOf(10, 1, 5, 3, 2, 4, 7, 9, 8, 6)
//
//fun swap(a: Int, b: Int) {
//    val temp = arr[a]
//    arr[a] = arr[b]
//    arr[b] = temp
//}
//
//fun insertSort() {
//
//    for (i in 1 until arr.size) {
//        var j = i
//        while (arr[j - 1] > arr[j]) {
//            swap(j - 1, j)
//            j -= 1
//            if (j <= 0) break
//        }
//    }
//}
//
//fun main() {
//    insertSort()
//    println(arr.joinToString(" "))
//}