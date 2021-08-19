package com.cucot.collection

class KlSet {
}

fun main() {
    val mutableSet = mutableSetOf("Kevin", "Nguyen", "John", "Nguyen")
    val immutableSet = setOf("Chung", "Ta", "Chung", "No")

    // some operations
    mutableSet.forEach { it -> println(it) }
    immutableSet.forEach({it -> println(it)})
    println(mutableSet.add("Tran"))
//    immutableSet.add("Ka") // no operation on immutable list
    mutableSet.forEach({it -> println(it)})

}