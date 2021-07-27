package com.cucot.play.introduction

class Variables(val c: Int) {
}

fun main() {
    println("Hello, world")
    println(a)
    val myVal: Variables = Variables(10)
    println(myVal.c)
    var myName: String = "Kevin"
    println(myName)
    myName = "Nguyen Nhu Phuc"
    println(myName)
    //myVal = Variables(20) - compiler error, val cannot be re-assigned
    val yourName = "Your name is inferred as String"
    println(yourName)
    var d: Int // variable may not be initialized
}

val a = 100
var b = 50
//var d: Int // propery must be initialized
