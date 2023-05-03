package bac


//fun solution(arr: IntArray): IntArray {
//    var answer = intArrayOf()
//
//    if (arr.size == 1) return intArrayOf(-1)
//
//    var minIdx = 0
//    var minValue = Int.MAX_VALUE
//
//    arr.forEachIndexed { index, value ->
//        if (value < minValue) {
//            minIdx = index
//            minValue = value
//        }
//    }
//
//    var flag = false
//    answer = IntArray(arr.size - 1) {
//        if (it == minIdx) {
//            flag = true
//        }
//        if (!flag) {
//            arr[it]
//        } else {
//            arr[it + 1]
//        }
//    }
//    return answer
//}

fun solution(phone_number: String): String {
    var answer = ""

    val limit  = phone_number.length - 4

    val sb = StringBuilder()
    for (i in 0 until phone_number.length){
        if (i < limit){
            sb.append("*")
        } else{
            sb.append(phone_number[i])
        }
    }

    return sb.toString()
}

fun main() {

}