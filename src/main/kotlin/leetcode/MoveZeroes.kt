package leetcode.medium

fun main(): Unit {
    val numbers = intArrayOf(1, 0, 3, 0, 4)
    moveZeroes(numbers)
    println(numbers.toList())
}

fun moveZeroes(nums: IntArray): Unit {
    var zeroCounter = 0
    for (i in 0 until nums.size - 1) {
        if (nums[i] == 0 && nums[i + 1] != 0) {
            nums[i - zeroCounter] = nums[i + 1]
            nums[i + 1] = 0;
        } else if (nums[i] == 0 && nums[i + 1] == 0) {
            zeroCounter++
        }
    }
}
