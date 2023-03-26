package bac.week5


/*
    소가 길을 건너간 이유 3.

 */



fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()

    val cows = Array(n) {
        val info = readLine().split(" ").map { it.toInt() }
        info[0] to info[1]
    }

    cows.sortBy { it.first }

    var prev = 0
    for (i in 0 until cows.size) {

        if (prev < cows[i].first){
            prev = cows[i].first + cows[i].second
        }else{
            prev += cows[i].second
        }
    }
    println(prev)
}