package leetcode.collection

class ListNode(val value: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return value.toString()
    }
}

class TreeNode {
    var head: ListNode? = null

    fun add(number: Int) {
        val newNode = ListNode(number)
        if (head == null) {
            head = newNode
        } else {
            tail()?.next = newNode
        }
    }

    private fun tail(): ListNode? {
        var currentNode = head ?: return null
        while (currentNode.next != null) {
            currentNode = currentNode.next ?: return null
        }
        return currentNode
    }

    fun string(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("[")
        var currentNode = head ?: return stringBuilder.append("]").toString()

        while (currentNode.next != null) {
            stringBuilder.append(currentNode.value).append(",")
            currentNode = currentNode.next ?: break
        }
        stringBuilder.append(currentNode.value)
        return stringBuilder.append("]").toString()
    }


}
