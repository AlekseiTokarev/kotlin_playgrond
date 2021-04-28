package leetcode
//392
fun main() {
    println(isSubsequence(s = "aaaaaa" , t = "bbaaaa"))
//    println(isSubsequence(s = "abc", t = "ahbgdc"))
//    println(isSubsequence(s = "axc", t = "ahbgdc"))
}

fun isSubsequence(s: String, t: String): Boolean {
    if (s.length > t.length) {
        return false
    }
    var index = -1
    for (char in s.toCharArray()) {
        index++
        if (index > t.length-1) return false
        if (t[index] == char) {
            continue
        } else {
            var charFound = false
            for (i in index until t.length) {
                if (t[index] == char) {
                    charFound = true
                    break
                }
                index++
            }
            if (!charFound) {
                return false
            }
        }
    }
    return true
}
