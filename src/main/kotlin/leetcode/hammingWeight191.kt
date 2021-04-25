package leetcode

fun main() {
    println(hammingWeight(3))
}

fun hammingWeight(input: Int): Int {
    val binaryString = Integer.toBinaryString(input)
    return binaryString.count { it == '1' }
}
