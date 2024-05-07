package bac.easy


/*
   주유소(단순구현)

   N(2 ≤ N ≤ 100,000)

   제일 왼쪽 도시부터 제일 오른쪽 도시까지의 거리 1이상 1_000_000_000 이하의 자연수

    사고과정.

    가장 저렴한 도시에서 미리 기름을 산다면? 최소비용으로 도착한

    배울점.
    단순구현 문제지만 정답률이 낮은걸로 봐서 조금 천천히 생각을 해야 풀수있다.
*/


//var n = 0
//lateinit var lenArr: LongArray
//lateinit var priceArr: LongArray
//
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    n = readLine().toInt()
//    lenArr = readLine().split(" ").map { it.toLong() }.toLongArray()
//    priceArr = readLine().split(" ").map { it.toLong() }.toLongArray()
//
//    var price = priceArr[0]
//    var totalPrice: Long = price * lenArr[0]
//
//    for (i in 1 until priceArr.size-1){
//        if (priceArr[i] < price){
//            price = priceArr[i]
//        }
//        totalPrice += (price) * lenArr[i]
//    }
//
//    println(totalPrice)
//
//    return@with Unit
//}