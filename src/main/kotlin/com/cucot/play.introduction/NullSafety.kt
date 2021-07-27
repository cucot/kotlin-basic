package com.cucot.play.introduction

class NullSafety {
}

fun main() {
    var notNullString = "Harry Won"
//    notNullString = null //cannot be assigned to null
    var nullableString: String? = "Harry Bien"
    var thisCanBeNull: Int? = null
    var thisCannotBeNull: Int
    thisCannotBeNull = 10
    showLength(nullableString)
    nullableString = null
    showLength(nullableString)
}

fun returnNullable(): Int {
    val a = 100
    val b = 105
    return a + b
//    return null : compilation error due to return type declaration: Int
}

fun showLength(text: String?) {
    println(text?.length)
}