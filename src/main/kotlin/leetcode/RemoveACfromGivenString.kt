package leetcode

fun main(): Unit {
    println(removeSymbols("cabrmbacbasac")) //aramaasc
}

fun removeSymbols(input: String): String {
    val stringBuilder = StringBuilder()
    var index = 0
    while (index < input.length) {
        if (index < input.length - 1 && input.substring(index, index + 2) == "ac") {
            index += 2
            continue
        } else {
            stringBuilder.append(input[index])
            index++
        }
    }
    return stringBuilder.toString()
}


