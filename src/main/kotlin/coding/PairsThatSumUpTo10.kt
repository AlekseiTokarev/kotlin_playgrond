package coding

import java.util.*

fun main(): Unit {
    val numbers = intArrayOf(1, 7, 2, 3, 4, 1, 2, 7, 3, 5, 6)
//    NonDuplicatePair(7, 3).equals(NonDuplicatePair(3, 7))
    val result = findPairs(numbers).distinctBy { listOf(it.first to it.second, it.second to it.first) }
//    result
    println(result)
}

data class NonDuplicatePair<A, B>(
    val first: A,
    val second: B
) {

    override fun hashCode(): Int {
        return Objects.hash(first, second) + Objects.hash(second, first);
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (javaClass != other?.javaClass) {
            return false
        }
        other as NonDuplicatePair<*, *>
        if (first == other.second && second == other.first) {
            return true
        }
        if (first == other.first && second == other.second) {
            return true
        }
        return false
    }


}

fun findPairs(input: IntArray): List<NonDuplicatePair<Int, Int>> {

    val pairs = arrayListOf<NonDuplicatePair<Int, Int>>()
    for (n in input) {
        for (i in n until input.size) {
            if (n == input[i]) continue
            if (n + input[i] == 10) {
                pairs.add(NonDuplicatePair(n, input[i]))
            }
        }
    }
    return pairs
}
