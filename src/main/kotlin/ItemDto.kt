import v2.ItemDto as ItemDtoV2

class ItemDto() {
    var itemId: Long = 0
    var model: String? = null
    var imeiESNSerialNumber: String? = null
}

fun ItemDto.toItemDtoV2(): ItemDtoV2 {
    return ItemDtoV2(
        itemId = itemId,
        modelCode = model ?: "fallbackModel",
        esn = imeiESNSerialNumber.orEmpty(),
        quantity = 1
    )
}

fun main() {
//    val itemDto = ItemDto()
//    itemDto.itemId = 11;
//    itemDto.model = "Samsung SM-G892U Galaxy S8 64GB"
//
//    val itemDtoV2 = itemDto.toItemDtoV2();
//    itemDtoV2.copy()
//    println(itemDtoV2)

//    print(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    print(maxSubArray(intArrayOf(5, 4, -1, 7, 8)))
}

//53. Maximum Subarray
fun maxSubArray(numbers: IntArray): Int {
    var maxSum = 0
    var sum = 0
    var lastNum: Int? = null
    for (num in numbers) {
        if (lastNum == null) {
            maxSum = num
            sum = num
            lastNum = num
            continue
        }
        if (num > sum + num) {
            sum = num
            if (sum > maxSum) {
                maxSum = sum
            }
        } else {
            sum = +num


            if (lastNum < num) {
                sum = +num
                if (sum > maxSum) {
                    maxSum = sum
                }
            }
        }
        lastNum = num
    }
    return maxSum
}
