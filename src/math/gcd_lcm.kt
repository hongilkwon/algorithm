package math

///*
//    gcd - 최대 공약수
//
//    두 수 a, b 있고 a > b다면, val r = a / b
//    a와 b의 최대 공약수는 b와 r의 공약수와 같다.
//
//    lcm - 최소 공배수
//
//    (a * b) / 최대 공약수
// */
//
//fun gcd(num1: Int, num2: Int): Int {
//
//    var (a, b) =
//        if (num1 > num2) {
//            num1 to num2
//        } else {
//            num2 to num1
//        }
//
//    while (b != 0) {
//        val r = a % b
//        a = b
//        b = r
//    }
//    return a
//}
//
//fun lcm(a: Int, b: Int): Int {
//
//    return a * b / gcd(a, b)
//}
//
//fun main() {
//    println(gcd(200, 160))
//    println(lcm(200,160))
//}