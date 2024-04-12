package leetcode


/*
   Next Greater Number(스택, monotone stack)
   https://leetcode.com/problems/next-greater-element-i/description/
*/

//import java.util.*
//
//lateinit var nums1: IntArray
//lateinit var nums2: IntArray
//fun nextGreaterElement(arr1: IntArray, arr2: IntArray): IntArray {
//
//    nums1 = arr1
//    nums2 = arr2
//
//    val temp = IntArray(1_0001) { -1 }
//    val stack = Stack<Int>()
//
//    for (i in 0 until nums2.size) {
//        while (stack.isNotEmpty() && stack.peek() < nums2[i]) {
//            val idx = stack.pop()
//            temp[idx] = nums2[i]
//        }
//        stack.add(nums2[i])
//    }
//
//    val answer = mutableListOf<Int>()
//    for (i in 0 until nums1.size) {
//        val idx = nums1[i]
//        answer.add(temp[idx])
//    }
//
//   return answer.toIntArray()
//}
