
import java.util.*


data class Truck(var w: Int,var p: Int)
fun main() {

    val queue: Queue<Truck> = LinkedList()

    queue.add(Truck(7,2))
    queue.add(Truck(2,1))


    queue.map { it.p += 1 }

    println(queue)
}
