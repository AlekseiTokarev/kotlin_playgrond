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

    val map = mapOf("foo" to "bar", "foo1" to "bar1")
    for ((key, value) in map){
        println("$value")
    }

}

class Main {

}
