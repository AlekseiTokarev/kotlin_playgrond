package leetcode

//1408

fun main() {
    println(stringMatching(arrayOf("leetcoder", "leetcode", "od", "hamlet", "am")))
    println(stringMatching(arrayOf("mass", "as", "hero", "superhero")))
    println(stringMatching(arrayOf("leetcode", "et", "code")))
}

fun stringMatching(words: Array<String>): List<String> {
    val output = mutableListOf<String>()

    for ((index, word) in words.withIndex()) {
        for ((indexInternal, wordInternal) in words.withIndex()) {
            if (index == indexInternal) continue
            if (word.length > wordInternal.length) continue
            if (wordInternal.contains(word)) {
                if (!output.contains(word)) {
                    output.add(word)
                }
            }
        }
    }
    return output
}
