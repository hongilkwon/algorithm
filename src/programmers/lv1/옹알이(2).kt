package programmers.lv1

import bac.rotateArr.arr

/*
    옹알이(2)
 */

fun solution(babbling: Array<String>): Int {
    var answer: Int = 0

    val wordMap = mapOf<Char, String>(
        'a' to "aya",
        'y' to "ye",
        'w' to "woo",
        'm' to "ma"
    )

    var cnt = 0
    outLoop@ for (str in babbling) {
        val temp = mutableListOf<String>()
        var prev = ""

        var idx = 0
        while (idx < str.length) {
            val word = wordMap[str[idx]]
            if (word != null) {
                if (prev == word) continue@outLoop

                for (j in 0 until word.length) {
                    if (idx + j >= str.length)
                        continue@outLoop
                    if (word[j] != str[idx + j]) {
                        continue@outLoop
                    }
                }
                idx += word.length
            } else {
                continue@outLoop
            }
            prev = word
            temp.add(word)
        }
//        println(temp.joinToString(" "))
        cnt += 1
    }

    answer = cnt
    return answer
}

fun main() {
    println(solution(arrayOf("ay", "wo", "m", "y")))
}