package leetcode

import kotlin.math.pow

const val SHIFT_TO = 64
const val positionWeight = 26

fun main() {
    println(titleToNumber("AB")) //28
    println(titleToNumber("ZY")) //701
}


fun titleToNumber(columnTitle: String): Int {
    return columnTitle.toCharArray()
        .mapIndexed { index, char -> calculateValue(char, columnTitle.length - index - 1) }
        .sum()


}

fun calculateValue(char: Char, position: Int): Int {
    if (position == 0) {
        return char.toNumber()
    }
    val result = char.toNumber() * (positionWeight.toDouble().pow(position)).toInt()
    return result

}

fun Char.toNumber(): Int = toInt() - SHIFT_TO


