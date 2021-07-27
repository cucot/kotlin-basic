package com.cucot.play.controlflow

class ConditionalExpression {

}

/**
 * Kotlin does not offer ternary operator, it uses if instead
 */

fun main() {
    println(max(-5, 10))
    println(max(20, 5))
}

fun max(a: Int, b: Int): Int = if (a < b) b else a