package com.cucot.collection

class WorkingWithList {
    val name = "Kevin"
}

val age = 100
fun main() {
    val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3, 4);
    val siteUser = listOf(5, 6, 7)

    systemUsers.set(2, 100) // modify item inside mutable list
//    siteUser.set(1, 56) // cannot modify item of immutable list
    val viewOfSystemUser: List<Int> = systemUsers // obtain read-only view of mutable lists by casting to List

//     viewOfSystemUser.set(1, 10) // error - cannot update read-only view of the list
    println(siteUser.get(1))
    println("size of mutable list is: $systemUsers.size")
    println("last index of 6 is of immutable list is : ${siteUser.lastIndexOf(6)}")
    siteUser.forEach({element -> println(element)})
}