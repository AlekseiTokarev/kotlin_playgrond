package leetcode

fun main(): Unit {
    println(wordPattern("abba", "dog cat cat dog"))
}

//290
fun wordPattern(pattern: String, s: String): Boolean {
    val patternChars = pattern.toCharArray()
    val words = s.split(Regex(" +"))
    if (patternChars.size != words.size) {
        return false
    }
    if (patternChars.distinct().size != words.distinct().size){
        return false
    }
    val set = hashSetOf<String>()
    for ((index, char) in patternChars.withIndex()) {
        set.add(char.toString()+words[index])
    }
    return patternChars.distinct().size == set.size
}

