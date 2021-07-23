package com.cucot.play

class NullSafety {
}

fun main() {
    var notNullString = "Harry Won"
//    notNullString = null //cannot be assigned to null
    var nullableString: String? = "Harry Bien"
}