package coding

fun main() {
    var n = 7893
    while (n != 0) {
        val reminder = n % 10
        println(reminder)
        n = n / 10
    }
}
