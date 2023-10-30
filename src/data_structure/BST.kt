package data_structure

/*
    이진 탐색 트리 구현

    * 기본 원리와 학습을 위한 구현으로 value는 Int로 한정한다.
    * node의 key와 data의 값은 같다.

 */

//fun main() {
//    val bst = BinarySearchTree()
//
//    bst.add(10)
//    bst.add(50)
//    bst.add(20)
//    bst.add(7)
//    bst.add(1000)
//
//    bst.print()
//    println(bst.getSize())
//
//    bst.delete(10)
//    bst.print()
//    println(bst.getSize())
//}
//
//data class Node(
//    var key: Int,
//    var left: Node? = null,
//    var right: Node? = null
//)
//
//class BinarySearchTree(private var root: Node? = null) {
//
//    private var size: Int = if (root == null) 0 else 1
//
//    fun getSize() = size
//
//    /*
//        search
//        재귀함수를 통해 구현 가능하다.
//     */
//    fun search(node: Node? = root, value: Int): Node? =
//        if (node == null || node.key == value)
//            node
//        else if (node.key > value) {
//            search(node = node.left, value = value)
//        } else {
//            search(node = node.right, value = value)
//        }
//
//    private fun addNode(parent: Node?, value: Int) {
//
//        if (parent == null || parent.key == value) {
//            // 이미 존재하는 key 라면 추가 하지 않는다.
//            return
//        } else if (parent.key > value) {
//            if (parent.left == null) {
//                parent.left = Node(key = value)
//                size += 1
//            } else
//                addNode(parent.left, value)
//        } else {
//            if (parent.right == null) {
//                parent.right = Node(key = value)
//                size += 1
//            } else
//                addNode(parent.right, value)
//        }
//    }
//
//    fun add(value: Int) {
//        if (root == null) {
//            root = Node(key = value)
//            size += 1
//        } else {
//            addNode(root, value)
//        }
//    }
//
//    fun delete(value: Int): Boolean {
//
//        // 1. 삭제할 노드와 그 노드의 부모 노드의 참조를 얻는다.
//        var node = root
//        var parentNode: Node? = null
//        // 삭제할 노드가 부모의 왼쪽, 오른쪽 자식인지 확인.
//        var isFromLeft = false
//
//        while (true) {
//            // root node가 null 이거나 모든 리프노드 까지 탐색을 했는데 키값을 못 찾은 경우
//            if (node == null) {
//                return false
//            }
//
//            if (node.key == value)
//                break
//            else if (node.key > value) {
//                parentNode = node
//                node = node.left
//                isFromLeft = true
//            } else {
//                parentNode = node
//                node = node.right
//                isFromLeft = false
//            }
//        }
//
//        // 2-1 삭제할 노드가 leaf 노드
//        if (node?.left == null && node?.right == null) {
//
//            // root 만 남아 있는 상황.
//            if (parentNode == null) {
//                root = null
//                size = 0
//                return true
//            }
//
//            // 삭제할 노드가 부모의 left, right 노드 인지 확인 후 삭제.
//            if (isFromLeft) {
//                parentNode.left = null
//            } else {
//                parentNode.right = null
//            }
//        }
//
//        // 2-2 삭제할 노드가 자식을 1개인 경우
//
//        //  삭제할 노드가 왼쪽 자식을 가진 경우
//        else if (node.right == null) {
//            if (parentNode == null)
//                root = node.left
//            else if (isFromLeft) {
//                parentNode.left = node.left
//            } else {
//                parentNode.right = node.left
//            }
//        }
//        //  삭제할 노드가 오른쪽 자식을 가진 경우
//        else if (node.left == null) {
//            if (parentNode == null)
//                root = node.right
//            else if (isFromLeft) {
//                parentNode.left = node.right
//            } else {
//                parentNode.right = node.right
//            }
//        }
//        // 2-3 삭제할 노드가 자식을 2개인 경우
//
//        // 삭제할 노드의 predecessor(자신의 보다 작으면서 가장 큰것)
//        parentNode = node
//        var left = parentNode?.left
//        isFromLeft = true
//
//        // successor를 찾음.
//        while (left?.right != null) {
//            parentNode = left
//            left = left.right
//            isFromLeft = false
//        }
//
//        node?.key = left?.key!!
//
//        // predecessor 니까 오른쪽 자식은 없다.
//        if (isFromLeft){
//            parentNode?.left = left.left
//        }else
//            parentNode?.right = left.left
//
//        size -= 1
//        return true
//    }
//
//    fun print() {
//        printSubTree(root)
//    }
//
//    /*
//        inOrder 순회로 이진탐색 트리의 오름 차순 순으로 출력 한다.
//     */
//    private fun printSubTree(node: Node?) {
//        if (node != null) {
//            printSubTree(node.left)
//            println("node key = ${node.key}")
//            printSubTree(node.right)
//        }
//    }
//}