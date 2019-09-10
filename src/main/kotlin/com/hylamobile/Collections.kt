package com.hylamobile

fun main(){
    var users: MutableList<User> = mutableListOf(User("Tom", 32), User("John", 64))
}


class User(val name: String, val age: Int) {

}
