package com.cucot.play.introduction

//kotlin classes and methods are final by default
class Inheritance {
}

// make a class opens for extension

open class Animal(val age: Int, val name: String) {
    open fun barking() {
        println("Whooooooooooooo")
    }

    fun showInstinct() {
        println("Basically we're just animal")
    }
}

class Cat(age: Int, name: String) : Animal(age = age, name = name) {
    override fun barking() {
        println("Meow, Meow")
    }

    /**
    override fun showInstinct() { - invalid declaration since showInstinct() in Animal is final by default

    }

     fun barking() { - invalid declaration since override in Kotlin is not an optional annotation but a required modifier
     }
     */

}

//class EnglandCat: Cat() // invalid declaration since Cat is final by default, cannot be extended


fun main() {
    val randomAnimal: Animal = Cat(5, "Hindi")
    randomAnimal.barking()
    randomAnimal.showInstinct()
    val anotherAnimal: Animal = Animal(3, "Hurracan")
    anotherAnimal.barking()
    anotherAnimal.showInstinct()
}


