package math

/*
    순열 nPr
    n개 중에 r개를 순서를 고려하여 뽑는 경우의 수
    bac.week5.concept.getN!/(bac.week5.concept.getN-r)!
    순열을 할때는 반드시! 오름차순 정렬이 선행된다.
 */


val permuList = mutableListOf('a', 'b', 'c', 'd')

fun MutableList<Char>.swap(i: Int, j: Int) {
    val temp = this[j]
    this[j] = this[i]
    this[i] = temp
}

fun swap(a: Int, b: Int) {
    val temp = permuList[a]
    permuList[a] = permuList[b]
    permuList[b] = temp
}

fun makePermutation(n: Int, r: Int, depth: Int = 0) {

    if (r == depth) {
        val result = permuList.subList(fromIndex = 0, toIndex = r)
        println(result.joinToString(" "))
        return
    }

    for (idx in depth until n) {
        swap(idx, depth)
        makePermutation(n, r, depth + 1)
        swap(depth, idx)
    }
}

fun main() {
    makePermutation(permuList.size, 2)
}


