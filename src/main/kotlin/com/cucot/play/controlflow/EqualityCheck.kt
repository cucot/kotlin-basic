package com.cucot.play.controlflow

class EqualityCheck {
}

/**
 * kotlin uses == for structural comparison and === for referential comparison
 * a == b: if (a == null)  b == null else a.equals(b)
 *
 * a === b: memory that a reference to is the same as b
 */
fun main() {
    val authors = setOf("One", "Two", "Five")
    val writers = setOf("Two", "Five", "One")
    println(authors == writers)
    println(null === null)
}