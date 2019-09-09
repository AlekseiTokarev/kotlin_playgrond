package com.hylamobile

fun getContactDetail(): Triple<String, String, Any> {
    return Triple("phone", "email", "link");
}

fun getPhoneList(): List<String> {
    return listOf<String>("mobile", "home phone")
}

fun main(args: Array<String>) {

    val map = mapOf("foo" to "bar", "foo1" to "bar1")
    for ((key, value) in map){
        println("$value")
    }
//    val (phone1, link) = getPhoneList();
    val (phone1, phone2) = getPhoneList();

    println(phone1)
    println(phone2)
}

class Main {

}
