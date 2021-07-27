package com.cucot.play.controlflow

class Loops {
}

class Animal(val name: String) {
    override fun toString() :String {
        return this.name
    }
}

class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}
fun main() {
    commonLoops()
    val zoo = Zoo(listOf(Animal("Abby"), Animal("Foggy"), Animal("Fend"), Animal("Mommy")))
    for (animal in zoo) {
        println(animal)
    }

    range()

}

fun commonLoops() {
    val points = listOf(1 ,2, 3, 4, 6, 8, 9, 10)

    for (integer in points) {
        if (integer % 2 == 0) {
            println("Even")
        } else {
            println("Odd")
        }
    }

    var start = 10
    while (start > 0) {
        println("$start is still greater than zero")
        --start
    }

    do {
        println("$start is still less than 25")
        ++start
    } while(start < 25)
}

fun range() {
    // range
    println("Printing out number of range 1 .. 5")
    for (i in 1..5) {
        print(" $i ")
    }

    println("\n#########Using in 1 until 5#######")
    for (i in 1 until 5) {
        print(" $i ")
    }

    println("\n########### Using in and step 5###########")
    for (i in 1..96 step 5) {
        print(" $i ")
    }

    println("\n########### Using in and step 5 until 96###########")
    for (i in 1 until 96 step 5) {
        print(" $i ")
    }

    println("\n$$$$$$$$$$$$ using DOWN TO $$$$$$$$$$$$")
    for (i in 10 downTo 0) {
        print(" $i ")
    }

    println("\n$$$$$$$$$$$$ using DOWN TO STEP $$$$$$$$$$$$")
    for (i in 10 downTo 0 step 2) {
        print(" $i ")
    }

    println("\n$$$$$$$$$$ using range for char $$$$$$$$$$$$$")
    for (c in 'a'..'z') {
        print(" $c ")
    }

    println("\n$$$$$$$$$$ using range step for char $$$$$$$$$$$$$")
    for (c in 'a'..'z' step 5) {
        print(" $c ")
    }

    val x = 23
    if (x in 1..50) {
        println("\n $x is in range of 1 to 50")
    }
    if (x !in -10..10) {
        println("\n $x is not in range -10 to 10")
    }
}