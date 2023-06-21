import java.util.*

fun main() {

    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })

    pq.add(6 to 4)
    pq.add(10 to 5)
    pq.add(1 to 8)
    pq.add(4 to 1)

    println(pq.poll())
}