package com.cucot.play.introduction

class Function {
}

fun printMessage(message: String) {
    println(message)
}

fun printMessageWithDefaultValue(message: String, prefix: String = "Default prefix") {
    println("[$prefix] $message")
}

fun sumTwoInt(first: Int =0, second: Int = 0): Int {
    return first + second
}

fun multiplyTwoIntShortDeclaration(first: Int = 0, second: Int = 0): Int = first * second

fun remainderWithReturnTypeInferred(first: Int, second: Int) = first % second
fun main() {
    printMessage("Simple function call")
    printMessageWithDefaultValue("Kevin", "Hello")
    printMessageWithDefaultValue("Jonas")
    println(sumTwoInt(3, 5))
    println(sumTwoInt(5))
    println(multiplyTwoIntShortDeclaration(5, 6))
    println(remainderWithReturnTypeInferred(30, 7))
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")
    for (index in 0 until 10) {
        print(" $index ")
    }
    print("\n")
    println(6 divideBy 3)
    println(3 multiplyBy 5)
    val pair = "Kevin" to "Nivek"
    println(pair)
    println(5 times " Kevin ")
    printEach("Kevin", "Peter", "Johnson", "Canyon", "Falcon")
    println("")
    greetingALl("Kevin", "Peter", "Johnson", "Faker", "Bengi", prefix = "Hello ")
    val staffs = mutableListOf("Edward Gaming", "RNG", "Sunning")
    helloThenGoodbyeAll("Goodbye", "Edward Gaming", "RNG", "Sunning")
}

infix fun Int.divideBy(by: Int) = this / by //infix extension function (looks like adding a member function to Int
infix fun Int.multiplyBy(with: Int) = this * with

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun like(otherPerson: Person) = likedPeople.add(otherPerson)

}

infix fun Person.hate(otherPerson: Person) = likedPeople.remove(otherPerson)

operator fun Int.times(str: String) = str.repeat(this)

fun printEach(vararg messages: String) {
    for (m in messages) {
        print(" $m ")
    }
}

fun greetingALl(vararg names: String, prefix: String) {
    for (name in names) {
        print("$prefix $name\n")
    }
}

fun helloThenGoodbyeAll(prefix: String, vararg names: String) {
    greetingALl(*names, prefix = "Hi, ")
    for (name in names) {
        println("$prefix $name")
    }
}
