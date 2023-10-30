package bac.week4.concept


val arr = arrayOf("철수", "영희", "민수", "민지")

fun fullCombination() {
    // 0 부터 (1 shl arr.size) 10000(2) - 1까지 모든 선택을 나타내는 수까지 반복.
    for (i in 0 until (1 shl arr.size)) {

        val result = mutableListOf<String>()
        for (j in 0 until arr.size) {
            // 어떤 비트가 선택되 었는지 확인
            if ((i and (1 shl j)) != 0) {
                result.add(arr[j])
            }
        }
        println("상태를 나타내는 비트: ${Integer.toBinaryString(i)}")
        println(result.joinToString(" "))
    }
}

fun containSelected(idx: Int) {
    var result = ""
    for (j in 0 until arr.size) {
        if ((idx and (1 shl j)) != 0) {
            result += arr[j]
        }
    }
    println(result)
}

fun main() {
    fullCombination()
}