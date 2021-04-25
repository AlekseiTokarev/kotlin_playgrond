package leetcode


fun main() {
    println(countPrimes(10))
}

fun countPrimes(n: Int): Int {
    if (n <= 2) {
        return 0
    }
    var lastNumber = 2
    var lastNumberAmount = 0
    var counter = 0
    for (i in lastNumber until n) {
        lastNumber = i;
        if (isPrime(i)) {
            counter++
        }
    }
    return counter
}

fun isPrime(n: Int): Boolean {
    if (n == 2 || n == 3) {
        return true
    }
    for (i in 3 until n step 2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}
