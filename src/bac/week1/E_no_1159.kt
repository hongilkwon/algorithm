package bac.week1

/*
농구경기
1-E

단순하게 cnt 자료구조를 이용하는 문제
 */

fun main()  = with(System.`in`.bufferedReader()){

    val num = readLine().toInt()
    val list = List(num){
        readLine().toString()
    }

    val firstNames = list.map { it.first().code - 'a'.code }

    val cnt = MutableList(26){ 0 }
    firstNames.forEach {
        cnt[it] += 1
    }
    
    val strBuilder = StringBuilder()
    cnt.forEachIndexed { index, i ->
        if (i >= 5)
            strBuilder.append((index+'a'.code).toChar())
    }
    val result = strBuilder.toString()

    if (result.isEmpty()){
        println("PREDAJA")
    }else{
        println(result)
    }
}