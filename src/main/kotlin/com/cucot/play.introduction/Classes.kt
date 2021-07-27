package com.cucot.play.introduction

// full class declaration including: class name, class header, properties and body
class Classes(var age: Int, val name: String) {
    fun showInfo() {
        print("Hello I am ${this.name}, and I am ${this.age} years old\n")
    }
}

class VipCustomer // another valid class declaration with only class name, kotlin will automatically create a non-parameterized default constructor

class PoorCustomer(val age: Int, val money: Double) // valid class declaration with class name, header containing main constructor, empty body

fun main() {
    val myClasses = Classes(26, "Kevin Nguyen")
    myClasses.showInfo()
    println(myClasses.age)
    println(myClasses.name)
    myClasses.age = 50
    myClasses.showInfo()
}