package com.hylamobile

fun main() {
    val user1 = User("Tom", 32)
    val users: MutableList<User> = mutableListOf(user1, User("John", 64))
}


class User(val name: String, val age: Int) {

}


