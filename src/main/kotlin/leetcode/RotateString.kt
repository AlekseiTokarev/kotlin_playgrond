package leetcode

//796
fun main() {
    println(rotateString("abcde", "cdeab"));
    println(rotateString("abcde", "abced"));
}

fun rotateString(a: String, b: String): Boolean {
    if (a == b) return true
    for (i in 1..a.length) {
        val substringToRotate = a.substring(0, i)
        if (a.drop(i) + substringToRotate == b) {
            return true
        }
    }
    return false
}
