package leetcode

//Medium 394
fun main() {
    println(decodeString("3[a]2[bc]"))
    println(decodeString("3[a2[c]]"))
}
val regex = Regex("\\d+\\[[a-z]+\\]")

fun decodeString(input: String): String {

    val encodedBlockMatcher = regex.find(input) ?: return input
    val decodedBlock = decodeBlock(encodedBlockMatcher.value)
    val result = input.replaceFirst(encodedBlockMatcher.value, decodedBlock)
    return decodeString(result);
}

fun decodeBlock(block: String): String{
    val (times,text) = block.removeSuffix("]").split("[")
    return text.repeat(times.toInt())
}
