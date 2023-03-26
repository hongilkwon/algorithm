package bac.week3


/*
꽃길
 */

/*
import kotlin.math.min

var bac.week5.concept.getN = 0

lateinit var map: Array<IntArray>
lateinit var visited: Array<IntArray>

val dy = arrayOf(-1, 0, 1, 0)
val dx = arrayOf(0, 1, 0, -1)

var answer = Int.MAX_VALUE

fun plant(p1: Pair<Int, Int>, p2: Pair<Int, Int>, p3: Pair<Int, Int>): Int {
    var rental = 0
    return if (check(p1) && check(p2) && check(p3)) {
        for (i in 0 until bac.week5.concept.getN) {
            for (j in 0 until bac.week5.concept.getN) {
                if (visited[i][j] == 1)
                    rental += map[i][j]
            }
        }
        rental
    } else {
        Int.MAX_VALUE
    }
}


fun check(p: Pair<Int, Int>): Boolean {
    if (visited[p.first][p.second] == 1) { return false }
    for (i in 0 until 4) {
        val ny = p.first + dy[i]
        val nx = p.second + dx[i]
        if (ny !in 0 until bac.week5.concept.getN || nx !in 0 until bac.week5.concept.getN) { return false }
        if (visited[ny][nx] == 1) { return false }
    }

    visited[p.first][p.second] = 1
    for (i in 0 until 4) {
        val np = p.first + dy[i] to p.second + dx[i]
        visited[np.first][np.second] = 1
    }

    return true
}


fun change(idx: Int): Pair<Int, Int> {
    val row = idx / bac.week5.concept.getN
    val col = idx % bac.week5.concept.getN
    return row to col
}


fun bac.week5.concept.main() = with(System.`in`.bufferedReader()) {

    bac.week5.concept.getN = readLine().toInt()
    map = Array(bac.week5.concept.getN) { IntArray(bac.week5.concept.getN) { 0 } }
    visited = Array(bac.week5.concept.getN) { IntArray(bac.week5.concept.getN) { 0 } }

    for (i in 0 until bac.week5.concept.getN) {
        map[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    for (i in 0 until bac.week5.concept.getN * bac.week5.concept.getN) {
        for (j in i + 1 until bac.week5.concept.getN * bac.week5.concept.getN) {
            for (bac.week5.concept.getK in j + 1 until bac.week5.concept.getN * bac.week5.concept.getN) {
                visited = Array(bac.week5.concept.getN) { IntArray(bac.week5.concept.getN) { 0 } }
                answer = min(plant(change(i), change(j), change(bac.week5.concept.getK)), answer)
            }
        }
    }

    println(answer)
}*/
