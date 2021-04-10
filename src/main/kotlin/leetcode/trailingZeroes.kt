package com.hylamobile

import java.math.BigInteger

fun main() {
    println(trailingZeroes(5199))
}

fun trailingZeroes(n: Int): Int {
    val a = countFactorial(n)
    dividesToTen(a)
    return counter;
}

    var counter = 0

    fun dividesToTen(a: BigInteger) {
        val big10 = BigInteger.valueOf(10L)
        if (a.remainder(big10) == BigInteger.ZERO) {
            counter++
            dividesToTen(a.divide(big10))
        }
    }

fun countFactorial(n: Int): BigInteger {
    var factorial = BigInteger.ONE;
    for (i in 2..n) {
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()));
    }
    return factorial
}
