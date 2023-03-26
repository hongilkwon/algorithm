package bac.week4.concept

//
//fun fullCombi() {
//    val arr = arrayOf("사과", "딸기", "포도", "배")
//
//    for (i in 0 until (1 shl arr.size)) {
//        println("i: $i")
//        var result = ""
//        for (j in 0 until arr.size) {
//            if ((i and (1 shl j)) != 0) {
//                result += arr[j]
//            }
//        }
//        println(result)
//    }
//}
//
//
//val arr = arrayOf("사과", "딸기", "포도", "배")
//fun containSelected(idx: Int) {
//    var result = ""
//    for (j in 0 until arr.size) {
//        if ((idx and (1 shl j)) != 0) {
//            result += arr[j]
//        }
//    }
//    println(result)
//
//}
//
//fun bac.week5.concept.main() {
//    // idx
//    // bac.week5.concept.getN = bac.week5.concept.getN or (1 shl idx)
//    for (i in 1 until arr.size) {
//        // 1 = {1,0,0,0}
//
//        /*
//        {1,1,0,0}
//        {1,0,1,0}
//        {1,0,0,1}
//        */
//
//        val num = 1 or (1 shl i)
//        containSelected(num)
//    }
//}