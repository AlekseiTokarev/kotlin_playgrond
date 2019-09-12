package com.hylamobile

import com.hylamobile.v2.ItemDto as ItemDtoV2

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
    val itemDto = ItemDto()
    itemDto.itemId = 11;
    itemDto.model = "Samsung SM-G892U Galaxy S8 64GB"

    val itemDtoV2 = itemDto.toItemDtoV2();
    println(itemDtoV2)
}
