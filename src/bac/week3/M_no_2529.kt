package bac.week3

/*
부등호
 */

lateinit var buho: Array<String>

val list = mutableListOf<String>()
val usedNum = mutableSetOf<Int>()

fun select(str: String, idx: Int, last: Int) {

    if (idx == buho.size) {
        list.add(str)
        return
    }

    for (i in 0..9) {

        if (i !in usedNum){
            if (buho[idx] == ">") {
                if (last > i.toString().toInt()){
                    val nStr = str + i.toString()
                    usedNum.add(i)
                    select(nStr, idx+1, i)
                    usedNum.remove(i)
                }
            } else {
                if (last < i.toString().toInt()){
                    val nStr = str + i.toString()
                    usedNum.add(i)
                    select(nStr, idx+1, i)
                    usedNum.remove(i)
                }
            }
        }
    }
}

fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()

    buho = Array(n) { " " }
    readLine().split(" ").forEachIndexed { idx, str ->
        buho[idx] = str
    }

    for (i in 0..9){
        usedNum.add(i)
        select(i.toString(),0,i)
        usedNum.remove(i)
    }

    println(list.maxOrNull())
    println(list.minOrNull())
}