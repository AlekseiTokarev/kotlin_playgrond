package leetcode


fun main() {
    val input = intArrayOf(2, 7, 11, 15)
    println(twoSum2(input, 9).toList());
    println(twoSum2(intArrayOf(3, 2, 3), 6).toList());
}

fun twoSum1(nums: IntArray, target: Int): IntArray {
    nums.dropLast(1)
        .forEachIndexed { index, i ->
            for (indexInner in index + 1 until nums.size) {
                if (i + nums[indexInner] == target) {
                    return intArrayOf(index, indexInner)
                }
            }
        }
    return intArrayOf();
}

fun twoSum2(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>();
    nums.forEachIndexed { index, i ->
        if (map.contains(target - i)) {
            return intArrayOf(map.getValue(target - i), index)
        }
        map[i] = index
    }
    return intArrayOf()
}
