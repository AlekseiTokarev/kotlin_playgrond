package leetcode.medium

fun main(): Unit {
    println(reverseWords("the sky is  blue"))
}

fun reverseWords(s: String): String {
    val words = s.split(Regex(" +"))
    val stringBuilder = StringBuilder()

    for (word in words){
        stringBuilder.insert(0, "$word ")
    }
    return stringBuilder.toString().trim()
}
