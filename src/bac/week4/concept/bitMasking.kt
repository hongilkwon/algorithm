package bac.week4.concept


//import kotlin.math.pow
//
///*
//    자주쓰이는 비트연산
//
//    1 and 0	= 0
//    1 and 1	= 1
//    0 and 0 = 0
//    0 and 1	= 0
//
//    1하고 and 연산을 하면 피연산자는 변하지 않음.
//    0하고 and 연산을 하면 피연산자는 0으로 변함. -> 이 성질을 이용함
//
//    1. 비트배열이 주어졌을때, idx 비트 0으로 만들기.
//    n = n and (1 shl idx).inv()
//
//    2. 비트배열이 주어졌을때, idx 비트 반전 시키기.
//
//    1 xor 0 = 1
//    1 xor 1 = 0
//    0 xor 0 = 0
//    0 xor 1 = 1
//
//    1하고 xor 연산을 하면, 피연산자는 반전됨 -> 이 성질을 이용함
//    0하고 xor 연산을 하면, 피연산자는 변하지 않음.
//
//    n = n xor (1 shl idx)
//
//   3. 2진수 표현 배열의 1이 최초로 나오는 idx 찾기
//
//   val idx = (n and -n)
//
//   4. 크기가 n인 2진수 표현 배열 모든 비트를 켜기
//
//   2의 n제곱 -1
//   (1 shl n) - 1
//
//   5. idx 비트를 1로 만들기( 0 -> 1,  1 -> 1)
//
//    0 or 0 = 0
//    0 or 1 = 1
//    1 or 0 = 1
//    1 or 1 = 1
//
//    1 하고 or 연산을 하면, 피연산자는 1이됨 -> 이 성질을 이용함.
//    0 하고 or 연산을 하면, 피연산자는 변하지 않음.
//
//     n = n or (1 shl idx)
//
//    6. idx 비트가 있는지 확인하기
//    1과 and 연산하면 피연산자가 그대로 이기 떄문에
//    그 결과가 1이면 참 0이면 거짓
//
//    (n and (1 shl idx)) != 0
//    주의)  (n and (1 shl idx)) == 1 로 하면 안됨.
// */
//
///*
// 0. 10진수를 2진수로
// */
//
//fun decimalToBinary(n: Int): IntArray {
//
//    val arr = IntArray(32) { 0 }
//    if (n < 1) return arr
//
//    var decimal = n
//    var idx = 0
//    while (decimal != 1) {
//        arr[idx] = decimal % 2
//        decimal /= 2
//        idx += 1
//    }
//
//    arr[idx] = decimal
//    println(arr.joinToString(" "))
//    return arr
//}
//
//
///*
// 1. 모든 자리수의 값이 1인 n자리 2진수.
// */
//
//fun allOn(n: Int) = (1 shl n) - 1
//
//
///*
//   2. 2진수 표현 배열의 선택된 idx 를  0 -> 1 로 변경함.
//   @ 변경하려는 자리수가 원래 1이면 1이 나옴
// */
//
//fun onSelected(arr: IntArray, idx: Int): Int {
//    var n = 0
//    arr.forEachIndexed { index, i -> n += (i * 2.0.pow(index)).toInt() }
//    n = n or (1 shl idx)
//
//    return n
//}
//
///*
//   3. 2진수 표현 배열의 선택된 idx 가 1인지 아닌지 확인 한다.
//*/
//
//fun isOn(arr: IntArray, idx: Int): Boolean {
//    var n = 0
//    arr.forEachIndexed { index, i -> n += (i * 2.0.pow(index)).toInt() }
//    n = n and (1 shl idx)
//
//    return n != 0
//}
//
//
/*
    4. 2진수 표현 배열을 뒤집는다.
 */
//fun allReverse(n: Int, k: Int): Int {
//    val a = (1 shl k) -1
//    println(Integer.toBinaryString(n))
//
//    val temp = a and n.inv()
//    println(Integer.toBinaryString(temp))
//
//    return temp
//}
//
//
///*
//   5. 2진수 표현 배열의 1이 최초로 나오는 idx 찾기.
// */
//
//fun findFirst(arr: IntArray): Int {
//    var n = 0
//    arr.forEachIndexed { index, i -> n += (i * 2.0.pow(index)).toInt() }
//    var result = n and (-n)
//
//    var cnt = 0
//    while (result / 2 > 0) {
//        result /= 2
//        cnt += 1
//    }
//    return cnt
//}
//
///*
//   6. 2진수 표현 배열의 특정 idx 값을
//   1 -> 0
//   0 -> 1
// */
//
//fun reverseSelected(arr: IntArray, idx: Int): Int {
//    var n = 0
//    arr.forEachIndexed { index, i -> n += (i * 2.0.pow(index)).toInt() }
//
//    n = n xor (1 shl idx)
//    return n
//}
//fun isOn(n: Int) {
//
//    for (i in 1..7) {
//        if (n and (1 shl i - 1) == 0)
//            println("$i 번째 비트는 0(off)")
//        else
//            println("$i 번째 비트는 1(on)")
//    }
//}
//
//fun on(n: Int, idx: Int): Int {
//
//    val temp = n or (1 shl idx - 1)
//
//    println("결과 ${Integer.toBinaryString(temp)}")
//    return temp
//}
//
//fun off(n: Int, idx: Int): Int {
//
//    val temp = n and (1 shl idx - 1).inv()
//
//    println("결과 ${Integer.toBinaryString(temp)}")
//    return temp
//}
//
//fun reverse(n: Int, idx: Int): Int {
//    val temp = n xor (1 shl idx - 1)
//
//    println("결과 ${Integer.toBinaryString(temp)}")
//    return temp
//}
//
//fun allReverse(n: Int, k: Int): Int {
//    val a = (1 shl k) - 1
//    return a and n.inv()
//}
//
//fun findFirstOnBit(n: Int): Int {
//    val temp = n and -n
//    println("결과 ${Integer.toBinaryString(temp)}")
//
//    return temp
//}
//
//fun main() {
//    findFirstOnBit("100100".toInt(2))
//    findFirstOnBit("1001001".toInt(2))
//    findFirstOnBit("10000".toInt(2))
//}