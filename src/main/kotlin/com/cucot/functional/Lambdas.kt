package com.cucot.functional

class Lambdas {
}

// create functions using lambda syntax

val makeUpperCase: (String) -> String = {str: String -> str.uppercase()}
val makeAnotherUpperCase: (String) -> String = {str -> str.uppercase()}
val makeThirdUpperCase = {str: String -> str.uppercase()}
//val makeFourthUpperCase = {str -> str.uppercase()} // cannot do this because compiler cannot infer type
val makeFifthUpperCase: (String) -> String = {it.uppercase()} // in case of lambda with single parameter, it key word can be used
val makeSixthUpperCase: (String) -> String = String::uppercase // lambda consists of a single  function call, use this like a pointer

val upperAndConcat: (String, String) -> String = {first: String, second: String -> first.uppercase().plus(second.uppercase())}
val upperAndConcatt: (String, String) -> String = {first, second -> first.uppercase().plus(second.uppercase())}

fun main() {
    println(makeUpperCase("Kevin"))
    println(upperAndConcat("kEviN", "Nguyen"))
}
