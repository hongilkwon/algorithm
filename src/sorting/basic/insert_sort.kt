package sorting.basic

/*
    삽입 정렬(꺼내서 앞으로 삽입)

    자신보다 "앞에 정렬"된 원소들 사이에 적절한 위치에 삽입하여 정렬한다.

    "필요할때만, swap이 일어난다"

    앞쪽부터 정렬이 일어난다.

    선택, 버블, 삽입 셋다 O(N^2) 시간복잡도를 가지지만,
    이 셋중에서 가장 연산이 적기 때문에 효율적이다.

    * 이미 데이터가 정렬이 많이 진행되어 있는 상태라면, 매우 좋은 성능을 보여준다.


     10, 1, 5, 3, 2, 4, 7, 9, 8, 6

    1 회차 1 10 5 3 2 4 7 9 8 6
    2 회차 1 5 10 3 2 4 7 9 8 6
    3 회차 1 3 5 10 2 4 7 9 8 6
    4 회차 1 2 3 5 10 4 7 9 8 6
    5 회차 1 2 3 4 5 10 7 9 8 6
    6 회차 1 2 3 4 5 7 10 9 8 6
    7 회차 1 2 3 4 5 7 9 10 8 6
    8 회차 1 2 3 4 5 7 8 9 10 6
    9 회차 1 2 3 4 5 6 7 8 9 10
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
//    for (i in 1 until arr.size) {
//        var j = i
//        // 자신의 앞에 숫자들 앞서야 된다면,
//        while (arr[j - 1] > arr[j]) {
//            swap(j - 1, j)
//            j -= 1
//            if (j <= 0) break
//        }
//        println("$i 회차 ${arr.joinToString(" ")}")
//    }
//}
//
//fun main() {
//    insertSort()
//    println(arr.joinToString(" "))
//}