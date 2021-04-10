package v2

data class ItemDto(
        val itemId: Long,
        val modelCode: String,
        val esn: String,
        var quantity: Int
) {
    val invoiceId: Long = 0
}
