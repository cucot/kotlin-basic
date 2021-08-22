@file:JvmName(name = "TopLevel") // since we define a class with the same name of the file, we need to specify another JVM class name
package com.cucot.coursera.helloworld

fun main(args: Array<String>) {
    val name = if (args.size > 0) args.get(0) else "Kevin"
    val secondName = args.getOrNull(5)
    println("Hello, $name")
    println("Hi, second or null, $secondName")
    println("First call: ${calculatedString()}, second call: ${calculatedString()}")
}

fun calculatedString() : String{
    println("called")
    return "Calculated"
}

// if we were to define a class like this, how to call the top-level function
class HelloKt {

    fun calculatedString(): String {
        return "Aloha"
    }
}