lateinit var arr: IntArray


fun main() {

    arr = intArrayOf(1, 4, 7, 9, 11, 13, 16, 17, 21, 22, 25, 28)

    val key = 22
    var left = 0
    var right = arr.lastIndex

    while (left <= right) {
        val mid = (left + right) / 2

        if (arr[mid] == key) {
            println(mid)
            break
        } else if (arr[mid] > key) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
}


