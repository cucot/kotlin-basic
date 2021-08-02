package com.cucot.functional

class HigherOrderFunction {

}

fun calculate(firstOperand: Int, secondOperand: Int, operation: (Int, Int) -> Int): Int {
    return operation(firstOperand, secondOperand)
}

fun sum(first: Int, second: Int) = first + second

fun mul(first: Int, second: Int): Int = first * second

fun main() {
    println(calculate(5, 6, ::sum))
    println(calculate(7, -3, ::mul))
    println(calculate(500, 8) { a, b -> a / b })
    val returnedFunc = anotherOperation()
    println(returnedFunc(8)) // function is actually executed

}

// returning function

fun square(x: Int) = x * x
fun anotherOperation(): (Int) -> Int {
    return ::square
}