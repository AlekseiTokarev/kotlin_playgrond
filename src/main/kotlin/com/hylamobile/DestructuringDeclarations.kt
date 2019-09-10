package com.hylamobile

fun getContactDetail(): Pair<String, String> {
    return Pair("87897878798798", "email@gmail.com");
}

fun getPhoneList(): List<String> {
    return listOf<String>("mobile", "home phone")
}

fun main(args: Array<String>) {
    val (phone, email) = getContactDetail();
    println("$email form getPhoneList()")

    val (phone1, phone2) = getPhoneList();
    println("$phone2 from getPhoneList()")

    val map = mapOf(1 to "One",
                    2 to "Two",
                    3 to "Three")

    for ((key, value) in map) {
        println("$value")
    }


}

