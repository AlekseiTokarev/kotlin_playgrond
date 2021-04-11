package leetcode

class ReverseBits

fun main() {
    println(reverseBits(43261596))
}

@OptIn(ExperimentalUnsignedTypes::class)
fun reverseBits(n: Int): Int {
    val intAsBinary = Integer.toBinaryString(n)
    val leadingZerosBinary = addLeadingZeros(intAsBinary)
    println(leadingZerosBinary)
    val reversedIntAsBinary = reverseString(leadingZerosBinary)
    println(reversedIntAsBinary)
    return Integer.parseUnsignedInt(reversedIntAsBinary, 2);
}

fun reverseString(input: String): String {
    val stringBuffer = StringBuffer()
    for (n in input.length - 1 downTo 0) {
        stringBuffer.append(input.get(n))
    }
    return stringBuffer.toString();
}

fun addLeadingZeros(input: String): String {
    val numberOfLackingZeros = Int.SIZE_BITS - input.length
    return "0".repeat(numberOfLackingZeros) + input
}
