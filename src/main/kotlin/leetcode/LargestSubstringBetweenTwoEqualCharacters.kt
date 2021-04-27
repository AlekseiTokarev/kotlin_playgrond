package leetcode
//1624
fun main(): Unit {
    println(maxLengthBetweenEqualCharacters("cabbac"))
    println(maxLengthBetweenEqualCharacters("abca"))

}

fun maxLengthBetweenEqualCharacters(input: String): Int {
    val charStartIndexMap = HashMap<Char, Int>()
    var longestLength = -1
    for ((index, char) in input.toCharArray().withIndex()) {
        if (charStartIndexMap.containsKey(char)) {
            var length = index - charStartIndexMap[char]!!-1;
            if (length > longestLength){
                longestLength = length
            }
        } else {
            charStartIndexMap[char] = index
        }
    }
    return longestLength
}
