package com.cucot.play.controlflow

class When {
    override fun equals(other: Any?): Boolean {
        return true
    }

    override fun hashCode(): Int {
        return 0
    }
}

fun showInfoUsingWhenStatement(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Hello")
        5.5 -> println("Double with value 5.5")
        When() -> "When constructor"
        is When -> println("Is When")
    }
}

fun main() {
    showInfoUsingWhenStatement(1)
    showInfoUsingWhenStatement("Hello")
    showInfoUsingWhenStatement("Kevin")
    showInfoUsingWhenStatement(5.5)
    showInfoUsingWhenStatement(When())
    println(assignUsingWhenExpression("one"))
    println(assignUsingWhenExpression("three"))
    println(assignUsingWhenExpression("five"))
}

fun assignUsingWhenExpression(input: String): Int {
    val result = when (input) {
        "one" -> 1
        "two" -> 2
        "three" -> 3
        else -> 0 // when expression requires a default branching
    }
    return result
}