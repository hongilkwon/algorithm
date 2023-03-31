package bac.week5

/*
   연산자 끼워넣기
 */

//import kotlin.math.max
//import kotlin.math.min
//
//var n = 0
//var nums: Array<Int> = emptyArray()
//var operators = mutableListOf<Char>()
//
//var max = Int.MIN_VALUE
//var min = Int.MAX_VALUE
//
//
//fun MutableList<Char>.swap(a: Int, b: Int) {
//    val temp = this[a]
//    this[a] = this[b]
//    this[b] = temp
//}
//
//fun permutation(n: Int, r: Int, list: MutableList<Char>, depth: Int = 0) {
//
//    if (r == depth) {
//        val result = list.subList(fromIndex = 0, toIndex = r)
////        println(result.joinToString(" "))
//        cal(result, nums)
//        return
//    }
//
//    for (idx in depth until n) {
//        list.swap(idx, depth)
//        permutation(n, r, list, depth = depth + 1)
//        list.swap(depth, idx)
//    }
//
//}
//
//fun cal(result: MutableList<Char>, nums: Array<Int>) {
//
//    var operIdx = 0
//    var current = nums[0]
//    for (i in 0 until result.size){
//        when(result[i]){
//            '+' -> current += nums[i + 1]
//            '-' -> current -= nums[i + 1]
//            '*' -> current *= nums[i + 1]
//            '/' -> current /= nums[i + 1]
//        }
//    }
//
//    max = max(max, current)
//    min = min(min, current)
//
//}
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//
//    nums = readLine().split(" ").map { it.toInt() }.toTypedArray()
//
//    val operatorInfo = readLine().split(" ").map { it.toInt() }.toTypedArray()
//    operatorInfo.forEachIndexed { index, i ->
//        if (index == 0) {
//            repeat(i) { operators.add('+') }
//        }
//        if (index == 1) {
//            repeat(i) { operators.add('-') }
//        }
//        if (index == 2) {
//            repeat(i) { operators.add('*') }
//        }
//        if (index == 3) {
//            repeat(i) { operators.add('/') }
//        }
//    }
//
////    println(nums.joinToString(" "))
////    println(operators.joinToString(" "))
//
//    permutation(n= operators.size, r = operators.size, list = operators)
//    println(max)
//    println(min)
//    Unit
//}
//
