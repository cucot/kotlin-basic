package com.cucot.play.introduction // package  specification is optional, if no package is specified, it goes to the default package

class HelloWorld {
}

// similar to Java, main function is entry point in Kotlin
//since kotlin 1.3, main can be declared without any parameters, nor return type
fun main() {
    println("Hello, world")
    println("Even semicolon is optional");

}

/*
this is main within Kotlin version earlier than 1.3
fun main (args: Array<String>) {
    print("Hello, world")
}
 */