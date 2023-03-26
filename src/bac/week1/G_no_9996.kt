package bac.week1

/*
한국이 그리울땐 서버에 접속하지.
1-F

String function

subString(start, end) end 미포함.

find{ } 주어진 람다조건에 따른 char 리턴

indexOf() 입력된 string 과 일치하는 idx 반환 단, 여러개 경우 제일 처음 일치하는 idx 리턴.

count{ } 주어진 람다조건과 일치하는 개수 리턴.

reversed() 뒤집어서 출력


기억해야 되는 문법
2중 이상 Nested 반복문에서 밖에 반복문을 에 continue, break 를 사용하려고 할떄,

   loop@ for(){
        for(){
             continue@loop
             break@loop
        }
   }

 */
fun main() = with(System.`in`.bufferedReader()){

    val fileNum = readLine().toInt()
    val pattern = readLine().toString()

    val starIdx = pattern.indexOf('*')
    val prefix = pattern.substring(0, starIdx)
    val suffix = pattern.substring(starIdx+1, pattern.length)

    loop@ for (i in 0..fileNum-1){
        val name = readLine().toString()

        // 반례
        if (name.length < prefix.length + suffix.length){
            println("NE")
        }
        else{
            for (j in 0 until prefix.length){
                if (prefix[j] != name[j]){
                    println("NE")
                    continue@loop
                }
            }
            for ( k in 0 until suffix.length){
                if (suffix[k] != name[name.length - suffix.length+k]){
                    println("NE")
                    continue@loop
                }
            }
            println("DA")
        }
    }
}