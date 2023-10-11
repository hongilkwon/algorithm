package programmers.lv2

/*
    오픈 챗팅방

    1 <= record <= 100_000
    단순구현 문제이지만, string class 함수 묻는 문제.
 */

//class Solution {
//
//    lateinit var record: Array<String>
//    val idMap = mutableMapOf<String, String>()
//    val chatList: MutableList<String> = mutableListOf()
//
//    fun solution(record: Array<String>): Array<String> {
//        var answer = arrayOf<String>()
//        this.record = record
//
//
//        for (i in 0 until record.size) {
//
//            val line = record[i].split(" ")
//            val operation = line[0]
//
//            if (operation == "Enter") {
//
//                val id = line[1]
//                val nicName = line[2]
//
//                if (idMap.containsKey(id)){
//                    if (idMap[id] != nicName) idMap[id] = nicName
//                }else{
//                    idMap[id] = nicName
//                }
//                chatList.add("${id}님이 들어왔습니다.")
//
//            } else if (operation == "Leave") {
//                val id = line[1]
//                chatList.add("${id}님이 나갔습니다.")
//            } else if (operation == "Change") {
//                val id = line[1]
//                val nicName = line[2]
//                idMap[id] = nicName
//            }
//        }
//
//        val chatArr = chatList.toTypedArray()
//        for (i in 0 until chatArr.size){
//            val chat = chatArr[i]
//            val id = chat.substring(0, chat.indexOf("님"))
//            val nic = idMap[id]!!
//            chatArr[i] = chat.replace(id, nic)
//        }
//
////        println(chatArr.joinToString(" "))
//        return chatArr
//    }
//}