package com.cucot.coursera.helloworld

class IdentifierValidator {
}

fun isValidIdentifier(str: String) : Boolean {
    fun isValidCharacter(c: Char) : Boolean {
        return c == '_' || c in 'a'..'z' || c in 'A'..'Z' || c in '0'..'9'
    }

    if (str.isEmpty() || str[0] in '0'..'9') return false
    for (c in str) {
        if  (!isValidCharacter(c)) return false
    }
    return true
}

fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}