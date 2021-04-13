package leetcode

fun main() {
    println(getLongestSymbolCombinations("aaaaaaaabbssssbbbbbttttttrrr"))

}

fun getLongestSymbolCombinations(input: String): String {

    var repeated = 0
    var lastSymbol = ' '
    var maxLength: Int = 0;
    var maxLengthSymbol: Char = ' '

    input.toCharArray().forEach {
        if (it == lastSymbol) {
            repeated++
        } else {
            repeated = 1
        }
        if (repeated > maxLength){
            maxLength = repeated
            maxLengthSymbol = it
        }

        lastSymbol = it
    }
    return maxLengthSymbol.toString().repeat(maxLength)

}
