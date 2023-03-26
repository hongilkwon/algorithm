
/*

 영수증

*/
fun main() = with(System.`in`.bufferedReader()) {

    val x = readLine().toInt()

    val n = readLine().toInt()

    val items = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until n) {
        val info = readLine().split(" ").map { it.toInt() }
        items.add(info[0] to info[1])
    }

    val sum = items.map {
        it.first * it.second
    }.sum()

    if (x==sum){
        println("Yes")
    }else{
        println("No")
    }
}