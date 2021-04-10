package com.hylamobile

interface Stack {
    fun push(`val`: Int)

    fun pop()

    fun top(): Int

    fun getMin(): Int
}

fun main() {
    val minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    minStack.getMin() // return -3

    minStack.pop()
    minStack.top() // return 0

    println(minStack.getMin()) // return -2

}

class MinStack : Stack {
    private var min = Int.MAX_VALUE
    private val tree = Root()

    override fun push(`val`: Int) {
        val newNode = Node(`val`, tree.node)
        tree.node = newNode
        if (`val` < min) {
            min = `val`
        }
    }

    override fun pop() {
        if (tree.node == null) {
            throw IllegalStateException("can't pop on empty array")
        }
        val currentValue = tree.node?.value
        tree.node = tree.node?.parentNode
        if (min == currentValue) {
            min = Int.MAX_VALUE
            tree.node?.let { findMinimum(it) }
        }
    }

    private fun findMinimum(node: Node) {
        if (node.value < min) {
            min = node.value
        }
        node.parentNode?.let { findMinimum(it) }
    }

    override fun top(): Int {
        return tree.node?.value ?: throw IllegalStateException("no elements")
    }

    override fun getMin(): Int {
        return min
    }
}

class Root {
    var node: Node? = null
}

class Node(val value: Int, val parentNode: Node?)
