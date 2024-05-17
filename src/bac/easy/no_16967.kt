package bac.easy


/*
   배열 복원하기

   사고과정

   문제를 읽고 예시를 보면서 한번더 정확히 이해한다.

   - 각 배열의 원소는 (x, y)만큼 이동한다
   - 겹쳐지는 부분을 파악한다.

   어떻게 하면 원본 배열을 복원할 수 있을까???
   ->  겹치는 부분은
   B[i][j] = A[i][j] + A[i-X][j-Y]
   A[i][j] = B[i][j] - A[i-X][j-Y]

   배울점.
   문제를 잘 읽고 이해하면 구현하는건 어렵지 않은 문제이다.

*/


//var h = 0
//var w = 0
//var x = 0
//var y = 0
//
//lateinit var b: Array<IntArray>
//lateinit var a: Array<IntArray>
//
//lateinit var check: Array<CharArray>
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    h = info[0]
//    w = info[1]
//    x = info[2]
//    y = info[3]
//
//    b = Array(h + x) {
//        readLine().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    check = Array(h + x) { CharArray(w + y) { 'x' } }
//
//    for (i in 0 until h) {
//        for (j in 0 until w) {
//            check[i][j] = 'a'
//        }
//    }
//    for (i in x until h + x) {
//        for (j in y until w + y) {
//            if (check[i][j] == 'a')
//                check[i][j] = '@'
//            if (check[i][j] == 'x')
//                check[i][j] = 'b'
//        }
//    }
//
////    check.forEach { println(it.joinToString(" ")) }
//
//    a = Array(h) { IntArray(w) }
//    for (i in 0 until h){
//        for (j in 0 until w){
//            if (check[i][j]== 'a')
//                a[i][j] = b[i][j]
//            if (check[i][j]== '@')
//                a[i][j] = b[i][j] - a[i-x][j-y]
//        }
//    }
//
//    a.forEach { println(it.joinToString(" ")) }
//    return@with Unit
//}