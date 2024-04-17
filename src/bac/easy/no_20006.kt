package bac.easy


/*
   랭킹전 대기열(단순구현 문제).

*/

//var p = 0
//var m = 0
//
//data class Room(
//    val owner: Pair<Int, String>,
//    val members: MutableList<Pair<Int, String>>
//)
//
//val roomList = mutableListOf<Room>()
//
//fun main() = with(System.`in`.bufferedReader()) {
//
//    val info = readLine().split(" ").map { it.toInt() }
//    p = info[0]
//    m = info[1]
//
//    for (i in 0 until p) {
//        val playerInfo = readLine().split(" ")
//        val player = playerInfo[0].toInt() to playerInfo[1]
//
//        if (roomList.isEmpty()) {
//            val room = Room(owner = player, mutableListOf(player))
//            roomList.add(room)
//            continue
//        }
//
//        var room: Room? = null
//        for (j in 0 until roomList.size) {
//            if (roomList[j].members.size < m && player.first in roomList[j].owner.first - 10..roomList[j].owner.first + 10) {
//                room = roomList[j]
//                break
//            }
//        }
//
//        if (room != null) {
//            room.members.add(player)
//        } else {
//            val room = Room(owner = player, mutableListOf(player))
//            roomList.add(room)
//        }
//    }
//
//    val sb = StringBuilder()
//    for (i in 0 until roomList.size) {
//        if (roomList[i].members.size == m) {
//            sb.append("Started!\n")
//        } else {
//            sb.append("Waiting!\n")
//        }
//
//        val temp = roomList[i].members.sortedBy { it.second }
//        for (j in 0 until temp.size) {
//            sb.append("${temp[j].first} ${temp[j].second}\n")
//        }
//    }
//
//    println(sb.toString())
//    return@with Unit
//}