package leetcode

import leetcode.collection.ListNode

//203 not implemented
class RemoveLinkedListElements {

    private var resultNode: ListNode? = null

    fun main() {
        val node0 = ListNode(1)
        val node1 = ListNode(5)
        val node2 = ListNode(3)
        val node3 = ListNode(4)
        val node4 = ListNode(5)
        node0.next = node1
        node1.next = node2
        node2.next = node3
        node3.next = node4
        removeElements(node4, 5)
    }

    fun removeElements(head: ListNode?, value: Int): ListNode? {
        head ?: return null
        while (head.next != null){
            if (head.next!!.value == value){
                removeElements(head.next!!.next, value);
            }
            removeElements(head.next, value);
        }
        return head
    }

}

