package com.cucot.coursera.helloworld

import java.io.IOException

class ExceptionHandling {
}

@Throws(IOException::class, IllegalArgumentException::class)
fun isSaidToThrow() {
    throw IOException("hello")
    print("hello exception")
}

fun nothingSpecial(throwOrNot: Boolean) {
    if (throwOrNot)
        throw IOException("There is no guarantee that I am gonna throw something")
}

fun parseNumber(number: String): Int {
    return try {
        Integer.parseInt(number)
    } catch (nfe: NumberFormatException) {
        0
    }
}

fun main() {
    val num1 = "03"
    val num2 = "50"
    val num3 = "-25"
    println("num1 = ${parseNumber(num1)}")
    println("num2 = ${parseNumber(num2)}")
    println("num3 = ${parseNumber(num3)}")
    println("numInvalid = ${parseNumber("$30")}")
}