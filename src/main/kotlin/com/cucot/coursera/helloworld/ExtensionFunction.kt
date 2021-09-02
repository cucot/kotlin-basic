package com.cucot.coursera.helloworld

class ExtensionFunction {
}

fun String.lastChar() = this[this.length - 1]
fun String.repeat(times: Int): String {
    val builder = StringBuilder(times * this.length)
    for (i in 1..times) {
        builder.append(this)
    }
    return builder.toString()
}
fun List<Int>.sum() : Int {
    var sum = 0
    this.forEach {it -> sum += it}
    return sum
}
fun String.get(index: Int, overloaded: Boolean) = '*'
fun main() {
    println("Last char of abc is ${"abc".lastChar()}")
    println("Kevin".repeat(10))
    val myIntList = listOf(1, 5, 90, 17)
    println("Sum = ${myIntList.sum()}")
    println("Kevin".get(1))
    println("Kevin".get(3, false)) // overload
}
