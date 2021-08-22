package com.cucot.functional

class Lambdas {
}

// create functions using lambda syntax

val maketoUpperCase: (String) -> String = {str: String -> str.toUpperCase()}
val makeAnothertoUpperCase: (String) -> String = {str -> str.toUpperCase()}
val makeThirdtoUpperCase = {str: String -> str.toUpperCase()}
//val makeFourthtoUpperCase = {str -> str.toUpperCase()} // cannot do this because compiler cannot infer type
val makeFifthtoUpperCase: (String) -> String = {it.toUpperCase()} // in case of lambda with single parameter, it key word can be used
val makeSixthtoUpperCase: (String) -> String = String::toUpperCase // lambda consists of a single  function call, use this like a pointer

val upperAndConcat: (String, String) -> String = {first: String, second: String -> first.toUpperCase().plus(second.toUpperCase())}
val upperAndConcatt: (String, String) -> String = {first, second -> first.toUpperCase().plus(second.toUpperCase())}

fun main() {
    println(maketoUpperCase("Kevin"))
    println(upperAndConcat("kEviN", "Nguyen"))
}
