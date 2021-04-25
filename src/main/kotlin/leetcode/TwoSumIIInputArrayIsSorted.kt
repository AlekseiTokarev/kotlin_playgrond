package leetcode

//167
fun main() {
    val result0 = twoSum(intArrayOf(-5, 2, 7, 11, 15), 22)
    println(result0.asList())
    val result1 = twoSum(intArrayOf(2, 3, 4), 6)
    println(result1.asList())
    val result2 = twoSum(intArrayOf(-1, 0), -1)
    println(result2.asList())
    val result3 = twoSum(intArrayOf(1, 2, 3, 4, 4, 9, 56, 90), 8)
    println(result3.asList())
}

fun twoSum(numbers: IntArray, target: Int): IntArray {
    for (i in 0 until numbers.size - 1) {
        for (n in 1 until numbers.size) {
            if (n == i) continue
            if (numbers[i] + numbers[n] == target) {
                return intArrayOf(i + 1, n + 1)
            }
        }
        if (i > 0 && numbers[i - 1] + numbers[i] > target && numbers[i] > target) {
            break
        }
    }
    return intArrayOf()

}
