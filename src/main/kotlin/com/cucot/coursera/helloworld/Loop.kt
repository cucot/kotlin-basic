package com.cucot.coursera.helloworld

class Loop {
}

fun main() {
    val nameToAge = mapOf("Kevin" to 25, "Peter" to 28, "Edward" to 24)

    for ((name, age) in nameToAge) {
        println("$name is $age years old")
    }

    val myList = listOf("Mot tram", "Hai tram", "Ba tram")
    for ((index, value) in myList.withIndex()) {
        println("$value is at index $index")
    }

    for (i in 1..5 step 2) {
        println("$i")
    }

    //exclude upper bound
    for (i in 1 until 10 step 3) {
        println("$i")
    }

    //even iterate through string
    for (str in "Hello, world") {
        print("${str + 1}")
    }

}