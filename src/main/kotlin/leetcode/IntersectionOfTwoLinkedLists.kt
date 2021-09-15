package leetcode

import leetcode.collection.ListNode
import leetcode.collection.TreeNode

fun main(): Unit {
    val list1 = TreeNode()
    list1.add(4)
    list1.add(1)
    list1.add(8)
    list1.add(4)
    list1.add(5)

    val list2 = TreeNode()
    list2.add(5)
    list2.add(6)
    list2.add(1)
    list2.add(8)
    list2.add(4)
    list2.add(5)

    val result = getIntersectionNodeAsLists(list1.head, list2.head)
    println(result)
}

fun getIntersectionNodeAsLists(headA: ListNode?, headB: ListNode?): ListNode? {
    headA ?: return null
    headB ?: return null

    var resultedNodeTail: ListNode? = null
    var resultedNode: ListNode? = null

    var currentA = headA
    var currentB = headB
    val listA = arrayListOf<Int>()
    val listB = arrayListOf<Int>()
    while (currentA?.next != null) {
        listA.add(currentA.value)
        currentA = currentA.next
    }
    while (currentB?.next != null) {
        listB.add(currentB.value)
        currentB = currentB.next
    }
    listA.intersect(listB).forEachIndexed { index, i ->
        if (index == 0) {
            resultedNode = ListNode(i)
            resultedNodeTail = resultedNode
        }
        resultedNodeTail?.next = ListNode(i)
        resultedNodeTail = resultedNodeTail?.next
    }

    return resultedNode

}

//fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
//    headA ?: return null
//    headB ?: return null
//
//    var lastMatches = false
//    var resultedNode: ListNode? = null
//
//    var currentA = headA
//    var currentB = headB
//    while (currentA?.next != null) {}
//        while (currentB?.next != null) {
//            if (currentA.value == currentB.value) {
//                lastMatches = true
//                var newNode = ListNode(currentA.value)
//                if (resultedNode == null) {
//                    resultedNode = newNode
//                } else {
//                    resultedNode.next = newNode
//                }
//                currentB = currentB.next
//                continue
//            } else {
//                lastMatches = false
//                resultedNode = null
//                currentB = currentB.next
//            }
//
//        }
//        currentA = currentA.next
//
//    }
//    return resultedNode
//
//}
