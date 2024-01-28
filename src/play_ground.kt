/*
    play_ground
 */


class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {


    var objectsAdded = 0
    override fun add(element: T): Boolean {
        objectsAdded += 1
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}


fun main() {

    val cs = CountingSet<Int>()

    cs.add(1)
    cs.add(2)
    cs.addAll(arrayOf(3,4,5))

    for (i in cs){
        println(i)
    }
}


