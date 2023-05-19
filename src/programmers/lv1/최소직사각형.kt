package programmers.lv1

/*
  최소직사각형
 */


//fun solution(sizes: Array<IntArray>): Int {
//    var answer: Int = 0
//
//    val w = mutableListOf<Int>()
//    val h = mutableListOf<Int>()
//
//    for (i in 0 until sizes.size){
//        if (sizes[i][0] > sizes[i][1]){
//            w.add(sizes[i][0])
//            h.add(sizes[i][1])
//        }else{
//            w.add(sizes[i][1])
//            h.add(sizes[i][0])
//        }
//    }
//
//    answer = w.maxOrNull()!! * h.maxOrNull()!!
//    return answer
//}