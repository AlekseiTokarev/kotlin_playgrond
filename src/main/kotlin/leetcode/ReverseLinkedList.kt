package leetcode

import leetcode.collection.ListNode
import leetcode.collection.TreeNode

//206
fun main() {
    val list = TreeNode()
    list.add(5)
    list.add(4)
    list.add(14)
    list.add(53)
    list.add(1)
    println(list.string())
    val reversedList = reverseList(list.head)
    println(reversedList?.print())

}

private fun reverseList(head: ListNode?): ListNode? {
    head ?: return null
    var last = ListNode(head.value)

    var current = head
    while (current?.next != null) {
        val following = current.next?: break
        val temp = ListNode(following.value)
        temp.next = last
        last = temp
        current = following
    }

    return last
}

fun ListNode.print(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("[")
    var currentNode = this ?: return stringBuilder.append("]").toString()

    while (currentNode.next != null) {
        stringBuilder.append(currentNode.value).append(",")
        currentNode = currentNode.next ?: break
    }
    stringBuilder.append(currentNode.value)
    return stringBuilder.append("]").toString()
}



/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */


