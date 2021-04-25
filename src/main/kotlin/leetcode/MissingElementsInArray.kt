package leetcode
//not a leetcode
fun main() {
    val array = arrayOf(1, 2, 3, 4, 6, 7, 9, 10)
    println(missingElements(array));
}

fun missingElements(array: Array<Int>): List<Int> {
    var missingNumber = ArrayList<Int>()
    for (i in array.first()..array.last()) {
        if (!array.contains(i)) {
            missingNumber.add(i)
        }
    }
    return missingNumber

}
